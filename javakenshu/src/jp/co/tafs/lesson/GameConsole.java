package jp.co.tafs.lesson;

public class GameConsole {
	protected String HARDWARE_NAME = "Nintendo 3DS";
	private String HARDWARE_MAKER = "任天堂";
	private String AVAILAVLE_NETWORK = "有";
	private String RELEASE_DATE = "2011/02/26";
	private int PRICE = 15000;
	private boolean powerStatus = false;
	private String activeSoftware = null;

	GameMessage message = new GameMessage();

	//電源を入れる
	protected void powerOn() {
		if (powerStatus == false) {
			powerStatus = true;
			message.powerOn(HARDWARE_NAME);
		}
	}

	//電源を切る
	protected void powerOff() {
		if (powerStatus == true) {
			powerStatus = false;
			message.powerOff(HARDWARE_NAME);
		}
	}

	//ソフトを入れる
	protected void inSoftware(String software) {
		if (activeSoftware == null) {
			activeSoftware = software;
		}
	}

	//ソフトを取り出す
	protected void outSoftware(String software) {
		if (activeSoftware != null) {
			activeSoftware = null;
		}
	}

	//ゲームプレイ
	protected void playGame() throws IllegalArgumentException {
		if (isPower() == false) {
			message.powerFalse();
			throw new IllegalArgumentException("電源が入っていません。");
		}
		if (this.activeSoftware == null) {
			message.nullSoftware();
			throw new IllegalArgumentException("ソフトが入っていません。");
		}
		message.playGame(HARDWARE_NAME, activeSoftware);
		impressionsGame();
	}

	//感想
	protected void impressionsGame() {
		message.playImpressions(activeSoftware);
		//感想を入力する場合は、以下の様に行う
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("感想を入力してください。");
		String impressions = scanner.next();
		System.out.println(impressions);
		scanner.close();
		*/
	}

	//電源判定
	protected boolean isPower() {
		boolean nowStatus = powerStatus;
		return nowStatus;
	}

	//以下、各属性取得用メソッド
	protected String getSoftware() {
		return activeSoftware;
	}

	protected String getHardwareName() {
		return HARDWARE_NAME;
	}

	protected String getHardwareMaker() {
		return HARDWARE_MAKER;
	}

	protected String getReleaseDate() {
		return RELEASE_DATE;
	}

	protected String getAvailableNetwork() {
		return AVAILAVLE_NETWORK;
	}

	protected int getPrice() {
		return PRICE;
	}
}