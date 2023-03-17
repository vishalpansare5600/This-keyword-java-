
public class Box 
{
	int heigth;
	int depth;
	int length;
	Box(int height,int depth,int length)
	{
		this.heigth=height;
		this.depth=depth;
		this.length=length;
	}
		public static void main(String[] args) 
	{
			Box b=new Box(10,20,50);
			System.out.println("value of depth="+b.depth);
			System.out.println("value of height="+b.heigth);
			System.out.println("value of length="+b.length);
 	}

}
