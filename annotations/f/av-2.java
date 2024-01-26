/* 1 */ package f;public final class av implements Iterable, Iterator { public boolean Ii0; public final com9 Dw0; public int Td; public int k5; public boolean Nt; public RY i8; public av(com9 paramcom9) { RY rY; this.Nt = true; this.Dw0 = paramcom9; ox0();
/* 2 */     this(); this.i8 = this; } public final void yp() { int i; if ((i = this.k5) >= 0) { Object[] arrayOfObject; float[] arrayOfFloat; int j; int k; Object object; for (arrayOfObject = this.Dw0.gg, arrayOfFloat = this.Dw0.lPT5, j = this.Dw0.y3, k = i + 1 & j; (object = arrayOfObject[k]) != null; ) { com9 com91; (com91 = this.Dw0).getClass(); int m; if ((k - (m = (int)(object.hashCode() * -7046029254386353131L >>> com91.UC0)) & j) > (i - m & j)) { arrayOfObject[i] = object; arrayOfFloat[i] = arrayOfFloat[k]; i = k; }  k = k + 1 & j; }  arrayOfObject[i] = null; this.Dw0.Z3--; if (i != this.k5) this.Td--;  this.k5 = -1; return; }  throw new IllegalStateException("next must be called before remove."); }
/*   */ 
/*   */   
/*   */   public final boolean hasNext() {
/*   */     if (this.Nt)
/*   */       return this.Ii0; 
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
/*   */     //   1: getfield Ii0 : Z
/*   */     //   4: ifeq -> 109
/*   */     //   7: aload_0
/*   */     //   8: getfield Nt : Z
/*   */     //   11: ifeq -> 99
/*   */     //   14: aload_0
/*   */     //   15: getfield Dw0 : Lf/com9;
/*   */     //   18: dup
/*   */     //   19: astore_1
/*   */     //   20: getfield gg : [Ljava/lang/Object;
/*   */     //   23: dup
/*   */     //   24: astore_2
/*   */     //   25: aload_0
/*   */     //   26: dup
/*   */     //   27: getfield i8 : Lf/RY;
/*   */     //   30: dup
/*   */     //   31: aload_1
/*   */     //   32: swap
/*   */     //   33: aload_2
/*   */     //   34: aload_0
/*   */     //   35: getfield Td : I
/*   */     //   38: dup
/*   */     //   39: istore_1
/*   */     //   40: aaload
/*   */     //   41: putfield Fw0 : Ljava/lang/Object;
/*   */     //   44: getfield lPT5 : [F
/*   */     //   47: iload_1
/*   */     //   48: faload
/*   */     //   49: putfield oE0 : F
/*   */     //   52: iload_1
/*   */     //   53: putfield k5 : I
/*   */     //   56: arraylength
/*   */     //   57: istore_1
/*   */     //   58: aload_0
/*   */     //   59: getfield Td : I
/*   */     //   62: iconst_1
/*   */     //   63: iadd
/*   */     //   64: dup
/*   */     //   65: istore_3
/*   */     //   66: iload_1
/*   */     //   67: aload_0
/*   */     //   68: iload_3
/*   */     //   69: putfield Td : I
/*   */     //   72: if_icmpge -> 89
/*   */     //   75: aload_2
/*   */     //   76: iload_3
/*   */     //   77: aaload
/*   */     //   78: ifnull -> 58
/*   */     //   81: aload_0
/*   */     //   82: iconst_1
/*   */     //   83: putfield Ii0 : Z
/*   */     //   86: goto -> 94
/*   */     //   89: aload_0
/*   */     //   90: iconst_0
/*   */     //   91: putfield Ii0 : Z
/*   */     //   94: aload_0
/*   */     //   95: getfield i8 : Lf/RY;
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
/*   */   public final void ox0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: iconst_m1
/*   */     //   4: putfield k5 : I
/*   */     //   7: iconst_m1
/*   */     //   8: putfield Td : I
/*   */     //   11: getfield Dw0 : Lf/com9;
/*   */     //   14: getfield gg : [Ljava/lang/Object;
/*   */     //   17: dup
/*   */     //   18: astore_1
/*   */     //   19: arraylength
/*   */     //   20: istore_2
/*   */     //   21: aload_0
/*   */     //   22: getfield Td : I
/*   */     //   25: iconst_1
/*   */     //   26: iadd
/*   */     //   27: dup
/*   */     //   28: istore_3
/*   */     //   29: iload_2
/*   */     //   30: aload_0
/*   */     //   31: iload_3
/*   */     //   32: putfield Td : I
/*   */     //   35: if_icmpge -> 52
/*   */     //   38: aload_1
/*   */     //   39: iload_3
/*   */     //   40: aaload
/*   */     //   41: ifnull -> 21
/*   */     //   44: aload_0
/*   */     //   45: iconst_1
/*   */     //   46: putfield Ii0 : Z
/*   */     //   49: goto -> 57
/*   */     //   52: aload_0
/*   */     //   53: iconst_0
/*   */     //   54: putfield Ii0 : Z
/*   */     //   57: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 4
/*   */     //   #2	-> 11
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/av.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */