package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Animal myPet = new Animal();

        System.out.println(myPet.getName());
        System.out.println(myPet.getRace());
        System.out.println(myPet.getColor());
        System.out.println(myPet.getFavouriteFood());
        System.out.println(myPet.getFavouriteActivity());
        System.out.println(myPet.getAge());
        System.out.println(myPet.getWeight());
        System.out.println(myPet.getHealth());
        System.out.println(myPet.getMood());


        Rescuer myHuman = new Rescuer();

        System.out.println(myHuman.name);
        System.out.println(myHuman.money);


        Food myDogFood = new Food();

        System.out.println(myDogFood.getName());
        System.out.println(myDogFood.getPrice());
        System.out.println(myDogFood.getQuantity());


        Vet myDoctor = new Vet();

        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpecialization());


    }
}
