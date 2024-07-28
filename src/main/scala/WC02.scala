import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC02 {
  def main(args: Array[String]):Unit={
    val sparkconf =new SparkConf
    sparkconf.set("spark.app.name","WC2")
    sparkconf.set("spark.master","local[*]")
    val spark = SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()

import spark.implicits._
    val grades = List(
      (1, 85),
      (2, 42),
      (3, 73)
    ).toDF("student_id", "score")

    grades.select(col("student_id"),col("score"),when(col("score")>=50,"Pass").otherwise("fail").alias("status")).show()

  }

}
