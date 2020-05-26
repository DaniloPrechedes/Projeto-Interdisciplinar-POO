
package projetointerdisciplinar;

import java.io.Serializable;


public class Cone extends Ponto implements Serializable {
    private float altura, raio;

    public Cone () {
    }

    public Cone(float altura, float raio, float x, float y) {
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

   public float getVolume (){
       float volume;
       volume= (3.14f*(raio*raio)*altura)/3;
       return volume;
   }

    @Override
    public String toString() {
        return "Cone " +super.toString() +"\nCone - altura: "+altura+ ", raio: "+raio+ "\nVolume do Cone : "+getVolume()+"\n";
    }
    
}
