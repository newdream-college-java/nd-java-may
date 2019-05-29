
public class Computer {
	int a;
	int b;
	public void plus(){
		System.out.println("和为："+(a+b));
	}
	public void reduce(){
		System.out.println("差为："+(a-b));
	}
	public void ride(){
		System.out.println("乘积为："+a*b);
	}
	public void except(){
		double c=a/b;
		System.out.println("商为："+c);
	}
}
