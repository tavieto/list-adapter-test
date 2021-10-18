package com.example.listadaptertest

import androidx.recyclerview.widget.DiffUtil

/*
* Esta classe é necessária para passar como argumento do ListAdapter.
*
* A classe DiffUtil verifica se a lista anterior é igual à lista atual.
*
* A primeira função chamada areItemsTheSame verifica se os itens são
* iguais, caso seja verdadeiro, vai chamar a função areContentsTheSame,
* e nessa função fazemos algo com essa informação de que o conteúdo é igual,
* sendo um verificação a mais, ou qualquer coisa do tipo.
*
* OBS.: quando tive o primeiro contato com esta classe fiquei confuso
* achando que os nomes das funções não faziam sentido, mas a lógica é
* que "a primeira função verifica se o conteúdo é igual, se for, chame
* a função que trata os dados se forem iguais, se o conteúdo não for igual,
* apenas renderiza em tela e não entra na função areContentsTheSame".
* */

class DataDiffCallback : DiffUtil.ItemCallback<User>() {

    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        return false
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return areItemsTheSame(oldItem, newItem)
    }
}