import java.util.*;

public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		int a=0,b=0;
		System.out.println("������10��������");
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("�Ƿ����ָ���Ϊ��"+b);
		System.out.println("��������Ϊ��"+(10-b));
	}
}