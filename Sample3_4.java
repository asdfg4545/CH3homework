public class Sample3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart Car1=new Cart();
		Car1.num=1234;
		Car1.gas=20.5;
		Car1.show();
	}

}
class Cart{
	//要改Cart，不然會跟Sample3的class car衝突
	
	
	int num;
	double gas;
	void show() {
		//無使用this
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		//也可以使用this
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	
}
