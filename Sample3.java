public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1;
		car1=new car();
		car1.num=1234;
		car1.gas=20.5;
		car car2;
		car2=new car();
		car2.num=2345;
		car2.gas=30.5;
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);
		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
	}
	

}
class car{
	int num;
	double gas;
}