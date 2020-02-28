fun main(args: Array<String>){
    args.sort()
    for (a in args.distinct())
        println(a)
}