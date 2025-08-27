package org.example.entidades

import org.example.enumeradores.Setor
import java.math.BigDecimal

class Servico(
    val profissional: String,
    val patrao: String,
    val salario: BigDecimal,
    val clientes: String,
    val materiais: String,
    val ferramentas: String,
    profissional1: Any?,
    setor: Setor,

    ) {
}