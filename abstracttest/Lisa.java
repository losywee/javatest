package abstracttest;
public class Lisa extends People{
Lisa(String in_name, String in_age, String in_location, String in_sex){
super(in_name, in_age, in_location, in_sex);
name = in_name;
age = in_age;
location = in_location;
sex = in_sex;
}

public void getDescription(){
System.out.println("my name is :"+name);
System.out.println("my age is :"+age);
System.out.println("my location is :"+location);
System.out.println("my sex is :"+sex);

}
//Lisa with People in all direcory "abstracttest"
//Compile: javac People.java Lisa.java or javac *.java
//Run: java abstracttest/Lisa
public static void main(String[] argv){

People lisa = new Lisa("lisa","20","Newyork","Female");
lisa.getDescription();


}
}
