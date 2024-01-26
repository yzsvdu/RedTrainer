/* 1 */ package f;public final class sj0 implements Iterable, Iterator { public boolean DF; public final lm Qm; public int D5; public int lF0; public boolean KJ0; public final wD TR; public sj0(lm paramlm) { wD wD1; this.KJ0 = true; this.Qm = paramlm; uq();
/* 2 */     this(); this.TR = this; } public final void FW() { int i; lm lm1; if ((i = this.lF0) == -1 && (lm1 = this.Qm).pE0) { lm1.pE0 = false; } else if (i >= 0) { int[] arrayOfInt1; int[] arrayOfInt2; int j; int k; int m; for (arrayOfInt1 = this.Qm.HP, arrayOfInt2 = this.Qm.Fn, j = this.Qm.cs0, k = i + 1 & j; (m = arrayOfInt1[k]) != 0; ) { lm lm2 = this.Qm; int n; if ((k - (n = (int)(m * -7046029254386353131L >>> lm2.mb0)) & j) > (i - n & j)) { arrayOfInt1[i] = m; arrayOfInt2[i] = arrayOfInt2[k]; i = k; }  k = k + 1 & j; }  arrayOfInt1[i] = 0; if (i != this.lF0) this.D5--;  } else { throw new IllegalStateException("next must be called before remove."); }  this.lF0 = -2; this.Qm.SG0--; }
/*   */ 
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.KJ0)
/*   */       return this.DF; 
/*   */     throw new JU("#iterator() cannot be used nested.");
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Object next() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield DF : Z
/*   */     //   4: ifeq -> 134
/*   */     //   7: aload_0
/*   */     //   8: getfield KJ0 : Z
/*   */     //   11: ifeq -> 124
/*   */     //   14: aload_0
/*   */     //   15: dup
/*   */     //   16: getfield Qm : Lf/lm;
/*   */     //   19: dup
/*   */     //   20: astore_1
/*   */     //   21: getfield HP : [I
/*   */     //   24: astore_2
/*   */     //   25: getfield D5 : I
/*   */     //   28: dup
/*   */     //   29: istore_3
/*   */     //   30: iconst_m1
/*   */     //   31: if_icmpne -> 54
/*   */     //   34: aload_0
/*   */     //   35: getfield TR : Lf/wD;
/*   */     //   38: dup
/*   */     //   39: aload_1
/*   */     //   40: swap
/*   */     //   41: iconst_0
/*   */     //   42: putfield lPt8 : I
/*   */     //   45: getfield yZ : I
/*   */     //   48: putfield pn0 : I
/*   */     //   51: goto -> 75
/*   */     //   54: aload_0
/*   */     //   55: getfield TR : Lf/wD;
/*   */     //   58: dup
/*   */     //   59: aload_1
/*   */     //   60: swap
/*   */     //   61: aload_2
/*   */     //   62: iload_3
/*   */     //   63: iaload
/*   */     //   64: putfield lPt8 : I
/*   */     //   67: getfield Fn : [I
/*   */     //   70: iload_3
/*   */     //   71: iaload
/*   */     //   72: putfield pn0 : I
/*   */     //   75: aload_2
/*   */     //   76: aload_0
/*   */     //   77: iload_3
/*   */     //   78: putfield lF0 : I
/*   */     //   81: arraylength
/*   */     //   82: istore_1
/*   */     //   83: aload_0
/*   */     //   84: getfield D5 : I
/*   */     //   87: iconst_1
/*   */     //   88: iadd
/*   */     //   89: dup
/*   */     //   90: istore_3
/*   */     //   91: iload_1
/*   */     //   92: aload_0
/*   */     //   93: iload_3
/*   */     //   94: putfield D5 : I
/*   */     //   97: if_icmpge -> 114
/*   */     //   100: aload_2
/*   */     //   101: iload_3
/*   */     //   102: iaload
/*   */     //   103: ifeq -> 83
/*   */     //   106: aload_0
/*   */     //   107: iconst_1
/*   */     //   108: putfield DF : Z
/*   */     //   111: goto -> 119
/*   */     //   114: aload_0
/*   */     //   115: iconst_0
/*   */     //   116: putfield DF : Z
/*   */     //   119: aload_0
/*   */     //   120: getfield TR : Lf/wD;
/*   */     //   123: areturn
/*   */     //   124: new f/JU
/*   */     //   127: dup
/*   */     //   128: ldc '#iterator() cannot be used nested.'
/*   */     //   130: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   133: athrow
/*   */     //   134: new java/util/NoSuchElementException
/*   */     //   137: dup
/*   */     //   138: invokespecial <init> : ()V
/*   */     //   141: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 81
/*   */     //   #3	-> 120
/*   */   }
/*   */   
/*   */   public final void uq() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: bipush #-2
/*   */     //   5: putfield lF0 : I
/*   */     //   8: iconst_m1
/*   */     //   9: putfield D5 : I
/*   */     //   12: getfield Qm : Lf/lm;
/*   */     //   15: dup
/*   */     //   16: astore_1
/*   */     //   17: getfield pE0 : Z
/*   */     //   20: ifeq -> 31
/*   */     //   23: aload_0
/*   */     //   24: iconst_1
/*   */     //   25: putfield DF : Z
/*   */     //   28: goto -> 75
/*   */     //   31: aload_1
/*   */     //   32: getfield HP : [I
/*   */     //   35: dup
/*   */     //   36: astore_1
/*   */     //   37: arraylength
/*   */     //   38: istore_2
/*   */     //   39: aload_0
/*   */     //   40: getfield D5 : I
/*   */     //   43: iconst_1
/*   */     //   44: iadd
/*   */     //   45: dup
/*   */     //   46: istore_3
/*   */     //   47: iload_2
/*   */     //   48: aload_0
/*   */     //   49: iload_3
/*   */     //   50: putfield D5 : I
/*   */     //   53: if_icmpge -> 70
/*   */     //   56: aload_1
/*   */     //   57: iload_3
/*   */     //   58: iaload
/*   */     //   59: ifeq -> 39
/*   */     //   62: aload_0
/*   */     //   63: iconst_1
/*   */     //   64: putfield DF : Z
/*   */     //   67: goto -> 75
/*   */     //   70: aload_0
/*   */     //   71: iconst_0
/*   */     //   72: putfield DF : Z
/*   */     //   75: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 5
/*   */     //   #2	-> 32
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sj0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */