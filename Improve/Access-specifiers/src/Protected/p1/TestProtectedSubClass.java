package Protected.p1;
import Protected.com.zemoso.B;

public class TestProtectedSubClass extends B{

    public static void main(String[] args) {

        TestProtectedSubClass testProtectedSubClassObj = new TestProtectedSubClass();

        /* It won't show compile error because protected has access in different package subclass */
        testProtectedSubClassObj.print();

    }
}
