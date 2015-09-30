package core.Player;

import core.Jagex.Class32;

public interface PlayerPreferences {
	Class32 c32 = new Class32();
	public static final int PLAYER_WORLD = 1;
	public String PLAYER_COLOR = "<col=418284>";
	public default String getPlayerColor() {
		return PLAYER_COLOR;
	}
}
