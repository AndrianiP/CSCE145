//Adriani Perez
//10/23/2020


public class Apple {
    //step 2 create instance variables

    private String type;
    private double weight;
    private double price;
    //step 3 create constructor

    //Defualt
    public Apple(){

        this.type = "gala";
        this.weight = 1.0;
        this.price = 0.0;

    }

    public Apple(String aT, double aW, double aP){

        this.setType(aT);
        this.setWeight(aW);
        this.setPrice(aP);

    }
    //Step 4. Create Accessors
    public String getType(){
        return this.type;
    }
    public double getWeight(){
        return this.weight;
    }

    public double getPrice(){
        return this.price;
    }

    //Step 5 Create Mutators

    public void setType(String aT){

        if (aT != null && 
                    (aT.equalsIgnoreCase("gala") ||
                     aT.equalsIgnoreCase("red delicious") ||
                     aT.equalsIgnoreCase("golden delicious") || 
                     aT.equalsIgnoreCase("granny smith"))){

                        this.type = aT;
                     }
                    else{
                        this.type = "gala";
                    }
    }

    public void setWeight(double aW){

        if (aW >= 0.0 && aW <= 2.0){
            this.weight = aW;
        }
        else{
            this.weight = 1.0;
        }

    }
    public void setPrice(double aP){
        if (aP >= 0){
            this.price = aP;
        }
        else{
            this.price = 0;
        }
    }

    public String toString(){
        return "Type: " +this.type+" Weight: "+this.weight+" Price: "+this.price;
    }

    public Boolean equals(Apple anA){
        return anA != null &&
                        
                        this.type.equals(anA.getType()) && 
                        this.weight == anA.getWeight() &&
                        this.price == anA.getPrice();
    }
}

