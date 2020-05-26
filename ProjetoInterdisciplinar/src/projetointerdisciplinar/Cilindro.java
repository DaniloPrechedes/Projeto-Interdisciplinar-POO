package projetointerdisciplinar;

import java.io.Serializable;


public class Cilindro extends Ponto implements Serializable{
    private float altura, raio;

    public Cilindro() {
    }

    public Cilindro(float altura, float raio, float x, float y) {
        super(x, y);
        this.altura = altura;
        this.raio = raio;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float getVolume(){
        float volume;
        volume= (3.14f*(raio*raio)*altura);
        return volume;
    }

    @Override
    public String toString() {
        return "Cilindro" +super.toString() +"\nCilindro - altura: "+altura+ ", raio: "+raio+ "\nVolume do Cilindro : "+getVolume()+"\n";
    }

    
}
