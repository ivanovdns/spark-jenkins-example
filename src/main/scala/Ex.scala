package com.epam

import org.apache.spark.sql.SparkSession

object Ex {
  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().master("local[1]").getOrCreate()

    ss.read
      .option("header", "true")
      .csv("data-in/hotels.csv")
      .show()

    ss.close()
  }
}
