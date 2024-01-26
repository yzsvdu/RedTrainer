/* 1 */ package f;public final class wc { public final Vp0 Hl0; public final short Lk; public final String bG; public short Wk0 = -1; public final short[][] Am0; public int is; public X9[][] Mv; public Ua[] tX; public wc(Vp0 paramVp0, short paramShort, String paramString, int paramInt1, short[][] paramArrayOfshort, int paramInt2) { this.Hl0 = paramVp0; this.Lk = paramShort; this.bG = paramString; this.Am0 = paramArrayOfshort; this.is = paramInt1 & 0xFFFFDF1F; this.Mv = new X9[paramInt2][]; for (byte b = 0; b < paramInt2; b++) this.Mv[b] = new X9[3];  if (l9(4)) this.Wk0 = F10();  } public final short F10() { Vp0 vp0; short s; if ((vp0 = this.Hl0) == Vp0.bG && (s = this.Lk) > 255) { if (s < 496) return (short)(s - 256 + 4576);  throw new RuntimeException("Allocate new range"); }  char c = 'ߐ';
/* 2 */     return (short)(vp0.gw0 * 256 + c + this.Lk); } public final short Zj() { return this.Lk; } public final Vp0 bk0() { return this.Hl0; } public final short uJ() { return this.Wk0; } public final X9 ml(lPT9 paramlPT9) { return this.Mv[0][paramlPT9.nV]; } public final boolean XF0() { return ((this.is & 0x10) != 0); } public final boolean aW() { return (this.Hl0 == Vp0.K7 && this.Lk < 2) ? true : (((this.is & 0x400) != 0)); } public final byte mv0() { int i; return (((i = this.is) & 0x1) != 0) ? 0 : (((i & 0x2) != 0) ? 1 : -1); } public final boolean l9(int paramInt) { return ((this.is & paramInt) != 0); } public final boolean th0(float paramFloat) { R30 r30; boolean bool = true; Ua ua; if ((ua = this.tX[bool]) == null) { ua = null; } else { r30 = this.kg0; }  if (this != null)
/* 3 */     { int i = (int)(paramFloat / this.aB); if (this.Bs.length - 1 < i) { i = 1; } else { i = 0; }  return i; }  return false; }
/*   */ 
/*   */   
/*   */   public final X9 Ra0(lPT9 paramlPT9, boolean paramBoolean, float paramFloat) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield tX : [Lf/Ua;
/*   */     //   4: iload_2
/*   */     //   5: aaload
/*   */     //   6: dup
/*   */     //   7: astore #4
/*   */     //   9: ifnonnull -> 18
/*   */     //   12: aconst_null
/*   */     //   13: astore #4
/*   */     //   15: goto -> 25
/*   */     //   18: aload #4
/*   */     //   20: getfield kg0 : Lf/R30;
/*   */     //   23: astore #4
/*   */     //   25: aload #4
/*   */     //   27: iconst_0
/*   */     //   28: istore #5
/*   */     //   30: ifnull -> 158
/*   */     //   33: iload_2
/*   */     //   34: iconst_1
/*   */     //   35: ixor
/*   */     //   36: dup
/*   */     //   37: istore_2
/*   */     //   38: aload #4
/*   */     //   40: getfield sI : Lf/Qb;
/*   */     //   43: astore #5
/*   */     //   45: ifeq -> 88
/*   */     //   48: aload #5
/*   */     //   50: getstatic f/Qb.Oe : Lf/Qb;
/*   */     //   53: dup
/*   */     //   54: astore #6
/*   */     //   56: if_acmpeq -> 67
/*   */     //   59: aload #5
/*   */     //   61: getstatic f/Qb.YF0 : Lf/Qb;
/*   */     //   64: if_acmpne -> 88
/*   */     //   67: aload #5
/*   */     //   69: aload #6
/*   */     //   71: if_acmpne -> 77
/*   */     //   74: goto -> 127
/*   */     //   77: aload #4
/*   */     //   79: getstatic f/Qb.qo : Lf/Qb;
/*   */     //   82: putfield sI : Lf/Qb;
/*   */     //   85: goto -> 135
/*   */     //   88: iload_2
/*   */     //   89: ifne -> 135
/*   */     //   92: aload #5
/*   */     //   94: getstatic f/Qb.Oe : Lf/Qb;
/*   */     //   97: if_acmpeq -> 135
/*   */     //   100: aload #5
/*   */     //   102: getstatic f/Qb.YF0 : Lf/Qb;
/*   */     //   105: dup
/*   */     //   106: astore_2
/*   */     //   107: if_acmpeq -> 135
/*   */     //   110: aload #5
/*   */     //   112: getstatic f/Qb.qo : Lf/Qb;
/*   */     //   115: if_acmpne -> 127
/*   */     //   118: aload #4
/*   */     //   120: aload_2
/*   */     //   121: putfield sI : Lf/Qb;
/*   */     //   124: goto -> 135
/*   */     //   127: aload #4
/*   */     //   129: getstatic f/Qb.RW : Lf/Qb;
/*   */     //   132: putfield sI : Lf/Qb;
/*   */     //   135: aload #4
/*   */     //   137: aload #5
/*   */     //   139: aload #4
/*   */     //   141: fload_3
/*   */     //   142: invokevirtual Hf : (F)Ljava/lang/Object;
/*   */     //   145: astore_2
/*   */     //   146: putfield sI : Lf/Qb;
/*   */     //   149: aload_2
/*   */     //   150: checkcast java/lang/Byte
/*   */     //   153: invokevirtual byteValue : ()B
/*   */     //   156: istore #5
/*   */     //   158: iload #5
/*   */     //   160: ifeq -> 178
/*   */     //   163: aload_0
/*   */     //   164: getfield Mv : [[Lf/X9;
/*   */     //   167: iload #5
/*   */     //   169: aaload
/*   */     //   170: aload_1
/*   */     //   171: getfield nV : I
/*   */     //   174: aaload
/*   */     //   175: invokevirtual st0 : ()V
/*   */     //   178: aload_0
/*   */     //   179: getfield Mv : [[Lf/X9;
/*   */     //   182: iload #5
/*   */     //   184: aaload
/*   */     //   185: aload_1
/*   */     //   186: getfield nV : I
/*   */     //   189: aaload
/*   */     //   190: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 20
/*   */     //   #3	-> 40
/*   */     //   #4	-> 150
/*   */     //   #5	-> 171
/*   */     //   #6	-> 174
/*   */     //   #7	-> 186
/*   */     //   #8	-> 189
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */