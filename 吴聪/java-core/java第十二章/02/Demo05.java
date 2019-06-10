package day2;

import java.util.Arrays;

public class Demo05 {
	String name;
	int age;
	String sex;
	int[] arr=new int[5];
	int sum=0;
	int cj=1;
//自我介绍
	public String toString(){
		return "姓名："+name+"\n年龄："+age+"\n性别:"+sex;
	}
//得到姓名
	public String getName(){
		return name;
	}
//设置姓名
	public String setName(String xm){
		name=xm;
		return name;
	}
//得到性别
	public String getSex(){
		return sex;
	}
//设置性别
	public String setSex(String xb){
		sex=xb;
		return sex;
	}
//数组求和
	public int Sum(int[] ar){
		for(int i=0;i<ar.length;i++){
			sum+=ar[i];
		}
		return sum;
	}
//阶乘求积
	public void Cj(int n){
		for(int i=1;i<=n;i++){
			cj=cj*i;
		}
		System.out.println(cj);
	}
//判断质数
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
//最小公倍数
	public void gb(int a,int b){
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				System.out.println("最小公倍数为"+i);
				break;
			}
		}
	}
//最大公约数
	public void gy(int a,int b){
		int min=a<b?a:b;
		for(int i=min;i>0;i--){
			if(a%i==0&&b%i==0){
				System.out.println("最大公约数为"+i);
				break;
			}
		}
	}
//费波拉切数
	public void fb(int s){
		int a=1,b=0,c=b;
		for(int i=1;i<=s;i++){
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
//有序数组
	public void sz(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
//以鸭换鸡
	public void change(String zl){
		if(zl.equals("鸭")){
			zl="鸡";
		}
		System.out.println("\n"+zl);
	}
}
