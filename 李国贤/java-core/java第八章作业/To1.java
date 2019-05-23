/*
使用 for循环与break语句实现:从1一直加到100,但如果累加的和大于500
也要结束循环，并输出此时已经加到的数是什么?
*/
public class To1{
	public static void main(String[] args){
		int sum=0;
		int i=1;
		for(;i<=100;i++){
			sum+=i;
			if(sum>500){
			break;
			}
		}
		System.out.println(i);
	}
}