package src.main.java;

public class Question2 {
	/**
	 * mainメソッドです。
	 * ここから処理を実行します。
	 */
	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr1 = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrint(arr1);

		long start = System.currentTimeMillis();

		// ソートを実行します。
		bubbleSort(arr1, 0, arr1.length - 1);

		long end = System.currentTimeMillis();

		// ソート後の値をコンソールに出力します。
		System.out.print("\nＢソート：");
		arrayPrint(arr1);

		System.out.println((end - start) + "ms");

		int[] arr2 = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		start = System.currentTimeMillis();

		quickSort(arr2, 0, arr2.length - 1);

		end = System.currentTimeMillis();

		// ソート後の値をコンソールに出力します。
		System.out.print("\nＱソート：");
		arrayPrint(arr2);

		System.out.println((end - start) + "ms");
	}

	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	public static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int L = left, R = right, wk;
		int p = arr[(left + right) / 2];
		while (L <= R) {
			while (arr[L] < p) {
				L++;
			}
			while (arr[R] > p) {
				R--;
			}
			if (L <= R) {
				wk = arr[L];
				arr[L] = arr[R];
				arr[R] = wk;
				L++;
				R--;
			}
		}
		quickSort(arr, left, R);
		quickSort(arr, L, right);
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