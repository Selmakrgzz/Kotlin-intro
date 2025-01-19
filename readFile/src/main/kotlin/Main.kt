package org.example
import java. io. File
import java. io. InputStream

fun main() {
    val inputStream: InputStream = File("src/main/kotlin/seltext.txt").inputStream()
    println("Received input: $inputStream")

    val fileContent = inputStream.reader().readText()

    for (i in fileContent){
        if (i.isLetter()){
            println("$i")
        }
    }

    //println("The file content: $inputFile")
}