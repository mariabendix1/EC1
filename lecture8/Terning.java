import java.util.Random;

class Terning{
  Random rand = new Random();
  // default antalSider
  int antalSider;
  int slag;

  public Terning(){
    this.antalSider = 6;
  }

  public Terning(int antalSider){
    this.antalSider = antalSider;
  }

  void kast(){
    this.slag = rand.nextInt(this.antalSider) + 1;
  }

  int vaerdi(){
    return slag;
  }
}
