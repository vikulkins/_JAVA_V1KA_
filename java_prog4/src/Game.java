import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Game extends JFrame{
    int MilanRes = 0;
    int MadridRes = 0;
    Font font = new Font("Times new roman",Font.ROMAN_BASELINE,40);
    Color color = new Color(0x0F3DF3);
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    JLabel labelRes = new JLabel("Result: " + MilanRes + " X " + MadridRes);
    JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
    JLabel labelWinner = new JLabel("Winner: DRAW");
    public Game() {
        setLayout(null); //для работы с абсолютным позиционированием, возможности задания расположения объектов по пикселям
        setSize(1000,500);
        setResizable(false); //чтоб окно не могло менять размер

        madridButton.setBounds(600,150,300,100);
        madridButton.setBackground(color);
        madridButton.setFont(font);
        add(madridButton);

        milanButton.setBounds(100,150, 300,100);
        milanButton.setFont(font);
        color = new Color(0xFF3DF3);
        milanButton.setBackground(color);
        add(milanButton);

        labelWinner.setBounds(350,10,400,50);
        labelWinner.setFont(font);
        add(labelWinner);

        labelRes.setBounds(380,60,400,50);
        labelRes.setFont(font);
        add(labelRes);

        labelLastScorer.setBounds(340,300,500,50);
        labelLastScorer.setFont(font);
        add(labelLastScorer);

        //ниже описываются все состояния мыши потому что так надо
        madridButton.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){
                if (MadridRes<=9 && MilanRes<=9) {
                    MadridRes++;
                    labelRes.setText("Result: " + MilanRes + " X " + MadridRes);
                    labelLastScorer.setText("Last Scorer: Real Madrid");
                    if(MilanRes>MadridRes) labelWinner.setText("Winner: AC Milan");
                    else if(MilanRes<MadridRes) labelWinner.setText("Winner: Real Madrid");
                    else labelWinner.setText("Winner: DRAW");
                }
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        milanButton.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){
                if (MadridRes<=9 && MilanRes<=9) {
                    MilanRes++;
                    labelRes.setText("Result: " + MilanRes + " X " + MadridRes);
                    labelLastScorer.setText("Last Scorer: AC Milan");
                    if(MilanRes>MadridRes) labelWinner.setText("Winner: AC Milan");
                    else if(MilanRes<MadridRes) labelWinner.setText("Winner: Real Madrid");
                    else labelWinner.setText("Winner: DRAW");
                }
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        setVisible(true);// метод с параметром тру чтобы созданное окно стало видимым тк по умолчанию оно невидимое
    }
    public static void main(String[]args){
        new Game().setVisible(true);
    }
}