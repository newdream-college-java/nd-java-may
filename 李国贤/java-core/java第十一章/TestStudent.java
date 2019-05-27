
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d1=new Student();
		d1.name="李名";
		d1.javaScore=84;
		d1.sqlScore=87;
		d1.cScore=89;
			System.out.println("名字是："+d1.name+"java成绩是："+d1.javaScore+"sql成绩是："+d1.sqlScore+"c#成绩是："+d1.cScore);
		d1.stu();
		d1.a();
		d1.b();
		d1.c();
		d1.avg();
			System.out.println("\t姓名是："+d1.a()+"\n\tjava成绩是："+d1.b()+"\n\t总成绩是："+d1.c()+"\n\t平均分是："+d1.avg());
		
	}

}
