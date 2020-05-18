package AnimalRescue;

public class Rescuer{

    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



    public void adopt () {
        System.out.println("Adopt dog ..");
    }

    public void buyFood () {
        System.out.println("Buy dog food..");
    }

    public void callVet () {
        System.out.println("Calls the vet..");
    }

    public void takesPetToVet () {
        System.out.println(" Takes dog to vet..");
    }



}
