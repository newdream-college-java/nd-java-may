/*
�Ӽ�������ʮ������1,2,3,�ǺϷ���������Ϊ�Ƿ����֣�ͳ�ƺϷ����ͷǷ����ָ���
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count1 = 0,count2 = 0;
		int[] a = new int[10];
		for(int i = 0;i<10;i++){
			System.out.print("������"+(i+1)+"�ڸ�������");
			a[i] = input.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.print("�Ϸ�������"+count1+"��\n�Ƿ�������"+count2+"��");
	}
}