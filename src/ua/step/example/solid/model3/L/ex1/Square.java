package ua.step.example.solid.model3.L.ex1;

/**
 * 
 * Квадрат - это всего лишь частный случай прямоугольника. Поэтому кажется
 * логичным унаследовать его от класса прямоугольник.
 *
 */
public class Square extends Rectangle {
//    double side;
//
//    public void setSide(double side) {
//        this.side = side;
//    }


        @Override
    public void setWidth(int width)
    {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(int length)
    {
        super.setLength(length);
        super.setWidth(length);
    }
}
