package grails.embedded.bug

class Company {
    Address address

    static embedded = ['address']
    static constraints = {
        address nullable: true
    }
    static mapping = {
        tablePerSubclass  true
    }
}
