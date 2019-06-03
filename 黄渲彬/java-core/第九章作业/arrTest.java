package sc;

public class arrTest {
	public static void main(String []args)
	{
		System.out.println("本次活动特价商品有:");
		String[] arr;
		arr = new String [5];
		arr[0]="Nike背包";
		arr[1]="Adidas运动衫";
		arr[2]="李宁运动鞋";
		arr[3]="Kappa外套";
		arr[4]="361°腰包";
        for(int i = 0;i<5;i++)
        {
        	System.out.println(arr[i]);
        }
    }
}
