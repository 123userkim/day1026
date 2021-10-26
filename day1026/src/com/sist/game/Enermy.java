package com.sist.game;

public class Enermy extends GraphicObject {
	
	// "적"이 x축으로 움직이는 간격을 위한 변수
	// 맨처음에는 오른쪽 끝에서 왼쪽으로 움직이도록 하기 위하여 음수를 설정합니다.
	int dx = -10;
	
	//생성시에 "적"으로 표현할 그래픽 파일이름을 매개변수로 전달받아 부모클래스의 생성자에게 전달합니다.
	public Enermy(String name) {
		super(name);
		
		//맨처음에 프로그램 실행하였을때에 "적"의 위치를 오른쪽 상단에 위치시키기 위하여 
		//x=500, y=0으로 설정합니다.
		x = 500;
		y = 0;
	}
	
	
	public void update() {
		
		// x좌표를 dx만큼 변경시킵니다.
		x += dx;
		
		//만약 완쪽끝에 도달하면 오른쪽으로 이동시키기 위하여 dx를 양수로 만듭니다.
		if(x < 0) {
			dx = 10;
		}
		
		//만약 오른쪽 끝에 도달하면 다시 왼쪽으로 이동시키기 위하여 dx를 음수로 만듭니다.
		if( x > 500) {
			dx = -10;
		}
		
	}
}