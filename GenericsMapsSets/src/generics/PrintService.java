package generics;

import java.util.ArrayList;

import java.util.List;

/*
 pode ter diversos tipos de generics 
<T> → quando quem usa a classe/método escolhe o tipo.

Object → quando você realmente não liga para o tipo (raro hoje).

? → quando não importa o tipo, só vai ler como Object. (tipo coringa)

? extends T → quando você vai ler e precisa que seja no mínimo um T.

? super T → quando você vai escrever/adicionar e precisa que aceite um T.
 
 */

public class PrintService<T> { // isso deixa o tipo generico, ou seja, melhora na implementacao, deixa mais abrangente
								//Sendo possivel escolher o tipo so na hr da main

	List<T> lista = new ArrayList<>();

	public void adcValor(T valor) {
		lista.add(valor);
	}

	public void print() {
		for (T i : lista) {
			System.out.print(i + " ");
		}

	}

	public T primeiro() {
		return lista.get(0);
	}
	

}
