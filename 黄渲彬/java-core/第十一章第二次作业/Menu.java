
/**
 * 这是一个添加Javadoc注释并生成Javadoc文档的一个类
 * 
 * */
public class Menu {
	
	public void showLoginMenu(){
		//实现显示登录系统
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1.登录系统");
		System.out.println("2.退出");
	}
	public void showMainMenu(){
		//主菜单
		System.out.println("我行我素购物管理系统主菜单");
		System.out.println("1.客户信息管理");
		System.out.println("2.真情回馈");
	}
	public void showCustMenu(){
		//客户管理系统菜单
		System.out.println("显示所有客户信息");
		System.out.println("添加客户信息");
		System.out.println("修改客户信息");
		System.out.println("查询客户信息");
	}
	public void showSendGMenu(){
		//实现显示真情回馈菜单
		System.out.println("我行我素管理系统>真情回馈");
		System.out.println("1.幸运大放送");
		System.out.println("2.幸运抽奖");
		System.out.println("3.生日问候");
		
		
		
	}
	public void signOut(){
		System.out.println("退出");
	}
}
