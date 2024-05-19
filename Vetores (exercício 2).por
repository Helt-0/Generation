programa
{
	
	funcao inicio()
	{
		inteiro vetor[10],i,j,soma,temp,contador
		contador=0
		enquanto(contador<10){
			escreva("Insira um número para a sequência de 10 números\n")
			leia(vetor[contador])
			contador=contador+1
		}
		limpa()
		escreva("Elementos nos índices ímpares:\n")
		para(i=0;i<=9;i++){
			se(i%2 !=0){
				escreva(vetor[i], " ")
			}
		
		}
		escreva("\n")
		escreva("Elementos pares:\n")
		j=0
		enquanto(j<=9){
			se(vetor[j]%2==0){
				escreva(vetor[j], " ")
				
			}
		     j=j+1
		}
         escreva("\n")
         contador=0
         soma=0
         para(contador=0;contador<=9;contador++){
         	soma=soma+vetor[contador]
         } 
         escreva("Soma:\n",soma,"\n")
         escreva("Média:\n",soma/10)         
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */