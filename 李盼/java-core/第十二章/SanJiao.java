
public class SanJiao {
	public void panduan(int a,int b,int c){
		if(a + b > c && a + c > b && b + c > a){
					sm(a,b,c);
		}else{
			System.out.println("不能构成三角形");
		}
	}
	public void sm(int a,int b,int c){
		int sum;
		int max = a;
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		if(max==a){
			sum = a*a-b*b-c*c;
		}else if(max==b){
			sum = b*b-a*a-c*c;
		}else{
			sum = c*c-b*b-a*a;
		}
		if(sum==0){
			System.out.println("是直角三角形");
		}else if(sum>0){
			System.out.println("是钝角三角形");
		}else{
			if(a==b&&b==c){
				System.out.println("是等边三角形");
			}else{
				System.out.println("是锐角三角形");
			}
		}
	}
}
