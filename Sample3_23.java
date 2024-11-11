
public class Sample3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car13 car1=new car13();
		car1.show();
		car1.setting(1234,20.5);
		String str="1號車";
		car1.setname(str);
		car1.show();
	}

}
class car13{
	private int num;
	private double gas;
	private String name;
	public car13(){
		num=0;
		gas=0;
		name="沒有名稱";
		System.out.println("生產了車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
	public void setting(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	public void setname(String nm) {
		name=nm;
		System.out.println("將車名設為"+name);
	}
	
}
