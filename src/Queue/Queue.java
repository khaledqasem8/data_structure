/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Msarat
 */
public interface Queue <E>{
     boolean isEmpty();
    int size();
    E first();
  void  enqueue(E element);
    E dequeue();
    
}
