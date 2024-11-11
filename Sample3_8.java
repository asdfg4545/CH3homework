
public class Sample3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car3 car=new car3();
		car.setting(1234,20.5);
		int n=car.getNum();
		double g=car.getGas();
		System.out.println("車號是"+n+"，汽油量是"+g);
	}

}
class car3{
	int num;
	double gas;
	void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	int getNum(){
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
}
