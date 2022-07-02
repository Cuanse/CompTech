/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author tique
 */
public class Hash <T extends Comparable<T>>{
    private T Array[];
    private String llaves[];
    //private Object Arrayindexes[] = new Object[31];
    
    public Hash(int dimension_prima){
        Array = (T[]) new Comparable[dimension_prima]; // uso número primo que ingreso en el constructor.
        llaves = new String[dimension_prima];
    }
    
    private int count(String llave){
        int count = 0;
        for(int i = 0; i < llave.length(); i++){
            count += llave.charAt(i);
        }
        return count;
    }
    private int index_disponible(String llave,int count){
        int index = map(count);
        if(Array[index]==null){ // si está vacio, hay espacio
            return index;
        }else{
            if(llaves[index].equals(llave)){ // reescriba el dato únicamente porque es la misma llave
                return index;
            }else{
                index = map2(index,count);// Revisar si count está entre la primera mitad o la segunda
                if(Array[index]==null){
                    return index;
                }else{
                    if(llaves[index].equals(llave)){
                        return index;
                    }else{
                        return -1; // no se encontró esa llave y estaban ocupadas esas posiciones de memoria
                    }
                    
                }                
            }
        }
    }
    public void insert(String llave, T dato){
        int count = count(llave);
        int index = index_disponible(llave,count);
        if(index != -1){
            Array[index] = dato;
            llaves[index] = llave;
        }
        
    }
    private int map(int count){        
        
        return (count*4)%Array.length; // funcion hash
                
    }
    
    private int map2(int index,int count){
        int mitad = (int) Array.length/2;
        if(index < mitad){
            index = ((count*11)%(mitad))+mitad; // ponemos el index en la segunda mitad porque sabemos está en la primera
        }else{
            index = ((count*11)%(mitad));
        }
        return index;
    }
    
    public T search(String llave){
        if(llave == null){
            return null;
        }else{
            int count = count(llave);
            int index = index_disponible(llave,count);
            if(index!= -1){
                return Array[index]; // retorna un espacio null si no estaba, y el dato si si estaba
            }else{
                return null;
            }
        }
    }
    
    public int search_index(String llave){
        if(llave == null){
            return -1;
        }else{
            int count = count(llave);
            int index = map(count);
            int index2 = map2(index,count);
            
            if(llaves[index].equals(llave)){
                return index;
            }else if(llaves[index2].equals(llave)){
                return index2;
            }else{
                return -1;
            }
            
        }
    }
    
    public void delete(String llave){
        if(llave != null){
            int index = search_index(llave);
            if(index!=-1){
                Array[index] = null;
            }
        }
    }
}
