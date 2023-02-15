fun main() {
//nos permite imprimir un mensaje y que el usuario ingrese la nota
print("Ingresa la nota")
//declarar una variable para almacenar la calificacion
var qualification = readLine()!!.toFloat()
//utilizar la estructura de control if para comprobar que la nota sea mayor o igual
if(qualification >= 5.0) {
    //imprimir un mensaje pues si la calificacion es mayor o igual a 5.0 que imprima "excelente"
    println("excelente")

    //si la calificacion es mayor o igual va imprimir "muy bien"
}else if (qualification >=4.0) {
     println("muy bien")
}else if (qualification >=3.0) {
    println("bien")
}else{
    println("necesitas mejorar")
}
}


