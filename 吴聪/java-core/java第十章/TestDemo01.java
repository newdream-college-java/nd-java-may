//import java.util.Scanner;
public class TestDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 a1 = new Demo01();
		a1.name="admin1";
		a1.passwd="111111";
		System.out.println(a1.name);
		System.out.println(a1.passwd);
		Demo01 a2 = new Demo01();
		a2.name="admin2";
		a2.passwd="222222";
		System.out.println(a2.name);
		System.out.println(a2.passwd);
//		Scanner in = new Scanner(System.in);
		System.out.println("请输入用户名：");
	}

}