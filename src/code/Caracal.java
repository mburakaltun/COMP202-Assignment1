package code;

/* Modify this file using the following info
 * - Caracal is a Cat breed  
 * - Caracal is considered a wild cat
 * - Caracal moves with 22 units of speed
 * - Caracal makes a "hiss" sound
 * - Caracal cats have longer ears (Hint: add this to its description)
 * 
 * */


public class Caracal extends Cat {

    public Caracal() {
        breed = "Caracal";
        sound = "hiss";
        moveSpeed = 22;
    }

    @Override
    public void makeSound() {
        System.out.println("The " + breed + " makes a " + sound + " sound");
    }

    @Override
    protected void move() {
        super.move();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Caracal cats have longer ears.");
    }

    @Override
    public int getMovespeed() {
        return super.getMovespeed();
    }

    @Override
    public boolean isMigratory() {
        return super.isMigratory();
    }

    @Override
    public String food() {
        return super.food();
    }

    @Override
    public String dietaryStyle() {
        return super.dietaryStyle();
    }

    @Override
    public String location() {
        return super.location();
    }

    @Override
    public String temperature() {
        return super.temperature();
    }

    @Override
    public boolean isWild() {
        return true;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void sleep(int number_of_sleep_hours) {
        super.sleep(number_of_sleep_hours);
    }
}
