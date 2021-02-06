package org.kodluyoruz;

public class Element<T> {
    private T element;
    private Element<T> elementType;

    public Element(T element){
        this.element = element;

    }
    public Element(Element<T> elementType){

        this.elementType = elementType;

    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Element<T> getElementType() {
        return elementType;
    }

    public void setElementType(Element<T> elementType) {
        this.elementType = elementType;
    }
}