package Hangman

import Pantalla.Mensajes

import scala.collection.mutable.ArrayBuffer

class Game {
  private var frase:String = new String()
  private var banco_letras:Array[Char] = new Array[Char](26)
  private var errores:Array[Char] = new Array[Char](7)
  private var aciertos:ArrayBuffer[Char] = new ArrayBuffer[Char]()
  private var letra:Char = '@'
  private var lenght:Byte = 0
  private var num_errores:Byte = 0
  private var suposicion:Boolean = false
  private var display:Mensajes = new Mensajes()

  def startGame() = {

  }


}
