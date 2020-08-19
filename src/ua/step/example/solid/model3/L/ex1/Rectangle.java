package ua.step.example.solid.model3.L.ex1;

/**
 * Класс прямоугольника - содержит длинны сторон 
 */
public class Rectangle {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return this.length * this.width;
	}

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}