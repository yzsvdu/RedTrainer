/*  1 */ package f;public final class y70 extends zb0 implements ae { public static final long serialVersionUID = 1L; public transient double[] jI0; public final void Hj0(int paramInt) { Object[] arrayOfObject; int i = (arrayOfObject = this.QG0).length; double[] arrayOfDouble1 = this.jI0; Arrays.fill(this.QG0 = new Object[paramInt], zb0.IM); this.jI0 = arrayOfDouble2; double[] arrayOfDouble2; Arrays.fill(arrayOfDouble2 = new double[paramInt], this.P6); while (i-- > 0) { Object object; if ((object = arrayOfObject[i]) != zb0.IM && object != zb0.ET) { int j; if ((j = Dg(object)) >= 0) { this.QG0[j] = object; this.jI0[j] = arrayOfDouble1[i]; continue; }  throw zb0.Tz0("", this.QG0[-j - 1], object); }  }  } public double P6 = nc0.Pd0; public final int J00(int paramInt) { this.jI0 = new double[super.J00(paramInt)]; return super.J00(paramInt); } public final void Cn0(int paramInt) { this.jI0[paramInt] = this.P6; super.Cn0(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof ae)) return false;  if (((zi0)(paramObject = paramObject)).ir0 != this
/*  2 */       .ir0) return false;  
/*  3 */     try { int i = this.ir0;
/*  4 */       int j = FH(); while (i == this
/*  5 */         .ir0)
/*  6 */       { boolean bool; int k; Object object; for (Object[] arrayOfObject = this.QG0; k-- > 0 && ((object = arrayOfObject[k]) == zb0.IM || object == zb0.ET);); if (k >= 0) { bool = true; } else { bool = false; }  if (bool) { if (i == this
/*  7 */             .ir0) {
/*  8 */             Object object1; for (Object[] arrayOfObject1 = this.QG0; j-- > 0 && ((object1 = arrayOfObject1[j]) == zb0.IM || object1 == zb0.ET);); if (j >= 0) {
/*  9 */               Object object2 = this.QG0[j]; double d1;
/* 10 */               if ((d1 = this.jI0[j]) == this
/* 11 */                 .P6) {
/* 12 */                 y70 y702; int n; if ((n = (y702 = (y70)paramObject).bu(object2)) < 0) {  } else {  }
/* 13 */                  d1 = y702.jI0[n]; if (d1 == ((y70)paramObject)
/*    */                   
/* 15 */                   .P6) { if (((y70)paramObject)
/*    */                     
/* 17 */                     .bu(object2) >= 0) { m = 1; } else { m = 0; }  if (!m) return false;  continue; }  return false;
/*    */               }  int m; y70 y701;
/* 19 */               if ((m = (y701 = (y70)paramObject).bu(m)) < 0) {  } else {  }
/* 20 */                double d2 = y701.jI0[m]; if (d1 != d2) return false;  continue;
/* 21 */             }  throw new NoSuchElementException();
/* 22 */           }  throw new ConcurrentModificationException(); }
/* 23 */          return true; }  } catch (ClassCastException classCastException) {} throw new ConcurrentModificationException(); }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: iconst_0
/*    */     //   3: istore_0
/*    */     //   4: getfield QG0 : [Ljava/lang/Object;
/*    */     //   7: astore_1
/*    */     //   8: getfield jI0 : [D
/*    */     //   11: dup
/*    */     //   12: astore_2
/*    */     //   13: arraylength
/*    */     //   14: istore_3
/*    */     //   15: iload_3
/*    */     //   16: dup
/*    */     //   17: iconst_m1
/*    */     //   18: iadd
/*    */     //   19: istore_3
/*    */     //   20: ifle -> 121
/*    */     //   23: aload_1
/*    */     //   24: iload_3
/*    */     //   25: aaload
/*    */     //   26: dup
/*    */     //   27: astore #4
/*    */     //   29: getstatic f/zb0.IM : Ljava/lang/Object;
/*    */     //   32: if_acmpeq -> 15
/*    */     //   35: aload #4
/*    */     //   37: getstatic f/zb0.ET : Ljava/lang/Object;
/*    */     //   40: if_acmpeq -> 15
/*    */     //   43: aload_2
/*    */     //   44: iload_3
/*    */     //   45: daload
/*    */     //   46: dstore #4
/*    */     //   48: getstatic f/Yr0.s00 : Z
/*    */     //   51: ifne -> 75
/*    */     //   54: dload #4
/*    */     //   56: invokestatic isNaN : (D)Z
/*    */     //   59: ifne -> 65
/*    */     //   62: goto -> 75
/*    */     //   65: new java/lang/AssertionError
/*    */     //   68: dup
/*    */     //   69: ldc 'Values of NaN are not supported.'
/*    */     //   71: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   74: athrow
/*    */     //   75: aload_1
/*    */     //   76: iload_3
/*    */     //   77: dload #4
/*    */     //   79: invokestatic doubleToLongBits : (D)J
/*    */     //   82: dup2
/*    */     //   83: bipush #32
/*    */     //   85: lushr
/*    */     //   86: lxor
/*    */     //   87: l2i
/*    */     //   88: istore #4
/*    */     //   90: aaload
/*    */     //   91: dup
/*    */     //   92: astore #5
/*    */     //   94: ifnonnull -> 103
/*    */     //   97: iconst_0
/*    */     //   98: istore #5
/*    */     //   100: goto -> 110
/*    */     //   103: aload #5
/*    */     //   105: invokevirtual hashCode : ()I
/*    */     //   108: istore #5
/*    */     //   110: iload_0
/*    */     //   111: iload #4
/*    */     //   113: iload #5
/*    */     //   115: ixor
/*    */     //   116: iadd
/*    */     //   117: istore_0
/*    */     //   118: goto -> 15
/*    */     //   121: iload_0
/*    */     //   122: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 48
/*    */     //   #2	-> 90
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(0);
/*    */     super.writeExternal(paramObjectOutput);
/*    */     paramObjectOutput.writeDouble(this.P6);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     int i = this.QG0.length;
/*    */     while (i-- > 0) {
/*    */       Object object;
/*    */       if ((object = this.QG0[i]) != zb0.ET && object != zb0.IM) {
/*    */         paramObjectOutput.writeObject(object);
/*    */         paramObjectOutput.writeDouble(this.jI0[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.P6 = paramObjectInput.readDouble();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       Object object = paramObjectInput.readObject();
/*    */       double d = paramObjectInput.readDouble();
/*    */       boolean bool = true;
/*    */       int j;
/*    */       if ((j = Dg(object)) < 0) {
/*    */         j = -j - 1;
/*    */         this.jI0[j];
/*    */         bool = false;
/*    */       } 
/*    */       this.jI0[j] = d;
/*    */       if (bool)
/*    */         xt0(this.Hs); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     double[] arrayOfDouble;
/*    */     boolean bool;
/*    */     Object[] arrayOfObject;
/*    */     int i;
/*    */     for (bool = true, arrayOfDouble = this.jI0, i = (arrayOfObject = this.QG0).length; i-- > 0;) {
/*    */       if ((object = arrayOfObject[i]) != zb0.IM && object != zb0.ET) {
/*    */         double d = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(object).append("=").append(d);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y70.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */