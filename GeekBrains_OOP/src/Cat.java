public class Cat extends Animal{
    String name;
    float MAX_JUMP_HEIGHT;
    float MAX_RUN_LENGTH;
    int APPETITE;
    boolean hungry;

    public static void main(String[] args) {
        Meal wiskas = new Meal(9);
        Animal[] Cats = new Animal[5];
        Cats[0] = new Cat("Matroskin",2, 200, 2);
        Cats[1] = new Cat("Pushok",2, 200, 4);
        Cats[2] = new Cat("Julka",2, 200, 1);
        Cats[3] = new Cat("Belyashik",2, 200, 3);
        Cats[4] = new Cat("Shavuha",2, 200, 6);
        for(int i =0; i < Cats.length; i++){
            Cats[i].eat(wiskas);
        }
    }

    public Cat(String _name, float _jump, float _run, int _appetite){
        name = _name;
        MAX_JUMP_HEIGHT = _jump;
        MAX_RUN_LENGTH = _run;
        APPETITE = _appetite;
        hungry = true;
    }

    @Override
    public boolean run(float length){
        boolean result = false;
        if(length <= MAX_RUN_LENGTH){
            result = true;
        }
        return result;
    }

    @Override
    public boolean swim(float length){
        return false;
    }

    @Override
    public boolean jump(float height){
        boolean result = false;
        if(height <= MAX_JUMP_HEIGHT){
            result = true;
        }
        return result;
    }

    public void eat(Meal cupOfMeal){
        if(APPETITE > cupOfMeal.getQuantity()){
            hungry = true;
            System.out.println(this.name+"'у мало еды в этой миске");
        }
        else {
            cupOfMeal.quantity = cupOfMeal.quantity - APPETITE;
            hungry = false;
            System.out.println(this.name+" сыт(а)");
        }
    }
}
