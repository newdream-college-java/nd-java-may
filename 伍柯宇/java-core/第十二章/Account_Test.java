import java.util.*;
public class Account_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Account acc = new Account();
		
		while(true){
			System.out.println("1、存款   2、取款    0、退出");
			System.out.print("请选择你要办理的业务：");
			int x=input.nextInt();
			if(x!=0){
				switch(x){
				case 1:
					System.out.print("请输入你要存入的金额：");
					int a=input.nextInt();
					acc.addmoney(a);
					break;
				case 2:
					System.out.print("请输入你要取出的金额：");
					int b=input.nextInt();
					acc.deletemoney(b);
					break;
				
				}
			}else{
				System.out.print("***退出***\n");
				System.exit(-1);
			}
		}
		
	}

}
