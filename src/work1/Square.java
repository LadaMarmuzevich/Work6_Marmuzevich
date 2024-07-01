package work1;
// Принцип подстановки Барбары Лисков
//В данном случае, создание отдельного класса Square с собственным методом setSide более логично и гибко, чем наследование от Rectangle.
// Это было сделано для того, чтобы Square и Rectangle были независимы и могли использоваться в разных контекстах без взаимных ограничений.

// Квадрат
public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
