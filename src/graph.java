import javax.swing.*;
import java.awt.*;


public class graph extends Canvas {


    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,400,400);
        g.drawOval(160, 120,50,50);
        g.drawOval(160, 50,50,50);
        g.drawOval(160, 190,50,50);
        g.drawRoundRect(145,35,80,220, 50, 50);
        g.setColor(Color.black);
        g.fillRoundRect(145,35,80,220,50,50);

        /*Белое закругление над красным*/
        g.setColor(Color.lightGray);
        g.drawOval(158,185,53,53);
        g.setColor(Color.lightGray);
        g.fillOval(158,185,53,53);

        g.setColor(Color.black);
        g.drawOval(152,190,65,65);
        g.fillOval(152,190,65,65);

        g.setColor(Color.green);
        g.fillOval(160, 192,50,50);


        /*Белое закругление над зеленым*/
        g.setColor(Color.lightGray);
        g.drawOval(158,114,53,53);
        g.setColor(Color.lightGray);
        g.fillOval(158,114,53,53);

        g.setColor(Color.black);
        g.drawOval(152,119,65,65);
        g.fillOval(152,119,65,65);

        g.setColor(Color.yellow);
        g.fillOval(160, 122,50,50);



        /* Белое закругление над красным*/
        g.setColor(Color.lightGray);
        g.drawOval(158,43,53,53);
        g.setColor(Color.lightGray);
        g.fillOval(158,43,53,53);

        g.setColor(Color.black);
        g.drawOval(152,48,65,65);
        g.fillOval(152,48,65,65);

        g.setColor(Color.red);
        g.fillOval(160, 52,50,50);

        /* Элемент сверху */
        g.setColor(Color.black);
        g.drawArc(166, 17, 40,30,0,180);
        g.fillArc(166, 17, 40,30,0,180);

        /* квадратик снизу*/

        g.drawRoundRect(170, 260, 30,50, 10, 10);
        g.setColor(Color.black);
        g.fillRoundRect(170, 260, 30,50, 10, 10);


        /*Треугольники left*/

        g.setColor(Color.black);
        g.fillRoundRect(100,52,40,40,10,10);
        g.setColor(Color.white);
        g.drawArc(55,55,80,80,0,90);
        g.fillArc(55,55,80,80,0,90);

        g.setColor(Color.black);
        g.fillRoundRect(100,120,40,40,10,10);
        g.setColor(Color.white);
        g.fillArc(55,120,80,80,0,90);

        g.setColor(Color.black);
        g.fillRoundRect(100,191,40,40,10,10);
        g.setColor(Color.white);
        g.fillArc(55,191,80,80,0,90);

        /* Треугольники right */

        g.setColor(Color.black);
        g.fillRoundRect(230,52,40,40,10,10);
        g.setColor(Color.white);
        g.drawArc(234,52,80,80,180,-90);
        g.fillArc(234,52,80,80,180,-90);

        g.setColor(Color.black);
        g.fillRoundRect(230,120,40,40,10,10);
        g.setColor(Color.white);
        g.drawArc(234,120,80,80,180,-90);
        g.fillArc(234,120,80,80,180,-90);

        g.setColor(Color.black);
        g.fillRoundRect(230,191,40,40,10,10);
        g.setColor(Color.white);
        g.drawArc(234,191,80,80,180,-90);
        g.fillArc(234,191,80,80,180,-90);



















    }





    public static void main(String[] args) {
        graph m=new graph();
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(400,400);
        f.setResizable(false);
        //f.setLayout(null);
        f.setVisible(true);
    }

}
