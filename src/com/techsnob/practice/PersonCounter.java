package com.techsnob.practice;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xml.internal.dtm.ref.IncrementalSAXSource;

class Person {
    private String name;
    private int sal;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int hashCode() { return name.hashCode(); }
}

public class PersonCounter {
	
	Map<Person, Integer> personToCounter = new HashMap<>();
	
	public void updatePersonCounter(Person p) {
	    Integer c = personToCounter.get(p);
	    if (c == null) c = 0;
	    c = c + 1;
	    personToCounter.put(p, c);
	}
	
	public static void main(String[] args) {
//		PersonCounter pc = new PersonCounter();
//		Person p = new Person();
//		p.setName("nari");
//		Person p1 = new Person();
//		p1.setName("nari");
//		pc.updatePersonCounter(p);
//		pc.updatePersonCounter(p1);
//		System.out.println(pc.personToCounter.size());
		System.out.println(first(5,3));
	}
	
	private static int first(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return second(b, a-b);
		}
	}

	private static int second(int a, int b) {
		if(a==0) {
			return b;
		} else {
			return first(b, a);
		}
	}

}


class TaskBase {
        int getStatusCode(Object obj) throws NullPointerException {
                if (obj != null ) {
                    return 1;
                } else {
                    return 0;
                }
        }
}

class ParallelTask extends TaskBase {

	@Override
	int getStatusCode(Object obj)  {
		return super.getStatusCode(obj);
	}


}
