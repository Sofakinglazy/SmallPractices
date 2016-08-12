package ecszoo;

public class PlayZooKeeper extends ZooKeeper{

	public PlayZooKeeper(Zoo zoo, Enclosure enclosure) {
		super(zoo, enclosure);
		treatList.add(Treat.watch_a_film);
		treatList.add(Treat.play_chase);
		treatList.add(Treat.painting);
	}


}
