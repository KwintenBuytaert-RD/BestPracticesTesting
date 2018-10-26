package com.realdolmen.bestPracticesTesting


import java.math.BigDecimal
import java.math.RoundingMode

class Calculator {

    private fun convertStringToBigDecimal(a: String): BigDecimal {
        return BigDecimal(a).setScale(4, RoundingMode.CEILING)

    }

    fun add(a: String, b: String): String {
        val bi1 = this.convertStringToBigDecimal(a)
        val bi2 = this.convertStringToBigDecimal(b)
        return bi1.add(bi2).setScale(4, RoundingMode.CEILING).toString()
    }

    fun multiply(a: String, b: String): String {
        val bi2 = this.convertStringToBigDecimal(b)
        val bi1 = this.convertStringToBigDecimal(a)
        return bi1.multiply(bi2).setScale(4, RoundingMode.CEILING).toString()
    }

    fun divide(a: String, b: String): String {
        val bi2 = this.convertStringToBigDecimal(b)
        val bi1 = this.convertStringToBigDecimal(a)
        return bi1.divide(bi2).setScale(4, RoundingMode.CEILING).toString()
    }
    //
    //    public static String sqrt(String a) {
    //        BigDecimal bi1 = Calculator.convertStringToBigDecimal(a);
    //        return bi1.pow()
    //    }

    fun squareRoot(b: Double): Double {
        return Math.sqrt(b)
    }


}
