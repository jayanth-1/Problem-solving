package Public.p1;
import com.zemoso.A;

public class TestPublic {

    public void display(){

        System.out.println("Hi, this is display method");
    }

    public static void main(String[] args) {

        A objA = new A();

        //It won't show compile error because public specifier has access every where here i tried in different package
        objA.show();

        TestPublic testPublicObj = new TestPublic();

        //It won't show compile error because public specifier has access in same class
        testPublicObj.display();
    }
}
