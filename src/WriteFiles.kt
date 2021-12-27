import java.io.File

fun main() {
    val myFile = File("src/MyFile.txt")
    myFile.writeText("It is awfully hard work doing nothing.")
    myFile.appendText("Just \nlook\n at \n that!")
    myFile.appendText("\tThere's a tab")


    val myByteFile = File("src/MyByteFile.txt")
    myByteFile.writeBytes(byteArrayOf(1, 2, 3))
}