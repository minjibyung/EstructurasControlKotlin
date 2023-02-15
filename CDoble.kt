fun main(){
//imprimir un mensaje
print("Ingresa la edad")
//declaramos una variable que almacena el dato ingresado por el usuario
var age: Int = readLine()!!.toInt()
//utilizamos la estructura if para comprobar si la edad es igual o mayor a 18
if(age >=18){
    //se imprime el mensaje de que si el usuario es mayor o igual a 18 "eres mayor de edad"
    println("Eres mayor de edad")
}else{
    //de lo contrario si el usuario es menor a 18 se imprime el mensaje "eres menor de edad"
    println("eres menor de edad")
}
}