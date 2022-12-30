package com.technorapper.kotlindelegates

interface MyInterface {
    fun bar()
    fun foo() = "foo"
}

class MyInterfaceWrapper(val myInterface: MyInterface) : MyInterface by myInterface

fun inlineWithDeligate() {
    val my = MyInterfaceWrapper(object : MyInterface {
        override fun bar() {
            // body
        }
    })
    println(my.foo()) // prints "foo"
}