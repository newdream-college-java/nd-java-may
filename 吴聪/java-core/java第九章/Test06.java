/*
�Ӽ���������10���������Ϸ�ֵΪ1 2 3��������3������Ϊ�Ƿ����֡����ͳ��ÿ�� �����ͷǷ����ֵĸ���
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] num=new int[10];
		int ff=0,zs=0;
		for(int i=0;i<num.length;i++){
			System.out.print("�������"+(i+1)+"������");
			num[i]=in.nextInt();
			if(num[i]==1||num[i]==2||num[i]==3){
				zs++;
			}else{
				ff++;
			}		
		}
		System.out.println("�Ϸ���������:"+zs);
		System.out.println("�Ƿ���������:"+ff);		
	}
}