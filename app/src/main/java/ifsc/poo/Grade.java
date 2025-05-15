package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import static java.awt.Color.black;
import static java.awt.Color.red;

public class Grade {

    private int x;
    private int y;

    public Grade(int x, int y) {

        if (x <= 0 || y <= 0) {
            this.x = 40;
            this.y = 40;
        }

        this.x = x;
        this.y = y;
    }
    
    public void desenhar(Draw d) {

        // Desenhar linhas horizontais

        d.setPenColor(black);

        int linhaHorizontal = this.x + 400;
        int linhaVertical = this.y + 400;
        int contY = this.y;
        int contX = this.x;

        for (int i = 0; i <= 10; i++) {
            d.line(this.x, contY, linhaHorizontal, contY);

            contY += 40;
        }

        // Desenhar linhas verticais

        for (int i = 0; i <= 10; i++) {
            d.line(contX, this.y, contX, linhaVertical);

            contX += 40;
        }

        d.setPenColor(red);

        // Rotulos para as colunas

        int rotuloColuna = this.x + 20;

        for (int i = 0; i < 10; i++) {
            d.text(rotuloColuna, (this.y - 20), Integer.toString(i));

            rotuloColuna += 40;
        }

        // Rotulos para as linhas

        int rotuloLinha = this.y + 20;

        for (int i = 0; i < 10; i++) {
            d.text((this.x - 20), rotuloLinha, (Character.toString((char) 'A' + i)));

            rotuloLinha += 40;
        }
    }
}