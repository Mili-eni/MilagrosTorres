package array;

import java.util.Scanner;

public class GesNotas {

	static Scanner teclado= new Scanner(System.in);		
	

	    public static void main (String []args){
	    	
	    
            double []notas = new double [10];	
           inicializarVector(notas); 
   		 
	        int opc;
	      
       	do {
		    System.out.print("Elige una opción:");
	        opc=teclado.nextInt(); 
	        System.out.print("Opción 1: mostrar toda las notas introducidas: ");
	        System.out.print("Opción 2: ordenar de menor a mayor las notas: ");
	        System.out.print("Opción 3: buscar una nota en la lista: ");
	        System.out.print("Opción 4: mostrar la nota media: ");
	        System.out.print("Opción 5: mostrar el número de aprobados: ");
	        System.out.print("Opción 6: mostrar la nota mas alta: ");
    
	        switch (opc) {
	        case 1: 
	     	break;
	     	
	        case 2:
	     	break;
	     	
	        case 3:
		    break;
		    
	        case 4:
	        break;
	        	
	        case 5:
	        break;
	        	
	        case 6:
	        break;
	        	
		
	        }

      }  while (opc != 0) ;
	     System.out.print("Opción no válida");
      
       	
       	}
	    
	 
        public static void inicializarVector(double[]notas) {
         for (int i= 0; i<notas.length; i++) {
        	 System.out.print("Ingresar notas: ");
        	 double num= teclado.nextDouble();
        	
      }   
        }
	    
	
	
	}
       	

	
       	
	    
		
       	
	

	