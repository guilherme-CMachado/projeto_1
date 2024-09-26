public class Caldeira {

    private boolean caldeiraVazia = false;
    private boolean ferverCaldeira = false;

    private static Caldeira instance;

    private Caldeira() {
        this.caldeiraVazia = true;
        this.ferverCaldeira = false;
    }

    public static Caldeira getInstance() {
        if (instance == null) {
            instance = new Caldeira();
        }
        return instance;
    }

    public void encher() {
        if(caldeiraVazia){
            System.out.println("Caldeira em enchimento");
            caldeiraVazia = false;
            ferverCaldeira = false;
        }
    }

    public void ferver() {
        if(!caldeiraVazia && !ferverCaldeira){
            System.out.println("Caldeira fervendo: " + ferverCaldeira);
        ferverCaldeira = true;
        }else if(caldeiraVazia){
            System.out.println("Não tem como encher ferver uma caldeira vazia :/");
        }else{
            System.out.println("TÁ PEGANDO FOGO! NÃO FERVE NOVAMENTE!");
        }
    }

    public void drenar() {
        if (!caldeiraVazia && ferverCaldeira) {
            System.out.println("Drenando a caldeira");
            caldeiraVazia = true;
            ferverCaldeira = false;
        } else {
            System.out.println("Caldeira não está pronta para drenar");
        }
    }

    public boolean estaVazia(){
        return caldeiraVazia;
    }

    public boolean estaFervida(){
        return ferverCaldeira;
    }
}
