
public class TestPig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig d1=new Pig();
		d1.varieties="����";
		d1.colour="��ɫ";
		d1.aggressivity =100;
			System.out.println(d1.varieties+"Ʒ��"+d1.colour+"��ɫ������Ĺ�����Ϊ"+d1.aggressivity);
		d1.walk();
		d1.strike();
		d1.eat();
		d1.toString();
		d1.animal();
		d1.pig();
		System.out.println(d1.toString());
		System.out.println(d1.animal());
		System.out.println(d1.pig());
		
	}

}
