public class Stack<V> {

V last;

  
public Stack(int s){


}

/** Push Inserta un elemento en la parte superior de la pila.  **/
public void push(V v) {

 p0(); 
    

    
}

private void p0(){
  if(pos == e){
    p1();
    
  } else if(pos < e){
    p2();
    
  } else if(pos == b){
    
    
  }

  
}

private void p1(){

  if(cur == e){
    
    cur -= 1;
    
  } else if(cur > b){

    cur -= 1;
    
  } else if(cur == b){

    cur = -1;
    
  } else if(cur == -1){

	cur = -2;
	  
  /** error message **/
    
  }

  
}

  private void p2(){
    
  
,  ,  2,  4,  5,  8,  3,  ,  ,  ,
	      cur	       pos	  e
	      				mov = e - pos	
	      				while(pos != cur)
		      				stack[pos + mov]
		      				pos--
    


    
  }
  
  
    
/** Pop  Elimina el elemento superior y lo devuelve.  **/
public V pop(){

return deleted;
}


/** Peek (o Top) Consulta el elemento superior sin eliminarlo.  **/
public V peek(){

  
  return last;   
}
/** isEmpty Comprueba si la pila está vacía.  **/
    
public void isEmpty(){

 
return flag;
}


public static void main(String[] args){



}

}
