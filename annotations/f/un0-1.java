/* 1 */ package f;public final class un0 extends GS implements Np0 { private void Bo(kf paramkf, hm0 paramhm0) { Wl wl = km.wI0.K7;
/* 2 */     Gp0 gp0 = paramkf.AD;
/*   */     hm0[] arrayOfHm0;
/*   */     int i;
/*   */     byte b;
/* 6 */     for (i = (arrayOfHm0 = gp0.cl[this.hU]).length, b = 0; b < i; ) { hm0 hm01; if ((hm01 = arrayOfHm0[b]) != null) { byte b1 = 0; byte[] arrayOfByte; while (b1 < (
/* 7 */           arrayOfByte = hm01.wt).length) { if (arrayOfByte[b1] > 0) arrayOfByte[b1] = 0;  b1++; }  if (this != null) this
/* 8 */             .LW
/* 9 */             .oD(paramhm0).Eh();  }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final byte hU;
/*   */   
/*   */   public un0(byte paramByte) {
/*   */     this.hU = paramByte;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 103;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: getstatic f/km.MR : Lf/Gp0;
/*   */     //   3: invokevirtual nI : ()B
/*   */     //   6: aload_0
/*   */     //   7: getfield hU : B
/*   */     //   10: if_icmpne -> 17
/*   */     //   13: iconst_1
/*   */     //   14: goto -> 18
/*   */     //   17: iconst_0
/*   */     //   18: ifeq -> 26
/*   */     //   21: ldc 200509
/*   */     //   23: goto -> 28
/*   */     //   26: ldc 200508
/*   */     //   28: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   31: astore_1
/*   */     //   32: aload #7
/*   */     //   34: aload_0
/*   */     //   35: aload #7
/*   */     //   37: aload_2
/*   */     //   38: <illegal opcode> run : (Lf/un0;Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
/*   */     //   43: astore_0
/*   */     //   44: aload_1
/*   */     //   45: ldc ''
/*   */     //   47: aload_0
/*   */     //   48: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   51: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 45
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/un0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */