//Adriani Perez


public class PBJSandwich {

    private Bread TopSlice;
    private PeanutButter PeanutButter;
    private Jelly Jelly;
    private Bread BottomSlice;

    public PBJSandwich(){
        this.TopSlice = new Bread();
        this.PeanutButter = new PeanutButter();
        this.Jelly = new Jelly();
        this.BottomSlice = new Bread();
    }

    public PBJSandwich(Bread aTS, PeanutButter aP, Jelly aJ, Bread aBS) {

        this.setTopSlice(aTS.getName(), aTS.getCalories(), aTS.getType());
        this.setPeanutButter(aP.getName(), aP.getCalories(), aP.getIsCrunchy());
        this.setJelly(aJ.getName(), aJ.getCalories(), aJ.getType());
        this.setBottomSlice(aBS.getName(), aBS.getCalories(), aBS.getType());

    }

    public Bread getTopSlice(){
        return this.TopSlice;
    }
    public PeanutButter getPeanutButter(){
        return this.PeanutButter;
    }
    public Jelly getJelly(){
        return this.Jelly;
    }
    public Bread getBottomSlice(){
        return this.BottomSlice;
    }

    public void setTopSlice(String aN, int aC, BreadType aT){
        this.TopSlice.setName(aN);
        this.TopSlice.setCalories(aC);
        this.TopSlice.setType(aT);
    }

    public void setPeanutButter(String aN, int aC, boolean aIC){
        this.PeanutButter.setName(aN);
        this.PeanutButter.setCalories(aC);
        this.PeanutButter.setIsCrunchy(aIC);
    }
    public void setJelly(String aN, int aC, FruitType aT){
        this.Jelly.setName(aN);
        this.Jelly.setCalories(aC);
        this.Jelly.setType(aT);
    }
    public void setBottomSlice(String aN, int aC, BreadType aT){
        this.BottomSlice.setName(aN);
        this.BottomSlice.setCalories(aC);
        this.BottomSlice.setType(aT);
    }

    public String toString(){
        return this.TopSlice+"\n"+this.PeanutButter+"\n"+this.Jelly+"\n"+this.BottomSlice;

    }
/*
    public boolean equals(PBJSandwich aPBJ){
        if (aPBJ != null &&
            this.TopSlice == aPBJ.TopSlice(aTS.getName(),aTS.getCalories(),aTS.getType()) &&
            this.PeanutButter == aPBJ.PeanutButter(dP.getName(), dP.getCalories(), dP.getIsCrunchy()) &&
            this.Jelly == aPBJ.Jelly(aJ.getName(), aJ.getCalories(), aJ.getType()) &&
            this.BottomSlice == aPBJ.BottomSlice());

    }
    */
}
