import java.util.Scanner;


public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account d1=new Account();
			
		Scanner input=new Scanner(System.in);
		for (int i = 1; i>0; i++) {
		System.out.println("1.存款 \t2.取款\t0.退出\n请选择你需要办理的业务：");
			int a=input.nextInt();
			if (a==1) {
				System.out.println("请输入金额：");
				d1.money=input.nextInt();
				d1.save(d1.money);
				continue;
			}else if (a==2) {
				System.out.println("请输入金额：");
				d1.money=input.nextInt();
				d1.with(d1.money);
				continue;
			}else if (a==0) {
				System.out.println("谢谢使用！");
				break;
			}
			System.out.println("请输入正确的数字");
			
		}

	
	}

}
