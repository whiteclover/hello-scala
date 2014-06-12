package Hello

object HelloWord  {
	
	def say(word: String) = println("Package " + word)
}

class H(wordx: String){
	var word: String = wordx

	def say() = println(word)
}