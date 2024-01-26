/* 1 */ package f;public final class y2 extends GS implements Np0 { private void A0(Gp0 paramGp0) { cOm4[] arrayOfCOm4; int i; byte b; for (i = (arrayOfCOm4 = paramGp0.Xt0(this.gb0)).length, b = 0; b < i; ) { jd0 jd0; if ((jd0 = (this[b]).gc) != null) { jd0
/* 2 */           .ta
/*   */           
/* 4 */           .ok(jd0.hp0);
/* 5 */         boolean bool = false; jd0.ta
/*   */           
/* 7 */           .u0 = (byte)(jd0.ta.u0 | bool);
/* 8 */         jd0.pO(); }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final byte gb0;
/*   */   
/*   */   public y2(byte paramByte) {
/*   */     this.gb0 = paramByte;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 104;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload #7
/*   */     //   2: getfield AD : Lf/Gp0;
/*   */     //   5: dup
/*   */     //   6: astore_1
/*   */     //   7: invokevirtual hG0 : ()B
/*   */     //   10: aload_0
/*   */     //   11: getfield gb0 : B
/*   */     //   14: if_icmpne -> 22
/*   */     //   17: ldc 200504
/*   */     //   19: goto -> 24
/*   */     //   22: ldc 200505
/*   */     //   24: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   27: astore_2
/*   */     //   28: aload #7
/*   */     //   30: aload_0
/*   */     //   31: aload_1
/*   */     //   32: <illegal opcode> run : (Lf/y2;Lf/Gp0;)Ljava/lang/Runnable;
/*   */     //   37: astore_0
/*   */     //   38: aload_2
/*   */     //   39: ldc ''
/*   */     //   41: aload_0
/*   */     //   42: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   45: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 2
/*   */     //   #2	-> 7
/*   */     //   #3	-> 39
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */