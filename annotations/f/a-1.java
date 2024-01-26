/*  1 */ package f;public class a extends Et0 { public Ny El; public boolean Q1; public ri0 qo0; public lPt4 Zo0; public boolean Jc0 = true; public a(Mw paramMw) { super(paramMw); w0(); H40((Ny)paramMw.Q1(Ny.class)); float f = DB0(); qp0(f, d6()); } public a(Mw paramMw, String paramString) { super(paramMw); w0(); H40((Ny)paramMw.Oz0(Ny.class, paramString)); float f = DB0(); qp0(f, d6()); } public a(eF0 parameF0, Mw paramMw, String paramString) { this(parameF0, (Ny)paramMw.Oz0(Ny.class, paramString)); } public final boolean Qf0() { lPt4 lPt41; if ((lPt41 = this.Zo0).lpt9);
/*  2 */     if (l > 
/*  3 */       System.currentTimeMillis()); this
/*  4 */       .PS = 0L; long l; return ((l = this.PS) <= 0L) ? false : false; } public a(eF0 parameF0, Ny paramNy) { w0(); X6(parameF0); H40(paramNy); float f = DB0(); qp0(f, d6()); } public a(Ny paramNy) { w0(); H40(paramNy); float f = DB0(); qp0(f, d6()); } public a() { w0(); } public a(ES paramES) { this(paramES, null, null); Ny ny; this(this); } public a(ES paramES1, ES paramES2) { this(paramES1, paramES2, null); Ny ny; this(this); } public a(ES paramES1, ES paramES2, ES paramES3) { this(paramES1, paramES2, paramES3); Ny ny; this(this); } public a(eF0 parameF0, Mw paramMw) { this(parameF0, (Ny)paramMw.Q1(Ny.class)); } public final void rh0(boolean paramBoolean1, boolean paramBoolean2) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Q1 : Z
/*    */     //   4: iload_1
/*    */     //   5: if_icmpne -> 9
/*    */     //   8: return
/*    */     //   9: aload_0
/*    */     //   10: getfield qo0 : Lf/ri0;
/*    */     //   13: dup
/*    */     //   14: astore_3
/*    */     //   15: ifnull -> 200
/*    */     //   18: aload_0
/*    */     //   19: aload_3
/*    */     //   20: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   23: pop
/*    */     //   24: getfield Q1 : Z
/*    */     //   27: iload_1
/*    */     //   28: if_icmpne -> 36
/*    */     //   31: iconst_0
/*    */     //   32: istore_3
/*    */     //   33: goto -> 195
/*    */     //   36: iload_1
/*    */     //   37: ifne -> 71
/*    */     //   40: aload_3
/*    */     //   41: getfield nT : Lf/fQ;
/*    */     //   44: dup
/*    */     //   45: astore #4
/*    */     //   47: getfield Z8 : I
/*    */     //   50: aload_3
/*    */     //   51: getfield Hd0 : I
/*    */     //   54: if_icmpgt -> 60
/*    */     //   57: goto -> 31
/*    */     //   60: aload #4
/*    */     //   62: aload_0
/*    */     //   63: iconst_1
/*    */     //   64: invokevirtual Ct : (Ljava/lang/Object;Z)Z
/*    */     //   67: pop
/*    */     //   68: goto -> 193
/*    */     //   71: aload_3
/*    */     //   72: getfield mU : I
/*    */     //   75: dup
/*    */     //   76: istore #4
/*    */     //   78: iconst_m1
/*    */     //   79: if_icmpeq -> 180
/*    */     //   82: aload_3
/*    */     //   83: getfield nT : Lf/fQ;
/*    */     //   86: getfield Z8 : I
/*    */     //   89: iload #4
/*    */     //   91: if_icmplt -> 180
/*    */     //   94: aload_3
/*    */     //   95: getfield ba0 : Z
/*    */     //   98: ifne -> 104
/*    */     //   101: goto -> 31
/*    */     //   104: iconst_0
/*    */     //   105: istore #4
/*    */     //   107: aload_0
/*    */     //   108: aload_3
/*    */     //   109: dup
/*    */     //   110: dup2
/*    */     //   111: getfield Hd0 : I
/*    */     //   114: istore #5
/*    */     //   116: iconst_0
/*    */     //   117: putfield Hd0 : I
/*    */     //   120: getfield rq : Lf/a;
/*    */     //   123: iload #5
/*    */     //   125: swap
/*    */     //   126: dup
/*    */     //   127: getfield Jc0 : Z
/*    */     //   130: iconst_0
/*    */     //   131: swap
/*    */     //   132: invokevirtual rh0 : (ZZ)V
/*    */     //   135: putfield Hd0 : I
/*    */     //   138: getfield Q1 : Z
/*    */     //   141: iload_1
/*    */     //   142: if_icmpne -> 148
/*    */     //   145: goto -> 31
/*    */     //   148: aload_3
/*    */     //   149: getfield nT : Lf/fQ;
/*    */     //   152: getfield Z8 : I
/*    */     //   155: aload_3
/*    */     //   156: getfield mU : I
/*    */     //   159: if_icmpge -> 165
/*    */     //   162: goto -> 180
/*    */     //   165: iload #4
/*    */     //   167: dup
/*    */     //   168: iconst_1
/*    */     //   169: iadd
/*    */     //   170: istore #4
/*    */     //   172: bipush #10
/*    */     //   174: if_icmple -> 107
/*    */     //   177: goto -> 31
/*    */     //   180: aload_3
/*    */     //   181: aload_0
/*    */     //   182: aload_3
/*    */     //   183: getfield nT : Lf/fQ;
/*    */     //   186: aload_0
/*    */     //   187: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   190: putfield rq : Lf/a;
/*    */     //   193: iconst_1
/*    */     //   194: istore_3
/*    */     //   195: iload_3
/*    */     //   196: ifne -> 200
/*    */     //   199: return
/*    */     //   200: iload_2
/*    */     //   201: aload_0
/*    */     //   202: iload_1
/*    */     //   203: putfield Q1 : Z
/*    */     //   206: ifeq -> 240
/*    */     //   209: aload_0
/*    */     //   210: ldc f/jj
/*    */     //   212: invokestatic vu0 : (Ljava/lang/Class;)Lf/Lc;
/*    */     //   215: invokevirtual obtain : ()Ljava/lang/Object;
/*    */     //   218: checkcast f/jj
/*    */     //   221: dup
/*    */     //   222: astore_2
/*    */     //   223: invokevirtual kZ : (Lf/V80;)Z
/*    */     //   226: ifeq -> 236
/*    */     //   229: aload_0
/*    */     //   230: iload_1
/*    */     //   231: iconst_1
/*    */     //   232: ixor
/*    */     //   233: putfield Q1 : Z
/*    */     //   236: aload_2
/*    */     //   237: invokestatic Lj0 : (Ljava/lang/Object;)V
/*    */     //   240: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 127
/*    */     //   #3	-> 132
/*    */     //   #4	-> 135
/*    */     //   #5	-> 203
/*    */     //   #6	-> 212
/*  4 */     //   #7	-> 218 } public final boolean fC() { lPt4 lPt41; if ((lPt41 = this.Zo0).sw || this.lpt9) return true;  } public void H40(Ny paramNy) { if (paramNy != null) { this.El = paramNy; NL(jM()); return; }  throw new IllegalArgumentException("style cannot be null."); } public final ES jM() { boolean bool; if (Qf0()) { ES eS1; if (this.Q1 && (eS1 = this.El.Ll) != null) return eS1;  if ((eS1 = this.El.LPT9) != null) return eS1;  }  if (fC()) if (this.Q1) { ES eS1; if ((eS1 = this.El.Us) != null) return eS1;  } else { ES eS1; if ((eS1 = this.El.Wo) != null) return eS1;  }
/*  5 */         Zy zy; if ((zy = this.ih0) != null && zy
/*  6 */       .re == this) { bool = true; } else { bool = false; }  if (this
/*  7 */       .Q1) { ES eS1; if (bool && (
/*  8 */         eS1 = this.El.Wa0) != null) return eS1;  if ((eS1 = this.El.sp) != null) return eS1;  if (fC() && (eS1 = this.El.Wo) != null) return eS1;  }  ES eS; return (bool && (eS = this.El.mK0) != null) ? eS : this.El.SB; } public void cD(JX paramJX, float paramFloat) { float f1, f2; boolean bool; kn0(); NL(jM()); if (Qf0()) { f1 = this.El.RY; f2 = this.El.mI0; } else if (this.Q1) { f1 = this.El.zk; f2 = this.El.wo; } else { f1 = this.El.TQ; f2 = this.El.Kn; }  int i; if ((i = f1 cmp 0.0F) != 0 || f2 != 0.0F) { bool = true; } else { bool = false; }  d10 d10 = this.sl0; if (bool) { byte b = 0; while (b < d10.Z8) { eF0 eF0 = (eF0)d10.get(b); if (i != 0 || f2 != 0.0F) { eF0.bs = eF0.bs + f1; eF0.kl += f2; } else { eF0.getClass(); }  b++; }  }  super.cD(paramJX, paramFloat); if (bool)
/*  9 */       for (byte b = 0; b < d10.Z8; ) { eF0 eF0 = (eF0)d10.get(b); float f4 = -f2; float f3; if ((f3 = -f1) != 0.0F || f4 != 0.0F) { eF0.bs = eF0.bs + f3; eF0.kl += f4; } else { eF0.getClass(); }  b++; }
/* 10 */         Zy zy; if ((zy = this.ih0) != null && zy
/* 11 */       .Pp && 
/* 12 */       Qf0() != this.Zo0
/* 13 */       .lpt9)
/* 14 */       UB0.M60
/* 15 */         .AW
/* 16 */         .df0();  }
/*    */ 
/*    */   
/*    */   public final float DB0() {
/*    */     float f = super.DB0();
/*    */     ES eS2;
/*    */     if ((eS2 = this.El.SB) != null)
/*    */       f = Math.max(f, ((uB)eS2).uz); 
/*    */     if ((eS2 = this.El.LPT9) != null)
/*    */       f = Math.max(f, ((uB)eS2).uz); 
/*    */     ES eS1;
/*    */     if ((eS1 = this.El.sp) != null)
/*    */       f = Math.max(f, ((uB)this).uz); 
/*    */     return f;
/*    */   }
/*    */   
/*    */   public final float d6() {
/*    */     float f = super.d6();
/*    */     ES eS2;
/*    */     if ((eS2 = this.El.SB) != null)
/*    */       f = Math.max(f, ((uB)eS2).B90); 
/*    */     if ((eS2 = this.El.LPT9) != null)
/*    */       f = Math.max(f, ((uB)eS2).B90); 
/*    */     ES eS1;
/*    */     if ((eS1 = this.El.sp) != null)
/*    */       f = Math.max(f, ((uB)this).B90); 
/*    */     return f;
/*    */   }
/*    */   
/*    */   public final float OI() {
/*    */     return DB0();
/*    */   }
/*    */   
/*    */   public final float Mb() {
/*    */     return d6();
/*    */   }
/*    */   
/*    */   public final void w0() {
/*    */     this.iG0 = i80.s0;
/*    */     this(this);
/*    */     lPt4 lPt41;
/*    */     this.Zo0 = new lPt4();
/*    */     Na0(lPt41);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */