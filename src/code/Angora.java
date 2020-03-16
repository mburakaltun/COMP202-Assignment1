package code;

/* Modify this file using the following info
 * - Angora is a Cat breed  
 * - Angora is not considered a wild cat
 * - Angora moves with 15 units of speed
 * - Angora makes a "meow" sound
 * - Angora cats may have differently colored eyes  (Hint: add this to its description)
 * 
 * */

public class Angora extends Cat {
/*
 * 
 *   YOUR CODE HERE
 * 
 * */

    public Angora() {
        breed = "Angora";
        sound = "meow";
        moveSpeed = 15;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    protected void move() {
        super.move();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Angora cats may have differently colored eyes");
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
        return super.isWild();
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
