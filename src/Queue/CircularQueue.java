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
public class CircularQueue <E> implements CQueue<E> {
      CircularlyLinkedList<E> list= new CircularlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E element) {
list.addLast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public void rotate() {
list.rotate();
    }
    
}
