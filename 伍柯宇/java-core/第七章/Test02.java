/*
ѭ�������ַ�����Ҫ��������ַ�������������ֱ������"Esc"����
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String str = input.next();
		String a = "0";
		if(!str.equals("Esc")){
			while(!a.equals("Esc")){
				System.out.print("��������룺");
				a = input.next();
				if(!a.equals("Esc")){
					str = str +a;
				}
			}
			System.out.print(str);
		}
	}
}