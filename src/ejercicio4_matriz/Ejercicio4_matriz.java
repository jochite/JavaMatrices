package ejercicio4_matriz;

import java.util.Scanner;

public class Ejercicio4_matriz {

final static int TAMANYO=3;

    public static void main(String[] args) {
      
        int[][] matriz=new int[TAMANYO][TAMANYO];
         
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarDiagonal(matriz);
        mostrarDiagonalSecundaria(matriz);
        mostrarIdentidad(matriz);
        mostrarIdentidad2(matriz);
        mostrarEsCuadrada(matriz);
        }
    
    // rellenar matriz
    
    public static void rellenarMatriz(int[][]m){
         Scanner sc=new Scanner(System.in);// Ojo el scanner se incluye en el bucle
        for(int i=0;i<m.length;i++){// bucle externo recorrido para filas
           
             for(int j=0;j<m[i].length;j++){// bucle interno para columnas
                 System.out.println("dame un valor " + i + " " + j);
                 m[i][j]=sc.nextInt();
       }
     }
   }
    
    //mostrar matriz
    
    public static void  mostrarMatriz(int[][]m){
        
          for(int i=0;i<m.length;i++){// no necesita el scanner dentro del segundo bucle
             for(int j=0;j<m[i].length;j++){
                 System.out.print(m[i][j] + " ");
             }
             System.out.println("");
             
        }
    }
      
    // Mostrar Diagonal
    
    public static void mostrarDiagonal(int[][] m){
        
          for(int i=0;i<m.length;i++){
              
             for(int j=0;j<m[0].length;j++){
              
               if(i==j){ // la diagonal quiere decir que i y j coinciden
                  System.out.print(m[i][j]+ " ");
               }
                              
             }
                           
          }
          
    }
          
   public static void mostrarDiagonalSecundaria(int[][] m){
       
         for(int i=0;i<m.length;i++){
               for(int j=0;j<m[0].length;j++){                  
                   if (m.length-1-i==j){
                       
                   /* m.length-1-i==j
                       
                       el tamaño de la matriz es 3
                       3-1-0 ( ojo cero en este caso es i)
                       en la primera vuelta de bucle 2==0
                       
                       i=0
                       j=1
                       3-1-0
                       2==1 false ( segunda vuelta de bucle)
                       
                       i=0
                       j=2
                       3-1-0
                       2==2  true ( en la tercera vuelta de bucle 
                       
                       Recordar que la diagonal es cuando coinciden j e i
                                           
                   */
                       
                    System.out.print(m[i][j] +" "); 
                 
                 }
              }
           }
   }
   
         public static void mostrarIdentidad(int[][] m){ 
             
           /* son todo ceros excepto la diagonal principal
              recordar que por defecto las matrices de enteros
              se rellenan con cero*/
             
             for(int i=0;i<m.length;i++){
                 m[i][i]=1;// me olvido de la j y dependiendo de lo que
                           // vale i 
             
             }
         }
         
         public static void mostrarIdentidad2(int[][] m){ 
             
           /* son todo ceros excepto la diagonal principal
              recordar que por defecto las matrices de enteros
              se rellenan con ceros
             
             
              tenemos matriz
             
                 recordar que por defecto las matrices de enteros
                 se rellenan con ceros
             
               0 0 0 
               0 0 0
               0 0 0
             
              empezamos con
             
              i=0
              j=0
              ¿ 0==0 ?
              m[i][j]=1 ( le volcamos un 1
             
              segunda vuelta
             
              i=0
              j=1
              ¿ 0==1? no
              m[i][j]=1 (le volcamos un 1
             
             tercera vuelta
             
              i=0
              j=2
              ¿ 0==2? 
              m[i][j]=1 (le volcamos un 1
             
             cuarta vuelta y volvemos a empeza
             
              i=1
              j=1
              ¿ 1==1 ? si lo es
              m[i][j]=1 (le volcamos un 1
              
             
             es decir  i= 0 1 2
                       j= 0 1 2
             
             
             */
             
             for(int i=0;i<m.length;i++){
                 
                 for(int j=0;j<m[0].length;j++){  
                     
                   if(i==j){
                      m[i][j]=1; 
                 }
             }
           }
         }    
             
             public static boolean mostrarEsCuadrada(int[][] m){
                 
                 return m.length==m[0].length;// return trabaja con una condición
                 
                 /* si la comparación es verdadera hace un return true y
                    si no un return false
                    En este caso m[0] porque no hay ningun bucle. Si hubiese
                    un for m incluiria m[i]
                 
                 */
                 
             }
   }
    
   


