package modling1;

public class Rectangle {
	private int width;
	private int length;
	private String color;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLegth() {
		return length;
	}
	
	public void setLegth(int length) {
		this.length = length;
	}
	
	public int area(){
		return width * length;
	}
	
	public int perimiter() {
		return (width + length)*2;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	
	}
	


