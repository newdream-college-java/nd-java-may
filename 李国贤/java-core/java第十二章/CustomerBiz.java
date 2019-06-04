import java.util.Scanner;


public class CustomerBiz {
	public void stus(){
		Scanner input=new Scanner(System.in);
		String name=" ";
		for (int i = 1; i >0; i++) {
				System.out.println("请输入客户姓名：");
				name=name+input.next()+"\t";
				System.out.println("继续输入吗？(y/n)");
				String a=input.next();
				if(a.equals("n")){
					break;
				}
		}
		System.out.println("**********************************\n\t客户姓名列表\n**********************************\n"+name);
	}
	
	
}
