/*
ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i = 1;i<4;i++){
			System.out.print("�������Ա�ţ�4λ��������");
			int num = input.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			String bir = input.next();
			System.out.print("�������Ա���֣�");
			int fen = input.nextInt();
			if(num/1000<1||num/10000>=1){
				System.out.print("������Ļ�Ա������\n\n");
			}
			else{
				System.out.print("��¼��Ļ�Ա��Ϣ�ǣ�\n"+num+"\t"+bir+"\t"+fen+"\n\n");
			}
		}
	}
}