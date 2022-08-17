package stringStudy;

public class Strring {

	public static void main(String[] args) 
	{
		String v1="velocity";
		String V2="Velocity";
		System.out.println(v1==V2);
		
		System.out.println("=====================");
		System.out.println("*******contains USE*******");

		String Name="Vishal Date";
		System.out.println(Name.contains("Date"));
		System.out.println(Name.contains("Dt"));
		System.out.println(Name.contains("  "));
		String S="Sweety";
		String S1=" ";
		String S2="";
	//	String S3=null;

		System.out.println("=====================");
		System.out.println("*******isEmpty USE*******");

		boolean result=S.isEmpty();
		System.out.println(result);
		System.out.println(S1.isEmpty());
		System.out.println(S2.isEmpty());
		//System.out.println(S3.isEmpty());
		
		
		
		System.out.println("=====================");
		System.out.println("*******blank USE*******");
		System.out.println(S.isBlank());
		System.out.println(S1.isBlank());
		System.out.println(S2.isBlank());
		
	//	System.out.println(S3.isBlank());
		
		
		System.out.println("=====================");
		System.out.println("*******charAt USE*******");
		
		String city="Ahmednagar";
		System.out.println(city.charAt(0));
		System.out.println(city.charAt(5));
		char x=city.charAt(6);
		System.out.println(x);
		//System.out.println(city.charAt(12));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12
		
		System.out.println("=====================");
		System.out.println("*******endsWith USE*******");
		System.out.println(city.endsWith("nagar"));
		System.out.println(city.endsWith("naga"));
		System.out.println(city.endsWith("agar"));
		System.out.println(city.endsWith(city));
		//System.out.println(city.endsWith(city));

		
		System.out.println("=====================");
		System.out.println("*******startsWith USE*******");
		System.out.println(city.startsWith("nagar"));
		System.out.println(city.startsWith(city));
		System.out.println(city.startsWith("Ahmed"));
		System.out.println(city.startsWith("agar", 6));
		
		System.out.println("=====================");
		System.out.println("*******substring USE*******");
		System.out.println(city.substring(6));
		System.out.println(city.substring(2, 5));
		System.out.println(city.subSequence(1, 10));
		System.out.println(city.subSequence(2, 8));

		System.out.println("=====================");
		System.out.println("******* search of words by using contains method*******");
		
		String poly="Polymorphism is one of the core concepts of object-oriented programming (OOP) "
				+ "and describes situations in which something occurs in several different forms. "
				+ "In computer science, it describes the concept that "
				+ "you can access objects of different "
				+ "types through the same interface";
		
		String O="object";
		System.out.println(poly.contains(O));
		
		System.out.println("=====================");
		System.out.println("*******concat USE*******");
		String a="to";
		String b="gether";
		String c=" & forever";
		
		System.out.println(a.concat(b).concat(c));
		
		System.out.println("=====================");
		System.out.println("*******indexOf USE*******");
		System.out.println(city.indexOf("a"));
		System.out.println(city.indexOf("ga"));
		System.out.println(city.indexOf("a", 1));
		System.out.println(city.indexOf("a", 7));
		
		System.out.println("=====================");
		System.out.println("*******lastIndexOf USE*******");
		System.out.println(city.lastIndexOf("a"));
		System.out.println(city.lastIndexOf("gar"));
		System.out.println(city.lastIndexOf("a", 7));
		System.out.println(city.lastIndexOf("a", 9));
		
		System.out.println("=====================");
		System.out.println("*******replace USE*******");
		System.out.println(city.replace("A", "Ma"));
		System.out.println(city.replace("Ahmed", "Shivaji"));
		System.out.println(poly.replace("is", "Ma"));
		System.out.println(poly.replaceAll("is", "c"));
		System.out.println(city.replaceFirst("a", "A"));
		
		System.out.println("=====================");
		System.out.println("*******split USE*******");
		String q="My Life My Rules";
		System.out.println(q.split(" "));
		
		String m6= "My,test";
		System.out.println(m6);
		System.out.println(m6.split(","));
		

		
		
		
		
		

		
		
		
		
		
		
		


										


		
		
		
		
		
		
		
		
		
	
	}

}
