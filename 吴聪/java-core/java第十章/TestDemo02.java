public class TestDemo02 {

	public static void main(String[] args) {
		Demo02 aa = new Demo02();
		aa.type="ÄşÏçºÚÖí";
		aa.color="ºÚÉ«";
		aa.atk=77;
		aa.walk();
		aa.hit();
		aa.eat();
		System.out.println(aa.toString());
		System.out.println(aa.tp());
		System.out.println(aa.cl());
	}

}
