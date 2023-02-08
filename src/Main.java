public class Main {

    public static void main(String[] args) {
        // calculadora
        System.out.println("Exercicio Calculadora");

        Calculadora.soma( 8, 12);
        Calculadora.subtracao(30, 18);
        Calculadora.divisao(45, 9);
        Calculadora.multiplicacao(8, 5);
        
        // Mesnsagem
        System.out.println("Exercicio Mensagem");
        
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(19);

        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        
        Emprestimo.calcular(1500,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1500,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500,9);



    }

}
