//Adriani Perez

public class Jelly {

    private String name;
    private int calories;
    private String type;

    public Jelly() {
        this.name = "none";
        this.calories = 50;
        this.type = "grape";
    }

    public Jelly(String aN, int aC, String aT) {
        this.setName(aN);
        this.setCalories(aC);
        this.setType(aT);
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String aN) {
        if (aN != null) {
            this.name = aN;
        } else {
            this.name = "none";
        }
    }

    public void setCalories(int aC) {
        if (aC >= 50 && aC <= 200) {
            this.calories = aC;
        } else {
            this.calories = 50;
        }
    }

    public void setType(String aT) {
        if (aT != null) {
            this.type = aT;
        } else {
            this.type = "grape";
        }
    }

    // Methods

    public String toString() {
        return this.name + " " + this.calories + " " + this.type;
    }

    public boolean equals(Jelly aJ) {
        return aJ != null && this.name.equals(aJ.getName()) && this.calories == aJ.getCalories()
                && this.type == aJ.getType();
    }

}
