/*  1 */ package f;public final class eM implements Iterable { public Object[] Jo; public Object[] WD0; public int uJ0; public boolean uk0; public transient y5 wS; public transient y5 tL0; public transient qA0 Qz; public transient qA0 Qg; public transient g3 ZD0; public transient g3 Ss0; public eM() { this(true, 16); } public final boolean equals(Object paramObject) { if (paramObject == this) return true;  if (!(paramObject instanceof eM)) return false;  int i; if (((eM)(paramObject = paramObject)).uJ0 != (i = this.uJ0)) return false;  Object[] arrayOfObject1; Object[] arrayOfObject2; byte b; for (arrayOfObject1 = this.Jo, arrayOfObject2 = this.WD0, b = 0; b < i; ) { Object object1 = this[b]; Object object2; if ((object2 = arrayOfObject2[b]) == null) { if (paramObject.MF(object1, f7.mv0) != null) return false;  }
/*  2 */       else if (!object2.equals(paramObject.MF(object1, null))) { return false; }  b++; }  return true; } public eM(int paramInt) { this(true, paramInt); } public eM(boolean paramBoolean, int paramInt) { this.uk0 = paramBoolean; this.Jo = new Object[paramInt]; this.WD0 = new Object[paramInt]; } public eM(boolean paramBoolean, int paramInt, Class paramClass1, Class paramClass2) { this.uk0 = paramBoolean; this.Jo = (Object[])o7.JB0(paramClass1, paramInt); this.WD0 = (Object[])o7.JB0(paramClass2, paramInt); } public eM(Class paramClass1, Class paramClass2) { this(false, 16, paramClass1, paramClass2); } public eM(eM parameM) { this(bool, j, clazz1, clazz2); int i = parameM.uJ0; System.arraycopy(parameM.Jo, 0, this.Jo, 0, i); Object[] arrayOfObject = this.WD0; i = this.uJ0; System.arraycopy(parameM.WD0, 0, this, 0, i); } public final Object bK(Object paramObject) { return MF(paramObject, null); } public final Object MF(Object paramObject1, Object paramObject2) { Object[] arrayOfObject = this.Jo; int i = this.uJ0 - 1; if (paramObject1 == null) { while (i >= 0) { if (arrayOfObject[i] == paramObject1) return this.WD0[i];  i--; }  } else { while (i >= 0) { if (paramObject1.equals(arrayOfObject[i])) return this.WD0[i];  i--; }  }  return paramObject2; } public final boolean uW(Object paramObject) { Object[] arrayOfObject = this.Jo; int i = this.uJ0 - 1; if (paramObject == null) { while (i >= 0) { if (this[i--] == paramObject) return true;  }  } else { while (i >= 0) { if (paramObject.equals(this[i--])) return true;  }  }  return false; } public final void SB(int paramInt) { int i; if (paramInt < (i = this.uJ0)) { Object[] arrayOfObject = this.Jo; int k = i - 1; if (this.uk0) { k = paramInt + 1; int m = k - paramInt; System.arraycopy(arrayOfObject, k, arrayOfObject, paramInt, m); k = this.uJ0 - paramInt; Object[] arrayOfObject1; System.arraycopy(arrayOfObject1 = this.WD0, k, arrayOfObject1, paramInt, k); } else { arrayOfObject[paramInt] = arrayOfObject[k]; this.WD0[paramInt] = this.WD0[k]; }  int j; arrayOfObject[j = this.uJ0] = null; this.WD0[j] = null; return; }  throw new IndexOutOfBoundsException(String.valueOf(paramInt)); } public final void clear() { Arrays.fill(this.Jo, 0, this.uJ0, (Object)null); Arrays.fill(this.WD0, 0, this.uJ0, (Object)null); this.uJ0 = 0; } public final int hashCode() { Object[] arrayOfObject1 = this.Jo; Object[] arrayOfObject2 = this.WD0; int i = 0; byte b = 0; int j = this.uJ0; while (b < j) { Object object2 = arrayOfObject2[b]; Object object1; if ((object1 = this[b]) != null) i = object1.hashCode() * 31 + i;  if (object2 != null) i = object2.hashCode() + i;  b++; }  return i; } public final String toString() { if (this.uJ0 == 0) return "{}";  Object[] arrayOfObject1 = this.Jo, arrayOfObject2 = this.WD0; this(32); ag.yd0('{'); ag.Nn(arrayOfObject1[0]);
/*  3 */     ag.yd0('='); Ag ag;
/*  4 */     (ag = new Ag()).Nn(arrayOfObject2[0]); for (byte b = 1; b < this.uJ0; ) { ag
/*  5 */         .V9(", ");
/*  6 */       ag.Nn(arrayOfObject1[b]);
/*  7 */       ag.yd0('=');
/*  8 */       ag.Nn(arrayOfObject2[b]); b++; }  ag
/*  9 */       .yd0('}');
/* 10 */     return ag.toString(); }
/*    */ 
/*    */   
/*    */   public final Iterator iterator() {
/*    */     return HV();
/*    */   }
/*    */   
/*    */   public final y5 HV() {
/*    */     if (this.wS == null) {
/*    */       y5 y52;
/*    */       this(this);
/*    */       this.wS = y52;
/*    */       this(this);
/*    */       this.tL0 = y52;
/*    */     } 
/*    */     y5 y51;
/*    */     if (!(y51 = this.wS).K6) {
/*    */       y51.HC = 0;
/*    */       y51.K6 = true;
/*    */       this.tL0.K6 = false;
/*    */       return y51;
/*    */     } 
/*    */     this.tL0.HC = 0;
/*    */     this.tL0.K6 = true;
/*    */     y51.K6 = false;
/*    */     return this.tL0;
/*    */   }
/*    */   
/*    */   public final qA0 iC() {
/*    */     if (this.Qz == null) {
/*    */       qA0 qA02;
/*    */       this(this);
/*    */       this.Qz = qA02;
/*    */       this(this);
/*    */       this.Qg = qA02;
/*    */     } 
/*    */     qA0 qA01;
/*    */     if (!(qA01 = this.Qz).F0) {
/*    */       qA01.rm = 0;
/*    */       qA01.F0 = true;
/*    */       this.Qg.F0 = false;
/*    */       return qA01;
/*    */     } 
/*    */     this.Qg.rm = 0;
/*    */     this.Qg.F0 = true;
/*    */     qA01.F0 = false;
/*    */     return this.Qg;
/*    */   }
/*    */   
/*    */   public final void Ed0(Object paramObject1, Object paramObject2) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aload_0
/*    */     //   2: getfield Jo : [Ljava/lang/Object;
/*    */     //   5: astore_3
/*    */     //   6: ifnonnull -> 42
/*    */     //   9: aload_0
/*    */     //   10: iconst_0
/*    */     //   11: istore #4
/*    */     //   13: getfield uJ0 : I
/*    */     //   16: istore #5
/*    */     //   18: iload #4
/*    */     //   20: iload #5
/*    */     //   22: if_icmpge -> 78
/*    */     //   25: aload_3
/*    */     //   26: iload #4
/*    */     //   28: aaload
/*    */     //   29: aload_1
/*    */     //   30: if_acmpne -> 36
/*    */     //   33: goto -> 81
/*    */     //   36: iinc #4, 1
/*    */     //   39: goto -> 18
/*    */     //   42: aload_0
/*    */     //   43: iconst_0
/*    */     //   44: istore #4
/*    */     //   46: getfield uJ0 : I
/*    */     //   49: istore #5
/*    */     //   51: iload #4
/*    */     //   53: iload #5
/*    */     //   55: if_icmpge -> 78
/*    */     //   58: aload_1
/*    */     //   59: aload_3
/*    */     //   60: iload #4
/*    */     //   62: aaload
/*    */     //   63: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   66: ifeq -> 72
/*    */     //   69: goto -> 81
/*    */     //   72: iinc #4, 1
/*    */     //   75: goto -> 51
/*    */     //   78: iconst_m1
/*    */     //   79: istore #4
/*    */     //   81: iload #4
/*    */     //   83: iconst_m1
/*    */     //   84: if_icmpne -> 221
/*    */     //   87: aload_0
/*    */     //   88: getfield uJ0 : I
/*    */     //   91: dup
/*    */     //   92: istore_3
/*    */     //   93: aload_0
/*    */     //   94: getfield Jo : [Ljava/lang/Object;
/*    */     //   97: arraylength
/*    */     //   98: if_icmpne -> 208
/*    */     //   101: aload_0
/*    */     //   102: dup
/*    */     //   103: dup2
/*    */     //   104: iload_3
/*    */     //   105: i2f
/*    */     //   106: ldc 1.75
/*    */     //   108: fmul
/*    */     //   109: f2i
/*    */     //   110: bipush #8
/*    */     //   112: swap
/*    */     //   113: invokestatic max : (II)I
/*    */     //   116: istore_3
/*    */     //   117: getfield Jo : [Ljava/lang/Object;
/*    */     //   120: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   123: invokevirtual getComponentType : ()Ljava/lang/Class;
/*    */     //   126: iload_3
/*    */     //   127: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
/*    */     //   130: checkcast [Ljava/lang/Object;
/*    */     //   133: dup
/*    */     //   134: astore #4
/*    */     //   136: aload_0
/*    */     //   137: getfield Jo : [Ljava/lang/Object;
/*    */     //   140: aload_0
/*    */     //   141: getfield uJ0 : I
/*    */     //   144: aload #4
/*    */     //   146: arraylength
/*    */     //   147: invokestatic min : (II)I
/*    */     //   150: istore #5
/*    */     //   152: iconst_0
/*    */     //   153: aload #4
/*    */     //   155: iconst_0
/*    */     //   156: iload #5
/*    */     //   158: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   161: putfield Jo : [Ljava/lang/Object;
/*    */     //   164: getfield WD0 : [Ljava/lang/Object;
/*    */     //   167: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   170: invokevirtual getComponentType : ()Ljava/lang/Class;
/*    */     //   173: iload_3
/*    */     //   174: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
/*    */     //   177: checkcast [Ljava/lang/Object;
/*    */     //   180: dup
/*    */     //   181: astore_3
/*    */     //   182: aload_0
/*    */     //   183: getfield WD0 : [Ljava/lang/Object;
/*    */     //   186: aload_0
/*    */     //   187: getfield uJ0 : I
/*    */     //   190: aload_3
/*    */     //   191: arraylength
/*    */     //   192: invokestatic min : (II)I
/*    */     //   195: istore #4
/*    */     //   197: iconst_0
/*    */     //   198: aload_3
/*    */     //   199: iconst_0
/*    */     //   200: iload #4
/*    */     //   202: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   205: putfield WD0 : [Ljava/lang/Object;
/*    */     //   208: aload_0
/*    */     //   209: dup
/*    */     //   210: getfield uJ0 : I
/*    */     //   213: dup
/*    */     //   214: istore #4
/*    */     //   216: iconst_1
/*    */     //   217: iadd
/*    */     //   218: putfield uJ0 : I
/*    */     //   221: aload_0
/*    */     //   222: dup
/*    */     //   223: getfield Jo : [Ljava/lang/Object;
/*    */     //   226: iload #4
/*    */     //   228: aload_1
/*    */     //   229: aastore
/*    */     //   230: getfield WD0 : [Ljava/lang/Object;
/*    */     //   233: iload #4
/*    */     //   235: aload_2
/*    */     //   236: aastore
/*    */     //   237: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 2
/*    */     //   #2	-> 88
/*    */     //   #3	-> 117
/*    */     //   #4	-> 127
/*    */     //   #5	-> 130
/*    */     //   #6	-> 174
/*    */     //   #7	-> 177
/*    */     //   #8	-> 210
/*    */   }
/*    */   
/*    */   public final void Yj0(Object paramObject) {
/*    */     Object[] arrayOfObject = this.Jo;
/*    */     if (paramObject == null) {
/*    */       byte b = 0;
/*    */       int i = this.uJ0;
/*    */       while (b < i) {
/*    */         if (arrayOfObject[b] == paramObject) {
/*    */           this.WD0[b];
/*    */           SB(b);
/*    */           return;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } else {
/*    */       byte b = 0;
/*    */       int i = this.uJ0;
/*    */       while (b < i) {
/*    */         if (paramObject.equals(arrayOfObject[b])) {
/*    */           this.WD0[b];
/*    */           SB(b);
/*    */           return;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */