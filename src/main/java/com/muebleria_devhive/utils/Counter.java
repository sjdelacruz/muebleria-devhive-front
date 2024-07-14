package com.muebleria_devhive.utils;

public class Counter {

	private int count;

	public Counter() {
		this.count = 0;
	}

	public Counter(int init) {
		this.count = init;
	}
	
	public void clear()
    {
        count = 0;
    }
	
	public int get()
    {
        return count;
    }
	
	public int incrementAndGet()
    {
        return ++count;
    }
	
	public String toString()
    {
        return ""+count;
    }

}
