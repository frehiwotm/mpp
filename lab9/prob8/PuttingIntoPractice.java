package labs.lab9.prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("\n##### Transactions from 2011 sorted by value #####\n");
		transactions.stream()
					.filter(tran -> tran.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println("\n##### The unique cities where the traders work #####\n");			
		Stream.of(raoul, mario, alan, brian)
								.map(e -> e.getCity()).distinct()
								.forEach(System.out::println);
        

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("\n##### Traders from Cambridge and sorted by name #####\n");	
		Stream.of(raoul, mario, alan, brian)
										.filter(t -> t.getCity().equals("Cambridge"))
										.sorted(Comparator.comparing(Trader::getName))
										.forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("\n##### Traders names sorted alphabetically #####\n");	
		Stream.of(raoul, mario, alan, brian)
										.map(t -> t.getName())
										.sorted()
										.forEach(System.out::println);
        

        // Query 5: Are there any trader based in Milan?
		
		System.out.println("\n##### Trader based in Milan #####\n");	
		Optional<Trader> traderInMilan = Stream.of(raoul, mario, alan, brian)
										.filter(t -> t.getCity().equals("Milan")).findAny();
		System.out.println(String.format("Is there any trader based in Milan? %s", traderInMilan.orElse(null).getName()));
		
		// Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        
		//Optional<Transaction> tranMilan = 
		
		//Stream<Transaction> tranMilan = 
		System.out.println("\n##### Trader based in Milan set to Cambridge #####\n");	
				transactions.stream()
							.filter(tran -> tran.getTrader().getCity().equals("Milan"))
							.forEach(tran -> tran.getTrader().setCity("Cambridge"));
				
		System.out.println(mario);		
					
        // Query 7: What's the highest value in all the transactions?
		
		System.out.println("\n##### Highest value #####\n");	
		IntSummaryStatistics tranValueSummary = transactions.stream().collect(Collectors.summarizingInt(Transaction::getValue));
		
		System.out.println("The highest value in all the transactions is: " + tranValueSummary.getMax());
    }
}
