package Private.com.zemoso;

public class TestPrivate {

    private void display(){

        System.out.println("Hi world!!");
    }

    public static void main(String[] args) {

        A objA = new A();

        //It shows compile error because private method has no access in other class

        /*
        objA.print();
        */

        TestPrivate testPrivateObj = new TestPrivate();

        //It won't show compile error because private member or method have access in same class
        testPrivateObj.display();
    }
}
