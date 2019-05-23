import java.util.*;

public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		double sum=0,ave=0;
		int a=0,b=0,c=0;
		System.out.println("请输入十个学生的单科成绩：");
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个同学的成绩：");
			arr[i]=input.nextInt();
			sum=sum+arr[i];
			if(arr[i]<60){
				a++;
			}else if(arr[i]>=60&&arr[i]<80){
				b++;
			}else{
				c++;	
			}
		}
		System.out.println("60分以下的人有："+a);
		System.out.println("60分到80分的人有："+b);
		System.out.println("80分以上的人有："+c);
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("最大值为"+max);
		int mix=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<mix){
				mix=arr[i];
			}
		}
		System.out.println("最小值为"+mix);
		ave=sum/10.0;
		System.out.println("平均值为："+ave);
	}
}
