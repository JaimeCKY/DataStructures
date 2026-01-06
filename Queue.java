public class Queue<V> {

  V first;
  int total;

public Queue(int s){

size = s;

b = 0;
e = size;

cur = e - 1;

queue = new V[size];

deleted = null;
first = null;

  total = 0;
  
flag = false;
  
}
  
/**Encolar (enqueue)  Añadir un elemento al final de la cola.**/
public void enqueue(V v){

if(cur > 0){

  queue[cur] = v;
  cur -= 1;

} else if(cur == 0){
  queue[cur] = v;  if(cur > b){
    flag = false;
  } else if(cur == 0){
    flag = false;

  } else if(cur == -1){
    flage = true;
  }

return flag;
  cur = -1;
    if(cur > b){
    flag = false;
  } else if(cur == 0){
    flag = false;

  } else if(cur == -1){
    flage = true;
  }

return flag;
} else if(cur == -1){

/** error message **/
}
  
}

/**Desencolar (dequeue)  Extraer el primer elemento (el más antiguo) **/
  public V dequeue(){  if(cur > b){
    flag = false;
  } else if(cur == 0){
    flag = false;

  } else if(cur == -1){
    flage = true;
  }

return flag;
if(cur > b){

deleted = dequeue[cur];
cur += 1;

} else if(cur == 0){

deleted = dequeue[cur];
cur = e;


} else if(cur == -1){
/** error message **/
}


return deleted;
}

  
/** Ver primero (peek/front) Consultar el primer elemento sin eliminarlo**/
    public V front(){


if(cur > b){
  first = stack[cur];

} else if(cur == 0){
first = stack[cur];

} else if(cur == -1){
/** error message **/

}

 return last; 
      
    }

/**Comprobar si está vacía (is\_empty) Verificar si la cola no tiene elementos.**/
public boolean isEmpty(){
  if(cur > b){
    flag = false;
  } else if(cur == 0){
    flag = false;

  } else if(cur == -1){
    flag = true;
  }

return flag;

  
}

/** Tamaño (size)  Obtener el número de elementos en la cola **/
public int size(){
  if(cur > 0) {

  total = size - cur;
    
  } else if(cur == 0){

  total = e;
    
  } 

  return total;
}


  
public static void main(String [] args){
  
}
}
