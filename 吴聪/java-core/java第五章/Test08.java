/*
ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��
����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ��
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("****************************************\n��ѡ�������Ʒ��ţ�\n1��T��\t2������Ь\t3��������\n****************************************\n\n");
		String a="y";
		int b=0,s;
		do{
			System.out.println("��������Ʒ��ţ�");
			int i = input.nextInt();
			System.out.println("�����빺��������");
			int j = input.nextInt();
			if(i==1){
				s = 100*j;
				b = b +s;
				System.out.println("T����100\t����"+j+"\t�ϼ�"+"��"+s);  
			}
			else if(i==2){
				s = 200*j;
				b = b +s;
				System.out.println("����Ь��200\t����"+j+"\t�ϼ�"+"��"+s);
			}
			else if(i==3){
				s = 300*j;
				b = b +s;
				System.out.println("�����ģ�300\t����"+j+"\t�ϼ�"+"��"+s);
			}
			else{
					System.out.println("�������");
			}
			System.out.println("�Ƿ����(y/n)��");
			a = input.next();
		}while(a.equals("y"));
		System.out.println("�����븶���");
		int money = input.nextInt();
		System.out.println("�ۿۣ�0.8\nӦ����"+(b*0.8)+"\n�����"+money+"\n��Ǯ��"+(money-b*0.8));
	}
}