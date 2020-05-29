public class Consigna4 {
    
    public static void main(String[] args) {
        
        String name = "Ignacio Neis Roina";
        String birth_date = "26/11/1990";
        int birth_year = 1990;
        boolean my_year=false;
        int leap_year;
        
        System.out.println("Mi nombre es "+name);
        System.out.println("Nací el "+birth_date);
        
     
        for (leap_year = 1948; leap_year <= 1992; leap_year = leap_year+4) {
       
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
