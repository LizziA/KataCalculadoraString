import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class CalculatorSpec : WordSpec(){
    init {
        "Si la entrada es vacia" should {
            "deberia retornar 0" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma()
                // prueba
                resultado.shouldBe(0)
            }
        }

        "Si la entrada es solo 1 numero" should {
            "deberia retornar ese numero" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("3")
                // prueba
                resultado.shouldBe(3)
            }
        }
        "Si la entrada son 2 numeros separados por coma" should {
            "deberia regresar la suma de los 2 numeros" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("3,4")
                // prueba
                resultado.shouldBe(7)
            }
        }

        "Si la entrada son 2 numeros desconocidos separados por coma" should {
            "deberia regresar la suma $" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1,2,3,4,5,6")
                // prueba
                resultado.shouldBe(21)
            }
        }
        " Si la entrada son multiples numeros separados por nueva lineas " should {
            "deberia retornar suma" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.sumad("1\n2\n3")
                // prueba
                resultado.shouldBe(6)
            }
        }
        "Si la entrada son varios numeros separados por un delimitador personalizado" should {
            "deberia regresar la suma" {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.sumap("1;//2;//3;//4;//5;//6")
                // prueba
                resultado.shouldBe(21)
            }
        }
        "Si la entrada son multiples numeros separados por un delimitador multicaracter personalizado" should {
            "deberia regresar la suma " {
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.sumac("1///*,2///*,3///*,4")
                // prueba
                resultado.shouldBe(10)

            }
        }
    }
    }

//    7. Si la entrada del usuario contiene un numero negativo debe retornar una excepcion con el mensaje "negativos no permitidos: x" donde x es el negativo
//    8. Si la entrada del usuario contiene multiples negativos debe regresar una excepcion con el mensaje "negativos no permitidos: -x, -y, -z  donde x,y,z son negativos
//    9. Si la entrada del usuario contiene numeros mayores a 1000 debe regresar la suma de los numeros menores a 1001
//    10. Si la entrada del usuario son multiples numeros separados por un delimitador multicaracter personalizado debe regresar la suma de los numeros (ejemplo: “//[***]\n1***2***3” debe retornar 6)
//    11. Si la entrada del usaurio son multiples delimitadores personalizados debe retornar la suma de los numeros (ejemplo “//[*][%]\n1*2%3” debe retornar 6)