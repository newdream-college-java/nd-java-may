import java.util.*;
public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("数据元素为{1,2,3,4,6,7,8}，请输入插入的位置：");
		int index = input.nextInt()-1;
		System.out.println("请输入插入的元素：");
		int a = input.nextInt();
		int[] arr = {1,2,3,4,6,7,8,0};
		Number d1=new Number();
		d1.insertArray(arr, index, a);
		System.out.print("\n插入后的数组为：");
		for(int i = 0;i < arr.length;i++){
		System.out.print(arr[i]+"\t");
		}
	}

}
