
public class Sample3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car10 car1=new car10();
		car1.show();
		car10 car2=new car10(1234,25.0);
		car2.show();
	}

}
class car10{
	private int num;
	private double gas;
	public car10() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
		
	}
	public car10(int n,double g) {
		this();
		num=n;
		gas=g;
	}
	public void show() {
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
}
