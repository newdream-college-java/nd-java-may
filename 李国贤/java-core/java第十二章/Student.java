import java.util.Scanner;
public class Student {
	public void xiugai(){
		Scanner input = new Scanner(System.in);
		String[] name = new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入客户姓名：");
			name[i] = input.next();
		}
		System.out.println("*************************************\n\t客户列表\n***************************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println("请输入要修改的客户姓名：");
		String jiuname = input.next();
		System.out.println("请输入新的客户姓名：");
		String newname = input.next();
		boolean flag = false;
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals(jiuname)){
				name[i] = newname;
				System.out.print("修改成功！");
				flag = true;
				break;
			}
		}
		if(flag){
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i]+"\t");
			}
		}else{
			System.out.println("输入的客户姓名没有找到！");
		}
	}
}
