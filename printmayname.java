public class printmayname {
	final String name = "Losywee" ;
	public void printName(){
		
		System.out.print(name);
		
	}
	
	public void referenceExample(){
		
		String s1 = "You" ;
		String s2 = "You" ;
		System.out.println("s1 == s2 ?" +( s1 == s2 ? "Yes, there the same" : "No there are difference") );
		String s3 = new String("You");
		String s4 = new String("You");
		System.out.println("s3 == s4 ?" +( s3 == s4 ? "Yes, there the same" : "No there are difference"));
		System.out.println("s3.equals( s4 )?" +( s3 .equals(s4) ? "Yes, there the same" : "No there are difference"));
		System.out.println("s3.equals( s1 )?" +( s3 .equals(s1) ? "Yes, there the same value or attribute" : "No there are difference"));
		
	}

}
