public class Demo04 {
	String name;
	double java;
	double sql;
	double c;
	public void study(){
		System.out.println("学生正在学习");
	}
	public String xm(){
		return name;
	}
	public double jv(){
		return java;
	}
	public double sum(){
		return java+sql+c;
	}
	public double avg(){
		return (java+sql+c)/3.0;
	}
	
}
