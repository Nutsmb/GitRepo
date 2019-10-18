public class Meal {
    final int VOLUME;
    public int quantity;

    public Meal(int volume) {
        VOLUME = volume;
        fill();
    }

    public static void main(String[] args) {

    }

    public void fill(){
        quantity = VOLUME;
    }

    public int getQuantity(){
        return quantity;
    }
}
