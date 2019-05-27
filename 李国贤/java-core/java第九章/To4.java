import java.util.Scanner;
import java.util.Arrays;
public class To4{
	public static void main(String[] args){
		char[] arr={'a','c','u','b','e','p','f','z',' '};
		Arrays.sort(arr);     //升序
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Scanner input=new Scanner(System.in);
		System.out.print("请输入这个字符：");
		char ch =input.next().charAt(0);
		int index=arr.length;
		for(int i=0;i<arr.length;i++){//找到比他大的并记录
			if(ch<arr[i]){
				index=i;
				break;
			}
		}
		if(index==arr.length){//比所有的都大
			for(int i=0;i<=arr.length-2;i++){
				arr[i]=arr[i+1];
			}
			arr[index-1]=ch;
		}else if(index==0){//比所有的都小
			arr[index]=ch;
		}else{
			for(int i=0;i<=index-2;i++){
				arr[i]=arr[i+1];
			}
		}
		arr[index-1]=ch;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}