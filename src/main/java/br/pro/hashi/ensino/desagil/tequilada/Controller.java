package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update();
		view.repaint();
	}
//testeed
	@Override
	public void keyPressed(KeyEvent event) {
	    if(event.getKeyCode() == KeyEvent.VK_SPACE) {
	        System.out.println("pressionei espa�o!");
	    }
	    
	    if(event.getKeyCode() == KeyEvent.VK_A) {
	        //cima;
	    	model.getHumanPlayer().move(0, -1);
	    }
	    
	    if(event.getKeyCode() == KeyEvent.VK_D) {
	        //baixo
	    	model.getHumanPlayer().move(0, 1);
	    }
	    
	    if(event.getKeyCode() == KeyEvent.VK_W) {
	        //esquerda
	    	model.getHumanPlayer().move(-1, 0);
	    }
	    if(event.getKeyCode() == KeyEvent.VK_S) {
	        //direita
	    	model.getHumanPlayer().move(1, 0);
	    }
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
