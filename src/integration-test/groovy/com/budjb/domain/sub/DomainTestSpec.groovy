package com.budjb.domain.sub

import com.budjb.domain.DomainTest
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class DomainTestSpec extends Specification {
    DomainTest domainTest

    def 'unique constraints fail'() {
        setup:
        domainTest = new DomainTest(val1: 'foo', val2: 'bar', val3: 'baz')

        expect:
        !domainTest.validate()
        domainTest.errors.errorCount == 3
    }

    def 'unique constraints fail again'() {
        setup:
        domainTest = new DomainTest(val1: 'foo', val2: 'bar', val3: 'baz')

        expect:
        !domainTest.validate()
        domainTest.errors.errorCount == 3
    }
}
