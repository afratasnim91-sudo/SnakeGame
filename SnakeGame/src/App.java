import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth=600;
        int boardHeight=boardWidth;

        JFrame frame=new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         snakegame sg=new snakegame(boardWidth, boardHeight);
         frame.add(sg);
         frame.pack();
         sg.requestFocus();
    }
}