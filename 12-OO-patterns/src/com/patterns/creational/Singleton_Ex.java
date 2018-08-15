package com.patterns.creational;

class Logger {
	private static Logger logger = null;

	private Logger() {
	}

	public synchronized static Logger getLogger() {
		if (logger == null)
			logger = new Logger();
		return logger;
	}

	public void info(String message) {
		// ..
	}

	public void error(String message) {
		// ..
	}

	public void warn(String message) {
		// ..
	}

	public void fatal(String message) {
		// ..
	}

}

public class Singleton_Ex {

	public static void main(String[] args) {

		// module-1
		// ---------------------------------------------
		Logger logger1 = Logger.getLogger();
		logger1.info("im started..");
		// ---------------------------------------------

		// module-2
		// ---------------------------------------------
		Logger logger2 = Logger.getLogger();
		logger2.warn("something going wrong");
		// ---------------------------------------------

		// module-3
		// ---------------------------------------------
		Logger logger3 = Logger.getLogger();
		logger3.error("something went wrong");
		// ---------------------------------------------
	}

}
