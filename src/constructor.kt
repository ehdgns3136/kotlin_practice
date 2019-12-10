class TestForConstructor {
    var s: String = ""

    constructor (t: String, u: String){
        // secondary constructor, delegate to primary constructor
        this.s += "$u"
    }

    constructor (t: String, u: String, i: Int) {
        this.s += "$u$t"
    }

    init {
        // execute immediately after the primary constructor
        s += "B"
    }
}