import java.util.Scanner;


public class StudentBiz {
	Student[] arr=new Student[3];
	public Student[] score(){
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
			System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ�");
			System.out.println("������Java�ɼ���");
			arr[i].Java=input.nextInt();
			System.out.println("������C�ɼ���");
			 arr[i].C=input.nextInt();
			System.out.println("������SQL�ɼ���");
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
