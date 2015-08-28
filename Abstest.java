public class Abstest {
public static void main(String[] args) {

}
}

abstract class Person {

Person (String n) {
name = n;
}

public String getName(){
return name;
}

abstract String getDescription() ;

private String name;

}

class Emplymee extends Person {

Employmee(String n, double s, int year, int month, int day ){
super(n);
salary = s;
}

}
