class Calculadora {
    fun suma(s: String = ""): Int {
        if (s.isNullOrEmpty())
            return 0

        val split = s.split(",")
        var total = 0
        for (num in split) {
            total = total + num.toInt()
        }

        return total
    }

    fun sumad(r: String = ""): Int {
        val five = r.split("\n")
        var t = 0
        for (N in five) {
            t = t + N.toInt()
        }
        return t
    }

    fun sumap(p: String = ""): Int {
        val seis = p.split(";//")
        var suma = 0
        for (Numero in seis) {
            suma = suma+ Numero.toInt()
        }
        return suma
    }
    fun sumac(c: String = ""): Int {
        val ten = c.split("///*,")
        var sum = 0
        for (Nu in ten) {
            sum = sum + Nu.toInt()
        }
        return sum
    }
}
