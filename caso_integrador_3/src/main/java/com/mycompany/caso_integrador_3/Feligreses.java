package com.mycompany.caso_integrador_3;

import javax.swing.JOptionPane;

public class Feligreses {
    
    String nameFeligreses;
    String cedFeligreses;
    double Diezmo;

    public Feligreses(String nameFeligreses, String cedFeligreses, double Diezmo) {
        this.nameFeligreses = nameFeligreses;
        this.cedFeligreses = cedFeligreses;
        this.Diezmo = Diezmo;
    }

    public String getNameFeligreses() {
        return nameFeligreses;
    }

    public void setNameFeligreses(String nameFeligreses) {
        this.nameFeligreses = nameFeligreses;
    }

    public String getCedFeligreses() {
        return cedFeligreses;
    }

    public void setCedFeligreses(String cedFeligreses) {
        this.cedFeligreses = cedFeligreses;
    }

    public double getDiezmo() {
        return Diezmo;
    }

    public void setDiezmo(double Diezmo) {
        this.Diezmo = Diezmo;
    }
        


}

