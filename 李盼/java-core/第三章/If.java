//����yes no�����������ͬ����
import java.util.Scanner;
public class If{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�㰮����");
		String str = input.next();
		if(str.equals("yes"))
			System.out.println("���ǰ��ҵ�");
		else if(str.equals("no"))
			System.out.println("ԭ���㲻����");
		else
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
	}

}