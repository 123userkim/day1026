package com.sist.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	Enermy enermy;
	Missile missile;
	SpaceShip spaceship;
	
	public MyPanel() {
		addKeyListener(this);
		requestFocus();
		setFocusable(true);
		
		enermy = new Enermy("enemy.png");
		spaceship = new SpaceShip("player.png");
		missile = new Missile("misile.png");
		
		class MyThread extends Thread{
			public void run() {
				while(true) {
					enermy.update();
					spaceship.update();
					missile.update();
					repaint();
					try {
						Thread.sleep(50);
					}catch (Exception e) {
						// TODO: handle exception
					}//end catch
				}//end while
			}//end run
		}// end MyThread 
		
		Thread t = new MyThread();
		t.start();
	}
	
	
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		enermy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	}


	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		spaceship.keyPressed(e);
		missile.keyPressed(e, spaceship.x, spaceship.y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
