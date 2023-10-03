package contador.mvc.modelo;

public class Contador {
    
    private int contador;
    
    public Contador(){
        contador = 0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void incrementar(){
        this.contador++;
    }
    
    public void decrementar(){
        this.contador--;
    }
    
}
