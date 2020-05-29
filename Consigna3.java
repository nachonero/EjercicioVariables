public class Consigna3 {
    
    public static void main(String[] args) {

        int birth_year = 1990;
        boolean my_year = false;
        int leap_year;
        
        System.out.println("Los años bisiestos hasta mi nacimiento fueron:");
        for (leap_year = 1948; leap_year <= 1990; leap_year = leap_year+4) {
        System.out.println(leap_year);
        
        
            if (birth_year == leap_year){
             my_year=true;
            
            }
             
        }
            
        if (my_year==true) {
            System.out.println("Mi año de nacimiento es bisiesto");
            }
        
        else { 
            
            System.out.println("Mi año de nacimiento no es bisiesto");
            } 
       
   
    
    }
}

