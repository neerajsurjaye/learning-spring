package com.spec.jdbc.mappers;

public interface Mapper<A, B> {

    B mapTo(A a);
    A mapFrom(B b);

}
