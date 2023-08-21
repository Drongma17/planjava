package com.thonglam.designpattern.singletonpattern;

// Static initializer based Java implementation of
// singleton design pattern
class Singleton1
{
	private static Singleton1 obj = new Singleton1();

	private Singleton1() {}

	public static Singleton1 getInstance()
	{
		return obj;
	}
}
