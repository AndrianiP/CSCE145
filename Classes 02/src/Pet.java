//Adriani Perez

//Step 1 Define Class
public class Pet {

    //step 2 Create Properties
    //Instance variables

    private String name;
    private int age;
    private double weight;
    private PetType type;

    //Step 3 Constructor

    //Default
    public Pet(){
        this.name = "none";
        this.age = 0;
        this.weight = 1.0;
        this.type = PetType.UNKNOWN;
    }
    //Parameterized (Creates a new instance and sets all the values)
    public Pet(String aN, int anA, double aW, PetType aT){
        
        this.setName(aN);
        this.setAge(anA);
        this.setWeight(aW);
        this.setType(aT);

    }
    //Step 4. Create Accessors (the scopes are private so we cant access them outside this class. This is when we access them)
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public PetType getType(){
        return this.type;
    }
    //Step 5. Create Mutators (Allows us to modify cvalues outside of this class first we need to validate if this value is correct)
    public void setName(String aN){
        if (aN != null)
            this.name = aN;
        else
            this.name = "none";
    }
    public void setAge(int anA){
        if (anA > 0)
            this.age = anA;
        else
            this.age = 0;
    }
    public void setWeight(double aW){
        if (aW > 0.0)
            this.weight = aW;
        else
            this.weight = 1;
    }
    public void setType(PetType aT){
        if (aT != null)
            this.type = aT;
        else
            this.type = PetType.UNKNOWN;
    }
    //Step 6. Other methods

    public String toString(){
        return this.name+ " "+ this.age +" "+ this.weight+" "+this.type;
    }

    public boolean equals(Pet aP){
        return aP != null &&
                this.name.equals(aP.getName()) &&
                this.age == aP.getAge() &&
                this.weight == aP.getWeight() &&
                this.type == aP.getType();
    }


    public void giveCompliment(){
        System.out.println(this.name+" reacted with joy");

    }

    public void giveCompliment(int c){
        for (int i = 0; i < c; i++){
            this.giveCompliment();
        }
    }
    //Static methods

    public static Pet createNewPet(PetType aT){
        
        Pet newPet = new Pet();
        newPet.setType(aT);
        return newPet;

    }

    public static Pet clonePet(Pet aP){
        
        if(aP == null)
            return null;
        return new Pet(aP.getName(), aP.getAge(), aP.getWeight(), aP.getType());
    }

}
