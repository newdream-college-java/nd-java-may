/*
ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ����������ַ���
*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String b="",letter=in.next();
		for(int i=1;!letter.equals("Esc");i++){
			if(!letter.equals("Esc")){
				b+=letter;
			}
//			b+=letter;
			letter = in.next();
		}
		System.out.print(b);
	}
}