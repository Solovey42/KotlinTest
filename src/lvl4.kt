fun main(args: Array<String>) {
    args.sort()
    var array:Array<String> = args
    for (a in array.distinct()){
        println( a+" "+args.count { it == a })
    }


}


