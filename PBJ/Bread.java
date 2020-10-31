//Adriani Perez

public class Bread {

    private String name;
    private int calories;
    private String type;

    // Constructor

    // Set Default
    public Bread() {

        this.name = "none";
        this.calories = 50;
        this.type = "Whole Wheat";
    }

    public Bread(String aN, int aC, String aT) {
        this.setName(aN);
        this.setCalories(aC);
        this.setType(aT);
    }

    // Accesors
    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getType() {
        return this.type;
    }

    // mutators
    public void setName(String aN) {
        if (aN != null) {
            this.name = aN;
        } else {
            this.name = "none";
        }
    }

    public void setCalories(int aC) {
        if (aC >= 50 && aC <= 250) {
            this.calories = aC;
        } else {
            this.calories = 50;
        }
    }

    public void setType(String aT) {
        if (aT != null) {
            this.type = aT;
        } else {
            this.type = "Whole wheat";
        }
    }
    // Methods

    public String toString() {
        return this.name + " " + this.calories + " " + this.type;
    }

    public boolean equals(Bread aB) {
        return aB != null && this.name.equals(aB.getName()) && this.calories == aB.getCalories()
                && this.type.equals(aB.getType());
    }
}
