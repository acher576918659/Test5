package tw.aaa.myproject.Test5;

public class hw5_18 {

	public static void main(String[] args) {
		int i, n = 45, prime, cnt = 0;
		prime = n - 1;
		while (cnt != 1) {
			for (i = 2; i < prime; i++)
				if (prime % i == 0) // not a prime
				{
					prime--;
					continue;
				}
			cnt = 1;
		}
		System.out.println("小於" + n + "的最大質數為" + prime);
	}
}
