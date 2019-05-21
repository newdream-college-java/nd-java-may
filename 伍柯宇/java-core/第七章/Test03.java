/*
猴子吃桃子，一天一个半，十天还剩一个，最开始有几个
*/
public class Test03{
	public static void main(String[] args){
		double n = 1;
		for(int i=1;i<10;i++){
			n = (n+1)*2;
		}
		System.out.print((int)n+"个桃子");
	}
}