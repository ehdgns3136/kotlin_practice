//val action = {println(42)}
val action: () -> Unit = {println(42)}

//val sum = {x: Int, y: Int -> x + y}
val sum: (Int, Int) -> Int = {x, y -> x + y}

