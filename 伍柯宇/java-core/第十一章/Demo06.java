package day2;
//�ж�����
public class Demo06 {
	int year;
	public void calc(){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
}
