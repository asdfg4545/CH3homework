public class Sample3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car5 car=new car5();
		car.setting(1234,20.5);
		car.show();
		System.out.println("指定不正確的汽油量{-10,0}看看");
		car.setting(1234,-10);
		car.show();
	}

}
class car5{
	private int num;
	private double gas;
	public void setting(int n,double g) {
		if(g>0&&g<100) {
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}else {
			System.out.println(gas+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}
