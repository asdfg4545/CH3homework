
public class Sample3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告car1");
		car12 car1=new car12();
		car1.setting(1234,20.5);
		System.out.println("宣告car2");
		car12 car2=new car12();
		System.out.println("將car1指定給car2");
		car2=car1;
		System.out.print("car1的");
		car1.carshow();
		System.out.print("car2的");
		car2.carshow();
		System.out.print("改變car1的資料");
		car1.setting(2345,30.5);
		System.out.print("car1的");
		car1.carshow();
		System.out.print("car2的");
		car2.carshow();
	}

}
class car12{
	private int num;
	private double gas;
	public car12(){
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void carshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}
