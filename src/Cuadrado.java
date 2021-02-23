import processing.core.PApplet;

public class Cuadrado {

	private int posX, posY, tamX, tamY;
	private boolean isMov;
	
	private boolean directY;
	
	private PApplet app;

	public Cuadrado(int posX, int posY, int tamX, int tamY,PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		isMov = true;
		directY = true;
		this.app = app;
	}
	
	public void drawRect(){
		
		app.rect(posX,posY,tamX,tamY);
		mov();
		
	}

	private void mov() {
		
		if (isMov && directY) {
			posY += 2;
			
		}else if (!directY && isMov) {
			
			posY -=2;
			
		}
	}

	public void setDirect(boolean limit) {
		
		directY = limit;
		
	}
	
	public boolean isDirect () { //baja
		
		return directY;
		
	}
	
	public void setMov(boolean isMov) {
		
		this.isMov = isMov;
		
	}
	
	public boolean isMov() {
		
		return isMov;
		
	}

	public int getPosX() {
		
		return posX;
		
	}

	public int getPosY() {
		
		return posY;
		
	}

	public int getTamX() {
		
		return tamX;
		
	}

	public int getTamY() {
		
		return tamY;
		
	}


}
