/*
��sort()������������������
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] arrStr = {"a","c","u","b","e","p","f","z"};
		System.out.print("ԭ�ַ����У�");
		for(int i =0;i<8;i++){
			System.out.print(arrStr[i]+"\t");
		}
		System.out.print("\n���������");
		Arrays.sort(arrStr);
		for(int i =0;i<8;i++){
			System.out.print(arrStr[i]+"\t");
		}
		System.out.print("\n�������Ϊ��");
		for(int i = 7;i>=0;i--){
			System.out.print(arrStr[i]+"\t");
		}
	}
}