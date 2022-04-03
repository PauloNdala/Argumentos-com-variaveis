package variaveis;

public class Variaveis {
   
   private double s;
   public double soma(String titulo,double...listaNumeros) {
	   System.out.println(titulo);
	   double total = 0 ;
	   for (double n : listaNumeros) {
		   total+=n;
	   }
	   return total;
   }
    

}
