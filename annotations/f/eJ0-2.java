/*  1 */ package f;public final class eJ0 extends zb0 implements Map { public static final long serialVersionUID = 1L; public transient Object[] Con; public final int J00(int paramInt) { this.Con = new Object[super.J00(paramInt)]; return super.J00(paramInt); } public final String toString() { this("{"); StringBuilder stringBuilder; Object[] arrayOfObject1; boolean bool; Object[] arrayOfObject2; int i; for (bool = true, arrayOfObject1 = this.Con, i = (arrayOfObject2 = this.QG0).length; i-- > 0;) { if ((object = arrayOfObject2[i]) != zb0.IM && object != zb0.ET) { Object object1 = this[i]; if (bool) { bool = false; } else { stringBuilder
/*  2 */             .append(", "); }  stringBuilder.append(object); stringBuilder.append("="); stringBuilder.append(object1); }  }  stringBuilder
/*  3 */       .append("}"); return stringBuilder.toString(); } public final Object put(Object paramObject1, Object paramObject2) { return Sy(Dg(paramObject1), paramObject2); } public final Object putIfAbsent(Object paramObject1, Object paramObject2) { int i; return ((i = Dg(paramObject1)) < 0) ? this.Con[-i - 1] : Sy(i, paramObject2); } public final boolean equals(Object paramObject) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof java/util/Map
/*    */     //   4: ifne -> 9
/*    */     //   7: iconst_0
/*    */     //   8: ireturn
/*    */     //   9: aload_1
/*    */     //   10: checkcast java/util/Map
/*    */     //   13: dup
/*    */     //   14: astore_1
/*    */     //   15: invokeinterface size : ()I
/*    */     //   20: aload_0
/*    */     //   21: getfield ir0 : I
/*    */     //   24: if_icmpeq -> 29
/*    */     //   27: iconst_0
/*    */     //   28: ireturn
/*    */     //   29: aload_0
/*    */     //   30: getfield QG0 : [Ljava/lang/Object;
/*    */     //   33: dup
/*    */     //   34: astore_2
/*    */     //   35: aload_0
/*    */     //   36: getfield Con : [Ljava/lang/Object;
/*    */     //   39: astore_0
/*    */     //   40: arraylength
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: dup
/*    */     //   44: iconst_m1
/*    */     //   45: iadd
/*    */     //   46: istore_3
/*    */     //   47: ifle -> 139
/*    */     //   50: aload_2
/*    */     //   51: iload_3
/*    */     //   52: aaload
/*    */     //   53: dup
/*    */     //   54: astore #4
/*    */     //   56: getstatic f/zb0.IM : Ljava/lang/Object;
/*    */     //   59: if_acmpeq -> 42
/*    */     //   62: aload #4
/*    */     //   64: getstatic f/zb0.ET : Ljava/lang/Object;
/*    */     //   67: if_acmpeq -> 42
/*    */     //   70: aload_0
/*    */     //   71: iload_3
/*    */     //   72: aaload
/*    */     //   73: dup
/*    */     //   74: astore #5
/*    */     //   76: ifnonnull -> 93
/*    */     //   79: aload_1
/*    */     //   80: aload #4
/*    */     //   82: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*    */     //   87: ifne -> 93
/*    */     //   90: goto -> 127
/*    */     //   93: aload_1
/*    */     //   94: aload #4
/*    */     //   96: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   101: dup
/*    */     //   102: astore #4
/*    */     //   104: aload #5
/*    */     //   106: if_acmpeq -> 131
/*    */     //   109: aload #4
/*    */     //   111: ifnull -> 127
/*    */     //   114: aload #4
/*    */     //   116: aload #5
/*    */     //   118: invokestatic Dz0 : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   121: ifeq -> 127
/*    */     //   124: goto -> 131
/*    */     //   127: iconst_0
/*    */     //   128: goto -> 132
/*    */     //   131: iconst_1
/*    */     //   132: ifne -> 42
/*    */     //   135: iconst_0
/*    */     //   136: goto -> 140
/*    */     //   139: iconst_1
/*    */     //   140: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 21
/*    */     //   #2	-> 30
/*    */     //   #3	-> 82
/*    */     //   #4	-> 118 } public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_1
/*    */     //   3: getfield QG0 : [Ljava/lang/Object;
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: aload_0
/*    */     //   9: getfield Con : [Ljava/lang/Object;
/*    */     //   12: astore_0
/*    */     //   13: arraylength
/*    */     //   14: istore_3
/*    */     //   15: iload_3
/*    */     //   16: dup
/*    */     //   17: iconst_m1
/*    */     //   18: iadd
/*    */     //   19: istore_3
/*    */     //   20: ifle -> 95
/*    */     //   23: aload_2
/*    */     //   24: iload_3
/*    */     //   25: aaload
/*    */     //   26: dup
/*    */     //   27: astore #4
/*    */     //   29: getstatic f/zb0.IM : Ljava/lang/Object;
/*    */     //   32: if_acmpeq -> 15
/*    */     //   35: aload #4
/*    */     //   37: getstatic f/zb0.ET : Ljava/lang/Object;
/*    */     //   40: if_acmpeq -> 15
/*    */     //   43: aload #4
/*    */     //   45: aload_0
/*    */     //   46: iload_3
/*    */     //   47: aaload
/*    */     //   48: astore #5
/*    */     //   50: ifnonnull -> 59
/*    */     //   53: iconst_0
/*    */     //   54: istore #4
/*    */     //   56: goto -> 66
/*    */     //   59: aload #4
/*    */     //   61: invokevirtual hashCode : ()I
/*    */     //   64: istore #4
/*    */     //   66: aload #5
/*    */     //   68: ifnonnull -> 77
/*    */     //   71: iconst_0
/*    */     //   72: istore #5
/*    */     //   74: goto -> 84
/*    */     //   77: aload #5
/*    */     //   79: invokevirtual hashCode : ()I
/*    */     //   82: istore #5
/*    */     //   84: iload_1
/*    */     //   85: iload #4
/*    */     //   87: iload #5
/*    */     //   89: ixor
/*    */     //   90: iadd
/*    */     //   91: istore_1
/*    */     //   92: goto -> 15
/*    */     //   95: iload_1
/*    */     //   96: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 3
/*    */     //   #2	-> 61
/*  3 */     //   #3	-> 79 } public final void Hj0(int paramInt) { Object[] arrayOfObject1; int i = (arrayOfObject1 = this.QG0).length, j = this.ir0; Object[] arrayOfObject2 = this.Con; Arrays.fill(this.QG0 = new Object[paramInt], zb0.IM); for (this.Con = new Object[paramInt]; i-- > 0; ) { Object object1; StringBuilder stringBuilder1, stringBuilder2; HashSet<Object> hashSet; Object object2; if ((object2 = arrayOfObject1[i]) == zb0.IM || object2 == zb0.ET) continue;  int k; if ((k = Dg(object2)) < 0) { String str; StringBuilder stringBuilder; HashSet<Class<?>> hashSet1; object1 = this.QG0[-k - 1]; i = this.ir0;
/*  4 */         this();
/*  5 */         this(); this(); Object[] arrayOfObject; int n; byte b2; for (n = (arrayOfObject = this.QG0).length, b2 = 0; b2 < n; ) { Object object; if ((object = arrayOfObject[b2]) != zb0.IM && object != zb0.ET) if (object != null) { hashSet1.add(object.getClass()); } else { hashSet1.add(null); }   b2++; }  if (hashSet1.size() > 1) { StringBuilder stringBuilder3; String str1; stringBuilder.append("\nMore than one type used for keys. Watch out for asymmetric equals(). Read about the 'Liskov substitution principle' and the implications for equals() in java."); stringBuilder.append("\nKey types: ").append(hashSet1);
/*  6 */           this(); if (this == object2) { str1 = "a == b"; } else { str1.append("Class of objects differ a=").append(getClass()).append(" vs b=").append(object2.getClass()); boolean bool1, bool2; if (getClass() != object2.getClass() && (bool1 = equals(object2)) != (bool2 = object2.equals(this))) { str1.append("\nequals() of a or b object are asymmetric"); str1.append("\na.equals(b) =").append(bool1); str1.append("\nb.equals(a) =").append(bool2); }  str1 = str1.toString(); }  stringBuilder
/*  7 */             .append(str1); }  stringBuilder2
/*  8 */           .append(stringBuilder.toString()); if (i != j)
/*  9 */         { str = RH0.KK("[Warning] apparent concurrent modification of the key set. Size before and after rehash() do not match ", j, " vs ", i); }
/* 10 */         else { str = ""; }  stringBuilder2
/* 11 */           .append(str);
/* 12 */         this();
/* 13 */         this(); int m; byte b1; for (m = arrayOfObject1.length, b1 = 0; b1 < m; ) { Object object; if ((object = arrayOfObject1[b1]) != zb0.IM && object != zb0.ET) hashSet.add(object);  b1++; }  if (hashSet
/* 14 */           .size() != j) { stringBuilder1.append("\nhashCode() and/or equals() have inconsistent implementation"); stringBuilder1.append("\nKey set lost entries, now got ").append(hashSet.size()).append(" instead of ").append(j); stringBuilder1.append(". This can manifest itself as an apparent duplicate key."); }  stringBuilder2
/* 15 */           .append(stringBuilder1.toString()); if (this == object2) stringBuilder2.append("Inserting same object twice, rehashing bug. Object= ").append(object2); 
/* 16 */         throw zb0.Tz0(stringBuilder2.toString(), this, object2); }  ((eJ0)super)
/* 17 */         .Con[hashSet] = stringBuilder2[stringBuilder1]; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Object get(Object paramObject) {
/*    */     int i;
/*    */     return ((i = bu(paramObject)) < 0) ? null : this.Con[i];
/*    */   }
/*    */   
/*    */   public final void clear() {
/*    */     if (this.ir0 == 0)
/*    */       return; 
/*    */     super.clear();
/*    */     Object object = zb0.IM;
/*    */     Arrays.fill(this.QG0, 0, this.QG0.length, this);
/*    */     Arrays.fill(this.Con, 0, this.Con.length, (Object)null);
/*    */   }
/*    */   
/*    */   public final Object remove(Object paramObject) {
/*    */     Object object = null;
/*    */     int i;
/*    */     if ((i = bu(paramObject)) >= 0) {
/*    */       object = this.Con[i];
/*    */       Cn0(i);
/*    */     } 
/*    */     return object;
/*    */   }
/*    */   
/*    */   public final void Cn0(int paramInt) {
/*    */     this.Con[paramInt] = null;
/*    */     super.Cn0(paramInt);
/*    */   }
/*    */   
/*    */   public final Collection values() {
/*    */     return new al0(this);
/*    */   }
/*    */   
/*    */   public final Set keySet() {
/*    */     return new G60(this);
/*    */   }
/*    */   
/*    */   public final Set entrySet() {
/*    */     return new lD0(this);
/*    */   }
/*    */   
/*    */   public final boolean containsValue(Object paramObject) {
/*    */     Object[] arrayOfObject1 = this.QG0;
/*    */     Object[] arrayOfObject2 = this.Con;
/*    */     if (paramObject == null) {
/*    */       int i = arrayOfObject2.length;
/*    */       while (i-- > 0) {
/*    */         Object object;
/*    */         if ((object = this[i]) != zb0.IM && object != zb0.ET && paramObject == arrayOfObject2[i])
/*    */           return true; 
/*    */       } 
/*    */     } else {
/*    */       int i = arrayOfObject2.length;
/*    */       while (i-- > 0) {
/*    */         Object object;
/*    */         if ((object = this[i]) != zb0.IM && object != zb0.ET && (paramObject == (object = arrayOfObject2[i]) || zb0.Dz0(paramObject, object)))
/*    */           return true; 
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean containsKey(Object paramObject) {
/*    */     boolean bool;
/*    */     if (bu(paramObject) >= 0) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public final void putAll(Map paramMap) {
/*    */     int i;
/*    */     int j;
/*    */     if ((i = paramMap.size()) > this.qm - (j = this.ir0)) {
/*    */       i = Math.max(j + 1, Yr0.Fg((i + j) / this.ri0) + 1);
/*    */       int[] arrayOfInt;
/*    */       if ((i = Arrays.binarySearch(arrayOfInt = gF.yv, i)) < 0)
/*    */         i = -i - 1; 
/*    */       Hj0(arrayOfInt[i]);
/*    */       this.qm = Math.min(i - 1, (int)(i * this.ri0));
/*    */       this.Mj = (i = this.QG0.length) - this.ir0;
/*    */     } 
/*    */     for (Iterator<Map.Entry> iterator = paramMap.entrySet().iterator(); iterator.hasNext(); ) {
/*    */       i = ((Map.Entry)iterator.next()).getKey();
/*    */       j = ((Map.Entry)iterator.next()).getValue();
/*    */       Sy(Dg(i), j);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(1);
/*    */     super.writeExternal(paramObjectOutput);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     int i = this.QG0.length;
/*    */     while (i-- > 0) {
/*    */       Object object;
/*    */       if ((object = this.QG0[i]) != zb0.ET && object != zb0.IM) {
/*    */         paramObjectOutput.writeObject(object);
/*    */         paramObjectOutput.writeObject(this.Con[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     if (paramObjectInput.readByte() != 0)
/*    */       super.readExternal(paramObjectInput); 
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       Object object1 = paramObjectInput.readObject(), object2 = paramObjectInput.readObject();
/*    */       Sy(Dg(object1), object2);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final Object Sy(int paramInt, Object paramObject) {
/*    */     Object object = null;
/*    */     boolean bool = true;
/*    */     if (paramInt < 0) {
/*    */       paramInt = -paramInt - 1;
/*    */       object = this.Con[paramInt];
/*    */       bool = false;
/*    */     } 
/*    */     this.Con[paramInt] = paramObject;
/*    */     if (bool)
/*    */       xt0(this.Hs); 
/*    */     return object;
/*    */   }
/*    */   
/*    */   public eJ0(int paramInt) {
/*    */     super(paramInt);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eJ0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */