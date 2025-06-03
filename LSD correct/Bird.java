public class Bird {
    protected double wingSpan;
    protected boolean canFly;

    public Bird(double wingSpan,boolean canFly) {
        this.wingSpan = wingSpan;
        this.canFly = canFly;
        
    }
public void getWingSpan (double wingSpan) {
        System.out.println("Bird's wingspan is: " + wingSpan);
    }


public void doesItFly(boolean canFly){
    if(canFly== true) {
        System.out.println("This bird can fly.");
    } else {
        System.out.println("This bird cannot fly.");
    }

}
}