public class Penguin extends Bird{
    public Penguin(double wingSpan) {
        super(wingSpan);
        
    }
    //changing implementation because penguins cannot fly
@Override
   public void doesItFly(boolean canFly) {
        if(canFly) {
            System.out.println("This penguin cannot fly.");
        } 
    }
}
