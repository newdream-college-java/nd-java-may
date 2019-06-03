package day2;
//判断闰年
public class Demo06 {
	int year;
	public void calc(){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
