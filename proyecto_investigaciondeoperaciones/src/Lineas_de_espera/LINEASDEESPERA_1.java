package Lineas_de_espera;
import java.io.IOException;
import java.util.Scanner;

public class LINEASDEESPERA_1 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Double seguir;
		do
		{
			double prueba;
			double λ;
			double μ;
			double Ls;
			double Lq;
			double Ws;
			double Wq;
			double Po;
			double ρ;
			double Pn;
			int n;
			double Pw;
			double S;
			double X,T,U,W,L,F,N,H,J,n1;
			String unidad;
			int model;
			System.out.println("escoja su modelo\n");
			System.out.println("Modelo 1\n"
							  +"Modelo 2\n"
							  +"Modelo 3\n"
							  +"Modelo 4\n");
			Scanner R = new Scanner(System.in);
			model = R.nextInt();
			switch(model)
			{
				case 1:
					System.out.println("digite le valor de  λ (lambda):\n");
					λ = R.nextDouble();
					System.out.println("digite el valor de μ (miu):\n");
					μ = R.nextDouble() ;
					System.out.println("digite el valor de n:\n");
					n = R.nextInt() ;
					System.out.println("digite la unidad de medida (dias,horas,minutos,segundos):\n");
					unidad = R.next();
					Ls = λ/(μ-λ);
					Lq = Math.pow(λ, 2)/(μ*(μ-λ));
					Ws = Ls/λ;
					Wq = Lq/λ;
					Po = 1 - (λ/μ);
					ρ = λ/μ;
					Pn = Math.pow(ρ, n)*(Po);
					System.out.println("Ls:  " +Ls+ " clientes esperando en el sistema");
					System.out.println("Lq:  " +Lq+ " clientes esperando en la cola");
					System.out.println("Ws:  " +Ws+ " " +unidad+ " de espera en el sistema" );
					System.out.println("Wq:  " +Wq+ " " +unidad+ " de espera en la cola");
					System.out.println("Po:  " +Po+ " " +unidad+ "  % de que este desocupado el sistema");
					System.out.println("ρ:  " +ρ+ " " +unidad+ "  % de que este ocupado el sistema");
					System.out.println("Pn: " +Pn+ " , es la probabilidadque haya exactamente n unidades en el sistema de las filas");
					break;
				case 2:
					System.out.println("digite le valor de  λ (lambda):\n");
					λ = R.nextDouble();
					System.out.println("digite el valor de μ (miu):\n");
					μ = R.nextDouble() ;
					System.out.println("digite la unidad de medida (dias,horas,minutos,segundos):\n");
					unidad = R.next();
					Lq = Math.pow(λ, 2)/((2*μ)*(μ-λ));
					Ls = (Lq)+(λ/μ);
					Ws = Ls/λ;
					Wq = Lq/λ;
					System.out.println("Ls:  " +Ls+ " clientes esperando en el sistema");
					System.out.println("Lq:  " +Lq+ " clientes esperando en la cola");
					System.out.println("Ws:  " +Ws+ " " +unidad+ " de espera en el sistema" );
					System.out.println("Wq:  " +Wq+ " " +unidad+ " de espera en la cola");
					break;
				case 3:
					System.out.println("digite le valor de  λ (lambda):\n");
					λ = R.nextDouble();
					System.out.println("digite el valor de μ (miu):\n");
					μ = R.nextDouble() ;
					System.out.println("digite el numero de servidores:\n");
					S = R.nextDouble() ;
					System.out.println("digite la unidad de medida (dias,horas,minutos,segundos):\n");
					unidad = R.next();
					System.out.println("digite el numero promedio que espera en la fila:\n");
					Lq = R.nextDouble() ;
					//Lq = λ/μ;
					Ls = (Lq)+(λ/μ);
					Ws = Ls/λ;
					Wq = Lq/λ;
					Pw = Lq*(((S*μ)/λ) - 1);
					System.out.println("Ls:  " +Ls+ " clientes esperando en el sistema");
					System.out.println("Lq:  " +Lq+ " clientes esperando en la cola");
					System.out.println("Ws:  " +Ws+ " " +unidad+ " de espera en el sistema" );
					System.out.println("Wq:  " +Wq+ " " +unidad+ " de espera en la cola");
					System.out.println("Pw:  " +Pw+ ", es la probabilidad de esperar en línea ");
					break;
				case 4:
					System.out.println("digite le valor de  T:\n");
					T = R.nextDouble();
					System.out.println("digite le valor de  N:\n");
					N = R.nextDouble();
					System.out.println("digite el valor de U:\n");
					U = R.nextDouble() ;
					System.out.println("digite el numero de F:\n");
					F = R.nextDouble() ;
					System.out.println("digite el valor de Po:\n");
					Po = R.nextDouble();
					/*System.out.println("digite el valor de Prueba:\n");
					prueba = R.nextDouble();*/
					X = T/(T+U);
					L = N*(1-F);
					H = F*N*X;
					n1 = L + H;
					J = N*F*(1-X);
					W = (L*T)/H;
					//Pn = factorial(prueba);
					Pn = Math.pow(X, n1)*Po*(factorial(N)/factorial(N-n1));
					System.out.println("X:  " +X);
					System.out.println("H:  " +H);
					System.out.println("L:  " +L);
					System.out.println("n:  " +n1);
					System.out.println("Pn:  " +Pn);
					System.out.println("J:  " +J);
					System.out.println("W:  " +W);
					System.out.println("F:  " +F);
					break;
				default:
					System.out.println("Este programa solo contempla 4 modelos");
			}
			System.out.println("\n¿desea cotinuar?  si = 1 | no = 0 \n");
			seguir = R.nextDouble();
		}
		while(seguir == 1);
		new ProcessBuilder("cmd" , "/c" ,"cls").inheritIO().start().waitFor();
	}
	public static double factorial (double n)
	{
		double aux = 1;
				for(int i = 2; i <= n; i++)
				{
					aux *= i;
				}
				return aux;
	}
}
