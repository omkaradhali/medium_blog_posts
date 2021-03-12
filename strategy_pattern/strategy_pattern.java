interface IFlyBehavior {
  public void fly();
}

class NoFlyBehavior implements IFlyBehavior { 
  public void fly(){
    System.out.println("I can't fly. I prefer running");
  }
}

class FlyBehavior implements IFlyBehavior { 
  public void fly(){
    System.out.println("I can fly at super sonic speed.");
  }
}


public abstract class Superhero {
  IFlyBehavior flyBehavior;
  
  public void fly(){
    flyBehavior.fly();
  }
}

public class Batman Extends SuperHero {
  public Batman(){
    flyBehavior = new NoFlyBehavior();
  }
}

public class SuperHeroSimulator{
  public static void main(String[] args){
    SuperHero batman = new Batman();
    batman.fly();
  }
}