import java.util.*;
public class Student01 {
	public void calcScore(){
		int sum=0;
		double ave=0;
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"个同学的成绩：");
			Scanner input=new Scanner(System.in);
			int score=input.nextInt();
			sum+=score;
		}
		System.out.println("总分为："+sum);
		System.out.println("平均分为："+sum/10.0);
	}
	
	public int getMax(){
		int []arr = new int [10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("请输入整数：");
			arr[i]=input.nextInt();
			}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		return max;
	}
}
