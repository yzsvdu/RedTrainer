/* 1 */ package f;public final class iL extends AbstractSet implements Iterable { public iL(qw0 paramqw0) {} public final boolean addAll(Collection paramCollection) { throw new UnsupportedOperationException(); }
/*   */   public final Iterator iterator() { return new Ke(this.LN); } public final boolean Lc0(Object paramObject) { // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: aload_0
/*   */     //   2: getfield LN : Lf/qw0;
/*   */     //   5: dup
/*   */     //   6: getfield JO : [B
/*   */     //   9: astore_0
/*   */     //   10: getfield TH0 : [Ljava/lang/Object;
/*   */     //   13: astore_2
/*   */     //   14: ifnonnull -> 44
/*   */     //   17: aload_2
/*   */     //   18: arraylength
/*   */     //   19: istore_1
/*   */     //   20: iload_1
/*   */     //   21: dup
/*   */     //   22: iconst_m1
/*   */     //   23: iadd
/*   */     //   24: istore_1
/*   */     //   25: ifle -> 86
/*   */     //   28: aload_0
/*   */     //   29: iload_1
/*   */     //   30: baload
/*   */     //   31: iconst_1
/*   */     //   32: if_icmpne -> 20
/*   */     //   35: aload_2
/*   */     //   36: iload_1
/*   */     //   37: aaload
/*   */     //   38: ifnonnull -> 20
/*   */     //   41: goto -> 81
/*   */     //   44: aload_2
/*   */     //   45: arraylength
/*   */     //   46: istore_3
/*   */     //   47: iload_3
/*   */     //   48: dup
/*   */     //   49: iconst_m1
/*   */     //   50: iadd
/*   */     //   51: istore_3
/*   */     //   52: ifle -> 86
/*   */     //   55: aload_0
/*   */     //   56: iload_3
/*   */     //   57: baload
/*   */     //   58: iconst_1
/*   */     //   59: if_icmpne -> 47
/*   */     //   62: aload_1
/*   */     //   63: aload_2
/*   */     //   64: iload_3
/*   */     //   65: aaload
/*   */     //   66: dup
/*   */     //   67: astore #4
/*   */     //   69: if_acmpeq -> 81
/*   */     //   72: aload_1
/*   */     //   73: aload #4
/*   */     //   75: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   78: ifeq -> 47
/*   */     //   81: iconst_1
/*   */     //   82: istore_0
/*   */     //   83: goto -> 88
/*   */     //   86: iconst_0
/*   */     //   87: istore_0
/*   */     //   88: iload_0
/*   */     //   89: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/* 2 */     //   #2	-> 10 } public final Object[] me(Object[] paramArrayOfObject) { int i = this.NY.ir0;
/* 3 */     if (paramArrayOfObject.length < i) paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);  Iterator iterator; byte b; for (iterator = iterator(), b = 0; b < i; ) { paramArrayOfObject[b] = ((Ke)this).q00(); b++; }  if (paramArrayOfObject.length > i) paramArrayOfObject[i] = null;  return paramArrayOfObject; } public final Object[] xq0() { Object[] arrayOfObject; Iterator iterator; byte b; for (arrayOfObject = new Object[this.NY.ir0], iterator = iterator(), b = 0; ((DA0)iterator).hasNext(); ) { this[b] = ((Ke)iterator).q00(); b++; }  return this; }
/*   */ 
/*   */   
/*   */   public final boolean lPt8(Collection paramCollection) {
/*   */     boolean bool = false;
/*   */     Iterator iterator = iterator();
/*   */     DA0 dA0;
/*   */     while ((dA0 = (DA0)iterator).hasNext()) {
/*   */       if (!paramCollection.contains(((Ke)iterator).q00())) {
/*   */         dA0.remove();
/*   */         bool = true;
/*   */       } 
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final void clear() {
/*   */     this.NY.clear();
/*   */   }
/*   */   
/*   */   public final boolean contains(Object paramObject) {
/*   */     return Lc0(paramObject);
/*   */   }
/*   */   
/*   */   public final boolean ow0(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield LN : Lf/qw0;
/*   */     //   4: dup
/*   */     //   5: astore_2
/*   */     //   6: getfield TH0 : [Ljava/lang/Object;
/*   */     //   9: dup
/*   */     //   10: astore_3
/*   */     //   11: aload_2
/*   */     //   12: getfield JO : [B
/*   */     //   15: astore_2
/*   */     //   16: arraylength
/*   */     //   17: istore #4
/*   */     //   19: iload #4
/*   */     //   21: dup
/*   */     //   22: iconst_m1
/*   */     //   23: iadd
/*   */     //   24: istore #4
/*   */     //   26: ifle -> 76
/*   */     //   29: aload_2
/*   */     //   30: iload #4
/*   */     //   32: baload
/*   */     //   33: iconst_1
/*   */     //   34: if_icmpne -> 19
/*   */     //   37: aload_1
/*   */     //   38: aload_3
/*   */     //   39: iload #4
/*   */     //   41: aaload
/*   */     //   42: dup
/*   */     //   43: astore #5
/*   */     //   45: if_acmpeq -> 62
/*   */     //   48: aload #5
/*   */     //   50: ifnull -> 19
/*   */     //   53: aload #5
/*   */     //   55: aload_1
/*   */     //   56: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   59: ifeq -> 19
/*   */     //   62: aload_0
/*   */     //   63: getfield LN : Lf/qw0;
/*   */     //   66: iload #4
/*   */     //   68: invokevirtual Id : (I)V
/*   */     //   71: iconst_1
/*   */     //   72: istore_0
/*   */     //   73: goto -> 78
/*   */     //   76: iconst_0
/*   */     //   77: istore_0
/*   */     //   78: iload_0
/*   */     //   79: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */   }
/*   */   
/*   */   public final boolean add(Object paramObject) {
/*   */     throw new UnsupportedOperationException();
/*   */   }
/*   */   
/*   */   public final int size() {
/*   */     return this.NY.ir0;
/*   */   }
/*   */   
/*   */   public final boolean isEmpty() {
/*   */     return this.NY.isEmpty();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */