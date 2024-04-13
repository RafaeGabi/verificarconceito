public class verificarconceito {
    public static void main(String[] args) {
        char conceito;

        System.out.print("Conceito do Aluno: ");

        conceito = System.console().readLine().charAt(0);

        if(conceito != 'A' && conceito != 'B' && conceito != 'C')
            System.out.println("Conceito Inválido");

        if(conceito == 'A' || conceito == 'B')
            System.out.println("Aluno Aprovado!!");

        if(conceito == 'C')
            System.out.println("Aluno Reprovado!!");

    }
}
