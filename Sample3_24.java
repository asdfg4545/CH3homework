
public class Sample3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car14[] car1;
		car1=new car14[3];
		for(int i=0;i<car1.length;i++) {
			car1[i]=new car14();
		}
		car1[0].carset(1234,20.5);
		car1[1].carset(2345, 30.5);
		car1[2].carset(3456, 40.5);
		for(int j=0;j<car1.length;j++) {
			car1[j].carshow();
		}
	}

}
class car14{
	int num;
	double gas;
	public void car14(){
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public void carset(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public void carshow() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
