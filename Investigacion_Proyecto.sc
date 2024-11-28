// Función para integrar
def aplicarIntegracion(funcion: Double => Double, limiteInferior: Double, limiteSuperior: Double): Double = {
  val puntoCentral: Double = (limiteInferior + limiteSuperior) / 2
  val inicioFuncion: Double = limiteInferior
  val finFuncion: Double = limiteSuperior
  ((limiteSuperior - limiteInferior) * (funcion(inicioFuncion) + 4 * funcion(puntoCentral) + funcion(finFuncion))) / 6
}

// Ejercicios de Integración
val resultado1: Double = aplicarIntegracion(x => -Math.pow(x, 2) + 8 * x - 12, 3, 5)

val resultado2: Double = aplicarIntegracion(x => 3 * Math.pow(x, 2), 0, 2)

val resultado3: Double = aplicarIntegracion(x => x + 2 * Math.pow(x, 2) - Math.pow(x, 3) + 5 * Math.pow(x, 4), -1, 1)

val resultado4: Double = aplicarIntegracion(x => (2 * x + 1) / (Math.pow(x, 2) + x), 1, 2)

val resultado5: Double = aplicarIntegracion(x => Math.exp(x), 0, 1)

val resultado6: Double = aplicarIntegracion(x => 1 / Math.sqrt(x - 1), 2, 3)

val resultado7: Double = aplicarIntegracion(x => 1 / (1 + Math.pow(x, 2)), 0, 1)

// Función para calcular el error del valor absoluto
def errorAbsoluto(esperado: Double, obtenido: Double): Double = Math.abs(esperado - obtenido)

// Error
val diferencia1: Double = errorAbsoluto(1.733, 1.733)

val diferencia2: Double = errorAbsoluto(8, 8)

val diferencia3: Double = errorAbsoluto(3.333, 4.67)

val diferencia4: Double = errorAbsoluto(3.333, 4.67)

val diferencia5: Double = errorAbsoluto(1.71828, 1.71886)

val diferencia6: Double = errorAbsoluto(0.828427, 0.828848)

val diferencia7: Double = errorAbsoluto(0.785398, 0.7833)