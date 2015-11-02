import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AANDBOPTC {
	public static void aandboptc() throws IOException{
		int count=0;
		FileWriter fileWritter = new FileWriter("/home/szy/t1-c",true);
		while(++count<100){
			String line="SELECT ?x ?y ?z  WHERE {{ ?x <rdf:type> <ub:FullProfessor>.?x <ub:name> ?y.} OPTIONAL {?x <ub:worksFor> ?z.} }";
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
			fileWritter.write(line+"\n");
			fileWritter.flush();
		}
		fileWritter.close();
		System.out.println("end");
	}
}
