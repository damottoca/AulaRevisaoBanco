package org.example.crud

import java.sql.Connection
import java.sql.DriverManager

class EntidadeJDBC(
    val usuario : String,
    val url : String,
    val senha: String
) {
    fun conectarComBanco() : Connection?{
        //Quando precisa fazer algo que possa falhar
        try{
            val coneccao : Connection = DriverManager.getConnection( //quando a Classe instanciar atributos
                this.url, this.usuario, this.senha
            )
            println("Conectou!")
            return coneccao
        } catch(erro : Exception){
            println(erro.printStackTrace())
        }
        return  null
    }
}