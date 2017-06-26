package tw.aaa.myproject.Test5;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input;
		int cnt = 0;
		int passwd = 6128;
		while (true) {
			System.out.print("請輸入密碼：");
			input = scn.nextInt();
			++cnt;
			if (input == 6128) {
				System.out.println("密碼正確！");
			break;}
			if(cnt>=3)
			{System.out.println("密碼輸入超過三次！");
			break;}
		}
	}
}
