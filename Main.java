import java.util.Scanner;
public class Main {
    public static void main(String[] args) {     
// degdegisenler yazmak
int a,b,c;
double u,alan;


Scanner imput= new Scanner(System.in);
System.out.println(" A değrini gir" );
a= imput.nextInt();

System.out.println("B değrini gir" );
b= imput.nextInt();

System.out.println("c değrini gir" );
c= imput.nextInt();
u = (a+b+c) / 2;

alan= Math.sqrt((u *(u -a)*(u -b)*(u -c)));
System.out.println(" Alan değri  " +alan);

    }
    
}
