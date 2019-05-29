
public class RunNian {
	public void year(int a){
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}
