package demo05;

public class Student {
	String name;
	int javaScore;
	int sqlScore;
	int CScore;
	public void stuscore(){
		System.out.println("ѧ����ѧϰ");
	}
	public String Name(){
		return "����";
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
