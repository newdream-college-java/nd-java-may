import java.util.Scanner;

public class CustomerBiz{
	Scanner input = new Scanner(System.in);
	public void customer(){
			String name = "";
			for(;;){
				System.out.print("请输入客户的姓名：");
				name = name + input.next() + "\t";
				System.out.print("继续输入吗？（y/n）");
				String a = input.next();
				if(a.equals("n")){
					break;
				}
			}
			System.out.println("**********************************\n\t客户姓名列表\n**********************************\n"+name);
	}
}
