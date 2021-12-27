import java.io.File

fun main(args: Array<String>) {
    firstQuestion()
    println("Longest word: " + longestWord())
    println("Total words: " + countWords())
    println("Total numbers: " + countOnlyNumbers())
}

fun firstQuestion()
{
    val fileName = "src/new.txt"
    val file = File(fileName)
    val linesLength = file.length()
    val lines = file.readLines().size

    println("$linesLength $lines")
}

fun longestWord() : Int {
    var longestWord = Int.MIN_VALUE;
    val file = File("src/words_sequence.txt")
    val lines = file.readLines()

    for (word in lines)
    {
        if (word.length > longestWord)
        {
            longestWord = word.length
        }
    }

    return longestWord
}

fun countWords(): Int {
    var counter = 0
    val file = File("src/text.txt")
    val lines = file.readLines()

    for (line in lines)
    {
        counter += line.split(" ").size
    }
    return counter
}

fun countOnlyNumbers(): Int {
    var counter = 0
    val file = File("src/words_with_numbers.txt")
    val lines = file.readLines()

    for (line in lines)
    {
        if (line.toIntOrNull() != null) {
            counter++
        }
    }
    return counter
}