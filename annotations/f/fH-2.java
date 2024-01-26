/*  1 */ package f;public final class fH extends ps0 { public static final long serialVersionUID = 1L; public transient Object[] Mx0; public final boolean C6(long paramLong) { boolean bool; if (mm(paramLong) >= 0) { bool = true; } else { bool = false; }  return bool; } public long Rv0; public final int J00(int paramInt) { this.Mx0 = new Object[super.J00(paramInt)]; return super.J00(paramInt); } public final void Hj0(int paramInt) { long[] arrayOfLong; int i = (arrayOfLong = this.fb).length; Object[] arrayOfObject = this.Mx0; byte[] arrayOfByte = this.JO; this.fb = new long[paramInt]; this.Mx0 = new Object[paramInt]; this.JO = new byte[paramInt]; while (i-- > 0) { if (arrayOfByte[i] == 1) { int j = xq(arrayOfLong[i]); this.Mx0[j] = arrayOfObject[i]; }  }  } public final void Id(int paramInt) { this.Mx0[paramInt] = null; super.Id(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof fH)) return false;  int i; if (((zi0)(paramObject = paramObject)).ir0 != (
/*  2 */       i = this.ir0)) return false;  
/*  3 */     try { int j = this.JO.length; while (i == this
/*  4 */         .ir0)
/*  5 */       { byte[] arrayOfByte; int k; for (arrayOfByte = this.JO, k = j; k-- > 0 && arrayOfByte[k] != 1;); if ((k >= 0)) { if (i == this
/*  6 */             .ir0) {
/*  7 */             for (arrayOfByte = this.JO; j-- > 0 && arrayOfByte[j] != 1;); if (j >= 0) {
/*  8 */               Object object1; long l = this.fb[j]; Object object2;
/*  9 */               if ((object2 = this.Mx0[j]) == null) {
/* 10 */                 int n; if ((n = paramObject.mm(l)) < 0) { object2 = null; } else { object2 = ((fH)paramObject).Mx0[object2]; }  if (object2 != null || 
/* 11 */                   !paramObject.C6(l)) return false;  continue;
/* 12 */               }  int m; if ((m = paramObject.mm(l)) < 0) { object1 = null; } else { object1 = ((fH)paramObject).Mx0[object1]; }
/* 13 */                if (!object2.equals(object1)) return false;  continue;
/* 14 */             }  throw new NoSuchElementException();
/* 15 */           }  throw new ConcurrentModificationException(); }
/* 16 */          return true; }  } catch (ClassCastException classCastException) {} throw new ConcurrentModificationException(); }
/*    */ 
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore_1
/*    */     //   3: getfield Mx0 : [Ljava/lang/Object;
/*    */     //   6: dup
/*    */     //   7: astore_2
/*    */     //   8: aload_0
/*    */     //   9: getfield JO : [B
/*    */     //   12: astore_3
/*    */     //   13: arraylength
/*    */     //   14: istore #4
/*    */     //   16: iload #4
/*    */     //   18: dup
/*    */     //   19: iconst_m1
/*    */     //   20: iadd
/*    */     //   21: istore #4
/*    */     //   23: ifle -> 80
/*    */     //   26: aload_3
/*    */     //   27: iload #4
/*    */     //   29: baload
/*    */     //   30: iconst_1
/*    */     //   31: if_icmpne -> 16
/*    */     //   34: aload_2
/*    */     //   35: iload #4
/*    */     //   37: aload_0
/*    */     //   38: getfield fb : [J
/*    */     //   41: iload #4
/*    */     //   43: laload
/*    */     //   44: invokestatic H50 : (J)I
/*    */     //   47: istore #5
/*    */     //   49: aaload
/*    */     //   50: dup
/*    */     //   51: astore #6
/*    */     //   53: ifnonnull -> 62
/*    */     //   56: iconst_0
/*    */     //   57: istore #6
/*    */     //   59: goto -> 69
/*    */     //   62: aload #6
/*    */     //   64: invokevirtual hashCode : ()I
/*    */     //   67: istore #6
/*    */     //   69: iload_1
/*    */     //   70: iload #5
/*    */     //   72: iload #6
/*    */     //   74: ixor
/*    */     //   75: iadd
/*    */     //   76: istore_1
/*    */     //   77: goto -> 16
/*    */     //   80: iload_1
/*    */     //   81: ireturn
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(0);
/*    */     paramObjectOutput.writeByte(0);
/*    */     paramObjectOutput.writeFloat(this.ri0);
/*    */     paramObjectOutput.writeFloat(this.Q0);
/*    */     paramObjectOutput.writeLong(this.Rv0);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     for (int i = this.JO.length; i-- > 0;) {
/*    */       if (this.JO[i] == 1) {
/*    */         paramObjectOutput.writeLong(this.fb[i]);
/*    */         paramObjectOutput.writeObject(this.Mx0[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.Rv0 = paramObjectInput.readLong();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       long l = paramObjectInput.readLong();
/*    */       Object object = paramObjectInput.readObject();
/*    */       Gm(l, object);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     Object[] arrayOfObject;
/*    */     boolean bool;
/*    */     byte[] arrayOfByte;
/*    */     long[] arrayOfLong;
/*    */     int i;
/*    */     for (bool = true, arrayOfByte = this.JO, arrayOfObject = this.Mx0, i = (arrayOfLong = this.fb).length; i-- > 0;) {
/*    */       if (arrayOfByte[i] == 1) {
/*    */         long l = arrayOfLong[i];
/*    */         Object object = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(l);
/*    */         stringBuilder.append("=");
/*    */         stringBuilder.append(object);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public final void Gm(long paramLong, Object paramObject) {
/*    */     boolean bool = true;
/*    */     int i;
/*    */     if ((i = xq(paramLong)) < 0) {
/*    */       i = -i - 1;
/*    */       this.Mx0[i];
/*    */       bool = false;
/*    */     } 
/*    */     this.Mx0[i] = paramObject;
/*    */     if (bool)
/*    */       xt0(this.zn0); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fH.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */