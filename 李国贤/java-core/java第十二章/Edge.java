
public class Edge {
	public void judge(int a,int b,int c){
		if (a + b > c && a + c > b && b + c > a) {
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
				System.out.println("��ֱ��������");
			}else if(sum>0){
				System.out.println("�Ƕ۽�������");
			}else{
				if(a==b&&b==c){
					System.out.println("�ǵȱ�������");
				}else{
					System.out.println("�����������");
				}
			}
		}else{
			System.out.println("���ܹ��������Σ�");
		}
	}
}
