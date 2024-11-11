
public class Sample3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carset car1=new carset();
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}
class carset{
	int num;
	double gas;
	void setNum(int n){
		num=n;
		System.out.println("將車號設定為"+num);
	}
	void setGas(double g) {
		gas=g;
		System.out.println("將汽油量設定為"+gas);
		
	}
}
