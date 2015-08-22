class Parent {

    private int var = 1;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

}

class Child extends Parent {

    private int var = 2;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }
    
    public static void main(String[] args) {
    
    Child child = new Child();
    Parent parent = (Parent)child;
    System.out.println(parent.getVar());
    }

}
