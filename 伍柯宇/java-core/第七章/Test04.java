/*
�û��������޴��������֣��ж���������������0�� ������ֱ������999����
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i= 0,j = 0,k = 0;
		do{
			System.out.print("������һ������999��������");
			int m = input.nextInt();
			if(m<0){
				i++;
			}
			else if(m>0){
				if(m==999){
					break;
				}
				else{
					j++;
				}
			}
			else{
				k++;
			}
		}while(true);
		System.out.println("��������Ϊ"+j);
		System.out.println("��������Ϊ"+i);
		System.out.println("0����Ϊ"+k);
	}
}