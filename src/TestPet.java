import com.ecpe308.sample.Pet;

public class TestPet {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.setName("Charlie");
        myPet.setBreed("Labrador");
        myPet.setPet_type("Dog");

        System.out.println("Name: " + myPet.getName());
        System.out.println("Breed: " + myPet.getBreed());
        System.out.println("Type: " + myPet.getPet_type());
    }
}
