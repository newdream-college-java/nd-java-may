/*
2012年培养学员25万人，每年增长25%，请问按此增长速度，
到哪一年培训人数将达到100万人？
*/
public class Demo01{
	public static void main(String[] args){
		double i=250000;
		int j=2012;
		while(i<=100*10000){
			i = i*1.25;
			j++;
		}
		System.out.println("第"+j+"年人数达到100万人");
	}
}