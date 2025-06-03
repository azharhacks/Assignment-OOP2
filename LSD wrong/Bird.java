//Does not respect LSD principle
public class Bird {
    protected double wingSpan;
    protected boolean canFly= true;

    public Bird(double wingSpan) {
        this.wingSpan = wingSpan;
        
    }
public void getWingSpan (double wingSpan) {
        System.out.println("Bird's wingspan is: " + wingSpan);
    }


public void doesItFly(boolean canFly){
    if(canFly) {
        System.out.println("This bird can fly.");
    } else {
        System.out.println("This bird cannot fly.");
    }

}
}