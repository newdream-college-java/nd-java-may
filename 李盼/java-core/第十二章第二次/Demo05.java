package day2;

import java.util.Arrays;

public class Demo05 {
	String name;
	int age;
	String sex;
	int[] arr=new int[5];
	int sum=0;
	int cj=1;
//���ҽ���
	public String toString(){
		return "������"+name+"\n���䣺"+age+"\n�Ա�:"+sex;
	}
//�õ�����
	public String getName(){
		return name;
	}
//��������
	public String setName(String xm){
		name=xm;
		return name;
	}
//�õ��Ա�
	public String getSex(){
		return sex;
	}
//�����Ա�
	public String setSex(String xb){
		sex=xb;
		return sex;
	}
//�������
	public int Sum(int[] ar){
		for(int i=0;i<ar.length;i++){
			sum+=ar[i];
		}
		return sum;
	}
//�׳����
	public void Cj(int n){
		for(int i=1;i<=n;i++){
			cj=cj*i;
		}
		System.out.println(cj);
	}
//�ж�����
	public void zs(int a){
		boolean flag=true;
		for(int i=2;i<a;i++){
			if(a%i==0){
				flag=false;
				System.out.println(flag);
				break;
			}
		}
		if(flag){
			System.out.println(flag);
		}
	}
//��С������
	public void gb(int a,int b){
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				System.out.println("��С������Ϊ"+i);
				break;
			}
		}
	}
//���Լ��
	public void gy(int a,int b){
		int min=a<b?a:b;
		for(int i=min;i>0;i--){
			if(a%i==0&&b%i==0){
				System.out.println("���Լ��Ϊ"+i);
				break;
			}
		}
	}
//�Ѳ�������
	public void fb(int s){
		int a=1,b=0,c=b;
		for(int i=1;i<=s;i++){
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
//��������
	public void sz(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
//��Ѽ����
	public void change(String zl){
		if(zl.equals("Ѽ")){
			zl="��";
		}
		System.out.println("\n"+zl);
	}
}
