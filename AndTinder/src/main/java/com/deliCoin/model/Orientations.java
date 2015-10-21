/**
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 */

package com.deliCoin.model;

public class Orientations {
	 public enum Orientation {
	        Ordered, Disordered;

	        public static Orientation fromIndex(int index) {
		        Orientation[] values = Orientation.values();
		        if(index < 0 || index >= values.length) {
			        throw new IndexOutOfBoundsException();
		        }
		        return values[index];
	        }
	    }
}
