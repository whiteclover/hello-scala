import Hello._
import p.s._

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
    PP.say()
    Stmt.for_stmt()

    val flyingBirds = List(
    new Pigeon,
    new Hawk)
    flyingBirds.foreach(bird => bird.fly())
    flyingBirds.foreach(bird => bird.swim())
  }
  
  def say(word: String) = println(word)

}