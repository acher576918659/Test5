package tw.aaa.myproject.Test5;

public class hw5_14 {

	public static void main(String[] args) {
		int i = 3500, j = 0;
		while (i >= 3) {
			i = i / 2;
			j++;

			if (i < 3)
				break;
		}
		System.out.println(j + "天");

	}
}