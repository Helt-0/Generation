programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro i,j,max,temp,contador
		contador=0
		enquanto(contador<10){
			escreva("Insira um número para a sequência de 10 números\n")
			leia(vetor[contador])
			contador=contador+1
		}
		i=0
		enquanto(i<9){
		max=i
		j=i+1	
		enquanto(j<=9){
			se(vetor[j]>vetor[max]){
				max=j
			}
		     j=j+1 
		   }
		temp=vetor[i]
		vetor[i]=vetor[max]
		vetor[max]=temp
		i=i+1
		}
	    escreva("vetor decrescente = | ")
	    i=0
	    enquanto(i<=9){
	    		escreva(vetor[i]," | ")
	    		i=i+1
	    }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */