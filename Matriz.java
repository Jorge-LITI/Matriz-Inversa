import java.util.Scanner;
import static java.lang.Math. *;
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
        System.out.println("");
        System.out.println("Creando una nueva matriz!!");
    }
    
    public void mostrarMat(double mat [][])
    {
        for(int i = 0; i < this.filas; i++)
        {
            for(int j = 0; j < this.columnas; j++)
            {
                System.out.print("| " + mat[i][j] + " | ");
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
        System.out.print("");
    }

    public void signo()
    {
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                if(Math.pow(-1,(i+j)) > 0)
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

    public double determinante (double [][] matriz)
	{
		double determinante = 0 ;
		
		int fil = matriz.length;
		int col = matriz[0].length;
		
		// Si la matriz es 1x1, el determinante es el elemento de la matriz
		if ((fil==1) && (col==1))
                {
			return matriz[0][0];
                }

		int signo=1;
		
		for (int columna=0;columna<col;columna++)
		{
			// Obtiene el adjunto de fila=0, columna=columna, pero sin el signo.
      //submatriz Se vuelve una matriz
			double[][] submatriz = getSubmatriz(matriz, fil, col,columna);
			determinante = determinante + signo*matriz[0][columna]*determinante(submatriz);
			signo*=-1;
		}
		
		return determinante;
	}

	
	public double[][] getSubmatriz(double[][] matriz, 
			int fil,
			int col, 
			int columna) 
      {
		double [][] submatriz = new double[fil-1][col-1];
		int con=0;
		for (int j=0;j<col;j++)
		{
			if (j==columna) 
      continue;
			for (int i=1;i<fil;i++)
      {
      	submatriz[i-1][con]=matriz[i][j];
      }
        con++;
    
    }
		return submatriz;
	}

  public double[][] transpuesta(double[][] matriz)
  {
    double trans[][]=new double[matriz[0].length][matriz.length];
    for(int i=0;i<matriz.length;i++)
    {
      for(int j=0;j<matriz.length;j++)
      {
        trans[i][j]=matriz[j][i];
       System.out.print("| "+trans[i][j]+" |");
      }
      System.out.println(" ");
    }
    return trans;
  }
  
  public double[][] matrizCofactores(double[][] matriz){
    double[][] nm=new double[matriz.length][matriz.length];
    for(int i=0;i<matriz.length;i++) {
      for(int j=0;j<matriz.length;j++) {
        double[][] det=new double[matriz.length-1][matriz.length-1];
  double detValor;
      for(int k=0;k<matriz.length;k++) 
      {
        if(k!=i) 
        {
          for(int l=0;l<matriz.length;l++) 
          {
            if(l!=j) 
            {
              int indice1=k<i ? k : k-1;
              int indice2=l<j ? l : l-1;
              det[indice1][indice2]=matriz[k][l];
            }
          }
        }
      }
         detValor = deter(det);
         nm[i][j]= detValor * (double)Math.pow(-1,i+j+2);
      }
    }
  return nm;
}

public static double deter(double mat [][])
{
  double det = 0;
  if(mat.length == 2)
  {
  det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
  }
  if(mat.length == 3)
  {
  det= (mat[0][0]*mat[1][1]*mat[2][2]) + (mat[1][0]*mat[2][1]*mat[0][2]) + (mat[2][0] * mat[0][1] * mat[1][2]) - ((mat[0][2] + mat [1][1] + mat[2][0]) + (mat[1][2] + mat[2][1] + mat[0][0]) + (mat[2][2] + mat[0][1] + mat[1][0]));
  }
  return det;
}
public void inversa(double mat[][])
{
  for(int i=0;i<x.length;i++)
  {
    for(int j=0;j<x[i].length;j++)
    {
      System.out.print(mat[i][j]+"/"+ determinante(x) + "  |");
    }
    System.out.println();
  }
   
}

}