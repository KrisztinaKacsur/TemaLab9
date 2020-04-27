package AnimalRescue;

public class AppMain2 {

    public static void main(String[] args) {

        Animal maya = new Animal();
        maya.setName("Maya");
        maya.setRace("labrador");
        maya.setColor("black");
        maya.setFavouriteFood("Chappie with chiken");
        maya.setFavouriteActivity ("Catch the ball");
        maya.setAge(2);
        maya.setWeight(20.5F);
        maya.setHealth(10);
        maya.setMood(10);


        System.out.println(maya.getName());
        System.out.println(maya.getRace());
        System.out.println(maya.getColor());
        System.out.println(maya.getFavouriteFood());
        System.out.println(maya.getFavouriteActivity());
        System.out.println(maya.getAge());
        System.out.println(maya.getWeight());
        System.out.println(maya.getHealth());
        System.out.println(maya.getMood());


        Rescuer human = new Rescuer();
        human.setName("Freya");
        human.setMoney(3500);

        System.out.println(human.getName());
        System.out.println(human.getMoney());



        Food food = new Food();
        food.setName("Chappie");
        food.setPrice(80.5F);
        food.setQuantity(9.5F);

        System.out.println(food.getName());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());

        Activity recreationalActivity = new Activity();
        recreationalActivity.setActivityName ("Catch the ball");

        System.out.println(recreationalActivity.getActivityName());


        Vet doctor = new Vet();
        doctor.setName("Oliver Jackson");
        doctor.setSpecialization("veterinarian");

        System.out.println(doctor.getName());
        System.out.println(doctor.getSpecialization());


    }
}
