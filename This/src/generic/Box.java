package generic;

public class Box<T extends Comparable<T>>{
private T item;

public Box(T item) {
	this.item=item;
}
public Box() {
	this(null);
}

public T getItem() {
	return item;
}
public void setItem(T item) {
	this.item=item;
}

@Override
public String toString() {
	return "Box [Item=" + item + "]";
}

@Override
public boolean equals(Object obj) {
	if(obj instanceof Box<?>) {
		Box<T> otherBox=(Box<T>) obj;
		return item.equals(otherBox.item);
	}else {
		return false;
	}
}
}
