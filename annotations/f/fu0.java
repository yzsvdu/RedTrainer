package f;

public final class fu0 extends Thread {
  public fu0() {
    super("SleepFixer");
  }
  
  public final void run() {
    try {
      Thread.sleep(Long.MAX_VALUE);
    } catch (InterruptedException interruptedException) {
      null.printStackTrace();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fu0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */