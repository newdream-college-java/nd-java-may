/*
使用while循环 输出100，95，90，...，5.
*/
public class Test03{
	public static void main(String[] args){
		int a=105;
		int i=1;
		while(i<21){
			a=a-5;
			System.out.println(a);
			i++;
		}
//		System.out.println(a);
	}
}