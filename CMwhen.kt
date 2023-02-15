fun main() {
//imprimir um mensaje de ingrese un dia de la semana
print("Ingresa un dia de la semana: ")
//declarar una variable para guardar el dato ingresado por el usauario
var day = readLine()

//utilizar una estructura when para comparar diferentes opciones 
when (day) {
    "lunes", "martes", "miercoles", "jueves", "viernes" -> {
        println("El $day es un dia laborable")
    }
    "sabado", "domingo" -> {
        println("El $day no es un dia laborable") 
    }
    else -> {
        println("El valor ingresado no es un dia valido")
    }
    }
        }
            
   
    

    
