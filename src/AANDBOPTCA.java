import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AANDBOPTCA	{
	public static void aandboptc() throws IOException{
		int count=0;
		FileWriter fileWritter = new FileWriter("/home/szy/t4-c",true);
		while(++count<100){
			String line="SELECT ?x ?y ?z ?w WHERE {{?x <ub:emailAddress> ?y.}{{?x <ub:telephone> ?z.} OPTIONAL {?x <rdf:type> ?w.}}}";
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("<rdf:type>");
			list1.add("<ub:teacherOf>");
			list1.add("<ub:undergraduateDegreeFrom>");
			list1.add("<ub:mastersDegreeFrom>");
			list1.add("<ub:doctoralDegreeFrom>");
			list1.add("<ub:emailAddress>");
			list1.add("<ub:telephone>");
			list1.add("<ub:researchInterest>");
			java.util.Random random=new java.util.Random();// 定义随机类
			int result1=random.nextInt(8);
			line=line.replace("<ub:emailAddress>",list1.get(result1) );
			int result2=random.nextInt(8);
			line=line.replace("<ub:telephone>",list1.get(result2) );
			int result3=random.nextInt(8);
			line=line.replace("<rdf:type>", list1.get(result3));
			fileWritter.write(line+"\n");
			fileWritter.flush();
		}
		fileWritter.close();
		System.out.println("end");
	}
}
