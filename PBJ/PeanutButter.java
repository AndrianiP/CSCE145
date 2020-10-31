public class PeanutButter {

    private String name;
    private int calories;
    private boolean IsCrunchy;

    public PeanutButter() {
        this.name = "none";
        this.calories = 100;
        this.IsCrunchy = false;
    }

    public PeanutButter(String aN, int aC, boolean aIC) {

        this.setName(aN);
        this.setCalories(aC);
        this.setIsCrunchy(aIC);

    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public boolean getIsCrunchy() {
        return this.IsCrunchy;
    }

    public void setName(String aN) {
        if (aN != null) {
            this.name = aN;
        } else {
            this.name = "none";
        }
    }

    public void setCalories(int aC) {
        if (aC >= 100 && aC <= 300) {
            this.calories = aC;
        } else {
            this.calories = 100;
        }
    }

    public void setIsCrunchy(boolean aIC) {
        if (IsCrunchy = true) {
            this.IsCrunchy = aIC;
        } else {
            this.IsCrunchy = false;
        }
    }

    // Methods
    public String toString() {
        return this.name + " " + this.calories+ " "+ this.IsCrunchy;
    }

    public boolean equals(PeanutButter aP) {
        return aP != null && this.name.equalsIgnoreCase(aP.getName()) && this.calories == aP.getCalories()
                && this.IsCrunchy == aP.getIsCrunchy();

    }

}
