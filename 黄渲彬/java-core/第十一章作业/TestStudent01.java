package demo05;

public class TestStudent01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name = "ÕÅÈı";
		student.javaScore = 85;
		student.sqlScore = 64;
		student.CScore = 78;
		student.stuscore();
		System.out.println(student.Name());
		System.out.println(student.jscore());
		System.out.println(student.sumscore());
		System.out.println(student.avgscore());
		

	}

}
