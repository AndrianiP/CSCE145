
//Adriani Perez
//10/23/2020


public class Coffee {
    
    public String name;
    public double caffeine;
    public double risk;

    public Coffee(){
        this.name = "coffee00";
        this.caffeine = 50;

    }


    public Coffee(String cN, double cCaf, double cR){

     //TODO CALL MUTATORS
       this.setName(cN);
       this.setCaffeine(cCaf);


    }

    public String getName(){
        return this.name;
    }

    public double getCaffeine(){
        return this.caffeine;
    }

    public double getRisk(){
        return 180 / ((this.caffeine / 100) * 6);
   }

    public void setName(String cN){
        if (cN != null){
            this.name = cN;
        }
        else{
            this.name = "coffee00";
        }
    }

    public void setCaffeine(double cCaf){

        if (cCaf >= 50 && cCaf <= 300){
            this.caffeine = cCaf;
        }
        else{
            this.caffeine = 50;
        }

    }

    public String toString(){
        return "It would take " +this.risk+ " cups of "+this.name+ " before it becames dangerous.";
        
    }


    
}
