
public class RunNian {
	public void year(int a){
		if(a%4==0&&a%100!=0||a%400==0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}
