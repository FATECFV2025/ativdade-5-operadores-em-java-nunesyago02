public class operadores {
    public float adicao(float v1, float v2){
        return v1+v2;
    }

    public float subtracao(float v1, float v2){
        return v1-v2;
    }

    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }

    public float divisao(float v1, float v2){
        return v1/v2;
    }
    public void exemploAtribuicao() {
        float a = 10;
        float b = 5;

        a += b;
        System.out.println("a += b: " + a);

        a -= b;
        System.out.println("a -= b: " + a);

        a *= b;
        System.out.println("a *= b: " + a);

        a /= b;
        System.out.println("a /= b: " + a);

        a %= b;
        System.out.println("a %= b: " + a);
    }

    // Operadores Lógicos
    public boolean operadorE(boolean cond1, boolean cond2) {
        return cond1 && cond2;
    }

    public boolean operadorOU(boolean cond1, boolean cond2) {
        return cond1 || cond2;
    }

    public boolean operadorNao(boolean cond) {
        return !cond;
    }

    public boolean igualA(float v1, float v2) {
        return v1 == v2;
    }

    public boolean diferenteDe(float v1, float v2) {
        return v1 != v2;
    }

    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    public boolean maiorOuIgualA(float v1, float v2) {
        return v1 >= v2;
    }

    public boolean menorOuIgualA(float v1, float v2) {
        return v1 <= v2;
    }

}
