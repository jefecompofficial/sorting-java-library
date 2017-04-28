package org.jefecomp.sorting;

public interface Sorting {
	
	
	void setParameter(String name, Object value);
	
	
	Object getParameter(String name);
	
	
	void sort(Object ... array);

}
