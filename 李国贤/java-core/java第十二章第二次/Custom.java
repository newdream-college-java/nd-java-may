import java.util.*;
public class Custom {
	Cus[] str=new Cus[5];
	
	public Cus[] people(){
		Scanner input = new Scanner(System.in);
		String s = "y";
		for (int i = 0; i < str.length&&s.equals("y"); i++) {
			str[i] = new Cus();
			System.out.println("������ͻ�������");	
			str[i].name = input.next();
			System.out.println("������ͻ����䣺");
			str[i].age = input.nextInt();
			System.out.println("�˿ͻ��Ƿ�����Ա(false/true)��");
			str[i].card = input.nextBoolean();
			System.out.println("�Ƿ������(y/n)");
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
