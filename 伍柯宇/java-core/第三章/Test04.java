import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		String y="yes",x="no";
		Scanner input=new Scanner(System.in);
		System.out.println("�㰮����");
		String a=input.next();
		if(a.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}
		if(a.equals("no")){
			System.out.println("ԭ���㲻����");
		}
		if(!a.equals("yes")&&!a.equals("no")){
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}	

	}
} 
