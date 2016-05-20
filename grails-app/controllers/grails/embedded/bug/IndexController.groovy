package grails.embedded.bug

class IndexController {
    static responseFormats = ['json', 'xml']
    def index() {
        respond Vendor.all
    }

    def search() {
        respond Vendor.where {
            address.zip =~ '%44%'
        }.list(max: 10, offset: 0)
    }
}
