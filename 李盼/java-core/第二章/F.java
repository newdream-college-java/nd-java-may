/*�����ۿ۹���СƱ��ÿ����100Ԫ���3��*/

import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������T������");
		int shuliang1 = input.nextInt();
		System.out.println("����������Ь����");
		int shuliang2= input.nextInt();
		System.out.println("����������������");
		int shuliang3 = input.nextInt();
		System.out.println("�������ۿ�(С��1��С��)");
		double zhekou = input.nextDouble();
		System.out.println("������ʵ��֧������");
		int jiaofei = input.nextInt();
		int jine1=245*shuliang1,
		     jine2=570*shuliang2,
		     jine3=320*shuliang3;
		double zongjine=(jine1+jine2+jine3)*zhekou,
		             zhaoqian=jiaofei-zongjine;
		int jifen = (int)zongjine/100*3;
		System.out.println("******************���ѵ�********************\n����Ʒ\t����\t����\t���\nT��\t$245\t"+shuliang1+"\t"+jine1+"\n������\t$570\t"+shuliang2+"\t"+jine2+"\n����Ь\t$320\t"+shuliang3+"\t"+jine3+"\n\n\n\n�ۿۣ�"+zhekou+"\n�����ܽ�$"+zongjine+"\nʵ�ʽ��ף�$"+jiaofei+"\n��Ǯ��$"+zhaoqian+"\n���ι�������õĻ�����"+jifen);
		
	}
}