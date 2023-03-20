import java.util.ArrayList;
import java.util.Scanner;

public class LongList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		String str="";
		int max=0;
		String longStr="";
		int count = 0;
		for(int i=0; i<5; i++) {
			System.out.println("별명을 입력하세요");
			array.add(i, sc.next());
			str = array.get(i);
			
			if(str.length()>max) {
				max = str.length();
				longStr = str;
			}
		}
		System.out.println("가장 긴 별명은 ~ :"+longStr);
	}

}
