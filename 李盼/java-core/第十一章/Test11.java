
public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��һ�����");
		date d = new date();
		System.out.println(d);
		
		System.out.println("�ڶ������");
		pig p1 = new pig();
		p1.run();
		p1.hit();
		p1.eat();
		System.out.println(p1.toString()+"\n"+p1.pinzhong()+"\n"+p1.yanse());
		
		System.out.println("���������");
		oblong o1 = new oblong();
		o1.move();
		o1.change();
		o1.news();
		System.out.println(o1.length()+"\t"+o1.kuan()+"\t"+o1.circumference()+"\t"+o1.area());
		
		System.out.println("���������");
		student s1 = new student();
		s1.study();
		System.out.println("������"+s1.xm()+"java�ɼ���"+s1.java()+"�ܳɼ���"+s1.sum()+"ƽ���ɼ���"+s1.avg());
		
		System.out.println("���������");
		car c1 = new car();
		System.out.println(c1.toString());
		c1.start();
		c1.quicken();
		c1.sell();
	}

}
















