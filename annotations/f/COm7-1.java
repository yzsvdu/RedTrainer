/* 1 */ package f;public final class COm7 implements ThreadFactory { public final Thread newThread(Runnable paramRunnable) { (new Thread(paramRunnable, B40.df("NetThread")
/* 2 */         .append(this.GD.getAndIncrement()).toString())).setDaemon(true); return new Thread(paramRunnable, B40.df("NetThread").append(this.GD.getAndIncrement()).toString()); }
/*   */ 
/*   */   
/*   */   public AtomicInteger GD;
/*   */   
/*   */   public COm7() {
/*   */     AtomicInteger atomicInteger;
/*   */     this();
/*   */     this.GD = this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COm7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */