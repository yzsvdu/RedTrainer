/* 1 */ package f;public final class LA0 extends zX { public final JG0 X9(io paramio, int paramInt) { lf lf = null; if (this.COM5 != null) { String str = this.e0;
/* 2 */       int i = this.cOM2; Jo jo = this.COM5; this(str, i, jo); } else if (this.U4 != null)
/* 3 */     { String str = this.e0;
/* 4 */       int i = this.cOM2; FV fV = this.U4; this(str, i, fV); }  if (lf != null) { String str1 = "headshot-menu-button"; String str2;
/* 5 */       if ((str2 = this.kn0) != null) { lf.Xu(str2); } else { lf.Xu(str1); }  lf
/*   */         
/* 7 */         .tW(paramio.Td0); Runnable runnable; if ((runnable = this.mq0) != null) lf.tW(this);  return lf; }  throw new JU("Missing player info data."); }
/*   */ 
/*   */   
/*   */   public Runnable mq0;
/*   */   public final int cOM2;
/*   */   public final Jo COM5;
/*   */   public final FV U4;
/*   */   
/*   */   public LA0(String paramString, Jo paramJo, Runnable paramRunnable) {
/*   */     super(paramString);
/*   */     boolean bool;
/*   */     this.COM5 = paramJo;
/*   */     this.U4 = null;
/*   */     if (km.XU()) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = true;
/*   */     } 
/*   */     this.cOM2 = bool;
/*   */     this.mq0 = paramRunnable;
/*   */   }
/*   */   
/*   */   public LA0(String paramString, FV paramFV, Runnable paramRunnable) {
/*   */     super(paramString);
/*   */     boolean bool;
/*   */     this.COM5 = null;
/*   */     this.U4 = paramFV;
/*   */     if (km.XU()) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = true;
/*   */     } 
/*   */     this.cOM2 = bool;
/*   */     this.mq0 = paramRunnable;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */