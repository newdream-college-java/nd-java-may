import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ѧϰ�����Ƿ�ϸ�");
		String i = input.next();
		while(i.equals("��")){
			System.out.println("�����Ķ��̲ģ�ѧϰ���۲��֣������ϻ���̣�����Ŷ���벿�֡�");
			System.out.println("ѧϰ�����Ƿ�ϸ�");
			i = input.next();
		}
	}
}