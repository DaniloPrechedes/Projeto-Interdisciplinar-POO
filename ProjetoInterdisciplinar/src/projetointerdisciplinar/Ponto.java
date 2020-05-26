/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

import java.io.Serializable;

/**
 *
 * @author Danilo
 */
public class Ponto implements Serializable{
    private float x,y;

    public Ponto() {
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenadas do Ponto X = " + x + " e Y = " + y;
    }
}
