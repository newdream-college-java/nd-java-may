import java.util.Scanner;


public class Triangle {
	Scanner input=new Scanner(System.in);
	public void stsu(int a,char b){
//		System.out.println("�������иߣ�");
//		 a=input.nextInt();
//		System.out.println("�������ӡ���ַ���");
//		 b=input.next().charAt(0);
		for (int i = 1; i < a+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}
