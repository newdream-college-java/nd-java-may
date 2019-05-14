/*
输出计算 100+101+102+……+200 之和
*/
public class Test01{
	public static void main(String[] args){
		int i = 100,sum = 0;
		while(i<201){
			sum +=i;
			i++;
		}
		System.out.println(sum);                 //15150
	}
}