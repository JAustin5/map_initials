import java.io.File

fun main(args: Array<String>) {

    val mutMap : MutableMap<String, String> = mutableMapOf<String, String>()

    val fileName = args[0]
    val lines: List<String> = File(fileName).readLines()
    lines.forEach { line ->
        val key1 = line[0]                  // gets first name letter
        val lineReading = line.split(" ")   // break apart the single line being read
        val key2 = lineReading[1][0]        // getting the last name letter
        val keyF = "$key1$key2"
        mutMap.put(keyF, line)
    }

    // recognizing if initial is in the map or not; using cntl-d to exit process
    println("Enter initials: ")
    while (true) {
        var keySearcher = readLine()

        if (keySearcher == null) {
            break
        }

        if (mutMap.containsKey(keySearcher)) {
            println(mutMap.getValue(keySearcher))
            println()
        }
        else {
            println("Not Found")
            println()
        }
    }
}
