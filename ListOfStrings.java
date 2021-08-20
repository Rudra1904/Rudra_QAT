package Test;
import java.util.*;
public class ListOfStrings {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			arrList.add(sc.next());
		}
		System.out.println("Reversed String : ");
		for(int j=arrList.size()-1;j>=0;j--) {
			System.out.println(arrList.get(j));
		}

		
	}

}
