
public class Battery {
	String brand;
	int gl;
	String xh;
	public void cd(){
		System.out.println(brand+"电池在充电");
	}
	public void fd(){
		System.out.println(brand+"电池在放电");
	}
	public String pp(){
		return brand;
	}
	public int Gl(){
		return gl;
	}
	public String Xh(){
		return xh;
	}
	public String toString(){
		return brand+gl+xh;
	}
	public void changeB(String name){
		brand=name;
		System.out.println(brand);
	}
	public void changeG(int g){
		gl=g;
		System.out.println(gl);
	}
	public void changeX(String x){
		xh=x;
		System.out.println(xh);
	}
}
