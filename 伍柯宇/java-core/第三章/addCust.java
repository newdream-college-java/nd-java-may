import java.util.Scanner;

public class addCust{
	public static void main(String[] args){
		System.out.println("�������ع������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n\n");
		Scanner input=new Scanner(System.in);
		System.out.print("�������Ա�ţ�<��λ����>����");
		int a=input.nextInt();
		if(a/1000>0&&a/10000==0){
			System.out.println(a+"��һ����λ��������");
		}else{
			System.out.println(a+"����һ����λ��������");
		}
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		String b=input.next();
		System.out.print("��������֣�");
		int c=input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�"+a+"\t"+b+"\t"+c);
	}	
}