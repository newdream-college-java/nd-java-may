
public class Date {
	int year;
	
	public void date(){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"�����꣬");
		}else{
			System.out.println(year+"�������꣬");
		}
	}
}
