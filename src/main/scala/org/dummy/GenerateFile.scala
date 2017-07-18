package org.dummy

import java.io.PrintWriter
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.Random

object GenerateFile extends App {
  val initTime = Instant.now()
  val letters = List("A", "B", "C", "D")
  val columns = 24
  val writer = new PrintWriter("generate.txt")
  var i = 0l

  def generateRandomLetters(letters: List[String], columns: Int, index: Long,
    initTime: Instant): String = {
    val rnd = new Random()
    initTime.plus(index, ChronoUnit.DAYS).getEpochSecond.toString +
      ":" + 0.to(columns).map(_ => letters(rnd.nextInt(letters.size))).mkString("")
  }
  try {
    while (i < 100000l) {
      val str = this.generateRandomLetters(letters, 24, i, initTime) + System.lineSeparator()
      writer.write(str)
      i += 1
    }
  } finally {
    writer.close()
  }
}
