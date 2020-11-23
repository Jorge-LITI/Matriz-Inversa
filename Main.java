import java.util.Scanner;
class Main {

  public static void Autores()
    {
        System.out.println("Este programa fue hecho por:");
        System.out.println("");
        System.out.println(">> Jorge Licea "  + "\n>> Luis Hernandez" + "\n>> Oscar Morales");
        System.out.println("");
    }

  public static void main(String[] args)
   {
      Autores();
        Scanner leer = new Scanner(System.in);
        System.out.println("Numero de filas: ");
        System.out.print("");
        int fil = leer.nextInt();
        System.out.println("Numero de columnas: ");
        System.out.print("");
        int col = leer.nextInt();

        
        //crear objeto Matriz
        Matriz mat1 = new Matriz(fil, col);
        mat1.llenarMat();
        System.out.println("");
        mat1.mostrarMat(mat1.x);
        System.out.println("");
        mat1.signo();
        System.out.println("\nEl determinante de la matriz es: " + mat1.determinante(mat1.x));  
        System.out.println("La matriz de cofactores es: ");
        double [][] matC = mat1.matrizCofactores(mat1.x);
        mat1.mostrarMat(matC);    
        System.out.println("\nLa matriz inversa es: \n");
        mat1.inversa(matC);
  }
}