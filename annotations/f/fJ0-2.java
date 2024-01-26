/* 1 */ package f;public final class fJ0 extends xk { public final boolean i2() { R30 r30; if ((r30 = this.Fk0) == null) return false;  int i = (int)(this.Ni / r30.aB); if (r30.Bs.length - 1 < i) { i = 1; } else { i = 0; }  return i; }
/*   */ 
/*   */   
/*   */   public R30 Fk0;
/*   */   public uT Mb;
/*   */   public float Ni;
/*   */   public final long yA0 = zm0.zg();
/*   */   public int h10;
/*   */   
/*   */   public fJ0(int paramInt) {
/*   */     this.h10 = paramInt;
/*   */   }
/*   */   
/*   */   public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     // Byte code:
/*   */     //   0: getstatic f/zm0.u20 : J
/*   */     //   3: aload_0
/*   */     //   4: getfield yA0 : J
/*   */     //   7: lsub
/*   */     //   8: aload_0
/*   */     //   9: getfield h10 : I
/*   */     //   12: i2l
/*   */     //   13: lcmp
/*   */     //   14: ifge -> 18
/*   */     //   17: return
/*   */     //   18: aload_0
/*   */     //   19: getfield Mb : Lf/uT;
/*   */     //   22: dup
/*   */     //   23: astore #7
/*   */     //   25: ifnull -> 93
/*   */     //   28: aload_1
/*   */     //   29: aload_0
/*   */     //   30: dup
/*   */     //   31: dup2
/*   */     //   32: aload #7
/*   */     //   34: aload_3
/*   */     //   35: dup
/*   */     //   36: getfield H : Lf/eo;
/*   */     //   39: astore_1
/*   */     //   40: getfield nj0 : Lf/eo;
/*   */     //   43: aload_1
/*   */     //   44: swap
/*   */     //   45: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   48: getfield Ni : F
/*   */     //   51: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   54: getfield Qy : F
/*   */     //   57: fadd
/*   */     //   58: dup
/*   */     //   59: fstore_1
/*   */     //   60: putfield Ni : F
/*   */     //   63: getfield Mb : Lf/uT;
/*   */     //   66: aload_0
/*   */     //   67: getfield Fk0 : Lf/R30;
/*   */     //   70: fload_1
/*   */     //   71: invokevirtual Hf : (F)Ljava/lang/Object;
/*   */     //   74: checkcast f/pe0
/*   */     //   77: astore_0
/*   */     //   78: getfield RC : Lf/O80;
/*   */     //   81: aload_0
/*   */     //   82: invokevirtual ID : (Lf/pe0;)V
/*   */     //   85: getfield Mb : Lf/uT;
/*   */     //   88: aload_2
/*   */     //   89: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   92: return
/*   */     //   93: aload_0
/*   */     //   94: aload_1
/*   */     //   95: aload_0
/*   */     //   96: dup
/*   */     //   97: dup2
/*   */     //   98: invokestatic vY : ()Lf/zp0;
/*   */     //   101: bipush #46
/*   */     //   103: iconst_2
/*   */     //   104: invokevirtual mF0 : (IB)[Lf/pe0;
/*   */     //   107: dup
/*   */     //   108: astore_1
/*   */     //   109: iconst_0
/*   */     //   110: aaload
/*   */     //   111: invokestatic AM : (Lf/pe0;)Lf/uT;
/*   */     //   114: dup
/*   */     //   115: astore #7
/*   */     //   117: fload #4
/*   */     //   119: fload #6
/*   */     //   121: fload #5
/*   */     //   123: aload_0
/*   */     //   124: aload #7
/*   */     //   126: putfield Mb : Lf/uT;
/*   */     //   129: ldc 0.05
/*   */     //   131: fadd
/*   */     //   132: fstore #4
/*   */     //   134: ldc 0.05
/*   */     //   136: fadd
/*   */     //   137: fload #4
/*   */     //   139: swap
/*   */     //   140: invokevirtual WQ : (FFF)V
/*   */     //   143: getfield Mb : Lf/uT;
/*   */     //   146: ldc 0.012
/*   */     //   148: invokevirtual zO : (F)V
/*   */     //   151: getfield Mb : Lf/uT;
/*   */     //   154: aload_3
/*   */     //   155: dup
/*   */     //   156: getfield H : Lf/eo;
/*   */     //   159: astore_3
/*   */     //   160: getfield nj0 : Lf/eo;
/*   */     //   163: aload_3
/*   */     //   164: swap
/*   */     //   165: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   168: getfield Mb : Lf/uT;
/*   */     //   171: getstatic f/Xi.WB : Z
/*   */     //   174: invokevirtual lM : (Z)V
/*   */     //   177: getfield Mb : Lf/uT;
/*   */     //   180: aload_2
/*   */     //   181: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   184: getfield Fk0 : Lf/R30;
/*   */     //   187: ifnonnull -> 212
/*   */     //   190: new f/R30
/*   */     //   193: dup
/*   */     //   194: aload_0
/*   */     //   195: swap
/*   */     //   196: dup
/*   */     //   197: ldc 0.125
/*   */     //   199: aload_1
/*   */     //   200: invokespecial <init> : (F[Ljava/lang/Object;)V
/*   */     //   203: putfield Fk0 : Lf/R30;
/*   */     //   206: getstatic f/Qb.Oe : Lf/Qb;
/*   */     //   209: putfield sI : Lf/Qb;
/*   */     //   212: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 0
/*   */     //   #2	-> 4
/*   */     //   #3	-> 48
/*   */     //   #4	-> 54
/*   */     //   #5	-> 60
/*   */     //   #6	-> 78
/*   */     //   #7	-> 82
/*   */     //   #8	-> 85
/*   */     //   #9	-> 209
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */