/*
 * �����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ��
 */
import java.util.*;
public class CustomerBiz{
	Scanner input=new Scanner(System.in);
	public void customer(){
		String []arr=new String[4];
		for(int i=0;i<arr.length;i++){
			System.out.print("������ͻ�������");
			arr[i]=input.next();
			System.out.println("���������� (y/n)");
			String a=input.next();
			if(a.equals("n")){
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�ͻ�������"+arr[i]);
		}
		
	}
}










