import java.util.*;

public class char_small {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		 char[] cc= s.toCharArray();
		 
		TreeMap< Character,Integer> tree_map = new TreeMap< Character,Integer>(); 
		
		
	
		for(int i=0;i<cc.length; i++) {
			
			// Integer intObj = new Integer(cc[i]);
			
		tree_map.put(cc[i],(int)cc[i]);
			}
		
		 System.out.println(tree_map.firstKey());
		

		
		

	}

}
