public class Gorilla extends Mammal {

    int energyLevel = 100;
    
    public void throwSomething(){
        int energyUsed = -5;
        System.out.println("The gorilla has thrown something and reduces his energy by " + energyUsed*-1 +"Points.");
        changeEnergyLevel(energyUsed);
    }

    public void eatBananas() {
        int energyCharge = 10;
        System.out.println("This gorilla eats a banana. He gains " + energyCharge + "Points.");
        changeEnergyLevel(energyCharge);
    }

    public void climb() {
        int energyReduce = -10;
        System.out.println("This gorilla starts climbing. He uses up " + energyReduce*-1 + "Points.");
        changeEnergyLevel(energyReduce);
    }
}
