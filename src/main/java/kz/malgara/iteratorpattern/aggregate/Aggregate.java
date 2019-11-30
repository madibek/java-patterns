package kz.malgara.iteratorpattern.aggregate;

import kz.malgara.iteratorpattern.iterator.Iterator;

public interface Aggregate {

    Iterator createIterator();
}
