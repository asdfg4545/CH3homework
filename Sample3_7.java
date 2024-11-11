
public class Sample3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1=new Car2();
		int number=1234;
		double gasoline=20.5;
		car1.setting(number,gasoline);
		car1.show();
	}

}
class Car2{
	int num;
	double gas;
	void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號射為"+num+"，將汽油量設為"+gas);
	}
	void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
	
}
