
/**
 * Write a description of class Curso1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso1
{
    private int [] notas;
    private int numEst;
    public Curso1(int cantEst){
        notas =  new int[cantEst];
    }
    public void añadirNotas(int nota){
       if(numEst < notas.length){ 
          notas[numEst] = nota;
          numEst++;
       }
    }
    public double promNotas(){
        double promedio = 0;
        double suma = 0;
        for(int i = 0; i < notas.length; i++){
           suma = suma + notas[i];
        }
        promedio = suma / notas.length;
        return promedio;
    }
    public double promNotaAprov(){
         double promedio = 0;
         double suma = 0;
         int apro = 0;
         for(int i = 0; i < notas.length; i++){
             if(notas[i] > 51){
                suma = suma + notas[i];
                apro++;
             }
         }
         promedio = suma / apro;
         
         return promedio;
    }
    public int numAprovados(){
        int aprov = 0;
        for(int i = 0; i < notas.length; i++){
           if(notas[i] >= 51){
              aprov++;
            }
        }
        return aprov;
    }
    public int numReprovados(){
        int reprov = 0;
        for(int i = 0; i < notas.length; i++){
           if(notas[i] < 51){
              reprov++;
            }
        }
        return reprov;
    }
    public int notaAlta(){
       int notaMax = 0;
       int nota1 = 0;
       int nota2 = 0;
       for(int i = 0; i < notas.length; i++){
            nota1 = notas[i];
            notaMax = Math.max(nota1,nota2);
            nota2 = nota1;
       }
       return notaMax;
    }
}
