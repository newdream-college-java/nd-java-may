import java.util.*;
public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����Ԫ��Ϊ{1,2,3,4,6,7,8}������������λ�ã�");
		int index = input.nextInt()-1;
		System.out.println("����������Ԫ�أ�");
		int a = input.nextInt();
		int[] arr = {1,2,3,4,6,7,8,0};
		Number d1=new Number();
		d1.insertArray(arr, index, a);
		System.out.print("\n����������Ϊ��");
		for(int i = 0;i < arr.length;i++){
		System.out.print(arr[i]+"\t");
		}
	}

}
