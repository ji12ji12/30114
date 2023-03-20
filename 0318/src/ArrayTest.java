import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		String str="";
		
		int count = 0;
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력하세요");
			array.add(i, sc.next());
			str = array.get(i);
		}
		
		for(int i=0; i<array.size();i++) {
			if(str.startsWith("김") == true) {
				count++;
				
			} else {
				array.remove(i);
			} 
		}
		
		System.out.println("성이 '김'인 분의 이름을 모두 출력합니다.");
		
		for(int i = 0; i<array.size(); i++) {
			System.out.print(array.get(i)+"  ");
		}
		System.out.println("김씨 성을 가진 분은 모두"+count+"명 입니다");
	}

}
