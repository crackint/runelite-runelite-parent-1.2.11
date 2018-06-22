/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.cache.script;

public class Opcodes
{
	public static final int LOAD_INT = 0;
	public static final int GET_SETTINGS = 1;
	public static final int PUT_SETTINGS = 2;
	public static final int LOAD_STRING = 3;
	public static final int JUMP = 6;
	public static final int IF_ICMPNE = 7;
	public static final int IF_ICMPEQ = 8;
	public static final int IF_ICMPLT = 9;
	public static final int IF_ICMPGT = 10;
	public static final int RETURN = 21;
	public static final int GET_VARBIT = 25;
	public static final int SET_VARBIT = 27;
	public static final int IF_ICMPLE = 31;
	public static final int IF_ICMPGE = 32;
	public static final int ILOAD = 33;
	public static final int ISTORE = 34;
	public static final int SLOAD = 35;
	public static final int SSTORE = 36;
	public static final int STRING_APPEND = 37;
	public static final int POP_INT = 38;
	public static final int POP_STRING = 39;
	public static final int INVOKE = 40;
	public static final int GET_VARC = 42;
	public static final int PUT_VARC = 43;
	public static final int ARRAY_INITIALIZE = 44;
	public static final int ARRAY_LOAD = 45;
	public static final int ARRAY_STORE = 46;
	public static final int GET_VARC_STRING = 47;
	public static final int PUT_VARC_STRING = 48;
	public static final int SWITCH = 60;
	public static final int WIDGET_CREATE_CHILD = 100;
	public static final int WIDGET_DESTROY_CHILD = 101;
	public static final int WIDGET_UNSET_CHILDREN = 102;
	public static final int WIDGET_LOAD_CHILD = 200;
	public static final int WIDGET_LOAD = 201;
	public static final int WIDGET_PUT_POSITION = 1000;
	public static final int WIDGET_PUT_SIZE = 1001;
	public static final int WIDGET_PUT_HIDDEN = 1003;
	public static final int WIDGET_PUT_NO_CLICK_THROUGH = 1005;
	public static final int WIDGET_PUT_SCROLL = 1100;
	public static final int WIDGET_PUT_TEXTCOLOR = 1101;
	public static final int WIDGET_PUT_FILLED = 1102;
	public static final int WIDGET_PUT_OPACITY = 1103;
	public static final int WIDGET_PUT_LINE_WIDTH = 1104;
	public static final int WIDGET_PUT_SPRITEID = 1105;
	public static final int WIDGET_PUT_TEXTUREID = 1106;
	public static final int WIDGET_PUT_SPRITE_TILING = 1107;
	public static final int WIDGET_PUT_MODELID_1 = 1108;
	public static final int WIDGET_PUT_3D_ROTATION = 1109;
	public static final int WIDGET_PUT_ANIMATION = 1110;
	public static final int WIDGET_PUT_TEXT = 1112;
	public static final int WIDGET_PUT_FONTID = 1113;
	public static final int WIDGET_PUT_TEXT_ALIGNMENT = 1114;
	public static final int WIDGET_PUT_TEXT_SHADOWED = 1115;
	public static final int WIDGET_PUT_BORDERTHICKNESS = 1116;
	public static final int WIDGET_PUT_SPRITE2 = 1117;
	public static final int WIDGET_PUT_FLIPPEDVERTICALLY = 1118;
	public static final int WIDGET_PUT_FLIPPEDHORIZONALLY = 1119;
	public static final int WIDGET_PUT_SCROLLWIDTHHEIGHT = 1120;
	public static final int WIDGET_ADVANCE_DIALOGUE = 1121;
	public static final int WIDGET_PUT_MODELID_2 = 1201;
	public static final int WIDGET_PUT_MODELID_3 = 1202;
	public static final int WIDGET_PUT_ACTION = 1300;
	public static final int WIDGET_PUT_DRAG_PARENT = 1301;
	public static final int WIDGET_PUT_NAME = 1305;
	public static final int WIDGET_PUT_SELECTED_ACTION = 1306;
	public static final int WIDGET_PUT_ACTIONS_NULL = 1307;
	public static final int WIDGET_PUT_MOUSE_PRESS_LISTENER = 1400;
	public static final int WIDGET_PUT_DRAGGED_OVER_LISTENER = 1401;
	public static final int WIDGET_PUT_MOUSE_RELEASE_LISTENER = 1402;
	public static final int WIDGET_PUT_MOUSE_ENTER_LISTENER = 1403;
	public static final int WIDGET_PUT_MOUSE_EXIT_LISTENER = 1404;
	public static final int WIDGET_PUT_DRAG_START_LISTENER = 1405;
	public static final int WIDGET_PUT_USE_WITH_LISTENER = 1406;
	public static final int WIDGET_PUT_CONFIG_LISTENER = 1407;
	public static final int WIDGET_PUT_RENDER_LISTENER = 1408;
	public static final int WIDGET_PUT_OPTION_CLICK_LISTENER = 1409;
	public static final int WIDGET_PUT_DRAG_RELEASE_LISTENER = 1410;
	public static final int WIDGET_PUT_DRAG_LISTENER = 1411;
	public static final int WIDGET_PUT_MOUSE_HOVER_LISTENER = 1412;
	public static final int WIDGET_PUT_TABLE_LISTENER = 1414;
	public static final int WIDGET_PUT_SKILL_LISTENER = 1415;
	public static final int WIDGET_PUT_USE_LISTENER = 1416;
	public static final int WIDGET_PUT_SCROLL_LISTENER = 1417;
	public static final int WIDGET_PUT_MSG_LISTENER = 1418;
	public static final int WIDGET_PUT_KEY_LISTENER = 1419;
	public static final int WIDGET_PUT_FRIENDS_LISTENER = 1420;
	public static final int WIDGET_PUT_CLAN_LISTENER = 1421;
	public static final int WIDGET_PUT_DIALOG_ABORT_LISTENER = 1423;
	public static final int WIDGET_PUT_OPENCLOSE_LISTENER = 1424;
	public static final int WIDGET_PUT_GE_LISTENER = 1425;
	public static final int WIDGET_PUT_RESIZE_LISTENER = 1427;
	public static final int WIDGET_GET_RELATIVEX = 1500;
	public static final int WIDGET_GET_RELATIVEY = 1501;
	public static final int WIDGET_GET_WIDTH = 1502;
	public static final int WIDGET_GET_HEIGHT = 1503;
	public static final int WIDGET_GET_HIDDEN = 1504;
	public static final int WIDGET_GET_PARENTID = 1505;
	public static final int WIDGET_GET_SCROLLX = 1600;
	public static final int WIDGET_GET_SCROLLY = 1601;
	public static final int WIDGET_GET_TEXT = 1602;
	public static final int WIDGET_GET_SCROLLWIDTH = 1603;
	public static final int WIDGET_GET_SCROLLHEIGHT = 1604;
	public static final int WIDGET_GET_MODELZOOM = 1605;
	public static final int WIDGET_GET_ROTATIONX = 1606;
	public static final int WIDGET_GET_ROTATIONY = 1607;
	public static final int WIDGET_GET_ROTATIONZ = 1608;
	public static final int WIDGET_GET_OPACITY = 1609;
	public static final int WIDGET_GET_TEXTCOLOR = 1611;
	public static final int WIDGET_GET_ITEMID = 1700;
	public static final int WIDGET_GET_STACKSIZE = 1701;
	public static final int WIDGET_GET_INDEX = 1702;
	public static final int WIDGET_GET_CONFIG = 1800;
	public static final int WIDGET_GET_ACTION = 1801;
	public static final int WIDGET_GET_NAME = 1802;
	public static final int WIDGET_PUT_POSITION_WIDGET = WIDGET_PUT_POSITION + 1000;
	public static final int WIDGET_PUT_SIZE_WIDGET = WIDGET_PUT_SIZE + 1000;
	public static final int WIDGET_PUT_HIDDEN_WIDGET = WIDGET_PUT_HIDDEN + 1000;
	public static final int WIDGET_PUT_NO_CLICK_THROUGH_WIDGET = WIDGET_PUT_NO_CLICK_THROUGH + 1000;
	public static final int WIDGET_PUT_SCROLL_WIDGET = WIDGET_PUT_SCROLL + 1000;
	public static final int WIDGET_PUT_TEXTCOLOR_WIDGET = WIDGET_PUT_TEXTCOLOR + 1000;
	public static final int WIDGET_PUT_FILLED_WIDGET = WIDGET_PUT_FILLED + 1000;
	public static final int WIDGET_PUT_OPACITY_WIDGET = WIDGET_PUT_OPACITY + 1000;
	public static final int WIDGET_PUT_LINE_WIDTH_WIDGET = WIDGET_PUT_LINE_WIDTH + 1000;
	public static final int WIDGET_PUT_SPRITEID_WIDGET = WIDGET_PUT_SPRITEID + 1000;
	public static final int WIDGET_PUT_TEXTUREID_WIDGET = WIDGET_PUT_TEXTUREID + 1000;
	public static final int WIDGET_PUT_SPRITE_TILING_WIDGET = WIDGET_PUT_SPRITE_TILING + 1000;
	public static final int WIDGET_PUT_MODELID_1_WIDGET = WIDGET_PUT_MODELID_1 + 1000;
	public static final int WIDGET_PUT_3D_ROTATION_WIDGET = WIDGET_PUT_3D_ROTATION + 1000;
	public static final int WIDGET_PUT_ANIMATION_WIDGET = WIDGET_PUT_ANIMATION + 1000;
	public static final int WIDGET_PUT_TEXT_WIDGET = WIDGET_PUT_TEXT + 1000;
	public static final int WIDGET_PUT_FONTID_WIDGET = WIDGET_PUT_FONTID + 1000;
	public static final int WIDGET_PUT_TEXT_ALIGNMENT_WIDGET = WIDGET_PUT_TEXT_ALIGNMENT + 1000;
	public static final int WIDGET_PUT_TEXT_SHADOWED_WIDGET = WIDGET_PUT_TEXT_SHADOWED + 1000;
	public static final int WIDGET_PUT_BORDERTHICKNESS_WIDGET = WIDGET_PUT_BORDERTHICKNESS + 1000;
	public static final int WIDGET_PUT_SPRITE2_WIDGET = WIDGET_PUT_SPRITE2 + 1000;
	public static final int WIDGET_PUT_FLIPPEDVERTICALLY_WIDGET = WIDGET_PUT_FLIPPEDVERTICALLY + 1000;
	public static final int WIDGET_PUT_FLIPPEDHORIZONALLY_WIDGET = WIDGET_PUT_FLIPPEDHORIZONALLY + 1000;
	public static final int WIDGET_PUT_SCROLLWIDTHHEIGHT_WIDGET = WIDGET_PUT_SCROLLWIDTHHEIGHT + 1000;
	public static final int WIDGET_ADVANCE_DIALOGUE_WIDGET = WIDGET_ADVANCE_DIALOGUE + 1000;
	public static final int WIDGET_PUT_MODELID_2_WIDGET = WIDGET_PUT_MODELID_2 + 1000;
	public static final int WIDGET_PUT_MODELID_3_WIDGET = WIDGET_PUT_MODELID_3 + 1000;
	public static final int WIDGET_PUT_ACTION_WIDGET = WIDGET_PUT_ACTION + 1000;
	public static final int WIDGET_PUT_DRAG_PARENT_WIDGET = WIDGET_PUT_DRAG_PARENT + 1000;
	public static final int WIDGET_PUT_NAME_WIDGET = WIDGET_PUT_NAME + 1000;
	public static final int WIDET_PUT_SELECTED_ACTION_WIDGET = WIDGET_PUT_SELECTED_ACTION + 1000;
	public static final int WIDGET_PUT_ACTIONS_NULL_WIDGET = WIDGET_PUT_ACTIONS_NULL + 1000;
	public static final int WIDGET_PUT_MOUSE_PRESS_LISTENER_WIDGET = WIDGET_PUT_MOUSE_PRESS_LISTENER + 1000;
	public static final int WIDGET_PUT_DRAGGED_OVER_LISTENER_WIDGET = WIDGET_PUT_DRAGGED_OVER_LISTENER + 1000;
	public static final int WIDGET_PUT_MOUSE_RELEASE_LISTENER_WIDGET = WIDGET_PUT_MOUSE_RELEASE_LISTENER + 1000;
	public static final int WIDGET_PUT_MOUSE_ENTER_LISTENER_WIDGET = WIDGET_PUT_MOUSE_ENTER_LISTENER + 1000;
	public static final int WIDGET_PUT_MOUSE_EXIT_LISTENER_WIDGET = WIDGET_PUT_MOUSE_EXIT_LISTENER + 1000;
	public static final int WIDGET_PUT_DRAG_START_LISTENER_WIDGET = WIDGET_PUT_DRAG_START_LISTENER + 1000;
	public static final int WIDGET_PUT_USE_WITH_LISTENER_WIDGET = WIDGET_PUT_USE_WITH_LISTENER + 1000;
	public static final int WIDGET_PUT_CONFIG_LISTENER_WIDGET = WIDGET_PUT_CONFIG_LISTENER + 1000;
	public static final int WIDGET_PUT_RENDER_LISTENER_WIDGET = WIDGET_PUT_RENDER_LISTENER + 1000;
	public static final int WIDGET_PUT_OPTION_CLICK_LISTENER_WIDGET = WIDGET_PUT_OPTION_CLICK_LISTENER + 1000;
	public static final int WIDGET_PUT_DRAG_RELEASE_LISTENER_WIDGET = WIDGET_PUT_DRAG_RELEASE_LISTENER + 1000;
	public static final int WIDGET_PUT_DRAG_LISTENER_WIDGET = WIDGET_PUT_DRAG_LISTENER + 1000;
	public static final int WIDGET_PUT_MOUSE_HOVER_LISTENER_WIDGET = WIDGET_PUT_MOUSE_HOVER_LISTENER + 1000;
	public static final int WIDGET_PUT_TABLE_LISTENER_WIDGET = WIDGET_PUT_TABLE_LISTENER + 1000;
	public static final int WIDGET_PUT_SKILL_LISTENER_WIDGET = WIDGET_PUT_SKILL_LISTENER + 1000;
	public static final int WIDGET_PUT_USE_LISTENER_WIDGET = WIDGET_PUT_USE_LISTENER + 1000;
	public static final int WIDGET_PUT_SCROLL_LISTENER_WIDGET = WIDGET_PUT_SCROLL_LISTENER + 1000;
	public static final int WIDGET_PUT_MSG_LISTENER_WIDGET = WIDGET_PUT_MSG_LISTENER + 1000;
	public static final int WIDGET_PUT_KEY_LISTENER_WIDGET = WIDGET_PUT_KEY_LISTENER + 1000;
	public static final int WIDGET_PUT_FRIENDS_LISTENER_WIDGET = WIDGET_PUT_FRIENDS_LISTENER + 1000;
	public static final int WIDGET_PUT_CLAN_LISTENER_WIDGET = WIDGET_PUT_CLAN_LISTENER + 1000;
	public static final int WIDGET_PUT_DIALOG_ABORT_LISTENER_WIDGET = WIDGET_PUT_DIALOG_ABORT_LISTENER + 1000;
	public static final int WIDGET_PUT_OPENCLOSE_LISTENER_WIDGET = WIDGET_PUT_OPENCLOSE_LISTENER + 1000;
	public static final int WIDGET_PUT_GE_LISTENER_WIDGET = WIDGET_PUT_GE_LISTENER + 1000;
	public static final int WIDGET_PUT_RESIZE_LISTENER_WIDGET = WIDGET_PUT_RESIZE_LISTENER + 1000;
	public static final int WIDGET_GET_RELATIVEX_WIDGET = WIDGET_GET_RELATIVEX + 1000;
	public static final int WIDGET_GET_RELATIVEY_WIDGET = WIDGET_GET_RELATIVEY + 1000;
	public static final int WIDGET_GET_WIDTH_WIDGET = WIDGET_GET_WIDTH + 1000;
	public static final int WIDGET_GET_HEIGHT_WIDGET = WIDGET_GET_HEIGHT + 1000;
	public static final int WIDGET_GET_HIDDEN_WIDGET = WIDGET_GET_HIDDEN + 1000;
	public static final int WIDGET_GET_PARENTID_WIDGET = WIDGET_GET_PARENTID + 1000;
	public static final int WIDGET_GET_SCROLLX_WIDGET = WIDGET_GET_SCROLLX + 1000;
	public static final int WIDGET_GET_SCROLLY_WIDGET = WIDGET_GET_SCROLLY + 1000;
	public static final int WIDGET_GET_TEXT_WIDGET = WIDGET_GET_TEXT + 1000;
	public static final int WIDGET_GET_SCROLLWIDTH_WIDGET = WIDGET_GET_SCROLLWIDTH + 1000;
	public static final int WIDGET_GET_SCROLLHEIGHT_WIDGET = WIDGET_GET_SCROLLHEIGHT + 1000;
	public static final int WIDGET_GET_MODELZOOM_WIDGET = WIDGET_GET_MODELZOOM + 1000;
	public static final int WIDGET_GET_ROTATIONX_WIDGET = WIDGET_GET_ROTATIONX + 1000;
	public static final int WIDGET_GET_ROTATIONY_WIDGET = WIDGET_GET_ROTATIONY + 1000;
	public static final int WIDGET_GET_ROTATIONZ_WIDGET = WIDGET_GET_ROTATIONZ + 1000;
	public static final int WIDGET_GET_OPACITY_WIDGET = WIDGET_GET_OPACITY + 1000;
	public static final int WIDGET_GET_TEXTCOLOR_WIDGET = WIDGET_GET_TEXTCOLOR + 1000;
	public static final int WIDGET_GET_ITEMID_WIDGET = WIDGET_GET_ITEMID + 1000;
	public static final int WIDGET_GET_STACKSIZE_WIDGET = WIDGET_GET_STACKSIZE + 1000;
	public static final int WIGET_GET_INDEX_WIDGET = WIDGET_GET_INDEX + 1000;
	public static final int GET_WIDGET_ROOT = 2706;
	public static final int WIDGET_GET_CONFIG_WIGET = WIDGET_GET_CONFIG + 1000;
	public static final int WIDGET_GET_ACTION_WIDGET = WIDGET_GET_ACTION + 1000;
	public static final int WIDGET_GET_NAME_WIDGET = WIDGET_GET_NAME + 1000;
	public static final int SEND_GAME_MESSAGE = 3100;
	public static final int PLAYER_ANIMATE = 3101;
	public static final int CLOSE_WINDOW = 3103;
	public static final int NUMERIC_INPUT = 3104;
	public static final int STRING_INPUT_1 = 3105;
	public static final int STRING_INPUT_2 = 3106;
	public static final int PLAYER_ACTION = 3107;
	public static final int SET_TOP_CONTEXT_MENU_ROW = 3108;
	public static final int SET_TOP_CONTEXT_MENU_ROW_2 = 3109;
	public static final int SET_MOUSE_BUTTON_CONTROLS_CAMERA = 3110;
	public static final int GET_HIDEROOFS = 3111;
	public static final int SET_HIDEROOFS = 3112;
	public static final int OPEN_URL = 3113;
	public static final int ITEM_PRICE = 3115;
	public static final int SEND_BUG_REPORT = 3116;
	public static final int SET_SHIFT_DROP_ENABLED = 3117;
	public static final int PLAY_SOUND_EFFECT = 3200;
	public static final int GET_GAMECYCLE = 3300;
	public static final int GET_ITEMCONTAINER_ITEMID = 3301;
	public static final int GET_ITEMCONTAINER_STACKSIZE = 3302;
	public static final int GET_ITEMCONTAINER_STACKSIZES_TOTAL = 3303;
	public static final int GET_INVENTORY_SIZE = 3304;
	public static final int GET_BOOSTEDSKILLLEVELS = 3305;
	public static final int GET_REALSKILLLEVELS = 3306;
	public static final int GET_SKILLEXPERIENCES = 3307;
	public static final int GET_COORDINATES = 3308;
	public static final int DIVIDE_BY_16384 = 3309;
	public static final int RIGHT_SHIFT_28 = 3310;
	public static final int AND_16384 = 3311;
	public static final int GET_ISMEMBERS = 3312;
	public static final int GET_ITEMCONTAINER_ITEMID_2 = 3313;
	public static final int GET_ITEMCONTAINER_STACKSIZE_2 = 3314;
	public static final int GET_ITEMCONTAINER_STACKSIZES_TOTAL_2 = 3315;
	public static final int GET_RIGHTS = 3316;
	public static final int GET_SYSTEM_UPDATE_TIMER = 3317;
	public static final int GET_WORLDNUM = 3318;
	public static final int GET_ENERGY = 3321;
	public static final int GET_WEIGHT = 3322;
	public static final int GET_PLAYERMOD = 3323;
	public static final int GET_FLAGS = 3324;
	public static final int PACK_LOCATION = 3325;
	public static final int GET_ENUM_VALUE = 3408;
	public static final int GET_FRIENDCOUNT = 3600;
	public static final int GET_FRIEND = 3601;
	public static final int GET_FRIEND_WORLD = 3602;
	public static final int GET_FRIEND_RANK = 3603;
	public static final int ADD_FRIEND = 3605;
	public static final int REMOVE_FRIEND = 3606;
	public static final int ADD_IGNORE = 3607;
	public static final int REMOVE_IGNORE = 3608;
	public static final int IS_FRIEND = 3609;
	public static final int GET_CLANCHAT_OWNER = 3611;
	public static final int GET_CLANCHATCOUNT = 3612;
	public static final int GET_CLAN_MEMBER_NAME = 3613;
	public static final int GET_CLAN_MEMBER_WORLD = 3614;
	public static final int GET_CLAN_MEMBER_RANK = 3615;
	public static final int CLANCHAT_KICK_RANK = 3616;
	public static final int CLANCHAT_KICK_CLANMEMBER = 3617;
	public static final int GET_CLANCHAT_RANK = 3618;
	public static final int JOIN_CLANCHAT = 3619;
	public static final int PART_CLANCHAT = 3620;
	public static final int GET_IGNORECOUNT = 3621;
	public static final int GET_IGNORE = 3622;
	public static final int IS_IGNORE = 3623;
	public static final int CLANMEMBER_ISME = 3624;
	public static final int GET_CLANCHATOWNER = 3625;
	public static final int GET_GRANDEXCHANGE_OFFER_IS_SELLING = 3903;
	public static final int GET_GRANDEXCHANGE_OFFER_ITEMID = 3904;
	public static final int GET_GRANDEXCHANGE_OFFER_PRICE = 3905;
	public static final int GET_GRANDEXCHANGE_OFFER_TOTALQUANTITY = 3906;
	public static final int GET_GRANDEXCHANGE_OFFER_QUANTITYSOLD = 3907;
	public static final int GET_GRANDEXCHANGE_OFFER_SPENT = 3908;
	public static final int GET_GRANDEXCHANGE_OFFER_NOT_STARTED = 3910;
	public static final int GET_GRANDEXCHANGE_OFFER_STATUS_2 = 3911;
	public static final int GET_GRANDEXCHANGE_OFFER_DONE = 3912;
	public static final int IADD = 4000;
	public static final int ISUB = 4001;
	public static final int IMUL = 4002;
	public static final int IDIV = 4003;
	public static final int RAND_EXCL = 4004;
	public static final int RAND_INCL = 4005;
	public static final int INTERPOLATE = 4006;
	public static final int ADD_PERCENT = 4007;
	public static final int SET_BIT = 4008;
	public static final int CLEAR_BIT = 4009;
	public static final int TEST_BIT = 4010;
	public static final int MODULO = 4011;
	public static final int POW = 4012;
	public static final int INVPOW = 4013;
	public static final int AND = 4014;
	public static final int OR = 4015;
	public static final int SCALE = 4018;
	public static final int CONCAT_INT = 4100;
	public static final int CONCAT_STRING = 4101;
	public static final int TOLOWERCASE = 4103;
	public static final int FORMAT_DATE = 4104;
	public static final int SWITCH_MALE_OR_FEMALE = 4105;
	public static final int INT_TO_STRING = 4106;
	public static final int STRING_COMPARE = 4107;
	public static final int GET_LINE_COUNT = 4108;
	public static final int GET_MAX_LINE_WIDTH = 4109;
	public static final int SWITCH_STRING = 4110;
	public static final int APPENDTAGS = 4111;
	public static final int CONCAT_CHAR = 4112;
	public static final int CHAR_IS_PRINTABLE = 4113;
	public static final int ISALNUM = 4114;
	public static final int ISALPHA = 4115;
	public static final int ISDIGIT = 4116;
	public static final int STRING_LENGTH = 4117;
	public static final int STRING_SUBSTRING = 4118;
	public static final int STRING_REMOVE_HTML = 4119;
	public static final int STRING_INDEXOF = 4120;
	public static final int STRING_INDEXOF_FROM = 4121;
	public static final int GET_ITEM_NAME = 4200;
	public static final int GET_ITEM_GROUND_ACTION = 4201;
	public static final int GET_ITEM_INVENTORY_ACTION = 4202;
	public static final int GET_ITEM_PRICE = 4203;
	public static final int GET_ITEM_STACKABLE = 4204;
	public static final int GET_ITEM_NOTE_1 = 4205;
	public static final int GET_ITEM_NOTE_2 = 4206;
	public static final int GET_ITEM_ISMEMBERS = 4207;
	public static final int SEARCH_ITEM = 4210;
	public static final int NEXT_SEARCH_RESULT = 4211;
	public static final int CHATFILTER_UPDATE = 5001;
	public static final int REPORT_PLAYER = 5002;
	public static final int GET_CHAT_MESSAGE_TYPE = 5003;
	public static final int GET_CHAT_MESSAGE = 5004;
	public static final int CHATBOX_INPUT = 5008;
	public static final int PRIVMSG = 5009;
	public static final int GET_LOCALPLAYER_NAME = 5015;
	public static final int GET_CHATLINEBUFFER_LENGTH = 5017;
	public static final int GET_MESSAGENODE_PREV_ID = 5018;
	public static final int GET_MESSAGENODE_NEXT_ID = 5019;
	public static final int RUN_COMMAND = 5020;
	public static final int GET_ISRESIZED = 5306;
	public static final int SET_ISRESIZED = 5307;
	public static final int GET_SCREENTYPE = 5308;
	public static final int SET_SCREENTYPE = 5309;
	public static final int GET_MAPANGLE = 5506;
	public static final int CANCEL_LOGIN = 5630;
	public static final int GET_VIEWPORT_SIZE = 6203;
	public static final int LOAD_WORLDS = 6500;
	public static final int GET_FIRST_WORLD = 6501;
	public static final int GET_NEXT_WORLD = 6502;
	public static final int GET_WORLD_BY_ID = 6506;
	public static final int GET_WORLD_BY_INDEX = 6511;
	public static final int GET_AREA_NAME = 6693;
}