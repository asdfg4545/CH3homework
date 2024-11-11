import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample3_19 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入字串");
		String str1=br.readLine();
		System.out.println("請輸入要檢索的文字");
		String str2=br.readLine();
		char ch=str2.charAt(0);
		int num=str1.indexOf(ch);
		if(num!=-1) {
			System.out.println(str1+"的第"+(num+1)+"個文字就是"+str2);
		}else {
			System.out.println(str1+"中並沒有"+str2+"這個字");
		}
		
	}

}
