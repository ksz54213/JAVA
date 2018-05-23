import java.util.*;
import java.lang.*;
class Except1{
	public static void main(String[] args) {
		int end=0,t=0;
		int [] x= new int[]{2,2,0,2};
		int [] y = new int[]{5,0,0,-5};
	//	Scanner scanner =new scanner(System.in);
		while(t<4){
	//		x=scanner.nextInt(); y=scanner.nextInt();
			try{	
				
				if(x[t]==0&&y[t]==0)
					throw new CmyException("0的0次方無定義,回傳值將錯誤");
				else if(y[t]<0)
					throw new CmyException2("次方為負值,結果不為整數,回傳值將錯誤");
				end=powerXY(x[t],y[t]);
			}
			catch(CmyException e){
				//System.out.println("0的 0次方=-1");
				end=-1;
			}
			catch(CmyException2 e){
				//System.out.println(x+" 的 " +y+" 次方=-1");	
				end=-1;
			}
			finally{
				System.out.println(x[t]+" 的 " +y[t]+" 次方= "+end+" ");
			}	
			t++;
		}
			
				
}
	public static int powerXY(int x,int y){
		int end=1;
		for(int i=1;i<=y;i++)
			end*=x;
		return end;
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
