package org.dummy

import org.apache.spark.rdd.RDD

/**
 * Clase que se debe rellenar para completar la práctica.
 */
class EventAggregation() extends Serializable {

  /**
   * Este método cálcula el número de ocurrencias de cada tipo de evento-
   * Por ejemplo, en el caso de unas cadenas como las siguientes:
   * -  1:AAAAABAAAAABAAAAABAAAAAB
   * -  2:BBAAAAAAAAAABBAAAAAAAAAA
   * En este caso el resultado debería ser Map{ "A" -> 6 , "B" -> 6 }
   *
   * @param rdd RDD con las lineas del fichero que se va a procesar,
   *            el formato de cada linea es 1:AAAAABAAAAABAAAAABAAAAAB.
   * @return Un diccionario con cada tipo de evento y el numero de ocurrencias
   *         asociadas al mismo.
   */
  def numberOfOccurrences(rdd: RDD[String]): Map[String, Long] = ???

  /**
   * Este método calcula la duracción total de cada tipo de evento.
   * Por ejemplo, en el caso de unas cadenas como las siguientes:
   * -  1:AAAAABAAAAABAAAAABAAAAAB
   * -  2:BBAAAAAAAAAABBAAAAAAAAAA
   * En este caso el resultado debería ser Map{ "A" -> 40 , "B" -> 8 }
   *
   * @param rdd RDD con las lineas del fichero que se va a procesar,
   *            el formato de cada linea es 1:AAAAABAAAAABAAAAABAAAAAB.
   * @return La duracción total a cada tipo de evento.
   */
  def calculateTotalDuration(rdd: RDD[String]): Map[String, Long] = ???

  /**
   * Este método calcula el numero total de transiciones que se han
   * producido en un dataset.
   * Por ejemplo, en el caso de unas cadenas como las siguientes:
   * -  1:AAAAABAAAAABAAAAABAAAAAB
   * -  2:BBAAAAAAAAAABBAAAAAAAAAA
   * El resultado debería ser
   * Map{ ("A","B") -> 5 , ("B","A") -> 5 }
   *
   * @param rdd RDD con las lineas del fichero que se va a procesar,
   *            el formato de cada linea es 1:AAAAABAAAAABAAAAABAAAAAB.
   * @return Un diccionario con cada tipo de transiciones que han aparecido
   *         en el dataset y el numero de ocurrencias.
   */
  def calculateNumberOfTransitions(rdd: RDD[String]): Map[(String, String), Long] = ???


  /**
   * Este método calcula el dia para cada uno de los tipos donde el evento ha
   * tenido una ocurrencia con la duracción máxima.
   * Por ejemplo, en el caso de unas cadenas como las siguientes:
   * -  1:AAAAABAAAAABAAAAABAAAAAB
   * -  2:BBAAAAAAAAAABBAAAAAAAAAA
   * -  3:BBBBBBBBAAAABBAAAAAAAAAA
   * En este caso el resultado debería ser Map{ "A" -> Day2 , "B" -> Day3 }
   *
   * @param rdd RDD con las lineas del fichero que se va a procesar,
   *            el formato de cada linea es 1:AAAAABAAAAABAAAAABAAAAAB.
   * @return Un diccionario con cada tipo y el día donde aparece la ocurrencia
   *         más durarera.
   */
  def calculateDayWithMaxDuration(rdd: RDD[String]): Map[String, Long] = ???

}
