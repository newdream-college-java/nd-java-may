import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		System.out.println("�����㰮����");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		if(a.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}else if(a.equals("no")){
			System.out.println("ԭ�����ǲ����ҵ�");
		}else{
			System.out.println("�㵽�װ����ǲ������Լ�Ҳ�������");
		}
	}

}