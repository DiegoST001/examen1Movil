package com.sanchez.diego.mylaboratoriocalificado01
import org.junit.Test
class Actividad1 {
    @Test
    fun main(){
        //Declaramos variables.
        val txtAnagrama1 = "Listen"
        val txtAnagrama2 = "silent"
        val txtNoAnagrama1 = "hello"
        val txtNoAnagrama2 = "world"
        //Llamamos las funciones agregando los respectivos parametros.
        println("El texto ${txtAnagrama1} y el ${txtAnagrama2} son Anagramas?: ${verificarAnagramas(textoLimpio(txtAnagrama1),textoLimpio(txtAnagrama2))}")
        println("El texto ${txtNoAnagrama1} y el ${txtNoAnagrama2} son Anagramas?: ${verificarAnagramas(textoLimpio(txtNoAnagrama1),textoLimpio(txtNoAnagrama2))}")
    }
    //Función para poner en el mismo estado todo texto, quitando espacios (replace) y convirtiendo todo a minúsculas (lowercase).
    private fun textoLimpio(txt1: String) = txt1.replace(" ", "").lowercase()
    //Ya contando con los textos en un mismo estado, se crear otra función que verifica si son anagramas.
    private fun verificarAnagramas(txt1: String, txt2: String) = txt1.toList().sorted() == txt2.toList().sorted()
    //Lo que hace la función verificarAnagramas() es recibir dos parámetros, los cuales primero se ordenan y luego se convierten en listas para comparar.



        //val numeroTexto = txt1.length;
        //val verificarIgualdad = txt1.count{it in txt2}
        //if (numeroTexto == verificarIgualdad){
          //  return true
        //}else{
          //  return false
        //}


}