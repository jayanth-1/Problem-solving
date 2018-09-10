public class TestMultipleInheritanceInterface implements InterfaceA, InterfaceB {

    @Override
    public void speed(){
        System.out.println("Speed is 40km/hr");
    }

    @Override
    public void distanceTravelled(){
        System.out.println("distanceTravelled upto 60km");
    }

    public static void main(String[] args){

        //creating TestMultipleInheritanceInterface object
        TestMultipleInheritanceInterface testMultipleInheritanceInterfaceObj = new TestMultipleInheritanceInterface();

        //calling override methods
        //no ambiguous here because speed and distanceTravelled method have no implementation in interface
        testMultipleInheritanceInterfaceObj.speed();
        testMultipleInheritanceInterfaceObj.distanceTravelled();
    }
}
