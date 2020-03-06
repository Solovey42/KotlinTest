fun main(args: Array<String>) {


   val table:MutableList<String> = mutableListOf()

    for(a in args) {
        table.add(a+" "+args.count { it == a })
    }
    val dist = table.distinct()

    val lengthComparator = compareByDescending<String> { it.substring(it.indexOf(' '),it.lastIndex) }
    val lengthThenString = lengthComparator.thenBy { it.substring(0,it.indexOf(' ')) }

    for(a in dist.sortedWith(lengthThenString))
        println(a)

}