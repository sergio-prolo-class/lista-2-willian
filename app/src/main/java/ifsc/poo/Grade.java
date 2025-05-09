package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import static java.awt.Color.black;
import static java.awt.Color.yellow;

public class Grade {

    public void desenhar(Draw d) {
        //d.rectangle();

        d.setPenColor(yellow);
        d.filledSquare(0,0,400);
        //d.filledSquare(0,20,660);

        d.setPenColor(black);                   // Desenha as linhas
        d.line(0,400, 400, 400);
        d.line(0,360, 400, 360);
        d.line(0,320, 400, 320);
        d.line(0,280, 400, 280);
        d.line(0,240, 400, 240);
        d.line(0,200, 400, 200);
        d.line(0,160, 400, 160);
        d.line(0,120, 400, 120);
        d.line(0,80, 400, 80);
        d.line(0,40, 400, 40);
        d.line(0,0, 400, 0);

        // desenhar quadrado por quadrado em um loop i <

        //d.line(0,100,1000, 100);
        //d.line(0, 500,1000,500);
        //d.line(0,400, 1000, 400);

    }

}
