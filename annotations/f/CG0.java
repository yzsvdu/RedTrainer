/* 1 */ package f;public final class CG0 implements ThreadFactory { public final AtomicInteger FJ = new AtomicInteger(1); public static final AtomicInteger w60 = new AtomicInteger(1); public final String y80 = B40.df("GUI-")
/* 2 */     .append(w60.getAndIncrement()).append("-invokeAsync-").toString();
/*   */   
/*   */   public final Thread newThread(Runnable paramRunnable) {
/*   */     (new Thread(paramRunnable, this.y80 + this.FJ.getAndIncrement())).setDaemon(true);
/*   */     (new Thread(paramRunnable, this.y80 + this.FJ.getAndIncrement())).setPriority(5);
/*   */     return new Thread(paramRunnable, this.y80 + this.FJ.getAndIncrement());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */