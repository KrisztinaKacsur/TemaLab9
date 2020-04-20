package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog myPet = new Dog();

        System.out.println(myPet.name);
        System.out.println(myPet.race);
        System.out.println(myPet.color);
        System.out.println(myPet.favouriteFood);
        System.out.println(myPet.favouriteActivity);
        System.out.println(myPet.age);
        System.out.println(myPet.wight);
        System.out.println(myPet.health);
        System.out.println(myPet.mood);


        Girl myHuman = new Girl();

        System.out.println(myHuman.name);
        System.out.println(myHuman.money);


        DogFood myDogFood = new DogFood();

        System.out.println(myDogFood.name);
        System.out.println(myDogFood.price);
        System.out.println(myDogFood.quantity);


        Vet myDoctor = new Vet();

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialization);


    }
}
