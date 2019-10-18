public class Cat extends Animal{
    String name;
    float MAX_JUMP_HEIGHT;
    float MAX_RUN_LENGTH;
    int APPETITE;
    boolean hungry;

    public static void main(String[] args) {
        Animal cat1 = new Cat("Matroskin",2, 200, 10);
        System.out.println(cat1.jump(1));
        System.out.println(cat1.run(200));
        System.out.println(cat1.swim(2));
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

    public void eat(int cupOfMeal){
        if(APPETITE > cupOfMeal){
            hungry = true;
            System.out.println(this.name+"'у мало еды в этой миске");
        }
        else {
            cupOfMeal = cupOfMeal - APPETITE;
            hungry = false;
        }

    }
}
