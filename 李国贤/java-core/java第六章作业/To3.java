/*
����� 1900-2012 ������.
*/
public class To3{
	public static void main(String[] args){
		for(int i=1900;i<=2012;i++){
			if(i%4==0&&i%100!=100||i%400==0){
				System.out.println(i+"���������");
			}
		}
	}
}