/*  1 */ package f;public final class SD0 extends BO { public int PP; public float kc0; public final void rH(AH0 paramAH0, Ym0 paramYm0, ls0 paramls0) { int i, j = paramAH0.Ze0(i = lPT6(paramYm0)); if (paramls0 != null) paramls0.Zc0(j, i);  } public float dZ; public float KJ0; public SD0(int paramInt) { super(paramInt); } public final void qJ(AH0 paramAH0, ls0 paramls0) { this.Ts = paramAH0.Ze0(2); this.PP = paramAH0.Ze0(2); if (this.K10 != 0 && paramls0 != null) { paramls0.Zc0(this.Ts, 2); paramls0.Zc0(this.PP, 2); }  } public final boolean cOM7(int paramInt, Va paramVa1, Va paramVa2) { if (this.K10 != 0) { float f1; int i; float f2 = this.ix[this.KN]; if (this.L9[0] == null) f2 = (f2 + this.UA0[0]) * this.K40[0];  if (paramInt == 0) { if ((paramInt = this.pL) <= 4) { f1 = f2 * this.Qp0; f2 *= this.kc0; } else if (f1 <= 8) { f1 = f2 * this.aP; f2 *= this.dZ; } else { f1 = f2 * this.jd0; f2 *= this.KJ0; }  i = this.nul; paramVa1.z0[i] = f1; paramVa2
/*    */           
/*  3 */           .z0[i] = f2; }
/*  4 */       else if (f1 == 1)
/*  5 */       { float f; int j; if ((j = this.pL) <= 4) { f = f2 * this.Qp0; } else if (f <= 8) { f = f2 * this.aP; } else { f = f2 * this.jd0; }  i = this.nul; i
/*  6 */           .z0[i] = f; }
/*    */       else
/*  8 */       { float f; int j; if ((j = this.pL) <= 4) { f = f2 * this.kc0; } else if (f <= 8) { f = f2 * this.dZ; } else { f = f2 * this.KJ0; }  i = this.nul; i
/*  9 */           .z0[i] = f; }
/*    */        }
/* 11 */      return (++this.KN == 3); }
/*    */ 
/*    */   
/*    */   public final void ai0(AH0 paramAH0, Ym0 paramYm0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield K10 : I
/*    */     //   4: ifeq -> 196
/*    */     //   7: aload_0
/*    */     //   8: dup
/*    */     //   9: aload_1
/*    */     //   10: aload_2
/*    */     //   11: invokespecial ai0 : (Lf/AH0;Lf/Ym0;)V
/*    */     //   14: getfield PP : I
/*    */     //   17: tableswitch default -> 48, 0 -> 156, 1 -> 118, 2 -> 89, 3 -> 51
/*    */     //   48: goto -> 196
/*    */     //   51: aload_0
/*    */     //   52: dup
/*    */     //   53: getstatic f/K30.dr0 : [F
/*    */     //   56: dup
/*    */     //   57: astore_2
/*    */     //   58: aload_1
/*    */     //   59: aload_0
/*    */     //   60: aload_2
/*    */     //   61: aload_1
/*    */     //   62: bipush #6
/*    */     //   64: invokevirtual Ze0 : (I)I
/*    */     //   67: faload
/*    */     //   68: putfield kc0 : F
/*    */     //   71: bipush #6
/*    */     //   73: invokevirtual Ze0 : (I)I
/*    */     //   76: faload
/*    */     //   77: dup
/*    */     //   78: fstore_0
/*    */     //   79: putfield KJ0 : F
/*    */     //   82: fload_0
/*    */     //   83: putfield dZ : F
/*    */     //   86: goto -> 196
/*    */     //   89: aload_0
/*    */     //   90: dup
/*    */     //   91: dup
/*    */     //   92: getstatic f/K30.dr0 : [F
/*    */     //   95: aload_1
/*    */     //   96: bipush #6
/*    */     //   98: invokevirtual Ze0 : (I)I
/*    */     //   101: faload
/*    */     //   102: dup
/*    */     //   103: fstore_0
/*    */     //   104: putfield KJ0 : F
/*    */     //   107: fload_0
/*    */     //   108: putfield dZ : F
/*    */     //   111: fload_0
/*    */     //   112: putfield kc0 : F
/*    */     //   115: goto -> 196
/*    */     //   118: aload_0
/*    */     //   119: getstatic f/K30.dr0 : [F
/*    */     //   122: dup
/*    */     //   123: astore_2
/*    */     //   124: aload_1
/*    */     //   125: aload_0
/*    */     //   126: dup
/*    */     //   127: aload_2
/*    */     //   128: aload_1
/*    */     //   129: bipush #6
/*    */     //   131: invokevirtual Ze0 : (I)I
/*    */     //   134: faload
/*    */     //   135: dup
/*    */     //   136: fstore_0
/*    */     //   137: putfield dZ : F
/*    */     //   140: fload_0
/*    */     //   141: putfield kc0 : F
/*    */     //   144: bipush #6
/*    */     //   146: invokevirtual Ze0 : (I)I
/*    */     //   149: faload
/*    */     //   150: putfield KJ0 : F
/*    */     //   153: goto -> 196
/*    */     //   156: aload_0
/*    */     //   157: getstatic f/K30.dr0 : [F
/*    */     //   160: dup
/*    */     //   161: astore_2
/*    */     //   162: aload_1
/*    */     //   163: aload_0
/*    */     //   164: aload_2
/*    */     //   165: aload_1
/*    */     //   166: aload_0
/*    */     //   167: aload_2
/*    */     //   168: aload_1
/*    */     //   169: bipush #6
/*    */     //   171: invokevirtual Ze0 : (I)I
/*    */     //   174: faload
/*    */     //   175: putfield kc0 : F
/*    */     //   178: bipush #6
/*    */     //   180: invokevirtual Ze0 : (I)I
/*    */     //   183: faload
/*    */     //   184: putfield dZ : F
/*    */     //   187: bipush #6
/*    */     //   189: invokevirtual Ze0 : (I)I
/*    */     //   192: faload
/*    */     //   193: putfield KJ0 : F
/*    */     //   196: return
/*    */   }
/*    */   
/*    */   public final boolean Pg0(AH0 paramAH0) {
/*    */     return super.Pg0(paramAH0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SD0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */