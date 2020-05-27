public class Consigna4 {
    
    public static void main(String[] args) {
        
        String nombre = "ignacio neis roina";
        String fecha_nacimiento = "26/11/1990";
        
        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("Naci el "+fecha_nacimiento);
        
     
for (int año_bisiesto = 1948; año_bisiesto <= 1990; año_bisiesto = año_bisiesto+4) {
        
       if (año_bisiesto==1990)
        System.out.println("Mi año de nacimiento es bisiesto");
        
       else
        
        System.out.println("Mi año de nacimiento no es bisiesto");
           }   
}
}
/*He utilizado el bucle de la fase anterior para "obtener" el dato desde un cálculo, y así no poner directamente un System.out.print indicando que "mi año no es bisiesto"
 En el caso de que se pidiese lo anterior, se pueden omitir las líneas de las 13 a la 19, quedanto impreso en pantalla el resultado solicitado.  
El problema es que con el bucle aparece "mi año de nacimiento no es bisiesto" en cada valor que calcula "for"*/