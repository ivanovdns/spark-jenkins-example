package com.epam

import org.apache.spark.sql.SparkSession
import org.apache.spark.{LocalSparkContext, SparkFunSuite}
import org.scalatest.funsuite.AnyFunSuiteLike

class MyTestSuite extends SparkFunSuite
  with AnyFunSuiteLike
  with LocalSparkContext {

  private val ss = SparkSession.builder().master("local[1]").getOrCreate()

  /*override def beforeAll(): Unit = {
    doThreadPreAudit()
    super.beforeAll()
  }

  override def afterAll(): Unit = {
    super.afterAll()
    ss.close()
    doThreadPostAudit()
  }*/

  test("test") {
    ss.read
      .option("header", "true")
      .csv("data-in/hotels.csv")
      .show()
  }
}
