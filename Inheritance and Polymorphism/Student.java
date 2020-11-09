public class Student extends Person{

    private int id;

    public Student(){
        super();//Persons default constructor

        this.id = 0;

    }
    public Student(String aN, int anID){
        
        super(aN);//Persons parameter constructor
        this.setID(anID);
    }
    
    public int getID(){
        return this.id;
    }

    public void setID(int anID){
        if(anID >= 0){
            this.id = anID;
        }
        else{
            this.id = 0;
        }

    }

    public String toString(){
        return super.toString()+" ID: "+this.id;
    }
    public boolean equals(Student aS){
        return aS != null && 
                super.equals(aS) &&
                this.id == aS.getID();
    }

}
