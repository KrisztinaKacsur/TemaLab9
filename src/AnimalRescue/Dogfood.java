package AnimalRescue;

public class Dogfood extends Food {



    public void juniorFood () {
        System.out.println("Perfect food for young dog ...");
    }

    public void adultFood () {
        System.out.println("Food for grown dogs ...");
    }

    public void seniorFood () {
        System.out.println("Food for old dogs");
    }


    @Override
    public void expire() {

    }
}
