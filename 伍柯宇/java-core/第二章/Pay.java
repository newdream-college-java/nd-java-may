public class Pay{    
	public static void main(String[]args){
		 System.out.println("*************消费单******************");          
		System.out.println("购买物品\t单价\t个数\t金额\nT恤\t\t￥245\t2\t￥490\n网球鞋\t\t￥570\t1\t￥570\n网球拍\t\t￥320\t1\t￥320\n\n折扣：\t\t8折");
		int tx=490;//T恤的总价格
		int wqx=570;//网球鞋的总价格
		int wqp=320;//网球拍的总价格
		double zk=0.8;//折扣为8折
		double xfzj=(tx+wqx+wqp)*zk;//消费的总金额       
		System.out.println("消费总金额\t￥"+xfzj); 
		int sjjf=1500;
		int zl=sjjf-(int)xfzj;//找零
		int jf=100;//积分
		int jf1=3;
		int jf2=(int)xfzj*jf1/jf;//所获积分=消费总金*3/100
		System.out.println("实际交费\t￥"+sjjf);
		System.out.println("找钱\t\t￥"+zl);
		System.out.print("本次购物所获得积分是："+jf2);             

	}

}