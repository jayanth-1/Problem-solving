public class TestMethodOverloading {

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b){
        return a + b;
    }

    static void sum(int a, long b){
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void main(String[] args){

        //compile time polymorphism
        System.out.println(TestMethodOverloading.add(3,4));

        //method overloading by changing number of parameters
        System.out.println(TestMethodOverloading.add(3,4,5));

        //method overloading by changing data type of arguments
        System.out.println(TestMethodOverloading.add(3.2,4.2));

        //method overloading with TypePromotion
        TestMethodOverloading.sum(3,4);

    }
}
