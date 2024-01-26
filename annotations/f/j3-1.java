/* 1 */ package f;public final class j3 extends PJ { public static void Ci(hm0[] paramArrayOfhm0, kf paramkf) { int i; byte b; for (i = paramArrayOfhm0.length, b = 0; b < i; ) { LV lV; Nh nh; hm0 hm01 = paramArrayOfhm0[b]; this(hm01); this((byte)0, nh); paramkf.YP
/* 2 */         .add(lV); b++; }  } public j3(byte paramByte, int[] paramArrayOfint, short[] paramArrayOfshort) { super(paramByte, paramArrayOfint, paramArrayOfshort); } private boolean KD0(hm0 paramhm0) { return (paramhm0 != null && !paramhm0.K0.AL() && a60(paramhm0.ih())); } public final byte YG0() { return -25; }
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     Gp0 gp0 = paramkf.AD;
/* 5 */     String str = ""; hm0[] arrayOfHm0; int i; if ((i = (arrayOfHm0 = (hm0[])Arrays.<hm0>stream(gp0.cl[this.uv]).filter(this::KD0).toArray(j3::j80)).length) != 1) { if (i != 2) { if (i == 3) { arrayOfString[0] = arrayOfHm0[0].coM1(); arrayOfString[1] = arrayOfHm0[1].coM1(); String[] arrayOfString; (arrayOfString = new String[3])[2] = arrayOfHm0[2].coM1(); String str1 = Ml0.Go(200519, Ml0.sB(200459, arrayOfString)); }  } else { arrayOfString[0] = arrayOfHm0[0].coM1(); String[] arrayOfString; (arrayOfString = new String[2])[1] = arrayOfHm0[1].coM1(); String str1 = Ml0.Go(200519, Ml0.sB(200458, arrayOfString)); }  } else { str = Ml0.Go(200518, arrayOfHm0[0].coM1()); }  Runnable runnable = zo0(arrayOfHm0, paramkf); paramkf
/* 6 */       .r00(str, "", this);
/*   */   }
/*   */   
/*   */   public final Runnable zo0(hm0[] paramArrayOfhm0, kf paramkf) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: aload_2
/*   */     //   2: <illegal opcode> run : ([Lf/hm0;Lf/kf;)Ljava/lang/Runnable;
/*   */     //   7: areturn
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */