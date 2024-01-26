/* 1 */ package f;public final class AC0 { public final void ZW(ByteBuffer paramByteBuffer, DC0 paramDC01, DC0 paramDC02) { int i; a4[] arrayOfA4; int j; byte b; for (i = -1, j = (arrayOfA4 = this.KL).length, b = 0; b < j; ) { int k; if ((k = (arrayOfA4[b]).h) > i) i = k;  b++; }  paramDC01
/* 2 */       .else(paramByteBuffer, this.p9, paramDC02); paramDC02.else(paramByteBuffer, this.p9, null); cu0 cu0 = cu0.Fh; i = 0;
/*   */     
/* 4 */     for (Hc0 hc0 = this.p9.dA.r30(); hc0.hasNext(); ) { jk0 jk0 = (jk0)hc0.next(); this(new AB(jk0.Af0, jk0.Af0.TU(), i, true, false)); jk0.MO = texture; Texture texture; (texture = new Texture()).setFilter(cu0, cu0); }
/* 5 */      D8
/*   */       
/* 7 */       .getClass(); paramDC01.Ja(this.p9); paramDC02.Ja(this.p9); this.p9
/* 8 */       .v8 = null; }
/*   */ 
/*   */   
/*   */   public static final ik D8 = C00.gd(AC0.class);
/*   */   public final a4[] KL;
/*   */   public final int l00;
/*   */   public g p9;
/*   */   
/*   */   public AC0(int paramInt1, int paramInt2, s40 params40) {
/*   */     bw0 bw0;
/*   */     DC0 dC02 = Ww0(paramInt2, params40, dC01);
/*   */     this.l00 = dC01.CoM9();
/*   */     DC0 dC01;
/*   */     this.KL = new a4[dC02.CoM9() + (dC01 = Ww0(paramInt1, params40, null)).CoM9()];
/*   */     this();
/*   */     this.p9 = new g(Math.min(1024, I20.qa), Math.min(1024, I20.qa), Uc.xi0, 2, true, bw0);
/*   */     byte b;
/*   */     for (b = 0; b < dC01.CoM9(); b++)
/*   */       this.KL[b] = dC01.Ti0()[b]; 
/*   */     for (b = 0; b < dC02.CoM9(); b++)
/*   */       this.KL[dC01.CoM9() + b] = dC02.Ti0()[b]; 
/*   */     ZW(params40.pr(), dC01, dC02);
/*   */   }
/*   */   
/*   */   public static DC0 Ww0(int paramInt, s40 params40, DC0 paramDC0) {
/*   */     return new DC0(paramInt, params40, paramDC0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */