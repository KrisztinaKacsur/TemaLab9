package AnimalRescue;

public class AppMain2 {

    public static void main(String[] args) {

        System.out.println("Animals from the adoption center: " + "\n");

        Dog maya = new Dog();
        maya.setName("Maya");
        maya.setBreed("labrador");
        maya.setColor("black");
        maya.setFavouriteFood("Chappie with chiken");
        maya.setFavouriteActivity ("Catch the ball");
        maya.setAge(2);
        maya.setWeight(20.5F);
        maya.setHealth(10);
        maya.setMood(10);
        maya.speak();
        maya.eat();
        maya.run();
        maya.sleep();


        System.out.println(maya.getName());
        System.out.println(maya.getBreed());
        System.out.println(maya.getColor());
        System.out.println(maya.getFavouriteFood());
        System.out.println(maya.getFavouriteActivity());
        System.out.println(maya.getAge());
        System.out.println(maya.getWeight());
        System.out.println(maya.getHealth());
        System.out.println(maya.getMood());
        System.out.println("\n");

        Cat sassy = new Cat();
        sassy.setName("Sassy");
        sassy.setBreed("Maine Coon");
        sassy.setColor("Grey");
        sassy.setFavouriteFood("Boiled chicken");
        sassy.setFavouriteActivity("Playing with a toy mouse");
        sassy.setAge(1);
        sassy.setWeight(4.2F);
        sassy.setHealth(10);
        sassy.setMood(10);
        sassy.speak();
        sassy.eat();
        sassy.run();
        sassy.sleep();

        System.out.println(sassy.getAge());
        System.out.println(sassy.getBreed());
        System.out.println(sassy.getColor());
        System.out.println(sassy.getFavouriteFood());
        System.out.println(sassy.getFavouriteActivity());
        System.out.println(sassy.getAge());
        System.out.println(sassy.getWeight());
        System.out.println(sassy.getHealth());
        System.out.println(sassy.getMood());
        System.out.println("\n");

        Duck ducky = new Duck();
        ducky.setName("Ducky");
        ducky.setBreed("Domestic duck");
        ducky.setColor("dark brown");
        ducky.setFavouriteFood("worms");
        ducky.setFavouriteActivity("swimming");
        ducky.setAge(1);
        ducky.setWeight(5);
        ducky.setHealth(10);
        ducky.setMood(10);
        ducky.speak();
        ducky.eat();
        ducky.run();
        ducky.sleep();

        System.out.println(ducky.getAge());
        System.out.println(ducky.getBreed());
        System.out.println(ducky.getColor());
        System.out.println(ducky.getFavouriteFood());
        System.out.println(ducky.getFavouriteActivity());
        System.out.println(ducky.getAge());
        System.out.println(ducky.getWeight());
        System.out.println(ducky.getHealth());
        System.out.println(ducky.getMood());
        System.out.println("\n");

        Parrot kiki = new Parrot();
        kiki.setName("Kiki");
        kiki.setBreed("Budgerigar");
        kiki.setColor("green");
        kiki.setFavouriteFood("sunflower seeds");
        kiki.setFavouriteActivity("flying in the room");
        kiki.setAge(2);
        kiki.setWeight(30);
        kiki.setHealth(10);
        kiki.setMood(10);
        kiki.speak();
        kiki.eat();
        kiki.run();
        kiki.sleep();

        System.out.println(kiki.getAge());
        System.out.println(kiki.getBreed());
        System.out.println(kiki.getColor());
        System.out.println(kiki.getFavouriteFood());
        System.out.println(kiki.getFavouriteActivity());
        System.out.println(kiki.getAge());
        System.out.println(kiki.getWeight());
        System.out.println(kiki.getHealth());
        System.out.println(kiki.getMood());
        System.out.println("\n");

        System.out.println("Adoptors: " + "\n");

        Girl rescuer = new Girl();
        rescuer.setName("Freya");
        rescuer.setMoney(3500);

        System.out.println(rescuer.getName());
        System.out.println(rescuer.getMoney());
        System.out.println("\n");

        Boy secondRescuer = new Boy();
        secondRescuer.setName("Kevin");
        secondRescuer.setMoney(6500);

        System.out.println(secondRescuer.getName());
        System.out.println(secondRescuer.getMoney());
        System.out.println("\n");


        System.out.println("Food types: " + " \n");

        Dogfood food = new Dogfood();
        food.setName("Chappie");
        food.setFoodType("Dry food");
        food.setPrice(80.5F);
        food.setQuantity(9.5F);
        food.expire();

        System.out.println(food.getName());
        System.out.println(food.getFoodType());
        System.out.println(food.getPrice());
        System.out.println(food.getQuantity());
        System.out.println("\n");

        CatFood foodForCats = new CatFood();
        foodForCats.setName("Whiskas");
        foodForCats.setFoodType("Wet food");
        foodForCats.setPrice(140.5F);
        foodForCats.setQuantity(14);
        foodForCats.expire();

        System.out.println(foodForCats.getName());
        System.out.println(foodForCats.getFoodType());
        System.out.println(foodForCats.getPrice());
        System.out.println(foodForCats.getQuantity());
        System.out.println("\n");

        ParrotFood foodForParrots = new ParrotFood();
        foodForParrots.setName("Kirikiri");
        foodForParrots.setFoodType("Seeds");
        foodForParrots.setPrice(20.5F);
        foodForParrots.setQuantity(1);
        foodForParrots.expire();

        System.out.println(foodForParrots.getName());
        System.out.println(foodForParrots.getFoodType());
        System.out.println(foodForParrots.getPrice());
        System.out.println(foodForParrots.getQuantity());
        System.out.println("\n");




        Activity recreationalActivity = new Activity();
        recreationalActivity.setActivityName ("Catch the ball");

        System.out.println(recreationalActivity.getActivityName());

        System.out.println("Medical staff: " + "\n");

        Vet doctor = new Vet();
        doctor.setName("Oliver Jackson");
        doctor.setSpecialization("veterinarian");
        doctor.consult();
        doctor.speakWithRescuer();
        doctor.calmAnimal();

        System.out.println(doctor.getName());
        System.out.println(doctor.getSpecialization());
        System.out.println("\n");

        Nurse nurseLinda = new Nurse();
        nurseLinda.setName("Linda Baker");
        nurseLinda.setSpecialization("Nurse");
        nurseLinda.speakWithRescuer();
        nurseLinda.consult();
        nurseLinda.calmAnimal();

        System.out.println(nurseLinda.getName());
        System.out.println(nurseLinda.getSpecialization());
        System.out.println("\n");

        Technician veterinaryTechnician = new Technician();
        veterinaryTechnician.setName("Marcus Lander");
        veterinaryTechnician.setSpecialization("Veterinary Technician");
        veterinaryTechnician.speakWithRescuer();
        veterinaryTechnician.calmAnimal();

        System.out.println(veterinaryTechnician.getName());
        System.out.println(veterinaryTechnician.getSpecialization());
        System.out.println("\n");


    }
}
