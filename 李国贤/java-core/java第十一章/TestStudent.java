
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d1=new Student();
		d1.name="����";
		d1.javaScore=84;
		d1.sqlScore=87;
		d1.cScore=89;
			System.out.println("�����ǣ�"+d1.name+"java�ɼ��ǣ�"+d1.javaScore+"sql�ɼ��ǣ�"+d1.sqlScore+"c#�ɼ��ǣ�"+d1.cScore);
		d1.stu();
		d1.a();
		d1.b();
		d1.c();
		d1.avg();
			System.out.println("\t�����ǣ�"+d1.a()+"\n\tjava�ɼ��ǣ�"+d1.b()+"\n\t�ܳɼ��ǣ�"+d1.c()+"\n\tƽ�����ǣ�"+d1.avg());
		
	}

}
