
package com.mycompany.caso_integrador_3;

import javax.swing.JOptionPane;


public class FeliArr {
    Iglesia Igle  = new Iglesia();
    
    Feligreses arrFeli[] = new Feligreses[Igle.cantFeligreses];
    
   
public void lecturaFeligreses(){
    for(int i = 0; Igle.cantFeligreses==arrFeli.length; i++){
JOptionPane.showMessageDialog(null, "Se solicitarán los datos de los feligrses "+i);
String  nameFeligreses = JOptionPane.showInputDialog(null,"Digite el nombre del feligres");
String cedFeligreses = JOptionPane.showInputDialog(null,"Escriba el numero de cedula del feligreses");
double Diezmo = Double.parseDouble(JOptionPane.showInputDialog("Escriba el salario del feligres")) * 0.10;
arrFeli[Igle.cantFeligreses] = new Feligreses(nameFeligreses, cedFeligreses, Diezmo);
}
}
}
