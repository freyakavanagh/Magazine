import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(this.magazines.get(index));
        // uses copy constructor to create a copy of the magazine you want to 'get' and returns it
    }

    public void setMagazine(int index, Magazine newMagazine) {
        this.magazines.set(index, new Magazine(newMagazine));
        // uses copy constructor to create a copy of the magazine you want to 'set' and sets it in the index
    }

    public void addMagazine(Magazine addMagazine){
        this.magazines.add(new Magazine(addMagazine));
        // uses copy constructor to create a copy of the magazine you want to 'add' and adds it to the arraylist
    }
}
