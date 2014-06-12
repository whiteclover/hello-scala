import Hello._

object Hi {
  def main(args: Array[String]) = {
  	println("hello world")
  	println("good day")
  	var a: String = "Nohaoo"
  	println(a)
  	say("Say Word")
  	HelloWord.say("hello")

  	val h = new H("hello class")
  	h.say()
  }


  def say(word: String) = println(word)
}