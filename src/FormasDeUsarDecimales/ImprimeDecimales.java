package FormasDeUsarDecimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ImprimeDecimales {

    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
        
        System.out.println("");
        
        //utilizando la clase Format
        DecimalFormat df = new DecimalFormat ("#.00");//el numero de decimales dependera del numero de 0
        System.out.println("La raíz cuadrada de " + numero + " es " + df.format(raiz));
                
        //Utilizando   String format
        System.out.println("La raíz cuadrada de " + numero + " es " + String.format("%.2f",raiz));// en la cadena puedes aumentar o disminuir la cantidad de decimales usando float
        
        //Utilizando la clase Math.round
        System.out.println("La raíz cuadrada de " + numero + " es " + (double)Math.round(raiz * 100d) / 100);//aqui los decimales se paran con un punto
        
        //Utilizando BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de " + numero + " es " + bd.doubleValue());
        
    }
    
}
