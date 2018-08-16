package com.arith;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

// file,database,socket,etc....
class Resource implements Closeable {

	public void init() {
		System.out.println("init().");
	}

	public void use() {
		System.out.println("using....");
		int v = 100;
		if (v < 200)
			throw new RuntimeException("somthing wrong");
		System.out.println("used....");
	}

	public void close() {
		System.out.println("close()..");
	}

}

public class Try_Finally_Ex {

	public static void main(String[] args) {

		// Resource resource = null;
		
		try (Resource resource = new Resource();
			 FileInputStream fis=new FileInputStream("")) {
			
			// resource = new Resource();

			resource.init();
			resource.use();

			// resource.close();

		} catch (RuntimeException | IOException e) {
			// resource.close();
			System.out.println("Ex-" + e.getMessage());
		}
//		finally {
//			resource.close();
//		}

	}

}
