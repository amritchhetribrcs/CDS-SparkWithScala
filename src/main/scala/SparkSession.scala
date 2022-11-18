import org.apache.spark.sql.SparkSession
// Wordcount example
object SampleSaprk extends App {
  val spark = SparkSession.builder
    .master("local[*]")
    .appName("Counting Words")
    .getOrCreate()
  val data = spark.sparkContext.parallelize(
    Seq(" Machine Learning with Scala is latest trends and Martin Odersky dreams of ....."))
  val wordCount = data
    .flatMap(row => row.split(" "))
    .map(word => (word, 1))
    .reduceByKey(_ + _)
  wordCount.foreach(println)
}