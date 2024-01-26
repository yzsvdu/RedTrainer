/* 1 */ package f;public final class aS extends xk { public final boolean i2() { return 
/* 2 */       (zm0.u20 - this.Bx > 600L); }
/*   */ 
/*   */   
/*   */   public lpt1 lf0;
/*   */   public float ZC;
/*   */   public final long Bx = zm0.zg();
/*   */   public int i30;
/*   */   
/*   */   public aS(int paramInt) {
/*   */     this.i30 = paramInt;
/*   */   }
/*   */   
/*   */   public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     // Byte code:
/*   */     //   0: getstatic f/zm0.u20 : J
/*   */     //   3: aload_0
/*   */     //   4: getfield Bx : J
/*   */     //   7: lsub
/*   */     //   8: aload_0
/*   */     //   9: getfield i30 : I
/*   */     //   12: i2l
/*   */     //   13: lcmp
/*   */     //   14: ifge -> 18
/*   */     //   17: return
/*   */     //   18: aload_0
/*   */     //   19: getfield lf0 : Lf/lpt1;
/*   */     //   22: dup
/*   */     //   23: astore_3
/*   */     //   24: ifnull -> 59
/*   */     //   27: aload_1
/*   */     //   28: aload_0
/*   */     //   29: aload_3
/*   */     //   30: aload_0
/*   */     //   31: dup
/*   */     //   32: getfield ZC : F
/*   */     //   35: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   38: getfield Qy : F
/*   */     //   41: fadd
/*   */     //   42: dup
/*   */     //   43: fstore_0
/*   */     //   44: putfield ZC : F
/*   */     //   47: fload_0
/*   */     //   48: invokevirtual wP : (F)V
/*   */     //   51: getfield lf0 : Lf/lpt1;
/*   */     //   54: aload_2
/*   */     //   55: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   58: return
/*   */     //   59: aload_1
/*   */     //   60: aload_0
/*   */     //   61: dup
/*   */     //   62: dup2
/*   */     //   63: invokestatic vY : ()Lf/zp0;
/*   */     //   66: getfield RN : Lf/lpt1;
/*   */     //   69: invokevirtual ro0 : ()Lf/lpt1;
/*   */     //   72: dup
/*   */     //   73: astore_0
/*   */     //   74: putfield lf0 : Lf/lpt1;
/*   */     //   77: aload_0
/*   */     //   78: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   81: fload #4
/*   */     //   83: fload #6
/*   */     //   85: fload #5
/*   */     //   87: ldc 0.05
/*   */     //   89: fadd
/*   */     //   90: fstore_0
/*   */     //   91: ldc 0.05
/*   */     //   93: fadd
/*   */     //   94: fload_0
/*   */     //   95: swap
/*   */     //   96: invokevirtual gv0 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   99: pop
/*   */     //   100: getfield lf0 : Lf/lpt1;
/*   */     //   103: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   106: ldc 0.75
/*   */     //   108: ldc 0.75
/*   */     //   110: ldc 0.75
/*   */     //   112: invokevirtual GJ : (FFF)V
/*   */     //   115: getfield lf0 : Lf/lpt1;
/*   */     //   118: iconst_0
/*   */     //   119: iconst_0
/*   */     //   120: aconst_null
/*   */     //   121: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*   */     //   124: pop
/*   */     //   125: getfield lf0 : Lf/lpt1;
/*   */     //   128: aload_2
/*   */     //   129: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   132: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 0
/*   */     //   #2	-> 4
/*   */     //   #3	-> 32
/*   */     //   #4	-> 38
/*   */     //   #5	-> 44
/*   */     //   #6	-> 51
/*   */     //   #7	-> 66
/*   */     //   #8	-> 69
/*   */     //   #9	-> 121
/*   */     //   #10	-> 125
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */