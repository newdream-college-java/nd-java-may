import java.util.*;
public class Student {
	String [] arr=new String[5];
	Scanner input=new Scanner(System.in);
	public void  addname(){
		
		
		for (int i = 0;  i< arr.length; i++) {
			System.out.print("������ͻ�������");
			arr[i]=input.next();
		}
		System.out.println("*******************************\n\n\t�ͻ������б�\n*******************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public void revise(){
		System.out.print("\n������Ҫ�޸ĵĿͻ�������");
		String name= input.next();
		System.out.print("�������µĿͻ�������");
		String newname= input.next();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(name)){
				arr[i]=newname;
				System.out.println("**********�޸Ľ��**********\n�ҵ����޸ĳɹ���");
				break;
			}else{
				System.out.println("�޸�ʧ�ܣ�����");
			}
		}
		System.out.println("*******************************\n\n\t�ͻ������б�\n*******************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
