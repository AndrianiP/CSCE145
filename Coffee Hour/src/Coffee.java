
//Adriani Perez
//10/23/2020


public class Coffee {
    
    public String name;
    public double caffeine;

    public Coffee(){
        this.name = "none";
        this.caffeine = 50;

    }

    public Coffee(String aN, double aC){
        this.setName(aN);
        this.setCaffeine(aC);
        
    }

    public String getName(){
        return this.name;
    }
    
    public double getCaffeine(){
        return this.caffeine;
    }

    public void setName(String aN){
        if (aN != null){
            this.name = aN;
        }
        else{
            this.name = "none";
        }
    }

    public void setCaffeine(double aC){
        if (aC >= 50 && aC <= 300){
            this.caffeine = aC;
        }
        else{
            this.caffeine = 50;
        }
    }

    public String toString(){
        return this.name;
    }
    public double riskyAmount(){
        return 180.0/((this.getCaffeine() / 100.0)*6.0);

    }

}
