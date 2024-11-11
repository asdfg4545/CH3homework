
public class Sample3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car11 car=new car11();
		car.showsum();
		car11 car1=new car11();
		car1.setting(1234,20.5);
		car.showsum();
		car11 car2=new car11();
		car2.setting(4567,30.5);
	}

}
class car11{
	public static int sum=0;
	private int num;
	private double gas;
	public static void showsum() {
		System.out.println("車子總共有"+sum+"台");
		System.out.println("開始生產車子");
		sum+=1;
	}
	public void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
}
