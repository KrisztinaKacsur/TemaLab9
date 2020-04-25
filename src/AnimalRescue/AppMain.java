package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog myPet = new Dog();

        System.out.println(myPet.getName());
        System.out.println(myPet.getRace());
        System.out.println(myPet.getColor());
        System.out.println(myPet.getFavouriteFood());
        System.out.println(myPet.getFavouriteActivity());
        System.out.println(myPet.getAge());
        System.out.println(myPet.getWeight());
        System.out.println(myPet.getHealth());
        System.out.println(myPet.getMood());


        Girl myHuman = new Girl();

        System.out.println(myHuman.name);
        System.out.println(myHuman.money);


        DogFood myDogFood = new DogFood();

        System.out.println(myDogFood.getName());
        System.out.println(myDogFood.getPrice());
        System.out.println(myDogFood.getQuantity());


        Vet myDoctor = new Vet();

        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpecialization());


    }
}
