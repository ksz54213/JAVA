public class Override_extends{
	public static void main(String[] args) {
		CShape c []= new CShape[3];

		c[0] = new CTriangle();
		c[1] = new CRect();
		c[2] = new CPentagone();
		
		for(int i =0 ;i<3;i++){
			c[i].angle();
			System.out.println(c[i].Tostring());
		}

	}
}
abstract class CShape{
	public int number;
	public int totalAngle;
	public abstract void angle();
	public String Tostring(){
		return "正"+number+"邊形的每一角為"+(totalAngle/number)+"度" ;
	}
}
class CTriangle extends CShape{
	
	@Override public void angle(){
		number = 3;
		totalAngle = (number-2)*180;
	}
	
}

class CRect extends CShape{
	
	@Override public void angle(){
		number = 4;
		totalAngle = (number-2)*180;
	}
}
class CPentagone extends CShape{
	
	@Override public void angle(){
		number = 5;
		totalAngle = (number-2)*180;
	}
}