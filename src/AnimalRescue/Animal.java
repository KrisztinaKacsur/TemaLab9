package AnimalRescue;

public class Animal {

    private String name;
    private String race;
    private String color;
    private String favouriteFood;
    private String favouriteActivity;
    private int age;
    private float weight;
    private int health;
    private int mood;


    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getFavouriteFood () {
        return favouriteFood;
    }

    public void setFavouriteFood (String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }


    public String getFavouriteActivity () {
        return favouriteActivity;
    }

    public void setFavouriteActivity (String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }


    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }


    public float getWeight () {
        return weight;
    }

    public void setWeight (float weight) {
        this.weight = weight;
    }


    public int getHealth () {
        return health;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int getMood () {
        return mood;
    }

    public void setMood (int mood) {
        this.mood = mood;
    }


//---------------------------------------------------------------------------------------

    public void eat() {

        System.out.println("Eating..");
    }

    public void sleep () {
        System.out.println("Sleep..");
    }

    public void run () {
        System.out.println("Run..");
    }

    public void play () {
        System.out.println("Play..");
    }

    public void bark () {
        System.out.println("Bark..");
    }

    public void sit () {
        System.out.println("Sit..");
    }

    public void wiggleTail () {
        System.out.println("Wiggling tail..");
    }

    public void walk () {
        System.out.println("Walk..");
    }







}
