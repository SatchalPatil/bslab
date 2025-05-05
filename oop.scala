// Scala Program to illustrate the keywords 

// Here class keyword is used to create a new class 
// def keyword is used to create Function 
// var keyword is used to create a variable 
class GFG 
{ 
	var name = "Priyanka"
	var age = 20
	var branch = "Computer Science"
	def show():Unit=
	{ 
	println("Hello! my name is " + name + "and my age is"+age); 
	println("My branch name is " + branch); 
	} 
} 

// object keyword is used to define 
// an object new keyword is used to 
// create an object of the given class 
object Main 
{ 
	def main(args: Array[String]) :Unit=
	{ 
		var ob = new GFG(); 
		ob.show(); 
	} 
} 
