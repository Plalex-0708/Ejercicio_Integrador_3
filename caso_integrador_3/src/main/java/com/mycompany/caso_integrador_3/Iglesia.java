package com.mycompany.caso_integrador_3;

import javax.swing.JOptionPane;

public class Iglesia {

    String name;
    String namePastor;
    int cantFeligreses;

    
    
    public void SolicitudDatos() {
        name = JOptionPane.showInputDialog("Digite el nombre de la Iglesia");
        namePastor = JOptionPane.showInputDialog("Digite el nombre del Pastor");
        cantFeligreses = Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad de feligreses"));
        
        
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePastor() {
        return namePastor;
    }

    public void setNamePastor(String namePastor) {
        this.namePastor = namePastor;
    }

    public int getCantFeligreses() {
        return cantFeligreses;
    }

    public void setCantFeligreses(int cantFeligreses) {
        this.cantFeligreses = cantFeligreses;
    }
    
}
