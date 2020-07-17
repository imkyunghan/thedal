/*
 * 메인클레스

 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		MyClass2 mu = new MyClass2();
		MyClass3 mo = new MyClass3();
		MyClass4 ma = new MyClass4();
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ma.rndNum();
		ArrayList<Integer> list = ma.rnd2NumList(rnd.nextInt(89)+10,rnd.nextInt(89)+10);
		for(;;) {
			System.out.print(list.get(0)+ "+" + list.get(1)+ "=");
			if(ma.input()==list.get(2)) {
				System.out.println("정답입니다");
				break;
			}
			System.out.println("멍청합니다.다시하세요");
		}
	}

}
