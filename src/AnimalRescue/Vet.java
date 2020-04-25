package AnimalRescue;

public class Vet {

    private String name;
    private String specialization;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public String getSpecialization () {
        return specialization;
    }

    public void setSpecialization (String specialization) {
        this.specialization = specialization;
    }



    public void consultAnimal() {
        System.out.println("Consulting animal..");
    }

    public void writePrescription () {
        System.out.println("Write prescription..");
    }

    public void giveInjection () {
        System.out.println("Gives injection..");
    }


}
