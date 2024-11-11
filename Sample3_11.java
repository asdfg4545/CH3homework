public class Sample3_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car6 car=new car6();
		car.setting(1234,20.5);
		car.show();
		car.setting(2345);
		car.show();
		car.setting(30.5);
		car.show();
	}

}
class car6{
	private int num;
	private double gas;
	public void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	public void setting(int n) {
		num=n;
		System.out.println("只變更車號");
		System.out.println("車號設為"+num);
	}
	public void setting(double g) {
		gas=g;
		System.out.println("只變更汽油量");
		System.out.println("汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}
