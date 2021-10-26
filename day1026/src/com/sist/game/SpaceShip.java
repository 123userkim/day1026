package com.sist.game;
import java.awt.event.KeyEvent;

//�츮��(���ּ�)�� ���� Ŭ����
public class SpaceShip extends GraphicObject {
	//�����ÿ� �̹������ϸ��� �Ű������� ���޹޾�, �θ��� �����ڿ��� ������
	public SpaceShip(String name) {
		super(name);
		
		//��ó�� ���ּ��� ��ġ xy�� ������
		x=150;
		y=350;
	}
	//���ּ��� ������ ����Ű�� ���� ���ּ��� ��ġ�� �̵���Ŵ
	//�Ű������� ���޹��� KeyEvent event�� ���ؼ� � Ű�� ���ȴ��� �� �� ����
	public void KeyPressed(KeyEvent event) {  
		//���� ����Ű�� ������
		if(event.getKeyCode()== KeyEvent.VK_LEFT ) {
			//x��ǥ�� �������� �̵���Ű�� ���� -10
			x -= 10;
		}//������ ����Ű
		if(event.getKeyCode()== KeyEvent.VK_RIGHT ) {
			//x��ǥ�� ���������� �̵���Ű�� ���� +10
			x += 10;
		}
		if(event.getKeyCode()== KeyEvent.VK_UP ) {
			//y��ǥ�� �������� �̵���Ű�� ���� -10
			y -= 10;
		}
		if(event.getKeyCode()== KeyEvent.VK_DOWN ) {
			//y��ǥ�� �Ʒ��������� �̵���Ű�� ���� +10
			y += 10;
		}
	}
}
