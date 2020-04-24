package courseWork;

import java.util.ArrayList;
import java.util.Queue;

public class Floor {
	
	//private Building building;
	public ArrayList<Person> peopleOnFloor;
	public ArrayList<Person> waitingQueue;
	public boolean goUp;
	public int floornumber;
	public boolean goDown;
	
	public Floor(int floorno) {
		peopleOnFloor = new ArrayList<Person>();
		waitingQueue = new ArrayList<Person>();
		goUp = false;
		goDown = false;
		floornumber = floorno;
	}

	public void addToQ(Person P){
		waitingQueue.add(P);
	}

	public Person removeFromQ(){
		Person leaving = waitingQueue.get(0);
		waitingQueue.remove(0);
		return leaving;
	}

	public void arrive(Person P){
		peopleOnFloor.add(P);
	}

//	public float leave(p: Person){
//		person.setCurrentFloor();
//		peopleOnFloor.remove(p);
//	}

	
	public int sizeQueue() {
		return waitingQueue.size();
	}

	public int getFloornumber() {
		return floornumber;
	}

	public void setFloornumber(int floornumber) {
		this.floornumber = floornumber;
	}
	
	//individual people know where they are going-> subclasses of person class

}

