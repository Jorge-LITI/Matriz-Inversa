import java.util.Scanner;
class Main {

  public static void Autores()
    {
        System.out.println("");
        System.out.println("Jorge Licea "  + "\nLuis Hernandes" + "\nOscar Morales");
        System.out.println();
    }

  public static void main(String[] args)
   {
      Autores();
        Scanner leer=new Scanner(System.in);
        System.out.println("Numero de filas ");
        int fil=leer.nextInt();
        System.out.println("Numero de columnas ");
        int col=leer.nextInt();

        
        //crear objeto Matriz
        Matriz mat1 = new Matriz(fil, col);
        mat1.llenarMat();
        mat1.mostrarMat();
        mat1.signo();
  }
}