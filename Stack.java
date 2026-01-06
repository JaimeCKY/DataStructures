public class Stack<V> {

V stack[];
V deleted;
V last;

public Stack(int s){

size = s;

b = 0;
e = size;

cur = e - 1;

stack = new stack[size];

deleted = null;
last = null;

flag = false;



}

/** Push Inserta un elemento en la parte superior de la pila.  **/
public void push(V v) {

if(cur > 0){

  stack[cur] = v;
  cur -= 1;

} else if(cur == 0){
  stack[cur] = v;
  cur = -1;
  
} else if(cur == -1){

/** error message **/
}
}
    
/** Pop  Elimina el elemento superior y lo devuelve.  **/
public V pop(){

if(cur > b){

deleted = stack[cur];
cur += 1;

} else if(cur == 0){

deleted = stack[cur];
cur = e;


} else if(cur == -1){
/** error message **/
}


return deleted;
}


/** Peek (o Top) Consulta el elemento superior sin eliminarlo.  **/
public V peek(){

if(cur > b){
  last = stack[cur];

} else if(cur == 0){
last = stack[cur];

} else if(cur == -1){
/** error message **/

}

 return last;   
}
/** isEmpty Comprueba si la pila está vacía.  **/
    
public void isEmpty(){

  if(cur > b){
    flag = false;
  } else if(cur == 0){
    flag = false;

  } else if(cur == -1){
    flage = true;
  }

return flag;
}


public static void main(String[] args){



}

}
