package com.budjb.domain

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class DomainTestSpec extends Specification {
    DomainTest domainTest

    def setup() {
        domainTest = new DomainTest(val1: 'foo', val2: 'bar', val3: 'baz')
        domainTest.save(failOnError: true, flush: true)
    }
    def 'domain is found'() {
        expect:
        DomainTest.findByVal1('foo')
    }
}
