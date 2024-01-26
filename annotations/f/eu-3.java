/* 1 */ package f;public final class eu extends yp0 { public final void wL() { Dk0 dk0 = this.ZI0; String str = this.rh; this.R
/* 2 */       .add(new Rb(str)); }
/*   */ 
/*   */   
/*   */   public String rh;
/*   */   public Dk0 ZI0;
/*   */   public ArrayList Y3;
/*   */   
/*   */   public eu(String paramString, Dk0 paramDk0, Runnable... paramVarArgs) {
/*   */     this();
/*   */     this.Y3 = arrayList;
/*   */     this.rh = paramString;
/*   */     this.ZI0 = paramDk0;
/*   */     ArrayList<?> arrayList;
/*   */     (arrayList = new ArrayList()).addAll(Arrays.asList((Object[])paramVarArgs));
/*   */   }
/*   */   
/*   */   public final boolean Ie() {
/*   */     Iterator<Runnable> iterator = this.Y3.iterator();
/*   */     while (iterator.hasNext()) {
/*   */       Runnable runnable;
/*   */       if ((runnable = iterator.next()) != null)
/*   */         runnable.run(); 
/*   */     } 
/*   */     this.Y3.clear();
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final boolean xA0() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final int zE() {
/*   */     return 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */