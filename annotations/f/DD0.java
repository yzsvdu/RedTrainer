/*    */ package f;public final class DD0 implements mX { public final tw OF0; public final vc0 jo0; public final xn0 LJ; public final OB[] b4; public final pRn iS; public final float Zm0; public DD0(DD0 paramDD0, pRn parampRn) { this.OF0 = paramDD0.OF0; this.jo0 = paramDD0.jo0; this.LJ = paramDD0.LJ; this.b4 = paramDD0.b4; this.Zm0 = paramDD0.Zm0; this.iS = parampRn; } public DD0(tw paramtw, Ii0 paramIi0) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_0
/*    */     //   2: invokespecial <init> : ()V
/*    */     //   5: invokevirtual xy : ()I
/*    */     //   8: iconst_1
/*    */     //   9: if_icmplt -> 258
/*    */     //   12: aload_2
/*    */     //   13: aload_0
/*    */     //   14: dup
/*    */     //   15: aload_2
/*    */     //   16: aload_0
/*    */     //   17: aload_1
/*    */     //   18: putfield OF0 : Lf/tw;
/*    */     //   21: invokevirtual VT : ()Lf/vc0;
/*    */     //   24: putfield jo0 : Lf/vc0;
/*    */     //   27: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   30: putfield iS : Lf/pRn;
/*    */     //   33: invokevirtual xy : ()I
/*    */     //   36: iconst_1
/*    */     //   37: if_icmpne -> 100
/*    */     //   40: aload_0
/*    */     //   41: dup
/*    */     //   42: dup
/*    */     //   43: aload_2
/*    */     //   44: iconst_0
/*    */     //   45: invokevirtual EI : (I)Lf/OB;
/*    */     //   48: invokevirtual N9 : ()Lf/pRn;
/*    */     //   51: astore_0
/*    */     //   52: getstatic f/xn0.LD : Lf/xn0;
/*    */     //   55: putfield LJ : Lf/xn0;
/*    */     //   58: iconst_2
/*    */     //   59: anewarray f/OB
/*    */     //   62: dup
/*    */     //   63: dup
/*    */     //   64: new f/OB
/*    */     //   67: dup
/*    */     //   68: astore_1
/*    */     //   69: fconst_0
/*    */     //   70: aload_0
/*    */     //   71: invokespecial <init> : (FLf/pRn;)V
/*    */     //   74: iconst_0
/*    */     //   75: aload_1
/*    */     //   76: aastore
/*    */     //   77: new f/OB
/*    */     //   80: dup
/*    */     //   81: astore_1
/*    */     //   82: fconst_1
/*    */     //   83: aload_0
/*    */     //   84: invokespecial <init> : (FLf/pRn;)V
/*    */     //   87: iconst_1
/*    */     //   88: aload_1
/*    */     //   89: aastore
/*    */     //   90: putfield b4 : [Lf/OB;
/*    */     //   93: fconst_1
/*    */     //   94: putfield Zm0 : F
/*    */     //   97: goto -> 257
/*    */     //   100: aload_2
/*    */     //   101: invokevirtual DS : ()Lf/xn0;
/*    */     //   104: getstatic f/xn0.Kb0 : Lf/xn0;
/*    */     //   107: if_acmpne -> 227
/*    */     //   110: aload_0
/*    */     //   111: aload_2
/*    */     //   112: invokevirtual xy : ()I
/*    */     //   115: dup
/*    */     //   116: istore_1
/*    */     //   117: aload_0
/*    */     //   118: getstatic f/xn0.Pw : Lf/xn0;
/*    */     //   121: putfield LJ : Lf/xn0;
/*    */     //   124: iconst_2
/*    */     //   125: imul
/*    */     //   126: iconst_1
/*    */     //   127: isub
/*    */     //   128: anewarray f/OB
/*    */     //   131: putfield b4 : [Lf/OB;
/*    */     //   134: iconst_0
/*    */     //   135: istore_3
/*    */     //   136: iload_3
/*    */     //   137: iload_1
/*    */     //   138: if_icmpge -> 158
/*    */     //   141: aload_0
/*    */     //   142: getfield b4 : [Lf/OB;
/*    */     //   145: iload_3
/*    */     //   146: aload_2
/*    */     //   147: iload_3
/*    */     //   148: invokevirtual EI : (I)Lf/OB;
/*    */     //   151: aastore
/*    */     //   152: iinc #3, 1
/*    */     //   155: goto -> 136
/*    */     //   158: iload_1
/*    */     //   159: aload_0
/*    */     //   160: dup
/*    */     //   161: getfield b4 : [Lf/OB;
/*    */     //   164: iload_1
/*    */     //   165: iconst_1
/*    */     //   166: isub
/*    */     //   167: aaload
/*    */     //   168: invokevirtual aM : ()F
/*    */     //   171: fconst_2
/*    */     //   172: fmul
/*    */     //   173: putfield Zm0 : F
/*    */     //   176: iconst_2
/*    */     //   177: isub
/*    */     //   178: istore_2
/*    */     //   179: iload_2
/*    */     //   180: iflt -> 257
/*    */     //   183: aload_0
/*    */     //   184: getfield b4 : [Lf/OB;
/*    */     //   187: dup
/*    */     //   188: astore_3
/*    */     //   189: iload_1
/*    */     //   190: new f/OB
/*    */     //   193: dup
/*    */     //   194: aload_0
/*    */     //   195: getfield Zm0 : F
/*    */     //   198: aload_3
/*    */     //   199: iload_2
/*    */     //   200: aaload
/*    */     //   201: invokevirtual aM : ()F
/*    */     //   204: fsub
/*    */     //   205: aload_0
/*    */     //   206: getfield b4 : [Lf/OB;
/*    */     //   209: iload_2
/*    */     //   210: aaload
/*    */     //   211: invokevirtual N9 : ()Lf/pRn;
/*    */     //   214: invokespecial <init> : (FLf/pRn;)V
/*    */     //   217: aastore
/*    */     //   218: iinc #1, 1
/*    */     //   221: iinc #2, -1
/*    */     //   224: goto -> 179
/*    */     //   227: aload_0
/*    */     //   228: aload_2
/*    */     //   229: aload_0
/*    */     //   230: aload_2
/*    */     //   231: invokevirtual DS : ()Lf/xn0;
/*    */     //   234: putfield LJ : Lf/xn0;
/*    */     //   237: invokevirtual jo0 : ()[Lf/OB;
/*    */     //   240: dup
/*    */     //   241: dup
/*    */     //   242: aload_0
/*    */     //   243: swap
/*    */     //   244: putfield b4 : [Lf/OB;
/*    */     //   247: arraylength
/*    */     //   248: iconst_1
/*    */     //   249: isub
/*    */     //   250: aaload
/*    */     //   251: invokevirtual aM : ()F
/*    */     //   254: putfield Zm0 : F
/*    */     //   257: return
/*    */     //   258: new java/lang/IllegalArgumentException
/*    */     //   261: dup
/*    */     //   262: ldc 'Need at least 1 stop for a gradient'
/*    */     //   264: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   267: athrow } public final mX rv0(pRn parampRn) { return new DD0(this, this.iS.o10(parampRn)); } public final int wu0() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield jo0 : Lf/vc0;
/*    */     //   4: getstatic f/vc0.C6 : Lf/vc0;
/*    */     //   7: if_acmpne -> 15
/*    */     //   10: iconst_1
/*    */     //   11: istore_1
/*    */     //   12: goto -> 17
/*    */     //   15: iconst_0
/*    */     //   16: istore_1
/*    */     //   17: iload_1
/*    */     //   18: ifeq -> 26
/*    */     //   21: iconst_1
/*    */     //   22: istore_0
/*    */     //   23: goto -> 42
/*    */     //   26: aload_0
/*    */     //   27: getfield b4 : [Lf/OB;
/*    */     //   30: dup
/*    */     //   31: arraylength
/*    */     //   32: iconst_1
/*    */     //   33: isub
/*    */     //   34: aaload
/*    */     //   35: getfield Bo : F
/*    */     //   38: invokestatic round : (F)I
/*    */     //   41: istore_0
/*    */     //   42: iload_0
/*    */     //   43: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 27
/*    */     //   #3	-> 35
/*  1 */     //   #4	-> 38 } public final int Vb() { boolean bool1; boolean bool2; if (this.jo0 == vc0.C6) { bool2 = true; } else { bool2 = false; }  if (bool2)
/*    */     
/*    */     { 
/*  4 */       bool1 = Math.round((this.b4[this.b4.length - 1]).Bo); } else { bool1 = true; }  return bool1; }
/*  5 */   public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { boolean bool; if (this.jo0 == vc0.C6) { bool = true; } else { bool = false; }  if (bool) { U80(paramInt3, paramInt4); } else { Fi(paramInt3, paramInt4); }  } public final void Gt0(uP paramuP, int paramInt1, int paramInt2) { boolean bool; if (this.jo0 == vc0.C6) { bool = true; } else { bool = false; }  if (bool) { U80(Math.round((this.b4[this.b4.length - 1]).Bo), 1); }
/*    */     
/*    */     else
/*    */     
/*  9 */     { Fi(1, Math.round((this.b4[this.b4.length - 1]).Bo)); }  } public final pe0 LPT8() { return null; } public final void U80(int paramInt1, int paramInt2) { OB[] arrayOfOB; C7 c72; if (paramInt1 <= 0 || paramInt2 <= 0) return;  C7 c71 = this.OF0.Ma; c71.getClass(); float f1 = this.iS.pT(), f2 = this.iS.bf(), f3 = this.iS.x3(), f4 = this.iS.Zg0(); if (c71.JJ == null) { C7 c7; this(c71); c71.JJ = c7; }  c71.prn *= f1; c71.cu0 *= f2; c71.ew0 *= f3; c71.JS *= f4; if (this.LJ == xn0.LD) { byte b; for (paramInt1 = (arrayOfOB = this.b4).length, b = 0; b < paramInt1; ) { c72.dJ0((this[b]).q3); b++; }  } else { float f = 0.0F; pRn pRn1 = (((DD0)super).b4[0]).q3; label29: do { OB[] arrayOfOB1; int i; byte b; for (i = (arrayOfOB1 = ((DD0)super).b4).length, b = 0; b < i; ) { pRn pRn2 = oB.q3; OB oB; if ((oB = arrayOfOB1[b]).Bo + f >= paramInt1) { pRn1
/* 10 */               .getClass(); pRn2.getClass(); break label29; }  c72
/* 11 */             .dJ0(pRn2); b++; pRn1 = pRn2; }  f += ((DD0)super).Zm0; } while (((DD0)super).LJ == xn0.Pw); }  } public final void Fi(int paramInt1, int paramInt2) { OB[] arrayOfOB; C7 c72; if (paramInt1 <= 0 || paramInt2 <= 0) return;  C7 c71 = this.OF0.Ma; c71.getClass(); float f1 = this.iS.pT(), f2 = this.iS.bf(), f3 = this.iS.x3(), f4 = this.iS.Zg0(); if (c71.JJ == null) { C7 c7; this(c71); c71.JJ = c7; }  c71.prn *= f1; c71.cu0 *= f2; c71.ew0 *= f3; c71.JS *= f4; if (this.LJ == xn0.LD) { for (int i = (arrayOfOB = this.b4).length; paramInt2 < i; ) { c72.dJ0((this[paramInt2]).q3); paramInt2++; }  } else { float f = 0.0F; pRn pRn1 = (((DD0)super).b4[0]).q3; label29: do { OB[] arrayOfOB1; int i; byte b; for (i = (arrayOfOB1 = ((DD0)super).b4).length, b = 0; b < i; ) { pRn pRn2 = oB.q3; OB oB; if ((oB = arrayOfOB1[b]).Bo + f >= paramInt2) { pRn1.getClass(); pRn2.getClass(); break label29; }  c72.dJ0(pRn2); b++; pRn1 = pRn2; }  f += ((DD0)super).Zm0; } while (((DD0)super).LJ == xn0.Pw); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */