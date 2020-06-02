package AnimalRescue;

public abstract class Dog extends Animal {




    public void play () {
        System.out.println("Playing..");
    }

    public void sit () {
        System.out.println("Sits ..");
    }

    public void wiggleTail () {
        System.out.println("Wiggling tail..");
    }

    public void walk () {
        System.out.println("Walk..");
    }




    @Override
    public void eat() {
        System.out.println("Eating pedigree");

    }

    @Override
    public void sleep() {

    }


    @Override
    public void speak() {

    }
}
