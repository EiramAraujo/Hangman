package Hangman

import Funcionamiento.Logica
import Funcionamiento.setGame
import Pantalla.Mensajes

import scala.collection.mutable.ArrayBuffer

class Game extends Logica{
  private val preparador:setGame = new setGame()
  private val display:Mensajes = new Mensajes()

  private var frase:String = new String()
  private var banco_letras:Array[Char] = new Array[Char](26)
  private var errores:Array[Char] = new Array[Char](7)
  private var aciertos:Array[Char] = new Array[Char](4)
  private var letra:Char = '@'
  private var num_errores:Int = 0
  private var suposicion:Boolean = false

  def startGame() = {
    display.cls()
    frase = preparador.setFrase()
    banco_letras = preparador.setBanco_Letras()
    errores = preparador.setErrores()
    aciertos = preparador.setAciertos(frase.length,frase)
    num_errores = 0


    do{
      display.cls()

      //Se muestra la pantalla del gato
      display.displayErrores(errores)
      println()
      display.displayAciertos(frase.length,aciertos)
      println()
      display.displayBanco(banco_letras)

      //Se recibe y verifica la letra a recibir
      letra = recibir_letra(banco_letras)
      suposicion = revisarSuposicion(letra, frase, aciertos)
      /*aciertos = acertar(letra,frase,aciertos)*/
      num_errores = errar(suposicion, errores, num_errores, letra)
    }
    while({
      ganar(aciertos,frase.length) && perder(errores)
    })

    //Mensaje final y revelacion de la frase
    display.finalMessage(perder(errores))
    println("La frase es: " + frase + "\n")
  }


}
