import grails.embedded.bug.Address
import grails.embedded.bug.Vendor

class BootStrap {

    def init = { servletContext ->
        Vendor vendor = new Vendor()
        vendor.address = new Address(address: "somewhere", city: "Youngstown", state: "OH", zip: "44555")
        vendor.save(failOnError:true)
    }
    def destroy = {
    }
}
