import java.util.*;
import java.lang.*;
public class test{
	public static void main(String[]args){

		CFlyMachine [] objArr = new CFlyMachine[10];
		int [] num = new int[3];

		for(int i=0;i<objArr.length;i++){
			num = makeRandom();	

			/*if(i!=0)
				objArr[i].counter = objArr[i-1].counter;*/

			objArr[i]=new CFlyMachine(num[0],num[1],num[2]);
		}

		System.out.println("類行為2的飛行器有 :\t"+CFlyMachine.counter+"\t個");		
		System.out.println("速度\t載重量\t類型\t");

		for(int i=0;i<objArr.length;i++)
			objArr[i].printData();
	}

	public static int[] makeRandom(){
		Random ran = new Random();
		int [] num = new int [3];
		num[0] = ran.nextInt(45001)+5000;
		num[1] = ran.nextInt(30001)+10000;
		num[2] = ran.nextInt(4);
		return num;
	}
}
//----------------------------------------------------------------------------------------------
class CFlyMachine{

	public int speed , carryCapacity;
	public static int counter=0;
	private int machineType;

	private CFlyMachine(){
		speed =0;
		carryCapacity =0;
		machineType=0;
	}
	public CFlyMachine(int a,int b,int c){
		speed=a;
		carryCapacity=b;
		machineType=c;
		if(machineType==2)
			counter++;
	}

	public int showmachineType(){
		return machineType;
	}

	public void printData(){
		
		System.out.println(speed+"\t"+carryCapacity+"\t"+machineType+"\t");
		if(machineType == 2){
			print();
		}
	}

	private void print(){
		System.out.println("****多一架****");
	}
}