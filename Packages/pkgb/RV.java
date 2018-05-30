package pkgb;
import java.lang.*;
import java.util.*;

public class RV extends pkga.Vehicle{

	@Override public void start(){
		System.out.println("休旅車發動中..");
	}

	@Override public void breaks(){
		System.out.println("休旅車煞車中..");
	}
}