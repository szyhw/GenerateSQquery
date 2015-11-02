import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class execute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//	AOPTBANDCANDD.aoptbandcand();
		//AOPTBANDC.aoptbandc();
		//AANDBOPTCA.aandboptc();
		//AOPTBANDCA.aoptbandca();
		//AOPTBOPTC.aoptboptc();
		Merge.merge(100,"/home/szy/test-600");
		FileReader fileReader = new FileReader("/home/szy/time");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String time=null;
		int sum=0;
		while ((time=bufferedReader.readLine()) != null) {
					int t=Integer.parseInt(time);
					sum=sum+t;
		}
		System.out.println(sum);
	}
}
