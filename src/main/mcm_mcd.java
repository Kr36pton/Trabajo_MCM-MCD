package main;

public class mcm_mcd {
    public static int minimoComunMultiplo(int nro1, int nro2){

        int resultado = 1;
        int i = 2;
        while(i <= nro1 || i <= nro2)
        {
            if(nro1%i==0 || nro2%i==0)
            {
                resultado=resultado*i;
                if(nro1%i==0) nro1=nro1/i;
                if(nro2%i==0) nro2=nro2/i;
            }
            else
                i=i+1;
        }
        return resultado;
    }

    public static int maximoComunDivisor(int num1, int num2){
        while(num1 != num2)
            if (num1>num2)
                num1=num1-num2;
            else
                num2=num2-num1;
        return num1;
    }
    public static void main(String[] args){
        int num1 = maximoComunDivisor(15,13);
        int MCD = num1;
        int resultado = minimoComunMultiplo(18, 21);

        System.out.println("El maximo comun divisor de 15 y 13 es: "+num1);
        System.out.println("el minimo comun multiplo de 18 y 21 es: "+resultado);
    }
}
