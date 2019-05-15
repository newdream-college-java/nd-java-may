/*
输出 1900-2012 的闰年
*/
public class Test03{
	public static void main(String[] args){
		for(int i = 1900;i<2013;i++){
			if(i%4==0&&i%400!=0||i%400==0){
				System.out.println(i+"年是闰年");
			}
		}
	}
}