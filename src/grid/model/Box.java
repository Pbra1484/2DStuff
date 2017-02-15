package grid.model;

public class Box 
{
	private int length;
	private int width;
	private int hight;
	private String info;
	


	public Box()
	{
		length = 10;
		width = 10;
		hight = 10;
		info = "Empty";
	}
	
	public String toString()
	{
		return "Box has" + info;
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
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
