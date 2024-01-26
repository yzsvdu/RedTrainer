/*    */ package f;public final class vi extends zX { public final JG0 X9(io paramio, int paramInt) {
/*  2 */     this(this.e0); Fy0 fy0; zh0 zh01; if ((zh01 = this.KV) != null) fy0
/*  3 */         .As
/*  4 */         .sm(new zh0[] { zh01 });  U70 u70; if ((u70 = this.W20) != null) fy0
/*  5 */         .As
/*  6 */         .qt(new U70[] { u70 });  Texture texture; if ((texture = this.uH0) != null) fy0
/*  7 */         .As
/*  8 */         .Yo(new Texture[] { texture });  int j; fy0
/*  9 */       .As
/* 10 */       .zT(this.aI0 * (j = this.pL), this.Sg * j); String str1 = "sprite-menu-button"; String str2;
/* 11 */     if ((str2 = this.kn0) != null) { fy0.Xu(str2); } else { fy0.Xu(str1); }
/* 12 */      int i, k; if ((i = this.FD) != 0 && (k = this.oi) != 0)
/*    */     
/* 14 */     { k = i * (i = this.pL); fy0.As.tL(k, k * i); }
/* 15 */     else { fy0.As
/*    */         
/* 17 */         .V1 = this.pL; }  Runnable runnable2; if (this
/* 18 */       .Ml && (runnable2 = this.U6) != null) fy0.tW(runnable2);  fy0
/*    */       
/* 20 */       .tW(paramio.Td0); Runnable runnable1; if (!this.Ml && (runnable1 = this.U6) != null) fy0.tW(this);  return fy0;
/*    */   }
/*    */   
/*    */   public Runnable U6;
/*    */   public final int aI0;
/*    */   public final int Sg;
/*    */   public zh0 KV;
/*    */   public U70 W20;
/*    */   public Texture uH0;
/*    */   public final int FD;
/*    */   public final int oi;
/*    */   public int pL;
/*    */   public boolean Ml;
/*    */   
/*    */   public vi(String paramString, Texture paramTexture, Runnable paramRunnable) {
/*    */     super(paramString);
/*    */     boolean bool;
/*    */     if (km.XU()) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = true;
/*    */     } 
/*    */     this.pL = bool;
/*    */     this.Ml = false;
/*    */     this.uH0 = paramTexture;
/*    */     this.U6 = paramRunnable;
/*    */     this.aI0 = 0;
/*    */     this.Sg = 0;
/*    */     this.FD = 32;
/*    */     this.oi = 32;
/*    */   }
/*    */   
/*    */   public vi(String paramString, zh0 paramzh0, Runnable paramRunnable) {
/*    */     this(paramString, paramzh0, -6, 0, 0, paramRunnable);
/*    */   }
/*    */   
/*    */   public vi(String paramString, zh0 paramzh0, int paramInt1, int paramInt2, int paramInt3, Runnable paramRunnable) {
/*    */     super(paramString);
/*    */     boolean bool3;
/*    */     if (km.XU()) {
/*    */       bool3 = true;
/*    */     } else {
/*    */       bool3 = true;
/*    */     } 
/*    */     this.pL = bool3;
/*    */     this.KV = paramzh0;
/*    */     this.aI0 = bool1;
/*    */     this.Sg = paramInt1;
/*    */     this.U6 = paramRunnable;
/*    */     this.Ml = bool2;
/*    */     this.FD = paramInt2;
/*    */     this.oi = paramInt3;
/*    */   }
/*    */   
/*    */   public vi(String paramString, U70 paramU70, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Runnable paramRunnable, boolean paramBoolean) {
/*    */     super(paramString);
/*    */     boolean bool;
/*    */     if (km.XU()) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = true;
/*    */     } 
/*    */     this.pL = bool;
/*    */     this.W20 = paramU70;
/*    */     this.aI0 = paramInt1;
/*    */     this.Sg = paramInt2;
/*    */     this.U6 = paramRunnable;
/*    */     this.Ml = paramBoolean;
/*    */     this.FD = paramInt3;
/*    */     this.oi = paramInt4;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */