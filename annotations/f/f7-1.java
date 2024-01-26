/* 1 */ package f;public class f7 implements Iterable { public static final Object mv0 = new Object(); public int Cx0; public Object[] g00; public Object[] RG; public float J6; public int aZ; public int this; public int Ib0; public transient oc jQ; public final int gP(Object paramObject) { if (paramObject != null) { Object[] arrayOfObject = this.g00; int i = (int)(paramObject.hashCode() * -7046029254386353131L >>> this.this); while (true)
/* 2 */       { Object object; if ((object = arrayOfObject[i]) == null) return -(i + 1);  if (object.equals(paramObject)) return i;  i = i + 1 & this.Ib0; }  }  throw new IllegalArgumentException("key cannot be null."); } public transient oc yh0; public transient TA gE0; public transient TA Jw; public transient Q70 Yz; public transient Q70 E90; public f7() { this(51, 0.8F); } public f7(int paramInt) { this(paramInt, 0.8F); } public f7(int paramInt, float paramFloat) { if (paramFloat > 0.0F && paramFloat < 1.0F) { this.J6 = paramFloat; this.aZ = (int)(paramInt * paramFloat); int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1; this.this = Long.numberOfLeadingZeros(i); this.g00 = new Object[paramInt]; this.RG = new Object[paramInt]; return; }  throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat); } public f7(f7 paramf7) { this((int)(paramf7.g00.length * (f = paramf7.J6)), f); Object[] arrayOfObject2 = this.g00; int j = paramf7.g00.length; System.arraycopy(paramf7.g00, 0, arrayOfObject2, 0, j); Object[] arrayOfObject1 = this.RG; int i = paramf7.RG.length; System.arraycopy(paramf7.RG, 0, this, 0, i); this.Cx0 = paramf7.Cx0; } public Object X00(Object paramObject1, Object paramObject2) { Object[] arrayOfObject1; int j; if ((j = gP(paramObject1)) >= 0) { this[j] = paramObject2; return (arrayOfObject1 = this.RG)[j]; }  j = -(j + 1); Object[] arrayOfObject2; (arrayOfObject2 = ((f7)super).g00)[j] = paramObject1; ((f7)super).RG[j] = paramObject2; ((f7)super).Cx0 = i; int i; if ((i = ((f7)super).Cx0 + 1) >= ((f7)super).aZ) super.lE(arrayOfObject2.length << 1);  return null; } public final Object pd0(Object paramObject) { int i; return ((i = gP(paramObject)) < 0) ? null : this.RG[i]; } public Object HH(Object paramObject) { int i; if ((i = gP(paramObject)) < 0) return null;  Object[] arrayOfObject1; Object[] arrayOfObject2; Object object1; int j; int k; Object object2; for (arrayOfObject1 = this.g00, object1 = (arrayOfObject2 = this.RG)[i], j = this.Ib0, k = i + 1 & j; (object2 = arrayOfObject1[k]) != null; ) { int m; if ((k - (m = (int)(object2.hashCode() * -7046029254386353131L >>> this.this)) & j) > (i - m & j)) { arrayOfObject1[i] = object2; arrayOfObject2[i] = arrayOfObject2[k]; i = k; }  k = k + 1 & j; }  arrayOfObject1[i] = null; arrayOfObject2[i] = null; this.Cx0--; return object1; } public final boolean GB0(Object paramObject) { return (gP(paramObject) >= 0); } public final void lE(int paramInt) { paramInt = this.g00.length; this.aZ = (int)(paramInt * this.J6); int i = paramInt - 1; this.this = Long.numberOfLeadingZeros(i); Object[] arrayOfObject1 = this.g00, arrayOfObject2 = this.RG; this.g00 = new Object[paramInt]; this.RG = new Object[paramInt]; if (this.Cx0 > 0) for (byte b = 0; b < paramInt; ) { Object object; if ((object = arrayOfObject1[b]) != null) { Object object1 = arrayOfObject2[b], arrayOfObject[] = this.g00; int j = (int)(object.hashCode() * -7046029254386353131L >>> this.this); while (true) { if (arrayOfObject[j] == 
/* 3 */               null) { arrayOfObject[j] = object; this.RG[j] = object1; break; }  j = j + 1 & this.Ib0; }  }  b++; }
/*   */         }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.Cx0;
/*   */     Object[] arrayOfObject1 = this.RG;
/*   */     byte b = 0;
/*   */     Object[] arrayOfObject2;
/*   */     int j = (arrayOfObject2 = this.g00).length;
/*   */     while (b < j) {
/*   */       i = object.hashCode() + i;
/*   */       Object object;
/*   */       if ((object = arrayOfObject2[b]) != null && (object = this[b]) != null)
/*   */         i = object.hashCode() + i; 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!(paramObject instanceof f7))
/*   */       return false; 
/*   */     if (((f7)(paramObject = paramObject)).Cx0 != this.Cx0)
/*   */       return false; 
/*   */     Object[] arrayOfObject1;
/*   */     Object[] arrayOfObject2;
/*   */     byte b;
/*   */     int i;
/*   */     for (arrayOfObject1 = this.RG, b = 0, i = (arrayOfObject2 = this.g00).length; b < i; ) {
/*   */       Object object;
/*   */       if ((object = arrayOfObject2[b]) != null) {
/*   */         int j;
/*   */         Object object1;
/*   */         if ((object1 = this[b]) == null) {
/*   */           object1 = mv0;
/*   */           if ((j = paramObject.gP(object)) >= 0)
/*   */             object1 = ((f7)paramObject).RG[j]; 
/*   */           if (object1 != null)
/*   */             return false; 
/*   */         } else if (!object1.equals(paramObject.pd0(j))) {
/*   */           return false;
/*   */         } 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return FS();
/*   */   }
/*   */   
/*   */   public oc COM7() {
/*   */     return sh();
/*   */   }
/*   */   
/*   */   public oc sh() {
/*   */     if (this.jQ == null) {
/*   */       oc oc2;
/*   */       this(this);
/*   */       this.jQ = oc2;
/*   */       this(this);
/*   */       this.yh0 = oc2;
/*   */     } 
/*   */     oc oc1;
/*   */     if (!(oc1 = this.jQ).IO) {
/*   */       oc1.kk0();
/*   */       this.jQ.IO = true;
/*   */       this.yh0.IO = false;
/*   */       return this.jQ;
/*   */     } 
/*   */     this.yh0.kk0();
/*   */     this.yh0.IO = true;
/*   */     this.jQ.IO = false;
/*   */     return this.yh0;
/*   */   }
/*   */   
/*   */   public TA mw0() {
/*   */     if (this.gE0 == null) {
/*   */       TA tA1;
/*   */       this(this);
/*   */       this.gE0 = tA1;
/*   */       this(this);
/*   */       this.Jw = tA1;
/*   */     } 
/*   */     TA tA;
/*   */     if (!(tA = this.gE0).IO) {
/*   */       tA.kk0();
/*   */       this.gE0.IO = true;
/*   */       this.Jw.IO = false;
/*   */       return this.gE0;
/*   */     } 
/*   */     this.Jw.kk0();
/*   */     this.Jw.IO = true;
/*   */     this.gE0.IO = false;
/*   */     return this.Jw;
/*   */   }
/*   */   
/*   */   public Q70 W5() {
/*   */     if (this.Yz == null) {
/*   */       Q70 q701;
/*   */       this(this);
/*   */       this.Yz = q701;
/*   */       this(this);
/*   */       this.E90 = q701;
/*   */     } 
/*   */     Q70 q70;
/*   */     if (!(q70 = this.Yz).IO) {
/*   */       q70.kk0();
/*   */       this.Yz.IO = true;
/*   */       this.E90.IO = false;
/*   */       return this.Yz;
/*   */     } 
/*   */     this.E90.kk0();
/*   */     this.E90.IO = true;
/*   */     this.Yz.IO = false;
/*   */     return this.E90;
/*   */   }
/*   */   
/*   */   public void t9() {
/*   */     if (this.Cx0 == 0)
/*   */       return; 
/*   */     this.Cx0 = 0;
/*   */     Arrays.fill(this.g00, (Object)null);
/*   */     Arrays.fill(this.RG, (Object)null);
/*   */   }
/*   */   
/*   */   public String FS() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: ldc ', '
/*   */     //   3: astore_1
/*   */     //   4: getfield Cx0 : I
/*   */     //   7: ifne -> 13
/*   */     //   10: ldc '{}'
/*   */     //   12: areturn
/*   */     //   13: aload_0
/*   */     //   14: new java/lang/StringBuilder
/*   */     //   17: dup
/*   */     //   18: dup
/*   */     //   19: astore_2
/*   */     //   20: bipush #32
/*   */     //   22: invokespecial <init> : (I)V
/*   */     //   25: bipush #123
/*   */     //   27: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   30: pop
/*   */     //   31: getfield g00 : [Ljava/lang/Object;
/*   */     //   34: dup
/*   */     //   35: astore_3
/*   */     //   36: aload_0
/*   */     //   37: getfield RG : [Ljava/lang/Object;
/*   */     //   40: astore #4
/*   */     //   42: arraylength
/*   */     //   43: istore #5
/*   */     //   45: iload #5
/*   */     //   47: dup
/*   */     //   48: iconst_m1
/*   */     //   49: iadd
/*   */     //   50: istore #5
/*   */     //   52: ifle -> 107
/*   */     //   55: aload_3
/*   */     //   56: iload #5
/*   */     //   58: aaload
/*   */     //   59: dup
/*   */     //   60: astore #6
/*   */     //   62: ifnonnull -> 68
/*   */     //   65: goto -> 45
/*   */     //   68: aload #6
/*   */     //   70: aload_0
/*   */     //   71: if_acmpne -> 78
/*   */     //   74: ldc '(this)'
/*   */     //   76: astore #6
/*   */     //   78: aload #4
/*   */     //   80: aload_2
/*   */     //   81: dup
/*   */     //   82: aload #6
/*   */     //   84: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   87: pop
/*   */     //   88: bipush #61
/*   */     //   90: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   93: pop
/*   */     //   94: iload #5
/*   */     //   96: aaload
/*   */     //   97: dup
/*   */     //   98: astore #6
/*   */     //   100: aload_0
/*   */     //   101: if_acmpne -> 176
/*   */     //   104: goto -> 172
/*   */     //   107: iload #5
/*   */     //   109: dup
/*   */     //   110: iconst_m1
/*   */     //   111: iadd
/*   */     //   112: istore #5
/*   */     //   114: ifle -> 186
/*   */     //   117: aload_3
/*   */     //   118: iload #5
/*   */     //   120: aaload
/*   */     //   121: dup
/*   */     //   122: astore #6
/*   */     //   124: ifnonnull -> 130
/*   */     //   127: goto -> 107
/*   */     //   130: aload #6
/*   */     //   132: aload_2
/*   */     //   133: aload_1
/*   */     //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   137: pop
/*   */     //   138: aload_0
/*   */     //   139: if_acmpne -> 146
/*   */     //   142: ldc '(this)'
/*   */     //   144: astore #6
/*   */     //   146: aload #4
/*   */     //   148: aload_2
/*   */     //   149: dup
/*   */     //   150: aload #6
/*   */     //   152: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   155: pop
/*   */     //   156: bipush #61
/*   */     //   158: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   161: pop
/*   */     //   162: iload #5
/*   */     //   164: aaload
/*   */     //   165: dup
/*   */     //   166: astore #6
/*   */     //   168: aload_0
/*   */     //   169: if_acmpne -> 176
/*   */     //   172: ldc '(this)'
/*   */     //   174: astore #6
/*   */     //   176: aload_2
/*   */     //   177: aload #6
/*   */     //   179: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   182: pop
/*   */     //   183: goto -> 107
/*   */     //   186: aload_2
/*   */     //   187: dup
/*   */     //   188: bipush #125
/*   */     //   190: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   193: pop
/*   */     //   194: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   197: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 4
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */