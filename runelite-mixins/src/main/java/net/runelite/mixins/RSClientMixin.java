/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.IndexedSprite;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIndexedSprite;
import net.runelite.rs.api.RSWidget;

@Mixin(RSClient.class)
public abstract class RSClientMixin implements RSClient
{
	@Inject
	@Override
	public List<Player> getPlayers()
	{
		int validPlayerIndexes = getPlayerIndexesCount();
		int[] playerIndexes = getPlayerIndices();
		Player[] cachedPlayers = getCachedPlayers();
		List<Player> players = new ArrayList<Player>(validPlayerIndexes);

		for (int i = 0; i < validPlayerIndexes; ++i)
		{
			players.add(cachedPlayers[playerIndexes[i]]);
		}

		return players;
	}

	@Inject
	@Override
	public List<NPC> getNpcs()
	{
		int validNpcIndexes = getNpcIndexesCount();
		int[] npcIndexes = getNpcIndices();
		NPC[] cachedNpcs = getCachedNPCs();
		List<NPC> npcs = new ArrayList<NPC>(validNpcIndexes);

		for (int i = 0; i < validNpcIndexes; ++i)
		{
			npcs.add(cachedNpcs[npcIndexes[i]]);
		}

		return npcs;
	}

	@Inject
	@Override
	public int getBoostedSkillLevel(Skill skill)
	{
		int[] boostedLevels = getBoostedSkillLevels();
		return boostedLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public int getRealSkillLevel(Skill skill)
	{
		int[] realLevels = getRealSkillLevels();
		return realLevels[skill.ordinal()];
	}

	@Inject
	@Override
	public void sendGameMessage(ChatMessageType type, String message)
	{
		sendGameMessage(type.getType(), "", message);
	}

	@Inject
	@Override
	public GameState getGameState()
	{
		return GameState.of(getRSGameState());
	}

	@Inject
	@Override
	public Point getMouseCanvasPosition()
	{
		return new Point(getMouseX(), getMouseY());
	}

	@Inject
	@Override
	public Widget[] getWidgetRoots()
	{
		int topGroup = getWidgetRoot();
		List<Widget> widgets = new ArrayList<Widget>();
		for (Widget widget : getWidgets()[topGroup])
		{
			if (widget != null && widget.getParentId() == -1)
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new Widget[widgets.size()]);
	}

	@Inject
	@Override
	public Widget getWidget(WidgetInfo widget)
	{
		int groupId = widget.getGroupId();
		int childId = widget.getChildId();

		return getWidget(groupId, childId);
	}

	@Inject
	@Override
	public Widget[] getGroup(int groupId)
	{
		RSWidget[][] widgets = getWidgets();

		if (widgets == null || groupId < 0 || groupId >= widgets.length)
		{
			return null;
		}

		List<Widget> w = new ArrayList<Widget>();
		for (Widget widget : widgets[groupId])
		{
			if (widget != null)
			{
				w.add(widget);
			}
		}
		return w.toArray(new Widget[w.size()]);
	}

	@Inject
	@Override
	public Widget getWidget(int groupId, int childId)
	{
		RSWidget[][] widgets = getWidgets();

		if (widgets == null || widgets.length <= groupId)
		{
			return null;
		}

		RSWidget[] childWidgets = widgets[groupId];
		if (childWidgets == null || childWidgets.length <= childId)
		{
			return null;
		}

		return childWidgets[childId];
	}

	@Inject
	@Override
	public int getSetting(Varbits varbit)
	{
		int[] settings = getSettings();
		int value = settings[varbit.getIndex()];
		return varbit.get(value);
	}

	@Inject
	@Override
	public boolean isPrayerActive(Prayer prayer)
	{
		return getSetting(prayer.getVarbit()) == 1;
	}

	/**
	 * Returns the local player's current experience in the specified
	 * {@link Skill}.
	 *
	 * @param skill the {@link Skill} to retrieve the experience for
	 * @return the local player's current experience in the specified
	 * {@link Skill}, or -1 if the {@link Skill} isn't valid
	 */
	@Inject
	@Override
	public int getSkillExperience(Skill skill)
	{
		int[] experiences = getSkillExperiences();

		if (skill == Skill.OVERALL)
		{
			int totalExperience = 0;

			for (int experience : experiences)
			{
				totalExperience += experience;
			}

			return totalExperience;
		}

		int idx = skill.ordinal();

		// I'm not certain exactly how needed this is, but if the Skill enum is updated in the future
		// to hold something else that's not reported it'll save us from an ArrayIndexOutOfBoundsException.
		if (idx >= experiences.length)
		{
			return -1;
		}

		return experiences[idx];
	}

	@Inject
	@Override
	public void refreshChat()
	{
		setChatCycle(getCycleCntr());
	}

	@Inject
	@Override
	public Widget getViewportWidget()
	{
		if (isResized())
		{
			if (getSetting(Varbits.SIDE_PANELS) == 1)
			{
				return getWidget(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE);
			}
			else
			{
				return getWidget(WidgetInfo.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX);
			}
		}
		return getWidget(WidgetInfo.FIXED_VIEWPORT);
	}

	@Inject
	@Override
	public MenuEntry[] getMenuEntries()
	{
		int count = getMenuOptionCount();
		String[] menuOptions = getMenuOptions();
		String[] menuTargets = getMenuTargets();
		int[] menuIdentifiers = getMenuIdentifiers();
		int[] menuTypes = getMenuTypes();
		int[] params0 = getMenuActionParams0();
		int[] params1 = getMenuActionParams1();

		MenuEntry[] entries = new MenuEntry[count];
		for (int i = 0; i < count; ++i)
		{
			MenuEntry entry = entries[i] = new MenuEntry();
			entry.setOption(menuOptions[i]);
			entry.setTarget(menuTargets[i]);
			entry.setIdentifier(menuIdentifiers[i]);
			entry.setType(MenuAction.of(menuTypes[i]));
			entry.setParam0(params0[i]);
			entry.setParam1(params1[i]);
		}
		return entries;
	}

	@Inject
	@Override
	public void setMenuEntries(MenuEntry[] entries)
	{
		int count = 0;
		String[] menuOptions = getMenuOptions();
		String[] menuTargets = getMenuTargets();
		int[] menuIdentifiers = getMenuIdentifiers();
		int[] menuTypes = getMenuTypes();
		int[] params0 = getMenuActionParams0();
		int[] params1 = getMenuActionParams1();

		for (MenuEntry entry : entries)
		{
			menuOptions[count] = entry.getOption();
			menuTargets[count] = entry.getTarget();
			menuIdentifiers[count] = entry.getIdentifier();
			menuTypes[count] = entry.getType().getId();
			params0[count] = entry.getParam0();
			params1[count] = entry.getParam1();
			++count;
		}

		setMenuOptionCount(count);
	}

	@Inject
	@Override
	public void setModIcons(IndexedSprite[] modIcons)
	{
		setRSModIcons((RSIndexedSprite[]) modIcons);
	}
}
