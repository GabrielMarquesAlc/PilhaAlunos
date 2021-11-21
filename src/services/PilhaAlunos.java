package services;

import models.Aluno;

public class PilhaAlunos {
	
	private final Aluno[] vetAlunos;
	private int pTopo;
	
	public PilhaAlunos (int tam){
		vetAlunos = new Aluno[tam];
		pTopo = -1;
	}
	
	public void empilhar(Aluno al){
		if ((pTopo + 1) >= vetAlunos.length){
			System.out.println("Esta cheio");
		}else{
			pTopo = pTopo + 1;
			vetAlunos[pTopo] = al;
		}
	}

	public void desempilhar(){
		
		if ((pTopo + 1) >= vetAlunos.length){
			pTopo = pTopo - 1;
		}else{
			System.out.println("Esta vazio");
		}
	}

	public void imprimirTodos(){
		int aux = pTopo;
		
		while (aux !=-1){
			System.out.println(vetAlunos[aux].nome);
			System.out.println(vetAlunos[aux].ra);
			System.out.println(vetAlunos[aux].mensalidade);
			aux = aux -1;
			
		}
		
	}
	public void pesquisarRa(int r){
		boolean achou = false;
		for (int i = pTopo; i == 0; i--) {
				if((vetAlunos[i] != null) && (vetAlunos[i].ra == r)){
					achou = true;
					System.out.println("R.A: "+vetAlunos[i].ra);
					System.out.println("Nome: "+vetAlunos[i].nome);
					System.out.println("Mensalidade: "+vetAlunos[i].mensalidade);
					break;
				}
		}
		if(!achou){
			System.out.println("RA não localizado");
		}
	}
	
	public void estacheio(){
		System.out.println(((pTopo + 1) >= vetAlunos.length)? "Esta cheio" : "Esta vazio");
	}
	
	
}
