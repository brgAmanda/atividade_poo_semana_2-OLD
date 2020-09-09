import java.util.Scanner;

public class TesteCalculadoraCientifica {
    public static void main(String... args) {
        
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n1-Radiciação\n2-Potenciação");
        int opcao = leitor.nextInt();
        String radicando = "";
        String base = "";
        String expoente = "";

        if (opcao == 1) {
            System.out.println("Qual é o radicando?");
            radicando = leitor.next();
        } else if (opcao == 2) {
            System.out.println("Qual é a Base?");
            base = leitor.next();
            System.out.println("Qual é o Expoente?");
            expoente = leitor.next();
        } else {
            System.out.println("Opção Inválida.");
        }

        Double resultado = 0.0;

        if (opcao == 1) {
            switch (opcao) {
                case 1:
                    resultado = calculadora.raiz(Integer.parseInt(radicando));
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = calculadora.raiz(Double.parseDouble(radicando));
                    System.out.println(resultado);
                    break;
                case 3: 
                    resultado = calculadora.raiz(radicando);
                    System.out.println(resultado);
                    break;
            }
        } else if (opcao == 2) {
            switch (opcao) {
                case 2:
                    resultado = calculadora.potencia(Byte.parseByte(base), Byte.parseByte(expoente));
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = calculadora.potencia(base, expoente);
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = calculadora.potencia(Integer.parseInt(base), Double.parseDouble(expoente));
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }
        leitor.close();
    }
    
}
