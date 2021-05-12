public class Inheritence {

    public void Method(){

        System.out.println("BaseClass");
    }

    public void Method2(){

        System.out.println("Another BaseMethod");
    }
}

class Child extends Inheritence{

    public void Method(){

        System.out.println("ChildClass");
    }


}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.Method();
        child.Method2();


        Inheritence base2 = new Inheritence();
        base2.Method();
        Inheritence base = new Child();

        base.Method();


    }
}
