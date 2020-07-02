package thanh;
import thanh.Board.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tetris extends JFrame {

    private JLabel statusbar;
    
    private JButton button  ;
    private JButton button1 ;
    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel("Diem hien tai cua ban : 0");
        add(statusbar, BorderLayout.SOUTH);
        JPanel buttonarea = new JPanel(new GridLayout(0, 2, 2, 2)); 
        add(buttonarea, BorderLayout.NORTH);
        button = new JButton("pause");
        buttonarea.add(button);
        button1 = new JButton("New Game");
        buttonarea.add(button1);
        
//        button = new JButton("pause");
//        add(button, BorderLayout.NORTH);
//        
//        button1 = new JButton("New Game");
//        add(button1, BorderLayout.NORTH);
//        
        var board = new Board(this);
        add(board);
       
        board.start();
        
        
            
		button.addActionListener(Board.pauseResume);
	 	button1.addActionListener(Board.newGame);
		

        setTitle("DoVanThanh-20173378-Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {

        
            var game = new Tetris();
            game.setVisible(true);
    }

	public JButton getButton() {
		return button;
	}

	public JButton getButton1() {
		return button1;
	}
	
}