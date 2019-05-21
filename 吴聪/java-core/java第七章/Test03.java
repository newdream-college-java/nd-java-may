/*
猴子摘了一堆枣N个，第一天吃了一半，还嫌不够，又多吃了一个；第二天吃了剩下的一半零一个；以后每天如此，到第十天，猴子一看剩下一个。问最初有多少个枣子
*/
public class Test03{
	public static void main(String[] args){
		int i=1,num=1;
		for(;i<10;i++){
			num=(num+1)*2;
		}
		System.out.print(num);
	}
}