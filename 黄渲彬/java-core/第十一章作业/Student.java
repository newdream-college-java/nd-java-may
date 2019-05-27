package demo05;

public class Student {
	String name;
	int javaScore;
	int sqlScore;
	int CScore;
	public void stuscore(){
		System.out.println("学生在学习");
	}
	public String Name(){
		return "张三";
	}
	public int jscore(){
		return javaScore;
	}
	public int sumscore(){
		return javaScore+sqlScore+CScore;
	}
	public int avgscore(){
		return (javaScore+sqlScore+CScore)/3;
	}
		
	
}
