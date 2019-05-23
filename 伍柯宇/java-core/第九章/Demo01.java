import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Random rd=new Random();
		int count=0,sum=0;
		for(int i=1;i<=10;i++){
			if(i%2==0){
				count++;
			}
		}
		int [] arr=new int[count];
		for(int i=1;i<=10;i++){
			int j=0;
			if(i%2==0){
				arr[j]=i;
				sum+=arr[j];
				System.out.println(arr[j]+"\t");
				j++;
			}
		}
		System.out.println("所有偶数的和为："+sum);
		boolean flag=false;
		int number=rd.nextInt(100)+1;
		for(int i=0;i<arr.length;i++){
			if(number==arr[i]){
				System.out.println(number+"在数组的下标为"+i+"的位置");
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(number+"不在数组中！！！");
		}
	}
}