package ecszoo;

import java.util.*;

public class Zoo {
	
	private List<Enclosure> enclosures;
	private List<ZooKeeper> zooKeepers;
	
	public Zoo(){
		enclosures = new ArrayList<>();
		zooKeepers = new ArrayList<>();
	}
	
	public void aMonthPasses(){
		if (enclosures.isEmpty()){
			System.err.println("No enclosure exsits.");
			return;
		}
		if (zooKeepers.isEmpty()){
			System.err.println("No zookeeper exsits.");
			return;
		}
		for (Enclosure enclosure : enclosures){
			enclosure.aMonthPasses();
		}
		for (ZooKeeper zooKeeper : zooKeepers){
			zooKeeper.aMonthPasses();
		}
		restock();
	}
	
	public void restock(){
		
	}
}
