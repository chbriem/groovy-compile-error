package groovy.compile.error


import groovy.compile.error.java.Domain

class TestClass extends AbstractTestClass1 {

    def testMethod() {
        def aux = myMethod("aux", [Domain.instance], "f", "f")
    }
}
