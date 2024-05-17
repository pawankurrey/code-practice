package com.abc.java.practice;

import java.io.Serializable;

@FunctionalInterface
public interface FucntionalInterface extends Serializable/**extends ParentInterface**/ {//gives you error
	public void doSomething();

}
