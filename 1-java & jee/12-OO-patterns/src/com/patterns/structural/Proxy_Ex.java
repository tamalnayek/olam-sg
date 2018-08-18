package com.patterns.structural;

class Logger {
	public void doLog() {
		System.out.println("log : ..");
	}
}

class Security {
	public void doSec() {
		System.out.println("security check..");
	}
}

class TrainingRoom {
	public void doTraining() {
		System.out.println("tng....");
	}
}

class OlamProxy {

	Security security = new Security();
	Logger logger = new Logger();
	TrainingRoom trainingRoom = new TrainingRoom();

	public void doTraining() {
		security.doSec();
		logger.doLog();
		trainingRoom.doTraining();
		logger.doLog();
	}
}

class Proxy_Ex {

	public static void main(String[] args) {

		OlamProxy olamProxy = new OlamProxy();
		olamProxy.doTraining();

	}

}
