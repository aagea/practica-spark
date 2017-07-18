package org.dummy

import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object PracticaApp extends App {

  //Suppress Spark output
  Logger.getLogger("org").setLevel(Level.ERROR)
  Logger.getLogger("akka").setLevel(Level.ERROR)

  val sc = new SparkContext(new SparkConf().setMaster("local").setAppName("Practica"))

  val rdd = sc.textFile("data.txt")
  val eventAggregation = new EventAggregation()

  println("calculateDayWithMaxDuration:")
  println(eventAggregation.calculateDayWithMaxDuration(rdd))
  println("calculateNumberOfTransitions:")
  println(eventAggregation.calculateNumberOfTransitions(rdd))
  println("calculateTotalDuration:")
  println(eventAggregation.calculateTotalDuration(rdd))
  println("numberOfOccurrences:")
  println(eventAggregation.numberOfOccurrences(rdd))

}
