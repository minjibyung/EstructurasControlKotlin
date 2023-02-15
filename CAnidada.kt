fun main() {
//imprimir um mensaje
print("Ingrese su nombre : ")
//declarar variable para guardar el dato
var name = readLine()!!
//imprimir mensaje
print("Ingrese la materia: ")
//declarar una variable
var materia = readLine()!!
print("Ingrese la 1er nota: ")
//declarar variable
var nota1 = readLine()!!.toFloat()
print("Ingrese 2da nota: ")
var nota2 = readLine()!!.toFloat()
print("Ingrese la 3er nota: ")
var nota3 = readLine()!!.toFloat()

//declarar variable para promediar las notas ingresadas po el usuario
var prom = (nota1 + nota2 + nota3) / 3

//imprimir mensaje sobre el resultado del promedio de las notas
println("El promedio de notas es: $prom")
//utilizar la estructura de control if
if (prom >= 3.5){
    println("El estudiante $name GANO LA MATERIA $materia")
}else{
    println("El estudiante $name PERDIO LA MATERIA $materia")
        if (prom >= 2.5){
            println("$name puede recuperar")
        }
    }
}
