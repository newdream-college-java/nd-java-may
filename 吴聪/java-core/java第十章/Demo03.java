
public class Demo03 {
	int length;
	int width;
	public void move(){
		System.out.print("长方形在移动");
	}
	public void change(){
		System.out.println("长方形正在变化");
	}
	public void info(){
		System.out.println("长方形长为"+length+"\t宽为"+width);
	}
	public int chang(){
		return length;
	}
	public int kuan(){
		return width;
	}
	public int zc(){
		return (length+width)*2;
	}
	public int mj(){
		return length*width;
	}
}
