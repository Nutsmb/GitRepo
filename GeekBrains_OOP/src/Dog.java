public class Dog extends Animal{
    float MAX_JUMP_HEIGHT;
    float MAX_RUN_LENGTH;
    float MAX_SWIM_LENGTH;

    public static void main(String[] args) {
        Animal dog1 = new Dog(0.5f, 500, 10);
        System.out.println(dog1.jump(1));
        System.out.println(dog1.run(200));
        System.out.println(dog1.swim(2));
    }

    public Dog(float _jump, float _run, float _swim){
        MAX_JUMP_HEIGHT = _jump;
        MAX_RUN_LENGTH = _run;
        MAX_SWIM_LENGTH = _swim;
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
        boolean result = false;
        if(length <= MAX_SWIM_LENGTH){
            result = true;
        }
        return result;
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
