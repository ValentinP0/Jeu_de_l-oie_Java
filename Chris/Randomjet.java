

import java.util.Random;
public class Randomjet {


    public int generate(){
        Random random = new Random();
        return 1+random.nextInt(6);
    }

    public int generate2(){
        Random random=new Random();
        return generate()+generate();
    }

}
