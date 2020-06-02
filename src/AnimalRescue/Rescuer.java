package AnimalRescue;

public class Rescuer extends Human {




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


    @Override
    public void takesCare() {

    }
}
