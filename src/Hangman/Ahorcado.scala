package Hangman

import Pantalla.Mensajes


object Ahorcado extends App {
  var ahorcado:Game = new Game()
  var mensaje:Mensajes = new Mensajes()
  do{
    ahorcado.startGame()
  }
  while({
    mensaje.preguntar()
  })

}