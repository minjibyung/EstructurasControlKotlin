fun main(){
//declarar dos} variables para guardar el dato ingresago por el usuario
var option: Int
var attempts = 0
//estructura do while

do {
    println("Bienvenid@ al sistema de autenticacion.")
    println("Por favor ingrese alguna opcion deseada: ")
    //mostrar las opciones al usuario
    println("1. Iniciar sesion")
    println("2. Recuperar contraseña")
    println("3. Salir del sistema")
    print("Opcion: ")

    option = readLine()?.toIntOrNull() ?: 0

    //utlizar la estructura when 
    when (option) {
        1 -> {
            //codigo para iniciar sesion
            //imprimir mensaje
            println("Ingrese su nombre de usuario y contraseña.")
            println("Usuario: ")
            //declarar variable para guardar el dato del usuario
            var user = readLine()
            println("Contraseña: ")
            var password = readLine()

            //utilizar la estructura if
            if (user == "admin" && password == "12345") {
                //imprimir mensaje si la condicion es buena
                println("Inicio de sesion es exitoso.")
            //utilizar la estructura else
            }else{
                attempts++
                println("El usuario y la contraseña son incorrectos. Intente nuevamente")
            }
            //utilizar la estructura if
            if (attempts >= 3) {
                println("Ya ha superado el maximo de intentos")
                option = 3 
            }
            }

            2 -> {
                //codigo de recuperacion de contraseña
                //imprimir el mensaje de ingresa un correo para recuperar la contraseña
                println("Ingrese su correo electronico ")
                //declarar variable para guardar el dato pedido
                var email = readLine()

                //utilizar la estructura if
                if (email == "user10@example.com"){
                    println("se ha enviado un correo con instrucciones para recuperar la contraseña.")
                }else{
                  println("No se encontro ningun usuario con ese correo")  
                }
                }
            3 -> {
                //salir del sistema
                println("Gracias por utilizar nuestro sistema de autenticacion")

            }
            else -> {
                //opcion invalida
                println("Opcion ingresada es inavalida. por favor, seleccione una opcion valida")
            }
                }

            } while (option != 3)
            }


            
                