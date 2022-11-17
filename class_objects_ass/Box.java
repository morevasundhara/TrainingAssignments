package class_objects_ass;

public class Box {

	  private int width;
	  private int height;
	  private int depth;
	  
	public Box(int width, int height, int depth) {
	    super();
	    this.width = width;
	    this.height = height;
	    this.depth = depth;
	}
	public int getWidth() {
	    return width;
	}
	public void setWidth(int width) {
	    this.width = width;
	}
	public int getHeight() {
	    return height;
	}
	public void setHeight(int height) {
	    this.height = height;
	}
	public int getDepth() {
	    return depth;
	}
	public void setDepth(int depth) {
	    this.depth = depth;
	}

	public int calVolume()
	{
	    return width*height*depth;
	}

	@Override
	public String toString() {
	    return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}

	public static void main(String[] args) {
	    
	    Box b=new Box(4,6,2);
	    System.out.println("Volume of box :" + b.calVolume());
	}


}
