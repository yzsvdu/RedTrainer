/* 1 */ package f;public final class iG0 extends Un { public final ia0 Ws0; public final s00 pP; public static void Pu(s00 params00, ia0 paramia0) { Un un; if (ia0.Ga0 == params00
/* 2 */       .c0 && (
/* 3 */       un = paramia0.Qh) != null)
/*   */     {
/*   */       
/* 6 */       hm.Fz0(un.TG0.oh0); }  } public final int YV; public iG0(ia0 paramia0, s00 params00, int paramInt) { // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: aload_0
/*   */     //   2: iload_3
/*   */     //   3: aload_0
/*   */     //   4: aload_2
/*   */     //   5: aload_0
/*   */     //   6: dup
/*   */     //   7: aload_1
/*   */     //   8: aload_0
/*   */     //   9: new java/lang/StringBuilder
/*   */     //   12: dup
/*   */     //   13: aload_2
/*   */     //   14: swap
/*   */     //   15: invokespecial <init> : ()V
/*   */     //   18: getfield c0 : Lf/LPT3;
/*   */     //   21: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   27: ldc ' x'
/*   */     //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   32: invokestatic getInstance : ()Ljava/text/NumberFormat;
/*   */     //   35: aload_2
/*   */     //   36: invokevirtual Qr0 : ()I
/*   */     //   39: i2l
/*   */     //   40: invokevirtual format : (J)Ljava/lang/String;
/*   */     //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   46: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   49: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   52: putfield Ws0 : Lf/ia0;
/*   */     //   55: ldc 'button'
/*   */     //   57: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   60: putfield pP : Lf/s00;
/*   */     //   63: putfield YV : I
/*   */     //   66: getfield c0 : Lf/LPT3;
/*   */     //   69: iconst_1
/*   */     //   70: invokevirtual default : (Z)Lf/dv;
/*   */     //   73: getstatic f/dv.wS : Lf/dv;
/*   */     //   76: if_acmpeq -> 84
/*   */     //   79: iconst_1
/*   */     //   80: istore_3
/*   */     //   81: goto -> 86
/*   */     //   84: iconst_0
/*   */     //   85: istore_3
/*   */     //   86: aload_0
/*   */     //   87: iload_3
/*   */     //   88: invokevirtual sk0 : (Z)V
/*   */     //   91: invokestatic Nr : ()Z
/*   */     //   94: ifeq -> 108
/*   */     //   97: aload_0
/*   */     //   98: aload_2
/*   */     //   99: aload_1
/*   */     //   100: <illegal opcode> run : (Lf/s00;Lf/ia0;)Ljava/lang/Runnable;
/*   */     //   105: invokevirtual tW : (Ljava/lang/Runnable;)V
/* 6 */     //   108: return } public final boolean i2(oa0 paramoa0) { int i; if ((i = paramoa0.cz0) == 10 || i == 5) ia0.Ga0 = this.pP.c0;  return super.i2(paramoa0); } public final void pm() { this.Ws0.l30.E1(rG0.Qb0(this.pP.c0, true, true)); this.Ws0.kt0 = this.YV; this.Ws0.BJ.TS.qt(new U70[] { wm0.y0.HR(this.pP.c0, false) }); this.Ws0.BJ
/* 7 */       .TS
/* 8 */       .tL(48, 48); this.Ws0
/* 9 */       .d40(); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */