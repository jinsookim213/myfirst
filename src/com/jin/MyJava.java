package com.jin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//class Hi implements Runnable{
//	public void run() {
//		for(int i= 1; i<=5; i++) {
//			System.out.println("I say Hi");
//			try {Thread.sleep(1000);} catch(Exception e) {}
//		}
//	}
//	
//}

class Hello implements Runnable{
	public void run() {
		for(int i= 1; i<=5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
	
}

class Counter{
	int  count;
	public synchronized void increment() {
		count++;
	}
}

public class MyJava  {
	public static void main(String args[]) throws InterruptedException  {
		
		
//		
//		int n = 0;
//		System.out.println("Enter Number: ");
//		Scanner s = new Scanner(System.in);
//		n = s.nextInt();
//		
//		System.out.println(n);
//		s.close();
//		int i = 6, j = 3;
//		
//		try {
//			int k = i/j;
//			if(j == 3) {
//				throw new KimException("this is worng");
//			}
//			
//		}catch(KimException e){
//			
//			System.out.println("Error " + e.getMessage());
//			
//		}finally {
//			System.out.println("Is it working...");
//		}
//		int n = 0;
//		System.out.println("Enter a number: ");
//		//BufferedReader br = null;
//		
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))				
//		{
//			n = Integer.parseInt(br.readLine());
//			System.out.println(n);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		int a[] = new int[4];
		
//		int a[] = {1,2,3,4};
//		
//		
//		
//		try{
//			a[5] = 9;
//			int i = 9/a.length;
//		}
//		catch(ArithmeticException  e) {
//			System.err.println("divided 0");
//			
//		}
//		catch( ArrayIndexOutOfBoundsException e){
//			System.err.println("Array out bound");
//		}
//		finally {
//			System.out.println("By2e");
//		}
		
//		Counter c = new Counter();
//		
//		Thread t1 = new Thread(new Runnable() {
//			public void run() {
//				for(int i= 1; i<=1000; i++) {
//					c.increment();
//				}
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//			public void run() {
//				for(int i= 1; i<=1000; i++) {
//					c.increment();
//				}
//			}
//		});
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		System.out.println(c.count);
//		Runnable obj1 =() -> {
//				for(int i= 1; i<=5; i++) {
//					System.out.println("I say Hi");
//					try {Thread.sleep(1000);} catch(Exception e) {}
//				}
//			
//		};
//		
//		Runnable obj2 = new Runnable() {
//			public void run() {
//				for(int i= 1; i<=10; i++) {
//					System.out.println("Hello");
//					try {Thread.sleep(1000);} catch(Exception e) {}
//				}
//			}
//		};
//		
//		Thread t1 = new Thread(() -> {
//			for(int i= 1; i<=5; i++) {
//				System.out.println("I say Hi");
//				try {Thread.sleep(1000);} catch(Exception e) {}
//			}
//		
//	});
//		Thread t2 = new Thread(obj2);
//		
//		t1.start();
//		try {Thread.sleep(200);} catch(Exception e) {}
//		t2.start();
//		System.out.println(t1.isAlive());
//		t1.join();
//		t2.join();
//		System.out.println(t1.isAlive());
//		System.out.println("Main end");
		
//		List<Stud>  studs = new ArrayList<>();
//		
//		studs.add(new Stud(23, "kim", 34));
//		studs.add(new Stud(24, "jin", 12));
//		studs.add(new Stud(25, "soo", 55));
//		studs.add(new Stud(26, "park", 76));
//		studs.add(new Stud(27, "jung", 22));
//		
//		Collections.sort(studs);
//		
//		for(Stud s: studs) {
//			System.out.println(s);
//		}
		
//		 ArrayList<Date> dates = new ArrayList<Date>();
//		  dates.add(new Date(4, 13, 1732)); //Jefferson
//		  dates.add(new Date(4, 12, 1732)); //Washington
//		  dates.add(new Date(3, 16, 1751)); //Madison
//		  dates.add(new Date(10, 30, 1735)); //Adams
//		  dates.add(new Date(4, 28, 1758)); //Monroe     
//
//
//		  System.out.println(dates);
//		  Collections.sort(dates);
//		  System.out.println("birthdays = "+dates);

//		ArrayList values = new ArrayList();
//		Random rn = new Random();
//				
//		for(int i= 0; i < 10; i++) {
//			
//			values.add(rn.nextInt(100));
//		}
//		
//		for(int i= 0; i < values.size(); i++) {
//			System.out.print(" " + values.get(i));
//		}
//		
//		System.out.println(values);
//		Iterator it = values.iterator();
//		System.out.println(it.next());
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		Collections.sort(values);
//		System.out.println(values);
//		
//		for (int i:values)
//			System.out.println(i);
		
//		Set<Integer> set = new HashSet<>();
//	
//		set.add(5);
//		set.add(3);
//		set.add(7);
//		set.add(7);
//		set.add(2);
//		
//		System.out.println(set.add(1));
//		
//		System.out.println(set);
		
//		Map<String, String>  map = new TreeMap<> ();
//		map.put("byName", "AIn");
//		map.put("actour", "Boo");
//		map.put("ceo", "Cim");
//		
//		
//		System.out.print(map);
//		System.out.println(map.get("myName"));
//		
//		Set<String> keys = map.keySet();
//		
//		for(String key: keys) {
//			System.out.println(key +   "  " + map.get(key));
//		}	
		//System.out.println("Hello World");
		
//		A obj = new B();
//		obj.show();
		

         for(int i= 1; i <=3; i++) {
        	 System.out.print("A");
        	 for(int j=1; j <= i; j++) {
        	 
        	 if (j > 1 && j < 3)
        		 System.out.print("B");
        	 
        	 if (j > 2)
        		 System.out.print("C");
        	 }
        	 System.out.println();
         }
	}

}
