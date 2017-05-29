package src.main.java;

public class Question2a {

	/**
	 * mainメソッドです。
	 * ここから処理を実行します。
	 */
	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrint(arr);

		// ソートを実行します。
		quickSort(arr, 0, arr.length - 1);

		// ソート後の値をコンソールに出力します。
		System.out.print("\nソート後：");
		arrayPrint(arr);
	}

	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	static void quickSort(int[] d, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = d[(left + right) / 2];
		int l = left, r = right, tmp;
		while (l <= r) {
			while (d[l] < p) {
				l++;
			}
			while (d[r] > p) {
				r--;
			}
			if (l <= r) {
				tmp = d[l];
				d[l] = d[r];
				d[r] = tmp;
				l++;
				r--;
			}
		}
		quickSort(d, left, r); // ピボットより左側をクイックソート
		quickSort(d, l, right); // ピボットより右側をクイックソート
	}

	public static void bubbleSort(int[] arr, int left, int right) {
		int wk;
		for (int j = right; j > 0; j--) {
			for (int i = 0; i < j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					wk = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = wk;
				}
			}
		}
	}

	/**
	 * 配列の値を順に出力するメソッドです。
	 * 
	 * @param arr 出力対象の配列。
	 * @return 計算結果を配列で返します。
	 */
	public static void arrayPrint(int[] arr) {

		// 配列の値を順に取り出し、コンソールに出力します。
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//System.out.println("");
	}

}