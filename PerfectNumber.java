
import java.util.*;

public class PerfectNumber {

	public static Set<Integer> divisors(int n) {
		int atlikums = 0;
		Set<Integer> dalitaji = null;
		for(int i=n/2; i>0; i--){
			atlikums = n%i;
			if(atlikums == 0){
				dalitaji.add(i);
			}
		}
		return dalitaji;
	}
	
	
	public static State process(int n){
		Set<Integer> dalitaji = divisors(n);
		int size = dalitaji.size();
		String[] dal = dalitaji.toArray(new String[size]);
		int summa = 0;
		for(int i=0; i<size; i++){
			summa+=Integer.valueOf(dal[i]);
		}
		if(summa>n){
			return State.ABUNDANT;
 		}else if(summa<n){
 			return State.DEFICIENT;
 		}else{
 			return State.PERFECT;
 		}
	}
	
	public enum State {
		ABUNDANT,
		DEFICIENT,
		PERFECT
	}
	
	
	
}
