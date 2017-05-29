package jp.co.tafs.lesson;

public class SuperGameConsole extends GameConsole {
	private String[] installedSoftware = new String[5];
	private String activeSoftware;
	GameMessage message = new GameMessage();

	protected void outPut(String[] arr) {
		System.out.println("installedSoftware[]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "：" + arr[i]);
		}
		System.out.println("activeSoftware：" + activeSoftware + "\n");
	}

	/*protected void testOutPut() {
		outPut(getArray());
	}*/

	//ソフトを入れる
	protected void inSoftware(String software) {
		if (isInstall(software)) {
			System.out.println(software + "は既にインストール済みです。");
			return;
		}
		else if (countSoftware() >= installedSoftware.length) {
			System.out.println("既に" + countSoftware() + "個インストールしています。");
			return;
		}
		else {
			installedSoftware[emptyNumber()] = software;
			message.compliteInstall(software);
			activeSoftware = software;
		}
	}

	//最初のソフトを取り出す
	protected void outSoftware() {
		if (countSoftware() == 0) {
			message.nothingSoftware();
			return;
		}
		else {
			if (activeSoftware == installedSoftware[0]) {
				activeSoftware = installedSoftware[1];
			}
			for (int i = 0; installedSoftware[i] != null; i++) {
				if (i == installedSoftware.length - 1) {
					installedSoftware[i] = null;
					break;
				}
				installedSoftware[i] = installedSoftware[i + 1];
			}
		}
	}

	//指定したソフトを取り出す
	protected void outSoftware(String software) {
		if (countSoftware() == 0) {
			message.nothingSoftware();
			return;
		}
		else if (isInstall(software) == false) {
			message.notFindSoftware();
			return;
		}
		else {
			for (int i = searchArgument(software); installedSoftware[i] != null; i++) {
				if (i == installedSoftware.length - 1) {
					installedSoftware[i] = null;
					break;
				}
				installedSoftware[i] = installedSoftware[i + 1];
			}
			//選択対象のゲームが削除された場合、最初のゲームを選択する
			if (activeSoftware == software) {
				activeSoftware = installedSoftware[0];
			}
		}
	}

	//ゲームソフトを選ぶ
	protected void selectSoftware(String software) {
		if (isInstall(software) == false) {
			message.notFindSoftware();
			return;
		}
		for (int i = 0; i < installedSoftware.length; i++) {
			if (installedSoftware[i] == software) {
				activeSoftware = installedSoftware[i];
				message.selectSoftware(software);
				break;
			}
		}
	}

	//ゲームをプレイする
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

	protected void impressionsGame() {
		message.playImpressions(this.activeSoftware);
	}

	//インストール済みかチェック
	private boolean isInstall(String software) {
		boolean flg = false;
		for (int i = 0; i < installedSoftware.length; i++) {
			if (installedSoftware[i] == software) {
				flg = true;
				break;
			}
		}
		return flg;
	}

	//インストールされている個数を数える
	private int countSoftware() {
		int count = 0;
		for (int i = 0; i < installedSoftware.length; i++) {
			if (installedSoftware[i] != null) {
				count++;
			}
		}
		return count;
	}

	//配列がどこから空になっているか調べる。
	private int emptyNumber() {
		int empty = 0;
		for (int i = 0; i < installedSoftware.length; i++) {
			if (installedSoftware[i] != null) {
				empty++;
			}
			else {
				break;
			}
		}
		return empty;
	}

	private int searchArgument(String software) {
		int argument = 0;
		for (int i = 0; i < installedSoftware.length; i++) {
			if (installedSoftware[i] == software) {
				argument = i;
				break;
			}
		}
		return argument;
	}

	protected String searchSoftware(int number) {
		int argument = number - 1;
		String software = null;
		for (int i = 0; i < installedSoftware.length; i++) {
			if (i == argument) {
				software = installedSoftware[i];
				break;
			}
		}
		return software;
	}

	protected String[] getArray() {
		return installedSoftware;
	}
}
