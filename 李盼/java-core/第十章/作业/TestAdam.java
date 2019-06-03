import java.util.Scanner;
public class TestAdam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adam d1=new Adam();
		Adam d2=new Adam();
		d1.name="admin1";
		d1.word=111111;
		d1.show();
		
		d2.name="admin2";
		d2.word=222222;
		d1.show();
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String c=input.next();
		System.out.println("请输入密码：");
		int d=input.nextInt();
		if(c.equals(d1.name)&&d==d1.word){
			System.out.println("请输入新密码：");
			int e=input.nextInt();
		
			System.out.println("修改密码成功，您的新密码为："+e);
		
			System.out.println("请输入用户名：");
			String m=input.next();
			System.out.println("请输入密码：");
			int n=input.nextInt();
			if(m!=d1.name||n!=e){
				System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
			}	
		}
	}

}
