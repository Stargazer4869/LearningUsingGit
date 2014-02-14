package org.dean;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class TestRangeMap {
	public static void main(String[] args) {
		RangeMap<Integer, String> map = TreeRangeMap.create();
		map.put(Range.closed(1, 5), "a");
		map.put(Range.closed(6, 15), "b");
		System.out.println(map.get(10));
	}
}
