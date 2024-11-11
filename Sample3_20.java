import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample3_20 {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入字串");
		String str1=br.readLine();
		System.out.println("請輸入要新增的字串");
		String str2=br.readLine();
		StringBuffer sb=new StringBuffer(str1);
		sb.append(str2);
		System.out.println("在「"+str1+"」後新增"+"「"+str2+"」就會變成"+"「"+sb+"」");
	}

}
