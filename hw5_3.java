package tw.aaa.myproject.Test5;

import java.util.Scanner;

public class hw5_3 {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int a;
		System.out.println("請輸入一整數：");
		a=b.nextInt();
		if(a<0)
			{a=-a;
			System.out.println("絕對值為："+a);
			}
		else
		{
			System.out.println("絕對值為："+a);
		}
	}

}
