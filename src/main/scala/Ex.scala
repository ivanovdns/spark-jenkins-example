package com.epam

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

object Ex {
  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().master("local[1]").getOrCreate()

    ss.read
      .option("header", "true")
      .csv("data-in/hotels.csv")
      .filter(col("Country") === "US")
      .write
      .format("avro")
      .save("data-out/hotels.without.US")

    ss.close()
  }
}
