import java.util.Scanner;

public class CustomerBiz{
	Scanner input = new Scanner(System.in);
	public void customer(){
			String name = "";
			for(;;){
				System.out.print("������ͻ���������");
				name = name + input.next() + "\t";
				System.out.print("���������𣿣�y/n��");
				String a = input.next();
				if(a.equals("n")){
					break;
				}
			}
			System.out.println("**********************************\n\t�ͻ������б�\n**********************************\n"+name);
	}
}
