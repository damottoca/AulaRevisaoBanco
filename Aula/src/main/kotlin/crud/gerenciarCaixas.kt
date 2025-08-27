package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material

fun cadastrarCaixa(){
    /*
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,  // val dimensao : Array<Double>
    val largura : Double,
    val interno : Boolean,
    val marca : String,
    val tampa : Boolean,
    val entradaDaAgua : Boolean,
    val saidaDaAgua : Boolean,
    val boia : String,
     PLASTICO, PVC, PARAFUSO, LIXA, MARTELO,
     */
    println("Escolha o material do qual a caixa é composta: ")
    println("1- Plástico")
    println("2- PVC")
    println("3- Parafuso")
    println("4- Lixa")
    println("5- Martelo")
    val opcao = readln().toInt()
    val material : Material
    when (opcao) {
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3-> material = Material.PARAFUSO
        4-> material = Material.LIXA
        5-> material = Material.MARTELO
        else -> material = Material.PLASTICO
    }

    println("Capacidade em litros: ")
    val litos = readln().toInt()

    println("Altura da caixa: ")
    val altura = readln().toDouble()

    println("Cor da caixa: ")
    val cor = readln().toString()

    println("Peso da caixa: ")
    val peso = readln().toDouble()

    println("Preço da caixa: ")
    val preco = readln().toBigDecimal()

    println("Profundidade da caixa: ")
    val profundidade = readln().toDouble()

    println("Largura da caixa: ")
    val largura = readln().toDouble()

    println("Interno da caixa: ")
    val interno = readln().toBoolean()

    println("Marca da caixa: ")
    val marca = readln().toString()

    println("Tampa da caixa: ")
    val tampa = readln().toString()

    println("Entrada D'Água: ")
    val entrada = readln().toBoolean()

    println("Saida D'Água: ")
    val saida = readln().toBoolean()

    println(" Boia da caixa: ")
    val boia = readln().toString()

    //Salvar as variáveis agora dentro da classe
    //Conecte o atributo da classe a variável que o usuario digitou


    CaixaDAgua(
        material = material,
        capacidade = litos,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,
        interno = interno,
        marca = marca,
        tampa = tampa,
        entradaDaAgua = entrada,
        saidaDaAgua = saida,
        boia = boia,
    )
}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}