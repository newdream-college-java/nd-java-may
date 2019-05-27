
public class TestPig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig d1=new Pig();
		d1.varieties="宁乡";
		d1.colour="黑色";
		d1.aggressivity =100;
			System.out.println(d1.varieties+"品种"+d1.colour+"颜色的猪；猪的攻击力为"+d1.aggressivity);
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
