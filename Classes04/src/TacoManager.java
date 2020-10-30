public class TacoManager {

    private Taco[] tacos;
    public static final int DEF_SIZE = 10;

    public TacoManager(){
        init(DEF_SIZE);
    }
    
    public TacoManager(int size){

        init(size);

    }
    public void init(int size){
        if (size >= 1){
            tacos = new Taco[size];
        }
        else{
            tacos = new Taco[DEF_SIZE];
        }
    }




}
