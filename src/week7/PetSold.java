package week7;

public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHouseBroken;

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean getVaccinated() {
        return isVaccinated;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public boolean getNeutered() {
        return isNeutered;
    }

    public void setHouseBroken(boolean houseBroken) {
        isHouseBroken = houseBroken;
    }

    public boolean getHouseBroken() {
        return isHouseBroken;
    }
}
