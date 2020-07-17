import java.util.*;
public class MyClass4 {
	
//	public int thehagi(){
//		Random rnd = new Random();
//		int a = rnd.nextInt(89)+10;
//		int b = rnd.nextInt(89)+10;
//		System.out.println(a + "+"+ b + "=");
//		return a+b;
//	}
	Scanner scn = new Scanner(System.in);
	Random rnd = new Random();
	
	public int[] rndNum() {
		int [] rndNum = new int[2];
		rndNum[0] = rnd.nextInt(89)+10;
		rndNum[1] = rnd.nextInt(89)+10;
		return  rndNum;
	}
	public ArrayList<Integer> rnd2NumList(int a , int b){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(a+b);
		return list;
		
	}
	public int input() {
		return scn.nextInt();
	}
	
	public ArrayList<Integer> thehagi(ArrayList<Integer>list){
		return list;

	}
	public void h1() {
	int a = rnd.nextInt(89)+10;
	int b = rnd.nextInt(89)+10;
	System.out.println(a + "+"+ b + "=");
	for(;;) {
		int c =scn.nextInt();
		if(c==a+b) {
			System.out.println("정답입니다");
			break;
		}
		System.out.println("멍청합니다.다시하세요");
	}
	}
}
