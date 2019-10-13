public class Cat extends Animal{
    float MAX_JUMP_HEIGHT;
    float MAX_RUN_LENGTH;

    public static void main(String[] args) {
        Animal cat1 = new Cat(2, 200);
        System.out.println(cat1.jump(1));
        System.out.println(cat1.run(200));
        System.out.println(cat1.swim(2));
    }

    public Cat(float _jump, float _run){
        MAX_JUMP_HEIGHT = _jump;
        MAX_RUN_LENGTH = _run;
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
}
