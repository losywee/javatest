// The problem is static final in class scope.
public class staticfinal {

public static void main(String[] args){
B b = new B("Awesome! ");
b.printPlugname();
b.printClassname();


}

}

abstract class A implements E{
private String mayname;
public static final String plugname = "super";
private static String myname;
abstract public void printPlugname();
public void printClassname() {
System.out.println("This is a class A");
}
}

class B extends A implements E{
public static final String plugname = "child"; //current reference chain are privilege, 
B(String a){
//plugname = a;
//super.plugname = a; //error/can't allocate a value for it
//super.mayname = a; // mayname only can use in A class.
//((A)this).myname = a; // myname only can use in A class.
super.printClassname(); // In child scope, here copy all parent class method and non-private member.
System.out.println(interfaceName); //In child scope, here copy all parent interface member.

}

public void printPlugname(){
System.out.println(plugname);
}

public void printClassname() {
System.out.println("This is a class B");
bClassMethod(); // static alse invoking by instance method. static or non-static are the class member, it owned by it class scope.
}

public static void bClassMethod(){
System.out.println("I am a cass method");
}

}

interface E{
static final String interfaceName = "E";
public void printClassname();
}
