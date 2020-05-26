 
package projetointerdisciplinar;

import java.io.Serializable;

public class Triangulo extends Ponto implements Serializable{
    private float base,altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura, float x, float y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
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
    
    public float getArea(){
        float area;
        area=(base*altura)/2;
        return area;
    }
    
    public float getPerimetro(){
        float perimetro;
        perimetro=base+(altura*2);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo" +super.toString() +"\nTringulo - Base :"+ base + ", Altura :" + altura +
                "\n Area do triangulo: "+getArea()+" Perimetro do triangulo: "+getPerimetro()+"\n";
    }
    
    
}
