import java.util.Arrays;


public class Customer {
	
	public void stus(String[] sum){
		Arrays.sort(sum);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]+"\t");
			
		}
	}
}
