import java.util.*;
import java.lang.*;
import java.io.*;
class test2{
	public static void main(String[] args) {
		int end=0,t=0,x1,y1;
		String x,y;
		Scanner scanner =new Scanner(System.in);
		while(true){
			
			try{
				System.out.print("�п�J x :");
				x=scanner.nextLine(); 
				if(!isNumeric(x)){
					throw new CmyException2("x�п�J���");
				}else{
					 x1 = Integer.parseInt(x); 
				}
				
				System.out.print("�п�J y :");
				y=scanner.nextLine();	
				if(!isNumeric(y)){
					throw new CmyException1("y�п�J���");
				}else{
					y1=Interger.parseInt(y);
				}
				
				if(x1==0&&y1==0)
					throw new CmyException3("0��0����L�w�q,�^�ǭȱN���~");
				else if(y1<0)
					throw new CmyException4("���謰�t��,���G�������,�^�ǭȱN���~");
				
				end = powerXY(x1,y1);
				
			}
			catch(CmyException1 | CmyException2 e){
				continue;
			}
			catch(CmyException3 | CmyException4 e2){
				end = -1;
			}
			finally{
				System.out.println(x1+" �� " +y1+" ����= "+end+" ");
				break;
			}
			
		}
			
				
}
	public static int powerXY(int x,int y){
		int end=1;
		for(int i=1;i<=y;i++)
			end*=x;
		return end;
	}

	public static boolean isNumeric(String str){  //
 	  	for (int i = str.length();--i>=0;){  
    		  if (!Character.isDigit(str.charAt(i))){
    		              return false;
    		  }
   		}	
	   return true;
	}
}
class CmyException extends Exception{
	public CmyException(String msg){
		super();
		System.out.println(msg);
	}
}
class CmyException2 extends Exception{
	public CmyException2(String msg){
		super();
		System.out.println(msg);
	}
}
class CmyException3 extends Exception{
	public CmyException3(String msg){
		super();
		System.out.println(msg);
	}
}
class CmyException4 extends Exception{
	public CmyException4(String msg){
		super();
		System.out.println(msg);
	}
}