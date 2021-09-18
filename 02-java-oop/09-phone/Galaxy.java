public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    //@Override
    public String ring(){
        return "Galaxy " + this.getVersionNumber() + "says" + this.getRingTone();
    }
    //@Override
    public String unlock(){
        return "Galaxy" + this.getVersionNumber() + "Unlocking vie fingerprint";
    }
    //@Override
    public void displayInfo(){
        System.out.println("Galaxy" + this.getVersionNumber() + "from " + this.getCarrier());
    
    }
}
