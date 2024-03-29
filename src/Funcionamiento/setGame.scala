package Funcionamiento

import scala.collection.mutable.ArrayBuffer

class setGame {

  //Recibe la frase con la que se jugara
  def setFrase(): String ={
    print("Introduzca la frase a adivinar: ")
    var frase:String = scala.io.StdIn.readLine()
    return frase.toUpperCase()
  }

  //Inicializa el banco de letras con el alfabeto
  def setBanco_Letras(): Array[Char] ={
    var banco:Array[Char] = new Array[Char](26)
    for(i <- 0 to 25){
      banco(i) = (65+i).toChar
    }

    return banco
  }

  //Inicializa el arreglo de errores con espacios en blanco
  def setErrores():Array[Char] = {
    var oportunidades: Array[Char] = new Array[Char](7)
    for(i <- 0 to 6){
      oportunidades(i) = ' '
    }
    return oportunidades
  }

  //Inicializa el arreglo de aciertos con los guines que se mostraran
  def setAciertos(n:Int, frase:String):Array[Char] = {
    var aciertos:Array[Char] = new Array[Char](n)
    for(i <- 0 until n){
      if(frase.charAt(i).!=(' '))
        aciertos(i) = '_'
      else
        aciertos(i) = ' '
    }

    return aciertos
  }
}
