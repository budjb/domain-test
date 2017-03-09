package com.budjb.domain

class DomainTest {
    String val1
    String val2
    String val3

    static constraints = {
        val1 unique: true
        val2 unique: true
        val3 unique: true
    }
}
