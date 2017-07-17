package labs.lab9.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
	
	public Set<String> union(List<Set<String>> sets){
		
		return
				sets.stream().sequential()
				.reduce(sets.get(0), (x, y)-> {
						x.addAll(y);
						return x;
					});
		
	}
	
	public static void main(String[] args) {
		
		Set<String> set1 =  new HashSet<String>(Arrays.asList("A", "B")); 
		Set<String> set2 =  new HashSet<String>(Arrays.asList("D")); 
		Set<String> set3 =  new HashSet<String>(Arrays.asList("1", "2", "3")); 
		
		List<Set<String>> setsColl = new ArrayList<>();
		setsColl.add(set1);
		setsColl.add(set2);
		setsColl.add(set3);
		
		Union un = new Union();
		Set<String> setsUnion = un.union(setsColl);
		//setsUnion
		
		System.out.println(setsUnion);
		
		
	}

}
