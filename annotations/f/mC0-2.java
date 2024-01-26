/*  1 */ package f;public final class mC0 extends GS implements Np0 { public final short E50; public final byte T5; private void zl(hm0 paramhm01, kf paramkf, hm0 paramhm02) { if (km.wI0.K7 != null) { paramhm01
/*  2 */         .gG0((short)0); paramkf.oD(paramhm01).bd(); paramhm02.gG0(this.E50); paramkf.oD(paramhm02).bd(); }  } public final boolean oV; public mC0(short paramShort, boolean paramBoolean, byte paramByte) { this.T5 = paramByte; this.E50 = paramShort; this.oV = paramBoolean; } public final byte YG0() { return 23; } public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { short s; if ((s = this.E50) == -1) { paramkf.Kq(Ml0.Go(5006, paramhm01.fA())); }
/*    */     else
/*  4 */     { LV lV; EI0 eI0; LPT3 lPT3 = Of.eH.On0(s); hm0 hm01 = null, hm02 = null; byte b; if ((b = this.T5) != 0) if (b != 1) { paramhm02 = hm02; paramhm01 = hm01; } else { paramhm01 = paramhm02 = paramhm01; }   if (paramhm01 == null) return;  if (this.oV) { F40 f40 = F40.ef0; byte b1 = 14;
/*    */         
/*  6 */         int i = paramkf.AD.Q40(1057, paramhm01, paramhm02); arrayOfString[0] = paramhm01.fA(); String[] arrayOfString; (arrayOfString = new String[3])[1] = paramhm02.fA(); (new String[3])[2] = 
/*  7 */           Ml0.OH0(lPT3.Iu);
/*    */         
/*  9 */         String str = Ml0.lz((byte)2, this, b1, i, arrayOfString);
/* 10 */         Runnable runnable = wv(paramhm01, paramkf, paramhm02); paramkf.r00(this, "", runnable); this(paramhm01, paramhm02); this((byte)0, eI0);
/* 11 */         paramkf.YP.add(this); }
/* 12 */       else { F40 f40 = F40.ef0; byte b1 = 14;
/*    */         
/* 14 */         int i = paramkf.AD.Q40(1057, paramhm01, paramhm02); arrayOfString[0] = paramhm01.fA(); String[] arrayOfString; (arrayOfString = new String[3])[1] = paramhm02.fA(); (new String[3])[2] = 
/* 15 */           Ml0.OH0(((LPT3)eI0).Iu);
/*    */         
/* 17 */         String str = Ml0.lz((byte)2, this, b1, i, arrayOfString);
/* 18 */         Runnable runnable = super.wv(paramhm01, paramkf, paramhm02);
/* 19 */         paramkf.RV(this, "", runnable); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Runnable wv(hm0 paramhm01, kf paramkf, hm0 paramhm02) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_3
/*    */     //   2: aload_2
/*    */     //   3: aload_1
/*    */     //   4: <illegal opcode> run : (Lf/mC0;Lf/hm0;Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*    */     //   9: areturn
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */