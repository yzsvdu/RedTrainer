/* 1 */ package f;public final class uJ0 extends Kl0 { public final void Dl0() { if (this.HO == cG.c60) UB0.Kg0.K7 = false; 
/* 2 */     (r8())
/* 3 */       .uk = this.HO; }
/*   */ 
/*   */   
/*   */   public cG HO;
/*   */   
/*   */   public uJ0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void sM() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   4: invokevirtual get : ()B
/*   */     //   7: istore_1
/*   */     //   8: getstatic f/cG.LPt5 : [Lf/cG;
/*   */     //   11: dup
/*   */     //   12: astore_2
/*   */     //   13: arraylength
/*   */     //   14: istore_3
/*   */     //   15: iconst_0
/*   */     //   16: istore #4
/*   */     //   18: iload #4
/*   */     //   20: iload_3
/*   */     //   21: if_icmpge -> 47
/*   */     //   24: aload_2
/*   */     //   25: iload #4
/*   */     //   27: aaload
/*   */     //   28: dup
/*   */     //   29: astore #5
/*   */     //   31: getfield Pz : B
/*   */     //   34: iload_1
/*   */     //   35: if_icmpne -> 41
/*   */     //   38: goto -> 52
/*   */     //   41: iinc #4, 1
/*   */     //   44: goto -> 18
/*   */     //   47: getstatic f/cG.yc : Lf/cG;
/*   */     //   50: astore #5
/*   */     //   52: aload_0
/*   */     //   53: aload #5
/*   */     //   55: putfield HO : Lf/cG;
/*   */     //   58: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 8
/*   */     //   #3	-> 55
/*   */   }
/*   */   
/*   */   public final void Cx() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */