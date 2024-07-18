package DesafioControleFluxo;

public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, forneça exatamente dois parâmetros.");
            return;
        }

        try {
            int primeiroParametro = Integer.parseInt(args[0]);
            int segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro >= segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, forneça parâmetros válidos (números inteiros).");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}