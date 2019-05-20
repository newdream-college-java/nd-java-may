/*
1.3¡¢Êä³ö 1900-2012 µÄÈòÄê
*/
public class Test03{
	public static void main(String[] args){
		int year=1900;
		for(;year<=2012;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(year);
			}
		}
	}
}