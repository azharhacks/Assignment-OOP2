public class DemoBird {
    public static void main(String[] args) {
        // Create a Penguin object
        Bird penguin = new Penguin(1.2, false);
        penguin.getWingSpan(penguin.wingSpan);
        penguin.doesItFly(penguin.canFly);

        // Create an Eagle object
        Eagle eagle = new Eagle(2.5, true);
        eagle.getWingSpan(eagle.wingSpan);
        eagle.doesItFly(eagle.canFly);
    }
}
