package gof.create.singleton;

class StaticBlock{
    private static StaticBlock instance;

    public StaticBlock(){

    }

    static{
        try {
            instance = new StaticBlock();
        }catch (Exception e){
            throw new RuntimeException("Exception happens on creating instance;");
        }
    }

    public static StaticBlock getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        String ref = super.toString().split("@")[1];
        return "I am " + ref + ", a static block singleton";
    }
}

public class StaticBlockSingleton {
    public static void main(String[] args) {
        StaticBlock staticBlock = StaticBlock.getInstance();
        System.out.println(staticBlock.toString());
        System.out.println(staticBlock);
    }
}
