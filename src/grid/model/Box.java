package grid.model;

public class Box 
{
	private int length;
	private int width;
	private int hight;
	
	public Box()
	{
		length = 10;
		width = 10;
		hight = 10;
	}
	
	public String toString()
	{
		return "The size is " + length + "x" + width + "x" + "hight";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

}
