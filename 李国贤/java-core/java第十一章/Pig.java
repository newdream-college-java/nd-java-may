
public class Pig {
	String varieties;
	String colour ;
	int aggressivity ;
	public void walk(){
		System.out.println(varieties+"Ʒ�ֵ�"+colour+"��ɫ����������ȥ");
	}
	public void strike(){
		System.out.println(varieties+"Ʒ�ֵ�"+colour+"��ɫ��������ˣ�������Ϊ��"+ aggressivity);
	}
	public void eat(){
		System.out.println(varieties+"Ʒ�ֵ�"+colour+"��ɫ����Ե����");
	}
	
	public String toString(){
		return varieties+"Ʒ�ֵ�"+colour+"��ɫ����";
	}
	public String animal(){
		return varieties;
	}
	public String pig(){
		return colour;
	}
	
}
