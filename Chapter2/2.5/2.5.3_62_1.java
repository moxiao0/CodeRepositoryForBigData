val inputTextFile = sc.textFile(path)
println(inputTextFile.collect.mkString(","))
