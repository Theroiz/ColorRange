import java.util.Scanner;

public class ColorRange {
    public static void main(String args[]) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um comprimento de onda");
        double ondaCom = entrada.nextDouble();
        String ondaCor = null;
        if(ondaCom >= 380D && ondaCom <= 450D)
        {
            ondaCor = "Violeta";
        }else if(ondaCom >= 450D && ondaCom <= 495D)
        {
            ondaCor = "Azul";
        }else if(ondaCom >= 495D && ondaCom <= 570D)
        {
            ondaCor = "Verde";
        }else if(ondaCom >= 570D && ondaCom <= 590D)
        {
            ondaCor = "Amarelo";
        }else if(ondaCom >= 590D && ondaCom <= 620D)
        {
            ondaCor = "Laranja";
        }else if(ondaCom >= 620D && ondaCom <= 750D)
        {
            ondaCor = "Vermelho";
        }
        System.out.println(ondaCom < 380D || ondaCom >750D ? "O comprimento de onda dado nao faz parte do spectro visivel" : "O comprimento de onda "+ondaCom+" gera a cor "+ondaCor);
    }
}