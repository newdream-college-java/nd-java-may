import java.util.*;
public class Student {
	String [] arr=new String[5];
	Scanner input=new Scanner(System.in);
	public void  addname(){
		
		
		for (int i = 0;  i< arr.length; i++) {
			System.out.print("请输入客户姓名：");
			arr[i]=input.next();
		}
		System.out.println("*******************************\n\n\t客户姓名列表：\n*******************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public void revise(){
		System.out.print("\n请输入要修改的客户姓名：");
		String name= input.next();
		System.out.print("请输入新的客户姓名：");
		String newname= input.next();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(name)){
				arr[i]=newname;
				System.out.println("**********修改结果**********\n找到并修改成功！");
				break;
			}else{
				System.out.println("修改失败！！！");
			}
		}
		System.out.println("*******************************\n\n\t客户姓名列表：\n*******************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
