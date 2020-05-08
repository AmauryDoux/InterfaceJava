public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    // takes off
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    // fly up
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flys upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    // fly down
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flys upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    //glide
    public void glide(){
        System.out.printf("It glides into the air.\n");
    }

    // land
    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.printf("%s landing.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
