package Hello


object  Stmt {


	def for_stmt() = {
		var i = 0
		println("### for until")
		for(i <- 1 until 10){
			println(i)
		}

		println("### Yield for")
		val numList = List(1,2,3,4,5,6,7,8,9,10);
		// for loop execution with a yield
		var retVal = for{ a <- numList 
			if a % 3 != 0; if a < 8
			} yield a
		// Now print returned values using another loop.
		for(a <- retVal){
	         println( "Value of a: " + a );
	      }
	}
}