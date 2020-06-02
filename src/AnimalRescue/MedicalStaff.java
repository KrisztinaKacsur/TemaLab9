package AnimalRescue;

public class MedicalStaff extends Human {




    public void speakWithRescuer () {
        System.out.println("Speak with rescuer .. ");
    }

    public void calmAnimal () {
        System.out.println("Calms the animal .. ");
    }

    public void consult () {
        System.out.println("Nurse consults animal..");
    }


    @Override
    public void takesCare() {

    }
}
