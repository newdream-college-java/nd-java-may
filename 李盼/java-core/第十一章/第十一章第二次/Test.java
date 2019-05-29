import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		// TODO Auto-generated method stub
		
		
		//第一题
//		Manager M1 = new Manager();
//		System.out.println(M1.reformation());
		
		//我行我素购物管理系统
//		Menu m2 = new Menu();
//		m2.welcome();
//		Student s1 = new Student();
		
		//三个整数求最大值
//		System.out.println("请输入三个整数：");
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		s1.max(a,b,c);
		
		//输入人数 分数求总分平均分
//		System.out.println("请输入人数：");
//		int n = input.nextInt();
//		System.out.println(s1.avg(n));
		
		//显示余额
//		Account a1 = new Account();
//		System.out.println("余额为："+a1.insert());
		
		//随机产生商品猜价格
//		QuessMachine q1 = new QuessMachine();
//		q1.guess();
		
		//求阶乘
//		Factorial f = new Factorial();
//		System.out.print("请输入一个整数：");
//		int num = input.nextInt();
//		System.out.println(f.jiecheng(num));
		
		
		//判断闰年
		System.out.println("请输入要判断的年份：");
		int m = input.nextInt();
		RunNian r = new RunNian();
		r.year(m);
	}
}
