package com.exam5;

public class Box5 {

	// Box5: 長23，寬14，高13
	public boolean validate(float length, float width, int height) {
		if (length <= 23 && width <= 14 && height <= 13) {
			return true;
		}
		return false;

	}
}
