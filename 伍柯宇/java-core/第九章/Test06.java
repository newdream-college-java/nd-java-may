import java.util.*;

public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		int a=0,b=0;
		System.out.println("请输入10个整数：");
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
			if(arr[i]==1||arr[i]==2||arr[i]==3){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("非法数字个数为："+b);
		System.out.println("整数个数为："+(10-b));
	}
}