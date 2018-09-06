package Default.p1;
import com.zemoso.A;

public class TestDefaultSubClass extends A {

    void print(){

        System.out.println("Hi world!!");
    }

    public static void main(String[] args){

        TestDefaultSubClass testDefaultSubClassObj = new TestDefaultSubClass();

        //It shows compile error default specifier has no access in different package subclass
       // testDefaultSubClassObj.display();

        //It won't show compile error default specifier has access in same class, same package, same package non subclass
        testDefaultSubClassObj.print();
    }
}
