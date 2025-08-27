package org.example.entidades

class Cliente(
    nome: String,
    sobrenome: String,
    idade: Int,
    cpf: Int,
    endereco: String,
    sexo: String,
    numero : Int,
    val pedido : Array<String>

) : Pessoa(nome = nome,
    sobrenome = sobrenome,
    cpf = cpf,
    sexo = sexo,
    idade = idade,
    endereco = endereco,
    numero = numero,

    ) {
}