package com.exam5;

public class Box3 {

	// Box3: 長39.5，寬27.5，高23
	public boolean validate(float length, float width, int height) {

		if (length <= 39.5 && width <= 27.5 && height <= 23) {
			return true;
		}
		return false;

	}
}
