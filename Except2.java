import java.util.*;
import java.lang.*;
import java.io.*;
class Except2{
    public static void main(String[] args) {
        String x,y;
        int X=0,Y=0,end=0;
        Scanner scanner =new Scanner(System.in);
        while(true){            
            try{
                x=scanner.next();
                y=scanner.next();

                if(isInt(x)&&isInt(y)){

                    X=Integer.parseInt(x);
                    Y=Integer.parseInt(y);

                    if(X==0&&Y==0)
                        throw new CmyException("0的0次方無定義,回傳值將錯誤");
                    else if(Y<0)
                        throw new CmyException("次方為負值,結果不為整數,回傳值將錯誤");
                    else
                        end=powerXY(X,Y);   
                }
                else if(isInt(y) && !isInt(x)){
                    throw new CmyException2("x 輸入整數 ! ");//x不是整數
                }
                else if(!isInt(y) && isInt(x)){
                    throw new CmyException2("y 輸入整數 ! ");//y不是整數
                }
                else{
                    throw new CmyException2("輸入整數 ! "); //x,y不是整數
                }
            }
            catch(CmyException e){//指數問題
                end = -1;
            }
            catch(CmyException2 e){ // 是否數字
                end=0;
            }
            finally{
                    if(end==0)
                        continue;
                    else{
                        System.out.println(X+"的"+Y+"次方為 :"+end);
                        break;  
                    }               
            }
        }
    }

    public static boolean isInt(String msg){
        try{
            int a=Integer.parseInt(msg);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public static int powerXY(int x,int y){
        int end=1;
        for (int i=0;i<y ; i++) {
            end*=x;
        }
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
