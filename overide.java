class base {
protected String myname = "losywee";
private void print() {
System.out.println(myname);
}
private String getMyname() throws NullPointerException {
return myname;
}
}

class overide extends base {

public void print() {
System.out.println(myname);
}

public static void main(String[] args) {
// if declare base bse will throw a access privilege error.
overide bse = new overide();
bse.print();
// Here will right, reload access privilege
base bse1 = new overide();
((overide)bse1).print();



}

}
