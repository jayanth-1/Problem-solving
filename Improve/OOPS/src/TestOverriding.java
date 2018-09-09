public class TestOverriding {

    public static void main(String[] args){

        //creating dog object which acquires properties of Animal base class
        Dog dogObj = new Dog();

        //Dog class overrides eat method in Animal class
        dogObj.eat();

        Rabbit rabbitObj = new Rabbit();

        //Rabbit class overrides eat method in Animal class
        rabbitObj.eat();
    }
}
