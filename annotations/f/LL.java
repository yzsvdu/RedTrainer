/*  1 */ package f;public final class LL extends Na { public final JJ0 bL0 = new JJ0(this); public final DF Be0 = new DF(this); public final Jr0 jJ0 = new Jr0(this); public IG[] Xw = new IG[64]; public int Nb0; public qy0 Tn; public IG Vc; public LL() { this.nn0 = true; Uz().ch0("expandLeadRow", this::Fn, 1); Uz().ch0("collapseLeadRow", this::N2, 1); } private void N2() { boolean bool = false; int i; n8 n8; int j; if ((n8 = this.Wz0) != null && (
/*    */       
/*  3 */       i = n8.Ha.v2) >= 0 && i < (
/*  4 */       j = this.ge0)) if (i >= 0 && i < j)
/*  5 */       { bF0 bF0 = Oq0(i); IG iG;
/*  6 */         if ((iG = (IG)gy0.Hr0((gy0[])this.Xw, bF0)) == null)
/*  7 */         { IG iG1 = null; bF0 bF01; if ((bF01 = bF0.getParent()) != null) { iG1 = (IG)gy0.Hr0((gy0[])this.Xw, bF01); if (!kw && iG1 == null) throw new AssertionError();  }  this(this, bF0, iG1); int m = this.Nb0 + 1; this.Xw = arrayOfIG; int k; iG
/*  8 */             .FK0 = arrayOfIG[k = iG.ks & arrayOfIG.length - 1]; IG[] arrayOfIG; (arrayOfIG = (IG[])gy0.else((gy0[])this.Xw, m))[k] = iG; }  iG
/*  9 */           .vu(bool); }
/* 10 */       else { throw new IndexOutOfBoundsException("row"); }   } public LL(f8 paramf8) { this(); GU(paramf8); } public static boolean FH(IG paramIG) { boolean bool; while ((bool = paramIG.YD0) && (paramIG = paramIG.qD) != null); return bool; } public final boolean bi(IG paramIG) { IG iG1, iG2; while (paramIG.YD0 && (iG2 = paramIG.qD) != null) { int i = ((bF0)iG2.NF).S7((bF0)paramIG.NF); if (kw || iG2.cD0.NW == ((bF0)iG2.NF).ty0()) { int j; XJ0 xJ01 = iG2.cD0; XJ0 xJ02; if ((xJ02 = paramIG.cD0) != null) { j = xJ02.HK0(); } else { boolean bool; int k; if ((k = ((bF0)j.NF).ty0()) == 0) { bool = true; } else { bool = false; }  j.Pl = bool; j = k; }  xJ01.dy0(i, j + 1); iG1 = iG2; continue; }  throw new AssertionError(); }  this.ge0 = this.Vc.cD0.HK0(); return (iG1.qD == null); } public final String TI() { return "treetable"; } private void Fn() { boolean bool = true; n8 n8; int i, j; if ((n8 = this.Wz0) != null && (i = n8.Ha.v2) >= 0 && i < (j = this.ge0)) if (i >= 0 && i < j) { bF0 bF0 = Oq0(i); IG iG; if ((iG = (IG)gy0.Hr0((gy0[])this.Xw, bF0)) == null) { IG iG1 = null; bF0 bF01; if ((bF01 = bF0.getParent()) != null) { iG1 = (IG)gy0.Hr0((gy0[])this.Xw, bF01); if (!kw && iG1 == null) throw new AssertionError();  }  this(this, bF0, iG1); int m = this.Nb0 + 1; this.Xw = arrayOfIG; int k; iG.FK0 = arrayOfIG[k = iG.ks & arrayOfIG.length - 1]; IG[] arrayOfIG; (arrayOfIG = (IG[])gy0.else((gy0[])this.Xw, m))[k] = iG; }  iG.vu(bool); } else { throw new IndexOutOfBoundsException("row"); }   } public final void Xw(nY paramnY) { super.Xw(paramnY); Uz0(this.Be0); Uz0(this.jJ0); } public final int RM(bF0 parambF0) { bF0 bF01; byte b; bF0 bF02; int i; for (b = -1, bF02 = parambF0.getParent(), bF01 = parambF0, i = b, parambF0 = bF02; parambF0 != null; ) { IG iG; if ((iG = (IG)gy0.Hr0((gy0[])this.Xw, parambF0)) == null) return -1;  int j; if ((j = parambF0.S7(bF01)) < 0) return -1;  if (iG.cD0 == null) if (iG.YD0) { this(64); iG.cD0 = xJ0; xJ0.dG0 = 1; int k = ((bF0)iG.NF).ty0(); XJ0 xJ0; if ((xJ0 = new XJ0()).mE0.length < k) xJ0.mE0 = new int[k];  xJ0.NW = k; xJ0.kr(0, k); xJ0.em0(0, k); } else { return -1; }   j = iG.cD0.at(j) + 1 + i; bF0 bF04 = parambF0.getParent(), bF03 = parambF0; i = j; parambF0 = bF04; }  return i; } public final bF0 Oq0(int paramInt) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Vc : Lf/IG;
/*    */     //   4: astore_0
/*    */     //   5: aload_0
/*    */     //   6: getfield cD0 : Lf/XJ0;
/*    */     //   9: dup
/*    */     //   10: astore_2
/*    */     //   11: ifnonnull -> 46
/*    */     //   14: iload_1
/*    */     //   15: aload_0
/*    */     //   16: getfield NF : Ljava/lang/Object;
/*    */     //   19: checkcast f/bF0
/*    */     //   22: invokeinterface ty0 : ()I
/*    */     //   27: iconst_1
/*    */     //   28: isub
/*    */     //   29: iload_1
/*    */     //   30: invokestatic min : (II)I
/*    */     //   33: dup
/*    */     //   34: istore_1
/*    */     //   35: iconst_1
/*    */     //   36: iadd
/*    */     //   37: isub
/*    */     //   38: istore_2
/*    */     //   39: iload_2
/*    */     //   40: iload_1
/*    */     //   41: istore_2
/*    */     //   42: istore_1
/*    */     //   43: goto -> 69
/*    */     //   46: iload_1
/*    */     //   47: aload_0
/*    */     //   48: aload_2
/*    */     //   49: iload_1
/*    */     //   50: invokevirtual zn0 : (I)I
/*    */     //   53: istore_1
/*    */     //   54: getfield cD0 : Lf/XJ0;
/*    */     //   57: iload_1
/*    */     //   58: invokevirtual at : (I)I
/*    */     //   61: iconst_1
/*    */     //   62: iadd
/*    */     //   63: isub
/*    */     //   64: istore_2
/*    */     //   65: iload_2
/*    */     //   66: iload_1
/*    */     //   67: istore_2
/*    */     //   68: istore_1
/*    */     //   69: iload_1
/*    */     //   70: ifge -> 87
/*    */     //   73: aload_0
/*    */     //   74: getfield NF : Ljava/lang/Object;
/*    */     //   77: checkcast f/bF0
/*    */     //   80: iload_2
/*    */     //   81: invokeinterface ly : (I)Lf/bF0;
/*    */     //   86: areturn
/*    */     //   87: getstatic f/LL.kw : Z
/*    */     //   90: ifne -> 113
/*    */     //   93: aload_0
/*    */     //   94: getfield z4 : [Lf/IG;
/*    */     //   97: iload_2
/*    */     //   98: aaload
/*    */     //   99: ifnull -> 105
/*    */     //   102: goto -> 113
/*    */     //   105: new java/lang/AssertionError
/*    */     //   108: dup
/*    */     //   109: invokespecial <init> : ()V
/*    */     //   112: athrow
/*    */     //   113: aload_0
/*    */     //   114: getfield z4 : [Lf/IG;
/*    */     //   117: iload_2
/*    */     //   118: aaload
/*    */     //   119: astore_0
/* 10 */     //   120: goto -> 5 } public final Object mB0(int paramInt1, int paramInt2, bF0 parambF0) { if (parambF0 == null) parambF0 = Oq0(paramInt1);  return parambF0.JA(paramInt2); } public final xy0 SH(int paramInt1, int paramInt2, bF0 parambF0) { Object object; xy0 xy0; Jr0 jr0; if (parambF0 == null) parambF0 = Oq0(paramInt1);  if (paramInt2 == 0) { object = parambF0.JA(paramInt2); if (parambF0.fk()) { DF dF; byte b; for (dF = this.Be0, b = -2; parambF0 != null; ) { dF.getClass(); b++; parambF0 = parambF0.getParent(); }  dF.DV = b; dF.fv0 = xy0; if ((xy0 = dF.jb.kY(paramInt2, object)) != null) xy0.lk(object);  return this.Be0; }  IG iG; if ((iG = (IG)gy0.Hr0((gy0[])this.Xw, parambF0)) == null) { IG iG1 = null; bF0 bF01; if ((bF01 = parambF0.getParent()) != null) { iG1 = (IG)gy0.Hr0((gy0[])this.Xw, bF01); if (!kw && iG1 == null) throw new AssertionError();  }  this(this, parambF0, iG1); int j = this.Nb0 + 1; this.Xw = arrayOfIG; int i; iG.FK0 = arrayOfIG[i = iG.ks & arrayOfIG.length - 1]; IG[] arrayOfIG; (arrayOfIG = (IG[])gy0.else((gy0[])this.Xw, j))[i] = iG; }  (jr0 = this.jJ0).LJ = iG; jr0.fv0 = xy0; if ((xy0 = this.jJ0.jb.kY(xy0, object)) != null) xy0.lk(object);  jr0
/* 11 */         .DV = iG.oD0;
/* 12 */       return this.jJ0; }  return super.SH(object, xy0, (bF0)jr0); } public final Object HV(int paramInt1, int paramInt2) { bF0 bF0; if ((bF0 = Oq0(paramInt1)) != null) { oq(); return null; }  return null; } public final void x7(IG paramIG) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnull -> 109
/*    */     //   4: aload_0
/*    */     //   5: dup
/*    */     //   6: dup
/*    */     //   7: getfield Nb0 : I
/*    */     //   10: iconst_1
/*    */     //   11: isub
/*    */     //   12: putfield Nb0 : I
/*    */     //   15: getfield Xw : [Lf/IG;
/*    */     //   18: dup
/*    */     //   19: astore_2
/*    */     //   20: aload_1
/*    */     //   21: getfield ks : I
/*    */     //   24: aload_2
/*    */     //   25: arraylength
/*    */     //   26: iconst_1
/*    */     //   27: isub
/*    */     //   28: iand
/*    */     //   29: dup
/*    */     //   30: istore_3
/*    */     //   31: aaload
/*    */     //   32: dup
/*    */     //   33: astore #4
/*    */     //   35: aload_1
/*    */     //   36: if_acmpne -> 51
/*    */     //   39: aload_2
/*    */     //   40: aload #4
/*    */     //   42: getfield FK0 : Lf/gy0;
/*    */     //   45: iload_3
/*    */     //   46: swap
/*    */     //   47: aastore
/*    */     //   48: goto -> 71
/*    */     //   51: aload #4
/*    */     //   53: getfield FK0 : Lf/gy0;
/*    */     //   56: dup
/*    */     //   57: astore_2
/*    */     //   58: aload_1
/*    */     //   59: if_acmpne -> 103
/*    */     //   62: aload #4
/*    */     //   64: aload_2
/*    */     //   65: getfield FK0 : Lf/gy0;
/*    */     //   68: putfield FK0 : Lf/gy0;
/*    */     //   71: aload_1
/*    */     //   72: getfield z4 : [Lf/IG;
/*    */     //   75: dup
/*    */     //   76: astore_1
/*    */     //   77: ifnull -> 109
/*    */     //   80: aload_1
/*    */     //   81: arraylength
/*    */     //   82: istore_2
/*    */     //   83: iconst_0
/*    */     //   84: istore_3
/*    */     //   85: iload_3
/*    */     //   86: iload_2
/*    */     //   87: if_icmpge -> 109
/*    */     //   90: aload_0
/*    */     //   91: aload_1
/*    */     //   92: iload_3
/*    */     //   93: aaload
/*    */     //   94: invokevirtual x7 : (Lf/IG;)V
/*    */     //   97: iinc #3, 1
/*    */     //   100: goto -> 85
/*    */     //   103: aload_2
/*    */     //   104: astore #4
/*    */     //   106: goto -> 51
/*    */     //   109: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 21
/* 12 */     //   #2	-> 72 } public final void GU(f8 paramf8) { qy0 qy01; if ((qy01 = this.Tn) != null) { JJ0 jJ0 = this.bL0; ((Q00)qy01).PU = (JJ0[])hm.LL0(jJ0, (Object[])((Q00)qy01).PU); }  this.Qe0 = paramf8; this.Tn = paramf8; this.Xw = new IG[64]; this.Nb0 = 0; if (paramf8 != null) { JJ0 jJ0 = this.bL0; paramf8.PU = (JJ0[])hm.LpT6((Object[])paramf8.PU, jJ0, JJ0.class); this(this, paramf8, null); int k = this.Nb0 + 1; this.Xw = arrayOfIG; int j; iG.FK0 = arrayOfIG[j = iG.ks & arrayOfIG.length - 1]; IG[] arrayOfIG; (arrayOfIG = (IG[])gy0.else((gy0[])this.Xw, k))[j] = iG; this.Vc = iG; IG iG; (iG = new IG()).oD0 = -1; (new IG()).YD0 = true; this(64); iG.cD0 = xJ0; xJ0.dG0 = 1;
/* 13 */       int i = paramf8.ty0(); XJ0 xJ0;
/* 14 */       if ((xJ0 = new XJ0()).mE0.length < i) xJ0.mE0 = new int[i];  xJ0.NW = i; xJ0.kr(0, i); xJ0.em0(0, i); this
/*    */         
/* 16 */         .ge0 = this.Vc.cD0.HK0(); this.sm0 = 2; } else { this.Vc = null; this.ge0 = 0; this.sm0 = 0; }  yH0(); MJ0(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */