val rddData = 
sc.parallelize(Array("one,two,three", "four,five,six","seven,eight,nine,ten" ))
val rddData2 = rddData.flatMap(_.split("," ) ) 
rddData2.collect

