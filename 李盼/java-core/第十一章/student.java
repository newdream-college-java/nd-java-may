
public class student {
	String name = "����";
	int javaScore = 100;
	int sqlScore = 99;
	int cScore = 98;
	public void study(){
		System.out.println("ѧ����ѧϰ");
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
