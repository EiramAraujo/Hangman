package Pantalla

  class Mensajes {

    def displayErrores(errores: Array[Char]): Unit = {
      println("Fallas: ")
      for (i <- 0 to 6) {
        print("|" + errores(i).toString + "|")
      }
      println(" ")
    }

    def displayAciertos(n: Integer, aciertos: Array[Char]): Unit = {
      for (i <- 0 to n) {
        print(aciertos(i).toString() + ' ')
      }
    }

    def displayBanco(banco: Array[Char]): Unit = {
      for (i <- 0 to 26) {
        print(banco(i).toString() + ' ')
        if (i == 12) {
          println(" ");
        }
      }
      println(" ");
    }

    def cls(): Unit = {
      for (i <- 0 to 50){
        println(" ");
      }
    }

    def preguntar(): Boolean  ={
      println("Desea jugar de nuevo? (S/N)");
      var decision = scala.io.StdIn.readChar()
      if(decision=='S'||decision=='s'){
        return true
      }else{
        return false
      }
    }

    def finalMessage(game:Boolean): Unit ={
      if(game==true){
        println("Felicidades, has ganado!");
      }else{
        println("Lo siento, has perdido");
      }
    }


  }
