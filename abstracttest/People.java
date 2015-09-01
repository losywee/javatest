package abstracttest;
public abstract  class People {
protected String name;
protected String age;
protected String location;
protected String sex;
protected abstract void getDescription();
People(String in_name, String in_age, String in_location, String in_sex){
name = in_name;
age = in_age;
location = in_location;
sex = in_sex;
}

}
