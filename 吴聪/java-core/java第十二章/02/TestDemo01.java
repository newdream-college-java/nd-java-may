package day2;

public class TestDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 aa = new Demo01();
		String[] str = new String[10];
		str = aa.sort(aa.sys());
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"\t");
		}
	}

}
