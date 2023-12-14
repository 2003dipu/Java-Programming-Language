// encapsulation
public class Gari {

    private String make;
    private String model;
    private int year;

    Gari(String make, String model, int year) {
        this.setMake(make);
        this.make = make;
        this.setModel(model);
        this.setYear(year);
    }
    Gari(Gari x){
        this.copy(x);
    }
    // getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    // setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Gari x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }
}
