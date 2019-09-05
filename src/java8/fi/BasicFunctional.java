package java8.fi;

import java.util.Iterator;

@FunctionalInterface
public interface BasicFunctional<T> {

    boolean equals(Object obj);
    int compare(T o1,T o2);
}

interface X<T>{
//    Iterator m(Iterator<String> arg,Class<?> c);
    void m(T arg);
}

interface Y<T>{
//    Iterator<String> m(Iterator<String> arg,Class<?> c);
//    long m();
      void m(T arg);
}

@FunctionalInterface
interface Z extends X,Y{

}
//
//interface foo<T>{
//    void m(T arg);
//}
//interface bar<T>{
//    void m(T arg);
//}
//
//@FunctionalInterface
//interface A<M,N> extends foo<M>,bar<N>{
//
//}
