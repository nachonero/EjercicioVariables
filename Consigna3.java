public class Consigna3 {
    
    public static void main(String[] args) {

        final int AÑO_INICIAL = 1948;
        int año_nacimiento = 1990;
        boolean mi_año = false;
       
        System.out.println("Los años bisiestos hasta mi nacimiento fueron:");
        for (int año_bisiesto = 1948; año_bisiesto <= 1990; año_bisiesto = año_bisiesto+4) {
        System.out.println(año_bisiesto);
        }
       
        if (mi_año)
        
            System.out.println("Mi año de nacimiento es bisiesto");
        else 
            
            System.out.println("Mi año de nacimiento no es bisiesto");
                    
    }
    
   }
//A pesar de obtener impreso el resultado de forma correcta, creo que me falta definir los valores de la condición booleana. 
    

