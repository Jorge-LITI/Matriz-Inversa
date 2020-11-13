import java.util.Scanner;
public class Matriz
{
    Scanner scan = new Scanner(System.in);
    public double[][] x;
    public int filas;
    public int columnas;
    
    public Matriz(int filas, int columnas)
    {
        this.filas = filas;
        this.columnas = columnas;
        x = new double[filas][columnas];
        System.out.println("Creando una nueva matriz!!");
    }
    
    public void mostrarMat()
    {
        for(int i = 0; i < this.filas; i++)
        {
            for(int j = 0; j < this.columnas; j++)
            {
                System.out.print(this.x[i][j] + " |");
            }
            System.out.println("");
        }
    }
    
    public void llenarMat()
    {
        for(int i = 0; i < this.filas; i++)
        {
            for(int j = 0; j < this.columnas; j++)
            {
                System.out.print("Valor en la posicion"+"["+(i+1)+"]"+"["+(j+1)+"]: ");
                x[i][j] = scan.nextDouble();
            }
        }
    }

    public void signo()
    {
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                if(x[i][j]%2==0)
                {
                    System.out.print("+ ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }
    
}