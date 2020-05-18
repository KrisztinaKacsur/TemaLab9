package AnimalRescue;

public class MedicalStaff {

    private String name;
    private String specialization;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }



    public void speakWithRescuer () {
        System.out.println("Speak with rescuer .. ");
    }

    public void calmAnimal () {
        System.out.println("Calms the animal .. ");
    }

    public void consult () {
        System.out.println("Nurse consults animal..");
    }



}
