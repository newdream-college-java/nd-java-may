public class Pay{    
	public static void main(String[]args){
		 System.out.println("*************���ѵ�******************");          
		System.out.println("������Ʒ\t����\t����\t���\nT��\t\t��245\t2\t��490\n����Ь\t\t��570\t1\t��570\n������\t\t��320\t1\t��320\n\n�ۿۣ�\t\t8��");
		int tx=490;//T�����ܼ۸�
		int wqx=570;//����Ь���ܼ۸�
		int wqp=320;//�����ĵ��ܼ۸�
		double zk=0.8;//�ۿ�Ϊ8��
		double xfzj=(tx+wqx+wqp)*zk;//���ѵ��ܽ��       
		System.out.println("�����ܽ��\t��"+xfzj); 
		int sjjf=1500;
		int zl=sjjf-(int)xfzj;//����
		int jf=100;//����
		int jf1=3;
		int jf2=(int)xfzj*jf1/jf;//�������=�����ܽ�*3/100
		System.out.println("ʵ�ʽ���\t��"+sjjf);
		System.out.println("��Ǯ\t\t��"+zl);
		System.out.print("���ι�������û����ǣ�"+jf2);             

	}

}