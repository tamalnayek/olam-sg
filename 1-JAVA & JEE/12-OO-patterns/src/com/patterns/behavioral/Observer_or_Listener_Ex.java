package com.patterns.behavioral;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// main module

class DoorEvent {
	private int num;
	private int floor;

	public DoorEvent(int num, int floor) {
		super();
		this.num = num;
		this.floor = floor;
	}

	public int getNum() {
		return num;
	}

	public int getFloor() {
		return floor;
	}

}

interface DoorListener {
	void start(DoorEvent event);

	void stop(DoorEvent event);
}

class Door {

	private List<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener listener) {
		this.doorListeners.add(listener);
	}

	public void removeListener(DoorListener listener) {
		this.doorListeners.remove(listener);
	}

	public void open() {
		System.out.println("door opened...");
		DoorEvent doorEvent = new DoorEvent(7, 20);
		for (int i = 0; i < doorListeners.size(); i++) {
			DoorListener doorListener = doorListeners.get(i);
			doorListener.start(doorEvent);
		}
	}

	public void close() {
		System.out.println("door closed...");
		DoorEvent doorEvent = new DoorEvent(7, 20);
		for (int i = 0; i < doorListeners.size(); i++) {
			DoorListener doorListener = doorListeners.get(i);
			doorListener.stop(doorEvent);
		}
	}
}

class Light implements DoorListener {
	@Override
	public void start(DoorEvent event) {
		System.out.println("Light ON - " + event.getFloor() + " : " + event.getNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("Light OFF - " + event.getFloor() + " : " + event.getNum());
	}
}

class AC implements DoorListener {
	@Override
	public void start(DoorEvent event) {
		System.out.println("AC ON - " + event.getFloor() + " : " + event.getNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("AC OFF - " + event.getFloor() + " : " + event.getNum());
	}
}

class TV implements DoorListener {
	@Override
	public void start(DoorEvent event) {
		System.out.println("TV ON - " + event.getFloor() + " : " + event.getNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("TV OFF - " + event.getFloor() + " : " + event.getNum());
	}
}

public class Observer_or_Listener_Ex {

	public static void main(String[] args) throws InterruptedException {
      
		Door door = new Door(); // Event Emitter

		Light light = new Light();  // Event Listener
		AC ac = new AC();
		TV tv = new TV();

		door.addDoorListener(light);
		door.addDoorListener(ac);
		door.addDoorListener(tv);

		TimeUnit.SECONDS.sleep(2);
		door.open();
		TimeUnit.SECONDS.sleep(2);
		door.close();

		door.removeListener(tv);

		TimeUnit.SECONDS.sleep(2);
		door.open();
		TimeUnit.SECONDS.sleep(2);
		door.close();

	}

}
