
package projetointerdisciplinar;

import java.io.Serializable;


public class Paralelepipedo extends Ponto implements Serializable{
    private float comprimento, altura, largura;

    public Paralelepipedo() {
    }

    public Paralelepipedo(float comprimento, float altura, float largura, float x, float y) {
        super(x, y);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
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
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float getVolume(){
        float volume;
        volume= comprimento*largura*altura;
        return volume;
    }

    @Override
    public String toString() {
        return "Paralelepipedo "+ super.toString() + "\nParalelepipedo Comprimento: "+ comprimento +
                ", \nAltura=" + altura +
                ", \nLargura="
                + largura + "\nVolume do Paralelepipedo: " +getVolume()+"\n";
    }
    
    
}
