package org.kodluyoruz;

public class Queue<T> {

    Element<T> first;
    Element<T> last;

    public synchronized void send(T element) {
        Element<T> node = new Element(element);

        if (first == null) {
            first = node;
            last = node;
        }
        else{
            last.setElementType(node);
            last = node;
        }
    }

    public T peek(){
        if(first != null){ first.getElement();}
        else
        {
            first= null;
        }
        return first.getElement();
    }
    public synchronized T poll(){
        T element = null;
        if(first != null){
            Element<T> node = first;
            first = first.getElementType();
            element = node.getElement();
        }
        return element;
    }
}