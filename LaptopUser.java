public class LaptopUser {
    
    private final Laptop laptop;
    
    public LaptopUser(Laptop laptop) { 
        this.laptop = laptop;
    }
    
    void turnOnLaptop() {
        this.laptop.poweron();
    }
    
    void turnOffLaptop(){
        this.laptop.powerOff();
    }
    void makeLaptopLouder(){ 
        this.laptop.volumeUp(); 
    }

    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}
