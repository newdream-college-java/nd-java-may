import java.util.Scanner;
public class To8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա��:");//��λ��������
		int a=input.nextInt();
		System.out.println("�������Ա����:");//��/�ձ�ʾ
		String b=input.next();
		System.out.println("���������:");
		int c=input.nextInt();
		if(a>=1000&&a<=9999){	
			System.out.println(a+"\t"+b+"\t"+c);
		}else{
			System.out.println("����Ļ�Ա�Ų��Ϸ�");
		}
	}

}