val transac = sc.textFile("/home/gustavo/Documents/transactionsJun2016.csv")
transac.filter(line => !line.contains("Amount")).map(_.split("\",\"").map(strings => (strings(5).replaceAll("\"", ""), strings(3).replaceAll("\"", "").toDouble)).reduceByKey((a, b) => a + b).collect() 
