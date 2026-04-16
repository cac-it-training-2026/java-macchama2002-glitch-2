package basic.question04;

import java.io.IOException;

/**
 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int[] ageGroup = new int[5];
		ageGroup = new int[] { 12, 18, 24, 19, 20 };

		System.out.println("３番目の人の年齢は" + ageGroup[2] + "歳です。");
	}

}
