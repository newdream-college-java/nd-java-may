import java.util.Scanner;
public class Demo01 {
	public void list(){
		String a= "";
		String b ="y";
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("请输入客户姓名：");
			String name =in.next();
			a=a+(name+"\t");
			System.out.print("继续输入吗？（y/n）");
			b = in.next();
		}while(b.equals("y"));
		System.out.print("\t客户列表\n"+a);
	}
}