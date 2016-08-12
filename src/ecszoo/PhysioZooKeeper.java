package ecszoo;

public class PhysioZooKeeper extends ZooKeeper{

	public PhysioZooKeeper(Zoo zoo, Enclosure enclosure) {
		super(zoo, enclosure);
		treatList.add(Treat.neck_Massage);
		treatList.add(Treat.bath);
	}
}
