
import java.util.StringTokenizer

class Calculadora {
    fun suma(s: String = ""): Int {
        if (s.isNullOrEmpty())
            return 0
        val split = s.split("," , "\n")
        val newline = System.getProperty("line.separator")
        var total = 0
        for (num in split) {
            total = total + num.toInt()
        }
        return total
    }
}
