package ch05;

public class Box<T> extends Item {
	private T contents;

	public Box() {
		this.contents = null;
	}

	// 넣다
	public void put(T item) {
		this.contents = item;
	}

	// 꺼내다
	public T take() {
		T item = this.contents;
		this.contents = null;
		return item;
	}

	public boolean isEmpty() {
		return this.contents == null;
	}

	public T count() {
		if (this.contents != null) {
			
		}
		return this.contents;
	}

	@Override
	public void doPrint() {
		if (this.contents != null) {
			System.out.println(this.contents + "를 넣으셨습니다.");
		}

	}

}
