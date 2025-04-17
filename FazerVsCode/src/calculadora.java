public class calculadora {
    public static void main(String[] args) {
        operadores op = new operadores();
        
        System.out.println("O resultado: "+ op.adicao(10, 5));
        System.out.println("O resultado: "+ op.subtracao(10, 5));
        System.out.println("O resultado: "+ op.multiplicacao(10, 5));
        System.out.println("O resultado: "+ op.divisao(10, 5));

        System.out.println("--- Operadores de Atribuicao ---");
        op.exemploAtribuicao();
        System.out.println();

        System.out.println("--- Operadores Logicos ---");
        System.out.println("true E true: " + op.operadorE(true, true));
        System.out.println("true E false: " + op.operadorE(true, false));
        System.out.println("true OU false: " + op.operadorOU(true, false));
        System.out.println("false OU false: " + op.operadorOU(false, false));
        System.out.println("NÃO true: " + op.operadorNao(true));
        System.out.println("NÃO false: " + op.operadorNao(false));
        System.out.println();

        System.out.println("--- Operadores de Comparacao ---");
        System.out.println("5 igual a 5: " + op.igualA(5, 5));
        System.out.println("5 diferente de 3: " + op.diferenteDe(5, 3));
        System.out.println("10 maior que 7: " + op.maiorQue(10, 7));
        System.out.println("2 menor que 8: " + op.menorQue(2, 8));
        System.out.println("6 maior ou igual a 6: " + op.maiorOuIgualA(6, 6));
        System.out.println("4 menor ou igual a 9: " + op.menorOuIgualA(4, 9));
    }
}
