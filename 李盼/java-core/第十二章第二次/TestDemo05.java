package day2;

public class TestDemo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo05 aa = new Demo05();
		aa.name="旺财";
		aa.age=18;
		aa.sex="男";
		System.out.println(aa);
		
		System.out.println(aa.getName());
		
		System.out.println(aa.setName("张三"));
		
		System.out.println(aa.getSex());
		
		System.out.println(aa.setSex("女"));
		
		int[] ar={1,2,3,4,5};
		System.out.println(aa.Sum(ar));
		
		aa.Cj(3);
		
		aa.zs(8);
		
		aa.gb(4,6);
		
		aa.gy(4,6);
		
		aa.fb(4);
		
		int[] arr={1,3,7,5,9};
		aa.sz(arr);
		
		aa.change("鸭");
	}

}
