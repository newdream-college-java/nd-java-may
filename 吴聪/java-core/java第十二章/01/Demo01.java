import java.util.Scanner;
public class Demo01 {
	public void list(){
		String a= "";
		String b ="y";
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("������ͻ�������");
			String name =in.next();
			a=a+(name+"\t");
			System.out.print("���������𣿣�y/n��");
			b = in.next();
		}while(b.equals("y"));
		System.out.print("\t�ͻ��б�\n"+a);
	}
}