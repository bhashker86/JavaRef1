import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Stream {

	public static void main(String[] args) {

      List numList=new ArrayList<Integer>();
      numList.add(12);
      numList.add(13);
      numList.add(2);
      numList.add(10);
      numList.add(24);
      numList.add(45);
      numList.add(34);
      numList.add(22);
      numList.add(21);
      System.out.print("Second highest number"+ getEpmWithMxSalary(numList));

	}

	
	public static  Integer getEpmWithMxSalary(List numList) {

 Optional<Integer> opnumber=numList.stream()
		 					 .sorted(Comparator.comparing(null)
		 					 .reversed().skip(1).findFirst();
		
	}
}
