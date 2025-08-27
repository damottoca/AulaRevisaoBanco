package org.example.entidades

import org.example.enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua( //Os 2 parenteses construtor da clsse
    val capacidade: Int,
    val cor: String,
    val peso: Double,
    val preco: BigDecimal,
    val altura: Double,
    val profundidade: Double,  // val dimensao : Array<Double>
    val largura: Double,
    val material: Material,
    val interno: Boolean,
    val marca: String,
    val tampa: String,
    val entradaDaAgua: Boolean,
    val saidaDaAgua: Boolean,
    val boia: String,

    ) //Aqui vai todos os atributos da classe
{


}