package jp.co.tafs.lesson;

public class GamePlayer {
	private final static String SOFTWARE_NAME_0 = "�|�P�b�g�����X�^�[ �_�C�������h";
	private final static String SOFTWARE_NAME_1 = "�|�P�b�g�����X�^�[ �u���b�N";
	private final static String SOFTWARE_NAME_2 = "�|�P�b�g�����X�^�[ X";
	private final static String SOFTWARE_NAME_3 = "�|�P�b�g�����X�^�[ �I���K���r�[";
	private final static String SOFTWARE_NAME_4 = "�|�P�b�g�����X�^�[ �T��";

	public static void main(String[] args) {
		//GameConsole console = new GameConsole();
		SuperGameConsole console = new SuperGameConsole();

		System.out.println("�Q�[���@�̖��O�F" + console.getHardwareName());
		System.out.println("�Q�[���@�̃��[�J�[�F" + console.getHardwareMaker());
		System.out.println("�l�b�g���[�N�ڑ��@�\�F" + console.getAvailableNetwork());
		System.out.println("�������F" + console.getReleaseDate());
		System.out.println("���i�F" + console.getPrice() + "�~\n");

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