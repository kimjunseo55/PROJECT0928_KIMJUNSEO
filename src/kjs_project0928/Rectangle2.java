package kjs_project0928;

public class Rectangle2{
	int x,y,width,height;

	public Rectangle2(int x, int y, int w, int h) {
		this.x=x; this.y=y; this.width=w; this.height=h;
	}

	public int square() {

		return width*height;
	}
	public void show() {

		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");

	}

	public boolean contains(Rectangle2 r) {

		if(x<r.x&&y<r.y&&x+width>r.x+r.width&&y+height>r.y+r.height) return true;

		else return false;
	}

	public static void main(String[] args) {
		Rectangle2 r=new Rectangle2(2,2,8,7);
		Rectangle2 s=new Rectangle2(5,5,6,6);
		Rectangle2 t=new Rectangle2(1,1,10,10);

		r.show();

		System.out.println("s의 면적은 "+s.square());

		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");

		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

	}
}

