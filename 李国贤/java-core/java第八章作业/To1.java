/*
ʹ�� forѭ����break���ʵ��:��1һֱ�ӵ�100,������ۼӵĺʹ���500
ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô?
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