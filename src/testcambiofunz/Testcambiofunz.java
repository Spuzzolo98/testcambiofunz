package testcambiofunz;
import java.util.Random;
import java.util.Scanner;
public class Testcambiofunz 
{

    public static void cambio(int j[],int n)
    {
            j[0] = 5; //il vettore allo slot 0 cambia stato perchè basato su riferimento
            n = 2; //la variabile invece non cambia
    }
    public static void main(String[] args) 
    {
        int j[] = new int[100], n=7; //vettore da cento, tutti gli oggetti =0
        cambio(j,n); //funzione con variabile e vettore con valori distinti
        System.out.println(j[0] +" "+n); //output 5 7, vedi sopra
    }    
}
