public class TestInheritance {

    public static void main(String[] args){
        //creating Dog object
        Animal dogObj = new Dog();

        //dog object acquires properties of parent class i.e Animal class here accessing eat method in Animal class
        dogObj.eat();

    }
}
