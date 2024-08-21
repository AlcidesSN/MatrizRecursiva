public class Mostrador {

    public Mostrador(){
    }

    public void mostraVetorR(int[] vector,int index) {
        if(vector.length <= index)
            return;
        System.out.println(vector[index]);
        mostraVetorR(vector,index+1);
    }

    public void mostrarMatrizR(int[][] matriz,int indexX, int indexJ){
        if (matriz.length <= indexX || indexX < 0){
            return;
        }
        if(matriz[0].length <= indexJ) {
            return;
        }
        System.out.println(matriz[indexX][indexJ]);

        mostrarMatrizR(matriz,indexX+1,indexJ);
        mostrarMatrizR(matriz,indexX-(matriz.length-1),indexJ+1);

    }
}
