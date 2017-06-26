package tw.aaa.myproject.Test5;

import java.util.Scanner;

public class hw5_4 {

	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		char a;
		System.out.println("請輸入一字元：");
a=b.next().charAt(0);
if(a<='9' && a>='0')
{System.out.println(a+"為數字");}
	
else if(a>='a'&& a<='z')
	{
		System.out.println(a+"為字元");
	}
else
{System.out.println("輸入錯誤");}
}
}
