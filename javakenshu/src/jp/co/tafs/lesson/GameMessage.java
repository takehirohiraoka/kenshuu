package jp.co.tafs.lesson;

public class GameMessage {
	static GameConsole console = new GameConsole();
	static GamePlayer player = new GamePlayer();

	private static String NOTHING_SOFTWARE_MESSAGE = "インストールされているゲームはありません。";
	private static String NOT_FIND_MESSAGE = "指定されたゲームはインストールされていません。";
	private static String COMPLITE_MESSAGE = "をインストールしました。";
	private static String SELECT_SOFTWARE_MESSAGE = "で遊ぼうかな。";

	private static String POWER_ON_MESSAGE = "の電源を入れた。";
	private static String POWER_OFF_MESSAGE = "の電源を切った。";
	private static String POWER_FALSE_MESSAGE = "まずは電源を入れないと…。";

	private static String SOFTWARE_IN_MESSAGE = "を入れた。";
	private static String SOFTWARE_OUT_MESSAGE = "を抜いた。";
	private static String SOFTWARE_NULL_MESSAGE = "まずはゲームを入れないと…。";

	private static String USE_MESSAGE = "を使って、";
	private static String PLAY_MESSAGE = "をプレイした。";
	private static String IMPRESSIONS_MESSAGE = "は良ゲーでした。";

	protected void println(String word) {
		System.out.println(word);
	}

	protected void powerOn(String hardware) {
		System.out.println(hardware + POWER_ON_MESSAGE);
	}

	protected void powerOff(String hardware) {
		System.out.println(hardware + POWER_OFF_MESSAGE);
	}

	protected void powerFalse() {
		System.out.println(POWER_FALSE_MESSAGE);
	}

	protected void inSoftware(String software) {
		System.out.println("「" + software + "」" + SOFTWARE_IN_MESSAGE);
	}

	protected void outSoftware(String software) {
		System.out.println("「" + software + "」" + SOFTWARE_OUT_MESSAGE);
	}

	protected void nullSoftware() {
		System.out.println(SOFTWARE_NULL_MESSAGE);
	}

	protected void nothingSoftware() {
		System.out.println(NOTHING_SOFTWARE_MESSAGE);
	}

	protected void notFindSoftware() {
		System.out.println(NOT_FIND_MESSAGE);
	}

	protected void compliteInstall(String software) {
		System.out.println("「" + software + "」" + COMPLITE_MESSAGE);
	}

	protected void selectSoftware(String software) {
		System.out.println("「" + software + "」" + SELECT_SOFTWARE_MESSAGE);
	}

	protected void playGame(String hardware, String software) {
		System.out.println(hardware + USE_MESSAGE + software + PLAY_MESSAGE);
	}

	protected void playImpressions(String software) {
		System.out.println("「" + software + "」" + IMPRESSIONS_MESSAGE);
	}
}
