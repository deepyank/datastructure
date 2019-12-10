package com.ex.lineardsinterface;

public interface Mapper<A, R> {
	R call(A x);
}
