package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material
import org.example.org.example.crud.ResulSet


fun cadastrarCaixa(){
        val conectar = EntidadeJDBC(
            url = "jdbc:postgresql//localhost:5432/aula",
            usuario = "postgres",
            senha = "5432"
    )
    conectar.conectarComBanco()
//Coloque o nome da tabela o mesmo nome da entidade
    val sql = " CREATE TABLE IF NOT EXISTS CaixaDAgua"
            "(id serial NOT NULL PRIMARY KEY," +
            "materia varchar(250)," +
            "capacidade float," +
            "altura float, " +
            " largura float," +
            " profundidade float," +
            "blablabla varchar (255)"
           " preco varchar (255)," +
    ")"
    val banco = conectar.conectarComBanco()
    banco!!.createStatement().execute(sql)

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
    val cor = readln() //por padrão já le como String, não precisa do .toString()

    println("Peso da caixa: ")
    val peso = readln().toDouble()

    println("Preço da caixa: ")
    val preco = readln().toBigDecimal()

    println("Profundidade da caixa: ")
    val profundidade = readln().toDouble()

    println("Largura da caixa: ")
    val largura = readln().toDouble()

    println("Interno da caixa: (1 - sim, 2 - não")
    val interno = when(readln().toInt()){
        //Usuario escolhe 1 ou 2 para true ou false. Se for outra coisa, é false
        //Isso afeta no resultado final, se tem ou não interno da caixa
        1 -> true
        2 -> false
        else -> false
    }

    println("Marca da caixa: ")
    val marca = readln() //por padrão já le como String, não precisa do .toString()

    println("Tampa da caixa: ")
    val tampa = readln() //por padrão já le como String, não precisa do .toString()

    println("Tem entrada D'Água: (1 - sim, 2 - não)")
    val entrada = when(readln().toInt()){
        //Usuario escolhe 1 ou 2 para true ou false. Se for outra coisa, é false
        //Isso afeta no resultado final, se tem ou não entrada da agua
        1 -> true
        2 -> false
        else -> false
    }

    println("Tem saida D'Água: ")
    val saida =  when(readln().toInt()){
        //Usuario escolhe 1 ou 2 para true ou false. Se for outra coisa, é false
        //Isso afeta no resultado final, se tem ou não saida de água
        1 -> true
        2 -> false
        else -> false
    }

    println(" Boia da caixa: ")
    val boia = readln() //por padrão já le como String, não precisa do .toString()

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
println ()
}

fun listarCaixas(){
    val banco = conectar.conectarComBanco()
    val sql = "SELECT * FROM CaixaDAgua"
    val resultados : ResulSet = banco!!.createStatement().executeQuery(sql)
}


fun excluirCaixa(id : Int){
val banco = conectar.conectarComBanco()
    val sqlBusca = "SELECT * FROM CaixaDAgua WHERE id = "
    val sql = "SELECT * FROM CaixaDAgua WHERE id = "
}