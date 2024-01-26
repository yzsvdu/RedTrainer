/* 1 */ package f;public final class To implements Iterable, Iterator { public final void remove() { int i; if ((i = this.rr0) >= 0) { Object[] arrayOfObject; int j; int k; Object object; for (arrayOfObject = this.pH.Hm, j = this.pH.vj0, k = i + 1 & j; (object = arrayOfObject[k]) != null; ) { MG mG; (mG = this.pH).getClass(); int m; if ((k - (m = (int)(object.hashCode() * -7046029254386353131L >>> mG.Mj)) & j) > (i - m & j)) { arrayOfObject[i] = object;
/* 2 */           i = k; }  k = k + 1 & j; }  arrayOfObject[i] = null; this.pH.xl--; if (i != this.rr0) this.AV--;  this.rr0 = -1; return; }  throw new IllegalStateException("next must be called before remove."); }
/*   */ 
/*   */   
/*   */   public boolean tC0;
/*   */   public final MG pH;
/*   */   public int AV;
/*   */   public int rr0;
/*   */   public boolean yh0 = true;
/*   */   
/*   */   public To(MG paramMG) {
/*   */     this.pH = paramMG;
/*   */     fu();
/*   */   }
/*   */   
/*   */   public final void fu() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: iconst_m1
/*   */     //   4: putfield rr0 : I
/*   */     //   7: iconst_m1
/*   */     //   8: putfield AV : I
/*   */     //   11: getfield pH : Lf/MG;
/*   */     //   14: getfield Hm : [Ljava/lang/Object;
/*   */     //   17: dup
/*   */     //   18: astore_1
/*   */     //   19: arraylength
/*   */     //   20: istore_2
/*   */     //   21: aload_0
/*   */     //   22: getfield AV : I
/*   */     //   25: iconst_1
/*   */     //   26: iadd
/*   */     //   27: dup
/*   */     //   28: istore_3
/*   */     //   29: iload_2
/*   */     //   30: aload_0
/*   */     //   31: iload_3
/*   */     //   32: putfield AV : I
/*   */     //   35: if_icmpge -> 52
/*   */     //   38: aload_1
/*   */     //   39: iload_3
/*   */     //   40: aaload
/*   */     //   41: ifnull -> 21
/*   */     //   44: aload_0
/*   */     //   45: iconst_1
/*   */     //   46: putfield tC0 : Z
/*   */     //   49: goto -> 57
/*   */     //   52: aload_0
/*   */     //   53: iconst_0
/*   */     //   54: putfield tC0 : Z
/*   */     //   57: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 11
/*   */   }
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.yh0)
/*   */       return this.tC0; 
/*   */     throw new JU("#iterator() cannot be used nested.");
/*   */   }
/*   */   
/*   */   public final Object next() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield tC0 : Z
/*   */     //   4: ifeq -> 90
/*   */     //   7: aload_0
/*   */     //   8: getfield yh0 : Z
/*   */     //   11: ifeq -> 80
/*   */     //   14: aload_0
/*   */     //   15: getfield pH : Lf/MG;
/*   */     //   18: getfield Hm : [Ljava/lang/Object;
/*   */     //   21: dup
/*   */     //   22: astore_1
/*   */     //   23: aload_0
/*   */     //   24: aload_1
/*   */     //   25: aload_0
/*   */     //   26: getfield AV : I
/*   */     //   29: dup
/*   */     //   30: istore_2
/*   */     //   31: aaload
/*   */     //   32: astore_3
/*   */     //   33: iload_2
/*   */     //   34: putfield rr0 : I
/*   */     //   37: arraylength
/*   */     //   38: istore_2
/*   */     //   39: aload_0
/*   */     //   40: getfield AV : I
/*   */     //   43: iconst_1
/*   */     //   44: iadd
/*   */     //   45: dup
/*   */     //   46: istore #4
/*   */     //   48: iload_2
/*   */     //   49: aload_0
/*   */     //   50: iload #4
/*   */     //   52: putfield AV : I
/*   */     //   55: if_icmpge -> 73
/*   */     //   58: aload_1
/*   */     //   59: iload #4
/*   */     //   61: aaload
/*   */     //   62: ifnull -> 39
/*   */     //   65: aload_0
/*   */     //   66: iconst_1
/*   */     //   67: putfield tC0 : Z
/*   */     //   70: goto -> 78
/*   */     //   73: aload_0
/*   */     //   74: iconst_0
/*   */     //   75: putfield tC0 : Z
/*   */     //   78: aload_3
/*   */     //   79: areturn
/*   */     //   80: new f/JU
/*   */     //   83: dup
/*   */     //   84: ldc '#iterator() cannot be used nested.'
/*   */     //   86: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   89: athrow
/*   */     //   90: new java/util/NoSuchElementException
/*   */     //   93: dup
/*   */     //   94: invokespecial <init> : ()V
/*   */     //   97: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 37
/*   */     //   #2	-> 80
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/To.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */