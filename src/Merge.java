import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Merge {
	public static void merge(int bound,String dist) throws IOException{
		String query=null;
		String filePath1 = "/home/szy/t1-c";
		FileReader fileReader1 = null;
		BufferedReader bufferedReader1 = null;
		fileReader1 = new FileReader(filePath1);
		bufferedReader1 = new BufferedReader(fileReader1);
		int count=0;
		FileWriter fileWritter = new FileWriter(dist,true);
		while ((query=bufferedReader1.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		count=0;
		String filePath2 = "/home/szy/t2-c";
		FileReader fileReader2 = new FileReader(filePath2);
		BufferedReader bufferedReader2 =  new BufferedReader(fileReader2);
		while ((query=bufferedReader2.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		count=0;
		String filePath3 = "/home/szy/t3-c";
		FileReader fileReader3 = new FileReader(filePath3);
		BufferedReader bufferedReader3 =  new BufferedReader(fileReader3);
		while ((query=bufferedReader3.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		count=0;
		String filePath4 = "/home/szy/t4-c";
		FileReader fileReader4 = new FileReader(filePath4);
		BufferedReader bufferedReader4 =  new BufferedReader(fileReader4);
		while ((query=bufferedReader4.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		count=0;
		String filePath5 = "/home/szy/t5-c";
		FileReader fileReader5 = new FileReader(filePath5);
		BufferedReader bufferedReader5 =  new BufferedReader(fileReader5);
		while ((query=bufferedReader5.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		count=0;
		String filePath6 = "/home/szy/t6-c";
		FileReader fileReader6 = new FileReader(filePath6);
		BufferedReader bufferedReader6 =  new BufferedReader(fileReader6);
		while ((query=bufferedReader6.readLine()) != null) {
			if(count<bound){
				++count;
				fileWritter.write(query+"\n");
				fileWritter.flush();
			}
			else{
				break;
			}
		}
		fileWritter.close();
		System.out.println("end");
	}
}
