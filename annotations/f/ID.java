/* 1 */ package f;public final class ID extends PJ { private void l1(kf paramkf, hm0 paramhm0, hm0[] paramArrayOfhm0) { this(paramhm0, true, paramArrayOfhm0); LV lV; nj nj; this((byte)0, nj); paramkf.YP
/* 2 */       .add(lV); int i; byte b;
/* 3 */     for (i = paramArrayOfhm0.length, b = 0; b < i; ) { dc0 dc0; hm01.tx(s); this(hm01, paramkf.oD(hm01)); paramkf
/* 4 */         .YP.add(dc0); hm0 hm01; short s;
/* 5 */       if ((s = dQ((hm01 = paramArrayOfhm0[b]).ih())) != -1 && s != hm01.XW() && hm01.K0.AL())
/* 6 */       { LV lV1; this(new ho(paramkf, hm01, true));
/* 7 */         paramkf.YP.add(lV1); }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public ID(byte paramByte, int[] paramArrayOfint, short[] paramArrayOfshort) {
/*   */     super(paramByte, paramArrayOfint, paramArrayOfshort);
/*   */   }
/*   */   
/*   */   private boolean oJ0(hm0 paramhm0) {
/*   */     return (paramhm0 != null && !paramhm0.K0.AL() && a60(paramhm0.ih()));
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return -24;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     Gp0 gp0 = paramkf.AD;
/*   */     String str = Ml0.OH0(200394);
/*   */     Runnable runnable = aj(paramkf, paramhm01, (hm0[])Arrays.<hm0>stream(gp0.cl[this.uv]).filter(this::oJ0).toArray(ID::TC));
/*   */     paramkf.RV(this, "", runnable);
/*   */   }
/*   */   
/*   */   public final Runnable aj(kf paramkf, hm0 paramhm0, hm0[] paramArrayOfhm0) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: aload_2
/*   */     //   3: aload_3
/*   */     //   4: <illegal opcode> run : (Lf/ID;Lf/kf;Lf/hm0;[Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   9: areturn
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */