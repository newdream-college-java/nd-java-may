/*дһ����ѧ�ҵ��࣬�����д������ķ�������:
a)�����������������бȽϣ������������е����ֵ�ķ�����
b)����һ��������������������ĸ�λ���Ǽ��ķ�����
c)����һ��������������������������ķ�����
d)����һ��������������� 1 �ӵ��������ĺ��Ƕ��ٵķ�������������һ�� 5 ��ô�ͼ���
1+2+3+4+5=15����󷵻� 15*/

public class Demo06 {
	public int a(int num1,int num2){
		int max=num1>num2?num1:num2;
		return max;
	}
	public int b(int num1){
		return num1%10;
	}
	public int c(int num1){
		return num1*num1*num1;
	}
	public int d(int num1){
		int sum=0;
		for(int i=1;i<=num1;i++){
			sum+=i;
		}
		return sum;
	}
}
