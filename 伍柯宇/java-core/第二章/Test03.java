import  java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������λ����������");
		int a=input.nextInt();
		int last=a%10;
		int ten=a/10%10;
		int hundred=a/100%10;
		int thousand=a/1000%10;
		System.out.println(a+"�ĸ�λΪ��"+last);
                                System.out.println(a+"��ʮλΪ��"+ten);
        		System.out.println(a+"�İ�λΪ��"+hundred);
        		System.out.println(a+"��ǧλΪ��"+thousand);
	}
}