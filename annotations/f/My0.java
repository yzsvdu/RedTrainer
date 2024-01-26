/*  1 */ package f;public final class My0 extends O0 { public final void qb0() { String str; LPT3 lPT3; super.qb0(); dQ dQ1; if ((dQ1 = this.jr) == null) return;  short s; if ((s = this.hC0) > 0)
/*    */     
/*    */     { 
/*  4 */       if (Ml0.OH0((lPT3 = Of.eH.On0(s)).Iu)
/*  5 */         .length() > 12) { this.jr
/*    */           
/*  7 */           .E1(Ml0.OH0(lPT3.Iu).substring(0, 12).trim() + "..."); } else { this.jr
/*    */           
/*  9 */           .E1(Ml0.OH0(lPT3.Iu)); }  str = rG0.kh0(lPT3); this.jr.Gq0(this); this.jr
/* 10 */         .jl = 150; } else { lPT3
/* 11 */         .E1(Ml0.OH0(61)); ((My0)super).jr.Gq0(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   public j40 JK;
/*    */   public dQ jr;
/*    */   
/*    */   public My0(Uc0 paramUc0, j40 paramj40, yj0 paramyj0, short paramShort) {
/*    */     super(paramShort, 0, (short)-1, (short)0, true);
/*    */     U00 u00;
/*    */     this.JK = paramj40;
/*    */     this.jr = paramyj0;
/*    */     qb0();
/*    */     this.gc = 6;
/*    */     this.x80 = 6;
/*    */     Xu("widget");
/*    */     this(this, paramUc0);
/*    */     bm0(u00);
/*    */   }
/*    */   
/*    */   public final void LPt2(byte paramByte, short paramShort1, short paramShort2) {
/*    */     throw null;
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnull -> 73
/*    */     //   4: aload_1
/*    */     //   5: getfield Bp0 : Lf/LPT3;
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: aload_0
/*    */     //   15: getstatic f/km.u4 : Lf/R8;
/*    */     //   18: astore_0
/*    */     //   19: getfield JK : Lf/j40;
/*    */     //   22: astore_2
/*    */     //   23: aload_0
/*    */     //   24: aload_2
/*    */     //   25: aload_1
/*    */     //   26: aload_2
/*    */     //   27: getfield Jg : I
/*    */     //   30: istore_0
/*    */     //   31: getfield Lh : Lf/nH0;
/*    */     //   34: getfield p1 : S
/*    */     //   37: istore_1
/*    */     //   38: getfield Zs : Lf/Q90;
/*    */     //   41: getfield COm1 : Lf/aq0;
/*    */     //   44: astore_2
/*    */     //   45: getfield e20 : Lf/c4;
/*    */     //   48: new f/zD
/*    */     //   51: dup
/*    */     //   52: iload_0
/*    */     //   53: iload_1
/*    */     //   54: aload_2
/*    */     //   55: invokespecial <init> : (ISLf/aq0;)V
/*    */     //   58: invokevirtual W3 : (Lf/Bi;)V
/*    */     //   61: getfield Lh : Lf/nH0;
/*    */     //   64: getfield Wy : I
/*    */     //   67: putfield Fc : I
/*    */     //   70: goto -> 130
/*    */     //   73: aload_0
/*    */     //   74: getfield JK : Lf/j40;
/*    */     //   77: dup
/*    */     //   78: astore_1
/*    */     //   79: ifnull -> 118
/*    */     //   82: aload_1
/*    */     //   83: getstatic f/km.u4 : Lf/R8;
/*    */     //   86: astore_2
/*    */     //   87: getfield Jg : I
/*    */     //   90: istore_3
/*    */     //   91: aload_2
/*    */     //   92: aload_1
/*    */     //   93: iconst_m1
/*    */     //   94: istore_1
/*    */     //   95: getfield Zs : Lf/Q90;
/*    */     //   98: getfield COm1 : Lf/aq0;
/*    */     //   101: astore_2
/*    */     //   102: getfield e20 : Lf/c4;
/*    */     //   105: new f/zD
/*    */     //   108: dup
/*    */     //   109: iload_3
/*    */     //   110: iload_1
/*    */     //   111: aload_2
/*    */     //   112: invokespecial <init> : (ISLf/aq0;)V
/*    */     //   115: invokevirtual W3 : (Lf/Bi;)V
/*    */     //   118: aload_0
/*    */     //   119: dup
/*    */     //   120: iconst_0
/*    */     //   121: iconst_0
/*    */     //   122: iconst_0
/*    */     //   123: invokespecial LPt2 : (BSS)V
/*    */     //   126: iconst_0
/*    */     //   127: putfield Fc : I
/*    */     //   130: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 5
/*    */     //   #2	-> 15
/*    */     //   #3	-> 27
/*    */     //   #4	-> 31
/*    */     //   #5	-> 34
/*    */     //   #6	-> 38
/*    */     //   #7	-> 41
/*    */     //   #8	-> 45
/*    */     //   #9	-> 48
/*    */     //   #10	-> 61
/*    */     //   #11	-> 64
/*    */     //   #12	-> 67
/*    */     //   #13	-> 87
/*    */     //   #14	-> 95
/*    */     //   #15	-> 98
/*    */     //   #16	-> 102
/*    */     //   #17	-> 105
/*    */     //   #18	-> 123
/*    */     //   #19	-> 127
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     uh0(36, 36);
/*    */     RI(36, 36);
/*    */     Tm(36, 36);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (paramoa0.Cz0() && paramoa0.cz0 == 4 && paramoa0.vl == 0 && (paramoa0.com8 & 0x24) != 0 && this.hC0 > 0 && this.JK != null) {
/*    */       Tm0(null);
/*    */       return true;
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/My0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */