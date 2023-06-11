package BirdDesignV0.Bird;

public class Bird {
    BeakType beakType;
    EatingHabit eatingHabit;
    BirdSize birdSize;
    String birdName;

    void eat(String birdName){
        if("Eagle".equals(birdName)){
            System.out.println("Eat like an Eagle");
        }
        else if("Sparrow".equals(birdName)){
            System.out.println("Eat like a sparrow");
        }
    }
    void fly(String birdName){
        if("Eagle".equals(birdName)){
            System.out.println("Fly like an Eagle");
        }
        else if("Sparrow".equals(birdName)){
            System.out.println("Fly like a sparrow");
        }
    }
}
