package f;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class A1 implements gL0 {
  public static final ik wu0 = C00.gd(A1.class);
  
  public static A1 L7 = new A1();
  
  public cK0 nc;
  
  public static A1 H() {
    return L7;
  }
  
  public A1() {
    cK0 cK01;
    a00 a00;
    this();
    this(a00);
    this.nc = this;
  }
  
  public final ScheduledFuture ac0(Runnable paramRunnable, long paramLong) {
    if (paramLong < 0L)
      paramLong = 0L; 
    try {
      TimeUnit timeUnit = TimeUnit.MILLISECONDS;
      return this.nc.schedule(paramRunnable, paramLong, this);
    } catch (RejectedExecutionException rejectedExecutionException) {
      return null;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */