import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AOPTBANDCANDD {
	public static void aoptbandcand() throws IOException{
		FileWriter fileWritter = new FileWriter("/home/szy/data/t2-c",true);
		int count=0;
		while(++count<200){
			String line="SELECT ?x ?y ?z ?w WHERE {{{ ?x <ub:name> ?y.} OPTIONAL {?x <ub:doctoralDegreeFrom> ?z.}}{{?x <ub:worksFor> <http://www.Department0.University0.edu>.} OPTIONAL {?x <ub:emailAddress> ?w.}}}";
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
			line=line.replace("<ub:name>",list1.get(result1) );
			int result2=random.nextInt(8);
			line=line.replace("<ub:worksFor>",list1.get(result2) );
			int result3=random.nextInt(8);
			line=line.replace("<ub:doctoralDegreeFrom>",list1.get(result3));
			int result4=random.nextInt(8);
			line=line.replace("<ub:emailAddress>", list1.get(result4));
			fileWritter.write(line+"\n");
			fileWritter.flush();
		}
		fileWritter.close();
		System.out.println("end");
	}
}
