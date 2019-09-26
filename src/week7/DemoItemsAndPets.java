package week7;

public class DemoItemsAndPets {
    public static void main(String args[]) {
        PetSold pet = new PetSold();

        pet.setInvoiceNum(1);
        pet.setDescription("Cat");
        pet.setPrice(100.00);
        pet.setVaccinated(true);
        pet.setNeutered(false);
        pet.setHouseBroken(false);
    }
}
