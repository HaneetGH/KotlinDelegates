package com.technorapper.concepts

class TestInLineClasses {

    @JvmInline
    value class TestInline(val age: Int) {

        init {
            require(age > 18)
        }
    }
}