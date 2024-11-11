import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample3_21 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入兩個整數");
		String str1=br.readLine();
		String str2=br.readLine();
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		int ans=Math.max(n1, n2);
		System.out.println(n1+"和"+n2+"較大的是"+ans);
	}

}
