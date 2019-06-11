import java.util.*;
public class Custom {
	Cus[] str=new Cus[5];
	
	public Cus[] people(){
		Scanner input = new Scanner(System.in);
		String s = "y";
		for (int i = 0; i < str.length&&s.equals("y"); i++) {
			str[i] = new Cus();
			System.out.println("请输入客户姓名：");	
			str[i].name = input.next();
			System.out.println("请输入客户年龄：");
			str[i].age = input.nextInt();
			System.out.println("此客户是否办理会员(false/true)：");
			str[i].card = input.nextBoolean();
			System.out.println("是否继续？(y/n)");
			s = input.next();
			if(s.equals("n")){
				break;
			}
		}
		return str;
	}
	public void show(Cus str[]){
		for (int i = 0; i < str.length; i++) {
			if(str[i]!=null){
			System.out.print(str[i].name+"\t");
			System.out.print(str[i].age+"\t");
			System.out.print(str[i].card+"\t");
			System.out.println();
			}
		}
	}
}
