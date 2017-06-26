package tw.aaa.myproject.Test5;

import java.util.Scanner;

public class hw_5_7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b;
		System.out.println("請輸入：");
		b = a.nextInt();
		if (b % 5 == 0 && b % 6 == 0) {
			System.out.println(b + "可被5與6整除");
		} else {
			System.out.println(b + "不可被5與6整除");
		}
	}
}
