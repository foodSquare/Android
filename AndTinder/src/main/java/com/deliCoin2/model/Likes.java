/**
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 */

package com.deliCoin2.model;

public class Likes {
	 public enum Like {
	        None(0), Liked(1), Disliked(2);

	        public final int value;

	        private Like(int value) {
	            this.value = value;
	        }

	        public static Like fromValue(int value) {
	            for (Like style : Like.values()) {
	                if (style.value == value) {
	                    return style;
	                }
	            }
	            return null;
	        }
	    }
}
