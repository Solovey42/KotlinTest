fun main(args: Array<String>) {

    if(args.isNullOrEmpty())
    {
        var inputText = readLine()

        val lstValues: List<String> = inputText.toString().dropLast(1).trim('"').trim().split(" ")
        val arg = lstValues.toTypedArray()

        for (a in arg)
            println(a)
    }
    else
    {
        //any code
    }
}

