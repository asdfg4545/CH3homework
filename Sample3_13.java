
public class Sample3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car9 car1=new car9();
		car1.show();
		car9 car2=new car9(1234,25.0);
		car2.show();
	}

}
class car9{
	private int num;
	private double gas;
	public car9(){
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
		
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public car9(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量是"+gas);

	}
	
}
