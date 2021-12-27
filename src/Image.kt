import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    val height: Int = 800
    val width: Int = 600
    val image = BufferedImage(height, width, BufferedImage.TYPE_INT_RGB)
    val imageFile = File("src/myFirstImage.png")

    val graphics = image.createGraphics()
    graphics.drawString("Playing with images", 80, 80)
    graphics.color = Color.MAGENTA
    graphics.drawArc(200, 200, 100, 250, 45, 90)

    saveImage(image, imageFile)
}

fun saveImage(image: BufferedImage, imageFile: File) {
    ImageIO.write(image, "png", imageFile)
}
