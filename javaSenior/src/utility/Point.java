package utility;

public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
	//如果x，y的值相同就是坐标上的同一点
    public boolean equals(Object obj) {
	  if(obj==null){
		  return false;
	  }
	  if(this==obj){
		  return true;
	  }
	  if(!(obj instanceof Point)){
		  return false;
	  }
	  else{
		  Point p = (Point)obj;
		  if(p.x==x&&p.y==y){
			  return true;
		  }
		  else{
			  return false;
		  }
	  }
	}

}
