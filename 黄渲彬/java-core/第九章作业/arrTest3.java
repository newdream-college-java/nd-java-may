package sc;

import java.util.Arrays;

public class arrTest3 {
	public static void main(String [] args)
	{
		String [] arr = {"a","c","u","b","e","p","f","z"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			}
			System.out.println();
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i]+" ");
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1-j; i++) {
					String temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;					
				}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
