package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
        Alfabeto.letras = letras;
    }
    
    @Override
    public String interpretacion() {
        return interpretacion; 
        }

    @Override
    public String toString() {
    	String letrascoma = String.join(",", letras);
        return letrascoma;
    }
    
    public String[] getLetras() {
        return letras;
        }

    public void setLetras(String[] letras) {
        Alfabeto.letras = letras;
        }

    public String getInterpretacion() {
        return interpretacion;
        }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
        }

   public int cantidadLetras(){
        return letras.length;
    }

}