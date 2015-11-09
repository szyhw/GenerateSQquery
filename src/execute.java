import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class execute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AANDBOPTC.aandboptc();
		AOPTBANDCANDD.aoptbandcand();
		AOPTBANDC.aoptbandc();
		AANDBOPTCA.aandboptc();
		AOPTBANDCA.aoptbandca();
		AOPTBOPTC.aoptboptc();
		Merge.merge(25,"/home/szy/data/test-150");
		Merge.merge(50,"/home/szy/data/test-300");
		Merge.merge(100,"/home/szy/data/test-600");/*
		FileReader fileReader = new FileReader("/home/szy/time-100");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String time=null;
		int sum=0;
		while ((time=bufferedReader.readLine()) != null) {
					int t=Integer.parseInt(time);
					sum=sum+t;
		}
		System.out.println(sum);*/
	}
}
