import java.util.Scanner;


public class CustomerBiz {
	public void stus(){
		Scanner input=new Scanner(System.in);
		String name=" ";
		for (int i = 1; i >0; i++) {
				System.out.println("������ͻ�������");
				name=name+input.next()+"\t";
				System.out.println("����������(y/n)");
				String a=input.next();
				if(a.equals("n")){
					break;
				}
		}
		System.out.println("**********************************\n\t�ͻ������б�\n**********************************\n"+name);
	}
	
	
}
