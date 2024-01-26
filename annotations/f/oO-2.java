/* 1 */ package f;public final class oO implements Iterable, Iterator { public boolean UL0; public final Nu0 Vq0; public int U20; public int t0; public boolean di0; public o20 t2; public oO(Nu0 paramNu0) { o20 o201; this.di0 = true; this.Vq0 = paramNu0; F2();
/* 2 */     this(); this.t2 = this; } public final void BV() { int i; if ((i = this.t0) >= 0) { Object[] arrayOfObject; int[] arrayOfInt; int j; int k; Object object; for (arrayOfObject = this.Vq0.q40, arrayOfInt = this.Vq0.d50, j = this.Vq0.Ug, k = i + 1 & j; (object = arrayOfObject[k]) != null; ) { Nu0 nu0; (nu0 = this.Vq0).getClass(); int m; if ((k - (m = (int)(object.hashCode() * -7046029254386353131L >>> nu0.pG)) & j) > (i - m & j)) { arrayOfObject[i] = object; arrayOfInt[i] = arrayOfInt[k]; i = k; }  k = k + 1 & j; }  arrayOfObject[i] = null; this.Vq0.Ty--; if (i != this.t0) this.U20--;  this.t0 = -1; return; }  throw new IllegalStateException("next must be called before remove."); }
/*   */ 
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.di0)
/*   */       return this.UL0; 
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
/*   */     //   1: getfield UL0 : Z
/*   */     //   4: ifeq -> 109
/*   */     //   7: aload_0
/*   */     //   8: getfield di0 : Z
/*   */     //   11: ifeq -> 99
/*   */     //   14: aload_0
/*   */     //   15: getfield Vq0 : Lf/Nu0;
/*   */     //   18: dup
/*   */     //   19: astore_1
/*   */     //   20: getfield q40 : [Ljava/lang/Object;
/*   */     //   23: dup
/*   */     //   24: astore_2
/*   */     //   25: aload_0
/*   */     //   26: dup
/*   */     //   27: getfield t2 : Lf/o20;
/*   */     //   30: dup
/*   */     //   31: aload_1
/*   */     //   32: swap
/*   */     //   33: aload_2
/*   */     //   34: aload_0
/*   */     //   35: getfield U20 : I
/*   */     //   38: dup
/*   */     //   39: istore_1
/*   */     //   40: aaload
/*   */     //   41: putfield SD : Ljava/lang/Object;
/*   */     //   44: getfield d50 : [I
/*   */     //   47: iload_1
/*   */     //   48: iaload
/*   */     //   49: putfield jo0 : I
/*   */     //   52: iload_1
/*   */     //   53: putfield t0 : I
/*   */     //   56: arraylength
/*   */     //   57: istore_1
/*   */     //   58: aload_0
/*   */     //   59: getfield U20 : I
/*   */     //   62: iconst_1
/*   */     //   63: iadd
/*   */     //   64: dup
/*   */     //   65: istore_3
/*   */     //   66: iload_1
/*   */     //   67: aload_0
/*   */     //   68: iload_3
/*   */     //   69: putfield U20 : I
/*   */     //   72: if_icmpge -> 89
/*   */     //   75: aload_2
/*   */     //   76: iload_3
/*   */     //   77: aaload
/*   */     //   78: ifnull -> 58
/*   */     //   81: aload_0
/*   */     //   82: iconst_1
/*   */     //   83: putfield UL0 : Z
/*   */     //   86: goto -> 94
/*   */     //   89: aload_0
/*   */     //   90: iconst_0
/*   */     //   91: putfield UL0 : Z
/*   */     //   94: aload_0
/*   */     //   95: getfield t2 : Lf/o20;
/*   */     //   98: areturn
/*   */     //   99: new f/JU
/*   */     //   102: dup
/*   */     //   103: ldc '#iterator() cannot be used nested.'
/*   */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   108: athrow
/*   */     //   109: new java/util/NoSuchElementException
/*   */     //   112: dup
/*   */     //   113: invokespecial <init> : ()V
/*   */     //   116: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 56
/*   */     //   #3	-> 95
/*   */   }
/*   */   
/*   */   public final void F2() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: iconst_m1
/*   */     //   4: putfield t0 : I
/*   */     //   7: iconst_m1
/*   */     //   8: putfield U20 : I
/*   */     //   11: getfield Vq0 : Lf/Nu0;
/*   */     //   14: getfield q40 : [Ljava/lang/Object;
/*   */     //   17: dup
/*   */     //   18: astore_1
/*   */     //   19: arraylength
/*   */     //   20: istore_2
/*   */     //   21: aload_0
/*   */     //   22: getfield U20 : I
/*   */     //   25: iconst_1
/*   */     //   26: iadd
/*   */     //   27: dup
/*   */     //   28: istore_3
/*   */     //   29: iload_2
/*   */     //   30: aload_0
/*   */     //   31: iload_3
/*   */     //   32: putfield U20 : I
/*   */     //   35: if_icmpge -> 52
/*   */     //   38: aload_1
/*   */     //   39: iload_3
/*   */     //   40: aaload
/*   */     //   41: ifnull -> 21
/*   */     //   44: aload_0
/*   */     //   45: iconst_1
/*   */     //   46: putfield UL0 : Z
/*   */     //   49: goto -> 57
/*   */     //   52: aload_0
/*   */     //   53: iconst_0
/*   */     //   54: putfield UL0 : Z
/*   */     //   57: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 4
/*   */     //   #2	-> 11
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oO.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */