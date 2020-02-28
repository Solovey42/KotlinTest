
fun main(args: Array<String>) {


   var table:MutableList<String> = mutableListOf()

    for(a in args) {
        table.add(a+" "+args.count { it == a })
    }
    var dist = table.distinct()

    val lengthComparator = compareByDescending<String> { it.substring(it.lastIndex) }
    val lengthThenString = lengthComparator.thenBy { it.substring(0,it.length-1) }

    for(a in dist.sortedWith(lengthThenString))
        println(a)

}
