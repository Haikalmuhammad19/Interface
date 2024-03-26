public class MacBook implements Laptop {
    private int volume;
    private boolean is_power_on;
    private static final int MAX_VOL = 100; // Nilai maksimum volume
    private static final int MIN_VOL = 0;   // Nilai minimum volume

    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("MacBook Pro");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is in process...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
            }
            System.out.println("Volume is " + this.getVolume());
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
            }
            System.out.println("Volume is " + this.getVolume());
        }
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public void poweron() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
