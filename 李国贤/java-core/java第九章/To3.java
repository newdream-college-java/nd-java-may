import java.util.Scanner;
import java.util.Arrays;
public class To3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);		
		String[] arr={"a","c","u","b","e","p","f","z"};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n���������");
		Arrays.sort(arr);
		for(int i=0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n�������Ϊ��");
		for(int i=7;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
}