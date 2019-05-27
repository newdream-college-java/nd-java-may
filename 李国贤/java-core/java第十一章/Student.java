
public class Student {
	String name;
	int javaScore;
	int sqlScore;
	int cScore;
	public void stu(){
		System.out.println("学生在学习");
	}
	public String a(){
		return name;
	}
	public int b(){
		return javaScore;
	}
	public int c(){
		return javaScore+sqlScore+cScore;
	}
	public double avg(){
		return (javaScore+sqlScore+cScore)/10;
	}
}
