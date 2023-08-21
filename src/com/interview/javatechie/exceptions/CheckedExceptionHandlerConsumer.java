package com.interview.javatechie.exceptions;

public interface CheckedExceptionHandlerConsumer <Target, ExObj extends Exception>{
 public void accept(Target target) throws ExObj;
}
