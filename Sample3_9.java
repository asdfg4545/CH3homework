public class Sample3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car4 car=new car4();
		car.num=1234;
		car.gas=-10;
		car.show();
	}

}
class car4{
	int num;
	double gas;
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}
