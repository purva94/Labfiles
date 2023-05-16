class RubberDuck implements SwimBehaviour,QuackBehaviour{
  public void swim(){
    System.out.println("Rubber Duck is swimming");
  }
  public void quack(){
    System.out.println("Rubber Duck is quaking");
  }
}

class WoodenDuck implements SwimBehaviour{
  public void swim(){
    System.out.println("Wooden Duck is swimming");
  }
}

class RedHeadDuck implements SwimBehaviour,FlyBehaviour,QuackBehaviour{
  public void swim(){
    System.out.println("Red Head Duck is swimming");
  }
  public void fly(){
    System.out.println("Red Head Duck is flying");
  }
  public void quack(){
    System.out.println("Red Head Duck is quaking");
  }
}

class LakeDuck implements SwimBehaviour,FlyBehaviour,QuackBehaviour{
  public void swim(){
    System.out.println("Lake Duck is swimming");
  }
  public void fly(){
    System.out.println("Lake Duck is flying");
  }
  public void quack(){
    System.out.println("Lake Duck is quaking");
  }
}