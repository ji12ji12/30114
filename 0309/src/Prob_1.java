import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%4==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("1~"+num+"까지의 4의 배수의 합은"+sum+"입니다");
	}

}
