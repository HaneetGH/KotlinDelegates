package com.technorapper.concepts

typealias UserName = String

fun typeAliasTest() {

}

data class Name(val name: String)
data class Age(val age: Int, val name: UserName)