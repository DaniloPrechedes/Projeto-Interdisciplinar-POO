/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

import java.io.Serializable;


public class Equacao2grau implements Serializable{
    private float a,b,c;

    public Equacao2grau() {
    }

    public Equacao2grau(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }

    public float getDelta(){
        float delta;
        delta = (b * b) + (-4 * (a * c));
        return delta;
    }
    
    
    
    public String getCalculaX(){
        
        String texto;
        if(getDelta()>=0){
            float x1,x2;
            x1 = (float) ((-(b) + Math.sqrt(getDelta())) / 2 * a);
            x2 = (float) ((-(b) - Math.sqrt(getDelta())) / 2 * a);
            texto = "X1 = "+x1+" e X2 ="+x2;
        }else{
            texto="Delta menor que 0";
        }
        return texto;
    }

    @Override
    public String toString() {
        return "Equação de segundo grau:\n" + getCalculaX();
    }

   
    
    
}
