import java.util.Scanner;


public class TestStartSMS {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用我行我素用户管理系统");
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		System.out.println("********************");
		
		System.out.println("请选择,输入数字");
		int a = input.nextInt();
		switch(a){
		case 1:
		System.out.println("登录系统");
		System.out.print("请输入用户名:");
		String sc = input.next();
		System.out.print("请输入密码:");
		String sb = input.next();
		if("1234".equals(sc) && "1234".equals(sb)){
			System.out.println("登录成功");
		}else{
			System.out.println("@@您没有权限进入系统,请重新登录@@");
		}
		break;
		case 2:
		System.out.println("退出");
		break;
		}
	}

}
