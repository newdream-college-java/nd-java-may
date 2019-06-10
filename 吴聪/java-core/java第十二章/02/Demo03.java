package day2;


public class Demo03 {
	public int[] insertArray(int[] arr,int index,int a){
		System.out.print("插入前的数组为：");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i = arr.length-2;i >= index;i--){
			arr[i+1] = arr[i];
		}
		arr[index] = a;
		return arr;
	}
}
