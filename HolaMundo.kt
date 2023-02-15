fun main(){
  println("Ingrese su Nombre:")
  var nombre:String?=readLine()

  println("Ingrese su Edad:")
  var edad:Int=readLine()!!.toInt()

  println("Bienvenid@ $nombre, su edad es $edad, y en 5 años sera ${edad+5}\n")
  println()
}