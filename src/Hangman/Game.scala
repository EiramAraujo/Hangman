package Hangman

import scala.collection.mutable.ArrayBuffer

class Game {
  private var frase:String = new String()
  private var banco_letras:Array[Char] = new Array[Char](26)
  private var errores:Array[Char] = new Array[Char](7)
  private var aciertos:ArrayBuffer[Char] = new ArrayBuffer[Char]()
  private var letra:Char = null
  private var lenght:Byte = null
  private var num_errores:Byte = null
  private var suposicion:Boolean = null

  def startGame(){

  }


}
