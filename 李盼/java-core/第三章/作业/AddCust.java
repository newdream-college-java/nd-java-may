/*
�ж�¼��Ļ�Ա���Ƿ�Ϸ�������Ϊ4λ������
*/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա�ţ�4λ��������");
		int hao = input.nextInt();
		System.out.println("�������Ա����<��/��>������λ����ʾ����");
		String shengRi = input.next();
		System.out.println("��������֣�");
		int jiFen = input.nextInt();
		while(hao/1000==0||hao/10000>=1){
			System.out.println("��Ա���������������룺");
			hao = input.nextInt();
		}
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�\n"+hao+"\t"+shengRi+"\t"+jiFen+"\t");
	}
}