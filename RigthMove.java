public class RigthMove<V> {

int bg;
int en;

int cnt;
int next;
  
int size;
  
int disp;

V piece;
V[] moved;


  public RigthMove(){

    bg = 0;
    en = 0;

    cnt = 0;
    next = 0;

    size = 0;
    
    disp = 0;

    piece = null;
    moved = null;
    
  }

public void move(int begin, int end, V[] place){

bg = begin;
en = end;

disp = 0;
  
size = place.length;

moved = new V[size];

moved = place;

size = size - 1;

d0();
  
} 


  private void d0(){

  if(bg == 0){
    d1();
    
  } else if(bg > 0) {
    d1();
    
  } else if(bg < 0) {
    /** error message **/
    
  }
    

  }

  private void d1(){

  
  if(en < size) {
  
      if(bg < en) {
        d2();
        
      } else if(bg == en){
        d3();
        
      }
    
  } else if(en == size){
    /** no displace **/
  }
  
}

  private void d2(){

/**
*  0,1,2,3,4,5,6

    6 - 5 = 1
    6 - 2 = 4
  **/
    
  disp = size - en; 
  cnt = en;

  next = 0;
    
  while(cnt > bg){
    piece = moved[cnt];
    next = cnt + disp  
    moved[next] = piece;    
    cnt -= 1;    
    
  }    

    if(cnt == bg){
      piece = moved[cnt];
      next = cnt + disp  
      moved[next] = piece
    
    }
    
}
  
  private void d3(){

    disp = size - en;
    next = 0;  
    
    piece = moved[cnt];
    next = cnt + disp  
    moved[next] = piece;
    
  }

  public static void main(String [] args){

    
  }

  
}
