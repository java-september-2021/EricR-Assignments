public class Bat extends Mammal{
    int energyLevel = 300;

    public void fly(){
        int reduceEnergy = -50;
        System.out.println("The bat is taking off.'WHOOOSH'");
        changeEnergyLevel(reduceEnergy);
    }
    
    public void eatHumans(){
        int gainEnergy = 25;
        System.out.println("The bat starts eating humans. 'WE'RE UNDER ATTACK!'");
        changeEnergyLevel(gainEnergy);
    }

    public void attackTown(){
        int reduceEnergy = -100;
        System.out.println("That starts attacking a town. 'LOOK OUT ITS MOTHERA!'");
        changeEnergyLevel(reduceEnergy);
    }
}