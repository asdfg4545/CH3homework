
public class Sample3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car7 car=new car7();
		car.show();
	}

}
class car7{
	private int num;
	private double gas;
	public  car7() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void show() {
		
		System.out.println("車號是"+num+"，汽油量是"+gas);
	}
	
}