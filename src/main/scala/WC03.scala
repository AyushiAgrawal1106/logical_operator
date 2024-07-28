import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, when}

object WC03 {
  def main(args: Array[String]):Unit={
    val sparkconf=new SparkConf()
    sparkconf.set("spark.app.name","WC03")
    sparkconf.set("spark.master","local[*]")

    val spark= SparkSession.builder()
      .config(sparkconf)
      .getOrCreate()
 import spark.implicits._
    val transactions = List(
      (1, 1000),
      (2, 200),
      (3, 5000)
    ).toDF("transaction_id", "amount")

    transactions.select(col("transaction_id"),col("amount"),
      when(col("amount")>1000,"HIGH")
        .when(col("amount")>500 && col("amount")<=1000,"MEDIUM")
        .otherwise("LOW").alias("Status")).show()
  }

}
