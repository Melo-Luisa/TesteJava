public class juiz {
    public int pontuacao;
    public int vidas;

    public juiz(int pontuacao, int vidas) {
        this.pontuacao = pontuacao;
        this.vidas = vidas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getVidas() {
        return vidas;
    }
    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }
    
}
