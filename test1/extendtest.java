//package test1;

class extendtest1 {
	public char name[];
	public  String myname =" losywee1"  ;
	public String getMyname(){
		return "parent";
	}
}

public class extendtest extends extendtest1{
	
	public String myname = " losywee2" ;
	//if the subclass exist the method, java will invoke the method, therwise invoke parent method
	public String getMyname(){
		return myname;
	}
	public char name[] = {'1'};
	public static void main(String[] args) {
		extendtest1 test1 = new extendtest();
		System.out.println(test1.getMyname() );
		System.out.println(( (extendtest1)test1).getMyname() );
		System.out.println( test1.myname);
		extendtest test2 = new extendtest();
		System.out.println( test2.getMyname() ); 
		System.out.println( test2.myname);
		//myname overwrite, but the value is losywee1
		System.out.println( test1.name ); //Nullpointer
		
		
	}
	
}
