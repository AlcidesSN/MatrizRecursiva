# MatrizRecursiva
vamos usar uma matriz 3x3 de exemplo:
~~~~
[12,15, 1]
[50,60,30]
[5, 9, 10]
~~~~
O Metodo recebe a matriz, o indexX e indexj ambos igual a 0.
~~~java
public void mostrarMatrizR(int[][] matriz,int indexX, int indexJ)
~~~
A primeira coisa é que ele verifica se a indexX é maior que o tamanho da linha da matriz.
~~~java
if (matriz.length <= indexX || indexX < 0){
    return;
}
~~~
Depois verifica se a indexJ é maior que o tamanho da coluna da matriz.
~~~java
if(matriz[0].length <= indexJ) {
    return;
}
~~~
Agora mostra no terminal o valor da matriz que esta no momento.
Monstrando no terminal o primeiro valor [12]
~~~java
System.out.println(matriz[indexX][indexJ]);
~~~
Chama de forma recursiva aumentando o valor de indexX em 1, fazendo com que o codigo se repita mostrando os numero [12, 50, 5].
~~~java
mostrarMatrizR(matriz,indexX+1,indexJ);
~~~
Para funcionar com qualquer tamanho de matriz, ele retorna o **indexX-(matriz.length-1)**, pois dessa forma por ele zera o indice, e soma o indexJ em 1 e chama a recursão com esses valores, zerando a linha e somando mais 1 na coluna.
~~~java
mostrarMatrizR(matriz,indexX-(matriz.length-1),indexJ+1);

~~~