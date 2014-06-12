package Hello

object HelloWord  {
	
	def say(word: String) = println("Package " + word)
}

class H(wordx: String){
	var word: String = wordx

	def say() = println(word)
}

trait Swimming {
    def swim() = println("I'm swimming")
}

abstract class Bird {
    def flyMessage: String
    def fly() = println(flyMessage)
}

class Pigeon extends Bird with Swimming {
    val flyMessage = "I'm a good flyer"
}

class Hawk extends Bird with Swimming {
    val flyMessage = "I'm an excellent flyer"
}