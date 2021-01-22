package groovy.compile.error

import groovy.compile.error.java.Class1
import groovy.compile.error.java.Class2
import groovy.compile.error.java.Class3
import groovy.compile.error.java.IDomain
import groovy.compile.error.java.IReturnType
import groovy.compile.error.java.ReturnType

abstract class AbstractTestClass1 {

    //1
    IReturnType myMethod(String name, List<? extends IDomain> domains, List<String> stringList1, List<String> stringList2, Class1 class1, Class2 class2) {
        new ReturnType()
    }

    //2
    IReturnType myMethod(String name, List<? extends IDomain> domains, String str1, String str2) {
        new ReturnType()
    }

    //3
    IReturnType myMethod(String id, int i) {
        new ReturnType()
    }

    //4
    IReturnType myMethod(String name, List<? extends IDomain> domains, List<String> stringList1, List<String> stringList2) {
        new ReturnType()
    }

    //5
    IReturnType myMethod(String name, List<? extends IDomain> domains, String str1, String str2, Class1 class1, Class2 class2, Set<Class3> setClass3) {
        new ReturnType()
    }

    //6
    IReturnType myMethod(String id, int i, Class1 class1) {
        new ReturnType()
    }

    //7 (could also be IDomain[]?)
    IReturnType myMethod(String id, IDomain... domains) {
        new ReturnType()
    }

    //8
    IReturnType myMethod(String name, List<? extends IDomain> domains, List<String> stringList1, List<String> stringList2, Class1 class1) {
        new ReturnType()
    }

    //9
    IReturnType myMethod(String name, List<? extends IDomain> domains, List<String> stringList1, List<String> stringList2, Class1 class1, Class2 class2, Set<Class3> setClass3) {
        new ReturnType()
    }

    //10
    IReturnType myMethod(String name, List<? extends IDomain> domains, String str1, String str2, Class1 class1, Class2 class2) {
        new ReturnType()
    }

    //11
    IReturnType myMethod(String name, List<? extends IDomain> domains, String str1, String str2, Class1 class1, Class2 class2, Set<Class3> setClass3, boolean bool) {
        new ReturnType()
    }

    //12
    IReturnType myMethod(String name, List<? extends IDomain> domains, String str1, String str2, Class1 class1) {
        new ReturnType()
    }

    //13
    IReturnType myMethod(String name, List<? extends IDomain> domains, List<String> stringList1, List<String> stringList2, Class1 class1, Class2 class2, Set<Class3> setClass3, boolean bool) {
        new ReturnType()
    }

    //14 (could also be String[]?)
    IReturnType myMethod(String name, List<? extends IDomain> domains, String... moreStrings) {
        myMethod(name, domains, moreStrings as List, [])
    }

}
