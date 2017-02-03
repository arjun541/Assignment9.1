package com;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SizeComp implements Comparator<HDTV> {

	@Override
	public int compare(HDTV arg0, HDTV arg1) {
		// TODO Auto-generated method stub
		if(arg0.getSize()<arg1.getSize())
		{
			return 1;
		}
		
		return -1;
	}

	

	

}
