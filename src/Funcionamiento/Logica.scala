package Funcionamiento

trait Logica {

  //Se recibe la letra y se validan diferentes parametros
  def recibir_letra(banco:Array[Char]): Char = {
    var letra: Char = '@'
    do {
      print("Ingrese una letra disponible: ")
      letra = scala.io.StdIn.readChar()
    }
    while({
      validarLetra(banco, letra)
    })

    return letra
  }

  //Valida que la letra este disponible en el banco de palabras
  def validarLetra(banco:Array[Char], letra:Char): Boolean ={
    for (i <- 0 to 26){
      if (banco(i).==(letra)){
        banco(i)= '#'
        return false
      }
    }

    return true
  }

  //Se revisa si la suposicion del jugador es correcta
  def revisarSuposicion(letra:Char, frase:String, aciertos:Array[Char]): Boolean = {
    var suposicion: Boolean = true
    for(i <- 0 to frase.length()){
      if( letra == frase.charAt(i)){
        suposicion = false
        aciertos(i) = letra
      }
    }

    return suposicion
  }

  //Se checa si se equivoco, en caso que si se agrega al arreglo de errores
  def errar(suposicion:Boolean, errores:Array[Char], num_errores:Int, letra:Char): Int ={
    var errores_num = num_errores
    if(suposicion){
      errores(num_errores) = letra
      errores_num = errores_num+1
    }

    return errores_num
  }

  //Se checa si se han adivinado todas las letras
  def ganar(aciertos:Array[Char],lenght:Int): Boolean ={
    for(i <- 0 to lenght){
      if(aciertos(i).equals(' ')){
        return true
      }
    }
    return false
  }

  //Se checa si el arreglo de errores ha sido completado
  def perder(errores:Array[Char]):Boolean = {
    for(i <- 0 to 7){
      if(errores(i).equals(' ')){
        return true
      }
    }

    return false
  }

}
