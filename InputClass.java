package com;

import java.util.ArrayList;
import java.util.Collections;

public class InputClass {
public static void main(String args[])
{ //loading of HDTV objects with data 
	HDTV h1=new HDTV("ONIDA",42);
	HDTV h2=new HDTV("SONY",45);
	HDTV h3=new HDTV("SAMSUNG",32);
	ArrayList<HDTV> tvList=new ArrayList();
	//adding to arrayList
	tvList.add(h1);
	tvList.add(h2);
	tvList.add(h3);
	//soring using comparator
	Collections.sort(tvList,new SizeComp());
	System.out.println("after sorting");
	System.out.println("brand-->size");
	for(HDTV h:tvList)
	{
		System.out.println(h.getBrand()+"--"+h.getSize());
	}
}
}
