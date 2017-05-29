package src.main.java;

//import java.util.Scanner;

public class Flowchart2 {
	public static void main(String[] args) {
		System.out.println(input());
	}

	static String input() {
		int y = 2400;
		String hantei = "";
		for (;;) {
			//Scanner y = new Scanner(System.in);
			if (y < 10000 && y > 999) {
				break;
			}
			else {
				System.out.println("1000～9999の範囲で入力してください");
			}
		}
		if (y != 9999) {
			hantei = decision(y);
		}
		else {
			hantei = "中断しました。";
			return hantei;
		}
		return hantei;
	}

	static String decision(int y) {
		String dec = "";
		String uru = "年はうるう年です。";
		String nouru = "年はうるう年ではありません。";
		if (y % 400 == 0) {
			dec = uru;
		}
		else if (y % 4 == 0) {
			if (y % 100 == 0) {
				dec = nouru;
			}
			else {
				dec = uru;
			}
		}
		else {
			dec = nouru;
		}
		dec = y + dec;
		return dec;
	}
}
