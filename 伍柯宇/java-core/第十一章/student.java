
public class student {
	String name = "李盼";
	int javaScore = 100;
	int sqlScore = 99;
	int cScore = 98;
	public void study(){
		System.out.println("学生在学习");
	}
	public String xm(){
		return name;
	}
	public int java(){
		return javaScore;
	}
	public int sum(){
		return javaScore+sqlScore+cScore;
	}
	public double avg(){
		return sum()/10.0;
	}
}
