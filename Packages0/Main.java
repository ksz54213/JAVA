import java.util.*;
import java.lang.*;
import Test.CmyException;
import Test.CmyException2;
class Main{
	public static void main(String[] args) {
		int end=0,t=0;
		int [] x= new int[]{2,2,0,2};
		int [] y = new int[]{5,0,0,-2};
	//	Scanner scanner =new scanner(System.in);
		while(t<4){
	//		x=scanner.nextInt(); y=scanner.nextInt();
			try{	
				
				if(x[t]==0&&y[t]==0)
					throw new CmyException("0��0����L�w�q,�^�ǭȱN���~");
				else if(y[t]<0)
					throw new CmyException2("���謰�t��,���G�������,�^�ǭȱN���~");
				end=powerXY(x[t],y[t]);
			}
			catch(CmyException e){
				//System.out.println("0�� 0����=-1");
				end=-1;
			}
			catch(CmyException2 e){
				//System.out.println(x+" �� " +y+" ����=-1");	
				end=-1;
			}
			finally{
				System.out.println(x[t]+" �� " +y[t]+" ����= "+end+" ");
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