/*
ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args ){
		Scanner in = new Scanner(System.in);
		int num,a;
		String bir;
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��(4λ����)��");
			num =in.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>:");
			bir =in.next();
			System.out.print("�������Ա���֣�");
			a =in.nextInt();
			if(num/1000<10&&num/1000>0){
			System.out.println("������Ļ�Ա��Ϣ�ǣ�\n"+num+"\t"+bir+"\t"+a);
			}else{
			System.out.println("¼��ʧ�ܣ�");
			}
		}
	}
}