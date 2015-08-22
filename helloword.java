import test1.user;
public class helloword {

	/**
	 * @param args
	 */
	// Inner class can access outer variable or method
	public class hellowordRecv{
		final String recvName = "HelloClass" ;
		hellowordRecv ( String msg) {
			String msgs = "\n" + recvName +" has get message from:" + msg ;
			System.out.print(msgs);		
		}
	
	}
	//Class method
	public static void printwhat(){
		
		System.out.println( "Hey! I am class method. ");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub Get class loader
		final String myname = "Funny";
		System.out.println(new helloword().getClass().getClassLoader().toString() );
		System.out.print(myname);
		// The same directory don't need import
		printmayname mypc = new printmayname();
		System.out.print(mypc.name);
		mypc.referenceExample();
		mypc.printName();
		helloword hell = new helloword();
		// Access inner class
		helloword.hellowordRecv recvHello = hell.new hellowordRecv(myname) ;
		String rep = replaceaString(myname,"nn","cking");
		System.out.print(rep);
		System.out.print("--------------------------replace all string-----------------------------\n");
		String myreplace = replaceAllString("gooutoutout","out", "fuck");
		System.out.println(myreplace);
		getvArrayIndex();
		//Access extern package
		user user1 = new user();
		String uname = user1.getUname();
		String upass = user1.getPasswd();
		System.out.println("uname = " + uname);
		System.out.println("upass = " + upass);
		//class method, it can invok directly.
		helloword.printwhat();
		//object reference , 
		String a="hello";
		changeString(a);
		System.out.println("After a=" + a); //print hello
		
		

}
	public static String replaceaString( String origin, String old, String with) {
		String newString = " ";
		String remainer = origin;
		int strIndexStart = 0;
		if( ((strIndexStart = remainer.indexOf(old)) == 0)){
		  return remainer;
		} else {
			int strIndexEnd = strIndexStart + old.length();
			String subStart = remainer.substring(0, strIndexStart);
			String subEnd = remainer.substring( strIndexEnd, remainer.length());
			newString = subStart+with+subEnd;
			return newString;
		}
	}
public static String replaceAllString (String origin, String old, String with){
	String newString = "" ;
	String remainer = origin ;
	int strIndexStart = 0 ;
	while( (strIndexStart = remainer.indexOf(old)) >= 0 && old != "") {
		int strIndexEnd = strIndexStart + old.length();
		String subStart = remainer.substring(0, strIndexStart);
		String subEnd = remainer.substring( strIndexEnd, remainer.length());
		newString = subStart+with+subEnd;	
		remainer = newString;
	}
	return newString;
}
public static void getvArrayIndex(){
	
	int a[ ][ ] = { { 1, 2, 3}, {4, 5, 6}, {7, 8, 6} };
	int searchFor = 6;
	int i = 0;
	int j= 0;
	boolean findIt = false;
	int sumSearch = 0;
	//Here, We must to ensure i =0 and j = 0 , otherwise throw error
	for(i=0; i < a.length; i++){
		for(j=0; j < a[ i ].length; j++ ) {
			if( a[i][j] == searchFor) {
				findIt = true;
				sumSearch = sumSearch +1;
				//break;			
			}		
		}
		if(findIt) {
			System.out.println( "Find it at" + i + j );
			System.out.println( "Current num = " + sumSearch );
		} else {
			System.out.println( "Find not!" );
		}
}
	
	
} 

public static void changeString(String a){
	a = a+"1000";
}
}



