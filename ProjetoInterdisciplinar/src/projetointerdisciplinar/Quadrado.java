package projetointerdisciplinar;

import java.io.Serializable;

public class Quadrado extends Ponto implements Serializable{
    private float ladoa,ladob;
    
    public Quadrado(){
    }

    public Quadrado(float ladoa, float ladob, float x, float y) {
        super(x, y);
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    /**
     * @return the ladoa
     */
    public float getLadoa() {
        return ladoa;
    }

    /**
     * @param ladoa the ladoa to set
     */
    public void setLadoa(float ladoa) {
        this.ladoa = ladoa;
    }

    /**
     * @return the ladob
     */
    public float getLadob() {
        return ladob;
    }

    /**
     * @param ladob the ladob to set
     */
    public void setLadob(float ladob) {
        this.ladob = ladob;
    }

    public float getArea(){
        float area;
        area=ladoa*ladob;
        return area;
    }
    
    public float getPerimetro(){
        float perimetro;
        perimetro = ladoa+ladoa+ladob+ladob;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Quadrado"+super.toString()+"\nQuadrado lado A: " +ladoa + ", Lado B" + ladob + 
                "\nArea do Quadrado: "+getArea()+"\nPerimetro do Quadrado: "+getPerimetro()+"\n";
    }
    
    
    



}
