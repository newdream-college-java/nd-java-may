
public class pig {
	String  breed = "С��";
	String color = "��ɫ";
	String atk = "100";
	public void run(){
		System.out.println(breed+"Ʒ�ֵ�"+color+"ɫ����������ȥ");
	}
	public void hit(){
		System.out.println(breed+"Ʒ�ֵ�"+color+"ɫ��������ˣ�������Ϊ"+atk);
	}
	public void eat(){
		System.out.println(breed+"Ʒ�ֵ�"+color+"ɫ����Ե����");
	}
	public String toString(){
		return breed+"Ʒ�ֵ�"+color+"ɫ��������Ϊ"+atk;
	}
	public String pinzhong(){
		return breed;
	}
	public String yanse(){
		return color;
	}

}
