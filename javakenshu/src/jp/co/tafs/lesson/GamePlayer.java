package jp.co.tafs.lesson;

public class GamePlayer {
	private final static String SOFTWARE_NAME_0 = "ポケットモンスター ダイヤモンド";
	private final static String SOFTWARE_NAME_1 = "ポケットモンスター ブラック";
	private final static String SOFTWARE_NAME_2 = "ポケットモンスター X";
	private final static String SOFTWARE_NAME_3 = "ポケットモンスター オメガルビー";
	private final static String SOFTWARE_NAME_4 = "ポケットモンスター サン";

	public static void main(String[] args) {
		//GameConsole console = new GameConsole();
		SuperGameConsole console = new SuperGameConsole();

		System.out.println("ゲーム機の名前：" + console.getHardwareName());
		System.out.println("ゲーム機のメーカー：" + console.getHardwareMaker());
		System.out.println("ネットワーク接続機能：" + console.getAvailableNetwork());
		System.out.println("発売日：" + console.getReleaseDate());
		System.out.println("価格：" + console.getPrice() + "円\n");

		if (console.isPower() == false) {
			console.powerOn();
		}

		console.inSoftware(SOFTWARE_NAME_0);
		console.inSoftware(SOFTWARE_NAME_1);
		console.inSoftware(SOFTWARE_NAME_2);
		console.inSoftware(SOFTWARE_NAME_3);
		console.inSoftware(SOFTWARE_NAME_4);

		System.out.println();

		console.outPut(console.getArray());

		console.selectSoftware(console.searchSoftware(2));

		console.playGame();
	}
}