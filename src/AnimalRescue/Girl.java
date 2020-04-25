package AnimalRescue;

public class Girl {

    public String name;
    public int money;


    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public int getMoney () {
        return money;
    }

    public void setMoney (int money) {
        this.money = money;
    }





    public void adopt () {
        System.out.println("Adopt dog ..");
    }

    public void buyDogFood () {
        System.out.println("Buy dog food..");
    }

    public void walkDog () {
        System.out.println("Takes dog for walk..");
    }

    public void callVet () {
        System.out.println("Calls the vet..");
    }

    public void takesDogToVet () {
        System.out.println(" Takes dog to vet..");
    }
}
