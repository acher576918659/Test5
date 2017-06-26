package tw.aaa.myproject.Test5;

public class hw5_11 {

	public static void main(String[] args) {
	int i=1,j=1;
	do{
		do{
			System.out.print(i+"*"+j+"="+i*j+"\t");
		j++;
		}
		while (j<=9);
		System.out.println();
			i++;
			j=1;
	}while(i<=9);
	
	}

}
