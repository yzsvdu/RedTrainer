/* 1 */ package f;public abstract class zb0 extends zi0 { public static final long serialVersionUID = -3461112548087185871L; public static final Object ET = new Object(); public static final Object IM = new Object(); public static IllegalArgumentException Tz0(String paramString, Object paramObject1, Object paramObject2) { IllegalArgumentException illegalArgumentException = new IllegalArgumentException(); StringBuilder stringBuilder1 = B40.df("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =");
/* 2 */     this(); Class<?> clazz1; int i; Class<?> clazz2; int j; if (paramObject1 == null) { String str = "class null"; } else { clazz2 = paramObject1.getClass(); }  StringBuilder stringBuilder2 = stringBuilder2.append(clazz2).append(" id= ").append(System.identityHashCode(paramObject1)).append(" hashCode= "); if (paramObject1 == null) { j = 0; } else { j = paramObject1.hashCode(); }
/* 3 */      paramObject1 = stringBuilder1.append(stringBuilder2.append(j).append(" toString= ").append(String.valueOf(paramObject1)).toString()).append("; object #2 =");
/* 4 */     this(); if (paramObject2 == null) { String str = "class null"; } else { clazz1 = paramObject2.getClass(); }  stringBuilder1 = stringBuilder1.append(clazz1).append(" id= ").append(System.identityHashCode(paramObject2)).append(" hashCode= "); if (paramObject2 == null) { i = 0; } else { i = paramObject2.hashCode(); }
/* 5 */      this(paramObject1.append(stringBuilder1.append(i).append(" toString= ").append(String.valueOf(paramObject2)).toString()).append("\n").append(paramString).toString()); return illegalArgumentException; } public transient Object[] QG0; public boolean Hs; public zb0() {} public zb0(int paramInt) { super(paramInt); } public static boolean Dz0(Object paramObject1, Object paramObject2) { return (paramObject2 == null || paramObject2 == ET) ? false : paramObject1.equals(paramObject2); } public void Cn0(int paramInt) { this.QG0[paramInt] = ET; this.ir0 = paramInt = this.ir0 - 1; int i = this.Vh0 - 1; if (this.Q0 != 0.0F && !this.IC && i <= 0) { paramInt = Math.max(paramInt + 1, Yr0.Fg(paramInt / this.ri0) + 1); int[] arrayOfInt; if ((paramInt = Arrays.binarySearch(arrayOfInt = gF.yv, paramInt)) < 0) paramInt = -paramInt - 1;  Hj0(arrayOfInt[paramInt]); this.qm = Math.min(paramInt - 1, (int)(paramInt * this.ri0)); this.Mj = (paramInt = FH()) - (paramInt = this.ir0); float f; int j;
/* 6 */       if ((j = (f = this.Q0) cmp 0.0F) != 0 && j != 0) this
/* 7 */           .Vh0 = (int)(paramInt * f + 0.5F);  }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int FH() {
/*   */     return this.QG0.length;
/*   */   }
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     int arrayOfInt[], j;
/*   */     if ((j = Arrays.binarySearch(arrayOfInt = gF.yv, paramInt)) < 0)
/*   */       j = -j - 1; 
/*   */     this.qm = Math.min(i - 1, (int)(i * this.ri0));
/*   */     int i;
/*   */     this.Mj = (i = arrayOfInt[j]) - this.ir0;
/*   */     float f;
/*   */     if ((f = this.Q0) != 0.0F)
/*   */       this.Vh0 = (int)(paramInt * f + 0.5F); 
/*   */     Arrays.fill(this.QG0 = new Object[i], IM);
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int bu(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: ifnonnull -> 57
/*   */     //   4: aload_0
/*   */     //   5: iconst_0
/*   */     //   6: istore_0
/*   */     //   7: getfield QG0 : [Ljava/lang/Object;
/*   */     //   10: dup
/*   */     //   11: astore_1
/*   */     //   12: arraylength
/*   */     //   13: istore_2
/*   */     //   14: iconst_0
/*   */     //   15: istore_3
/*   */     //   16: iload_3
/*   */     //   17: iload_2
/*   */     //   18: if_icmpge -> 53
/*   */     //   21: aload_1
/*   */     //   22: iload_3
/*   */     //   23: aaload
/*   */     //   24: dup
/*   */     //   25: astore #4
/*   */     //   27: ifnonnull -> 33
/*   */     //   30: goto -> 55
/*   */     //   33: aload #4
/*   */     //   35: getstatic f/zb0.IM : Ljava/lang/Object;
/*   */     //   38: if_acmpne -> 44
/*   */     //   41: goto -> 53
/*   */     //   44: iinc #0, 1
/*   */     //   47: iinc #3, 1
/*   */     //   50: goto -> 16
/*   */     //   53: iconst_m1
/*   */     //   54: istore_0
/*   */     //   55: iload_0
/*   */     //   56: ireturn
/*   */     //   57: aload_0
/*   */     //   58: aload_1
/*   */     //   59: invokevirtual hashCode : ()I
/*   */     //   62: ldc 2147483647
/*   */     //   64: iand
/*   */     //   65: istore_2
/*   */     //   66: getfield QG0 : [Ljava/lang/Object;
/*   */     //   69: dup
/*   */     //   70: iload_2
/*   */     //   71: swap
/*   */     //   72: arraylength
/*   */     //   73: irem
/*   */     //   74: dup
/*   */     //   75: istore_3
/*   */     //   76: aaload
/*   */     //   77: dup
/*   */     //   78: astore #4
/*   */     //   80: getstatic f/zb0.IM : Ljava/lang/Object;
/*   */     //   83: if_acmpne -> 88
/*   */     //   86: iconst_m1
/*   */     //   87: ireturn
/*   */     //   88: aload #4
/*   */     //   90: aload_1
/*   */     //   91: if_acmpeq -> 189
/*   */     //   94: aload_1
/*   */     //   95: aload #4
/*   */     //   97: invokestatic Dz0 : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*   */     //   100: ifeq -> 106
/*   */     //   103: goto -> 189
/*   */     //   106: aload_0
/*   */     //   107: getfield QG0 : [Ljava/lang/Object;
/*   */     //   110: dup
/*   */     //   111: astore_0
/*   */     //   112: arraylength
/*   */     //   113: dup
/*   */     //   114: istore #4
/*   */     //   116: iconst_2
/*   */     //   117: iload_2
/*   */     //   118: iconst_1
/*   */     //   119: invokestatic Zf : (IIII)I
/*   */     //   122: istore_2
/*   */     //   123: iload_3
/*   */     //   124: istore #5
/*   */     //   126: iload #5
/*   */     //   128: iload_2
/*   */     //   129: isub
/*   */     //   130: dup
/*   */     //   131: istore #5
/*   */     //   133: ifge -> 143
/*   */     //   136: iload #5
/*   */     //   138: iload #4
/*   */     //   140: iadd
/*   */     //   141: istore #5
/*   */     //   143: aload_0
/*   */     //   144: iload #5
/*   */     //   146: aaload
/*   */     //   147: dup
/*   */     //   148: astore #6
/*   */     //   150: getstatic f/zb0.IM : Ljava/lang/Object;
/*   */     //   153: if_acmpne -> 159
/*   */     //   156: goto -> 183
/*   */     //   159: aload #6
/*   */     //   161: aload_1
/*   */     //   162: if_acmpeq -> 186
/*   */     //   165: aload_1
/*   */     //   166: aload #6
/*   */     //   168: invokestatic Dz0 : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*   */     //   171: ifeq -> 177
/*   */     //   174: goto -> 186
/*   */     //   177: iload #5
/*   */     //   179: iload_3
/*   */     //   180: if_icmpne -> 126
/*   */     //   183: iconst_m1
/*   */     //   184: istore #5
/*   */     //   186: iload #5
/*   */     //   188: ireturn
/*   */     //   189: iload_3
/*   */     //   190: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 59
/*   */     //   #3	-> 66
/*   */     //   #4	-> 107
/*   */     //   #5	-> 119
/*   */     //   #6	-> 146
/*   */   }
/*   */   
/*   */   public final int Dg(Object paramObject) {
/*   */     this.Hs = false;
/*   */     if (paramObject == null) {
/*   */       int i1;
/*   */       int i2;
/*   */       Object[] arrayOfObject1;
/*   */       int i3;
/*   */       byte b;
/*   */       for (i1 = 0, i2 = -1, i3 = (arrayOfObject1 = this.QG0).length, b = 0; b < i3; ) {
/*   */         Object object1;
/*   */         if ((object1 = arrayOfObject1[b]) == ET && i2 == -1)
/*   */           i2 = i1; 
/*   */         if (object1 == IM) {
/*   */           if (i2 != -1) {
/*   */             this.QG0[i2] = null;
/*   */             i1 = i2;
/*   */             // Byte code: goto -> 128
/*   */           } 
/*   */           this.Hs = true;
/*   */           this.QG0[i1] = null;
/*   */           // Byte code: goto -> 128
/*   */         } 
/*   */         if (object1 == null) {
/*   */           i1 = -i1 - 1;
/*   */           // Byte code: goto -> 128
/*   */         } 
/*   */         i1++;
/*   */         b++;
/*   */       } 
/*   */       if (i2 != -1) {
/*   */         this.QG0[i2] = null;
/*   */         return i2;
/*   */       } 
/*   */       throw new IllegalStateException("Could not find insertion index for null key. Key set full!?!!");
/*   */     } 
/*   */     int i = paramObject.hashCode() & Integer.MAX_VALUE;
/*   */     Object[] arrayOfObject;
/*   */     int j;
/*   */     Object object;
/*   */     if ((object = (arrayOfObject = this.QG0)[j = i % arrayOfObject.length]) == IM) {
/*   */       this.Hs = true;
/*   */       arrayOfObject[j] = paramObject;
/*   */       return j;
/*   */     } 
/*   */     if (object == paramObject || Dz0(paramObject, object))
/*   */       return -j - 1; 
/*   */     int k;
/*   */     i = Ck.Zf(k = (arrayOfObject = this.QG0).length, 2, i, 1);
/*   */     int m = -1, n = j;
/*   */     while (true) {
/*   */       if (object == ET && m == -1)
/*   */         m = n; 
/*   */       int i1;
/*   */       if ((i1 = n - i) < 0)
/*   */         i1 += k; 
/*   */       Object object2;
/*   */       if ((object2 = arrayOfObject[i1]) == IM) {
/*   */         if (m != -1) {
/*   */           this.QG0[m] = paramObject;
/*   */           break;
/*   */         } 
/*   */         this.Hs = true;
/*   */         this.QG0[i1] = paramObject;
/*   */         m = i1;
/*   */         break;
/*   */       } 
/*   */       if (object2 == paramObject || Dz0(paramObject, object2)) {
/*   */         m = -i1 - 1;
/*   */         break;
/*   */       } 
/*   */       if (i1 == j) {
/*   */         if (m != -1) {
/*   */           this.QG0[m] = paramObject;
/*   */           break;
/*   */         } 
/*   */         throw new IllegalStateException("No free or removed slots available. Key set full?!!");
/*   */       } 
/*   */       int i2 = i1;
/*   */       Object object1 = object2;
/*   */     } 
/*   */     return m;
/*   */   }
/*   */   
/*   */   public void writeExternal(ObjectOutput paramObjectOutput) {
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeByte(0);
/*   */     paramObjectOutput.writeFloat(this.ri0);
/*   */     paramObjectOutput.writeFloat(this.Q0);
/*   */   }
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     super.readExternal(paramObjectInput);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zb0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */