/*
��1�ӵ�100���ۼӵ�500ʱ�˳�
*/
public class Test01{
	public static void main(String[] args){
		int sum = 0;
		int i ;
		for(i = 1;i<101;i++){
			sum +=i;
			if(sum>500){
				break;
			}
		}
		System.out.print(i);
	}
}
