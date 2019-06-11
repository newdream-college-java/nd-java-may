import java.util.Scanner;


public class StudentBiz {
	Student[] arr=new Student[3];
	public Student[] score(){
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
			System.out.println("请输入第"+(i+1)+"个同学的成绩");
			System.out.println("请输入Java成绩：");
			arr[i].Java=input.nextInt();
			System.out.println("请输入C成绩：");
			 arr[i].C=input.nextInt();
			System.out.println("请输入SQL成绩：");
			arr[i].SQL=input.nextInt();
			continue;
		}
		return arr;
	}
	public Student[] getAvg(Student[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i].pinjun=(arr[i].Java+arr[i].C+arr[i].SQL)/3;
		}
		return arr;
	}
}
