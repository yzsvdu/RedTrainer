package f;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class cK0 extends ScheduledThreadPoolExecutor {
  public cK0(a00 parama00) {
    super(3, parama00);
  }
  
  public final void shutdown() {
    setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    super.shutdown();
  }
  
  public final void afterExecute(Runnable paramRunnable, Throwable paramThrowable) {
    super.afterExecute(paramRunnable, paramThrowable);
    Future<?> future;
    if ((future = (Future)paramRunnable).isDone())
      try {
        get();
      } catch (ExecutionException executionException) {
        (paramRunnable = Thread.currentThread()).getUncaughtExceptionHandler().uncaughtException((Thread)paramRunnable, getCause());
      } catch (InterruptedException interruptedException) {
      
      } catch (CancellationException cancellationException) {} 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */