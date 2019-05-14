/*
计算100+101+102+...+200 输出结果
*/
public class Test01{
	public static void main(String[] args){
		int a=0;
		int i=100;
		while(i<201){
			a+=i;
			i++;
		}
		System.out.print(a);
	}
}