
public class App {
    
    
    public static void main(String[] args) throws Exception {
        System.out.println("Willy Wonka te dá as boas vindas!");

       Caldeira caldeira = Caldeira.getInstance();

        caldeira.encher();  
        caldeira.ferver(); 
        caldeira.drenar(); 
    }
    
    

}

