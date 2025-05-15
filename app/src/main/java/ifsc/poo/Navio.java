package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import static java.awt.Color.red;

public class Navio {

    private int tamanhoNavio;
    private int posicaoX;
    private int posicaoY;
    private String orientacao;

    private final int DIMENSAO_QUADRADO = 20;

    public Navio(int tamanhoNavio, int posicaoX, int posicaoY, String orientacao) {
        this.tamanhoNavio = tamanhoNavio;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.orientacao = orientacao;
    }

    public void desenhar(Draw d) {

        d.setPenColor(red);

        if (orientacao == "horizontal") {

            int x = this.posicaoX;

            for (int i = 0; i < tamanhoNavio; i ++) {
                d.filledSquare(x, this.posicaoY, DIMENSAO_QUADRADO);

                x += 40;
            }

        } else if (orientacao == "vertical") {

            int y = this.posicaoY;

            for (int i = 0; i < tamanhoNavio; i++) {
                d.filledSquare(this.posicaoX, y, DIMENSAO_QUADRADO);

                y += 40;
            }
        }
    }
}