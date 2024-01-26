/*  1 */ package f;public final class Fm extends zb0 implements hy0 { public static final long serialVersionUID = 1L; public transient byte[] pC0; public final void Hj0(int paramInt) { Object[] arrayOfObject; int i = (arrayOfObject = this.QG0).length; byte[] arrayOfByte1 = this.pC0; Arrays.fill(this.QG0 = new Object[paramInt], zb0.IM); this.pC0 = arrayOfByte2; byte[] arrayOfByte2; Arrays.fill(arrayOfByte2 = new byte[paramInt], this.Pw0); while (i-- > 0) { Object object; if ((object = arrayOfObject[i]) != zb0.IM && object != zb0.ET) { int j; if ((j = Dg(object)) >= 0) { this.QG0[j] = object; this.pC0[j] = arrayOfByte1[i]; continue; }  throw zb0.Tz0("", this.QG0[-j - 1], object); }  }  } public byte Pw0 = nc0.il; public final int J00(int paramInt) { this.pC0 = new byte[super.J00(paramInt)]; return super.J00(paramInt); } public final void Cn0(int paramInt) { this.pC0[paramInt] = this.Pw0; super.Cn0(paramInt); } public final boolean equals(Object paramObject) { if (!(paramObject instanceof hy0)) return false;  int i; if (((zi0)(paramObject = paramObject)).ir0 != (
/*  2 */       i = this.ir0)) return false;  
/*  3 */     try { int j = this.QG0.length; while (i == this
/*  4 */         .ir0)
/*  5 */       { Object[] arrayOfObject; int k; Object object; for (arrayOfObject = this.QG0, k = j; k-- > 0 && ((object = arrayOfObject[k]) == zb0.IM || object == zb0.ET);); if ((k >= 0)) { if (i == this
/*  6 */             .ir0) {
/*  7 */             Object object1; for (arrayOfObject = this.QG0; j-- > 0 && ((object1 = arrayOfObject[j]) == zb0.IM || object1 == zb0.ET);); if (j >= 0) {
/*  8 */               Object object2 = this.QG0[j]; byte b;
/*  9 */               if ((b = this.pC0[j]) == this
/* 10 */                 .Pw0) {
/* 11 */                 Fm fm; int n; if ((n = (fm = (Fm)paramObject).bu(object2)) < 0) {  } else {  }
/* 12 */                  b = fm.pC0[n]; if (b == ((Fm)paramObject)
/*    */                   
/* 14 */                   .Pw0) { if (((Fm)paramObject)
/*    */                     
/* 16 */                     .bu(object2) >= 0) { m = 1; } else { m = 0; }  if (!m) return false;  continue; }  return false;
/*    */               }  int m;
/* 18 */               if ((m = (object = paramObject).bu(m)) < 0) {  } else {  }
/* 19 */                m = ((Fm)object).pC0[m]; if (b != m) return false;  continue;
/* 20 */             }  throw new NoSuchElementException();
/* 21 */           }  throw new ConcurrentModificationException(); }
/* 22 */          return true; }  } catch (ClassCastException classCastException) {} throw new ConcurrentModificationException(); }
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
/*    */     //   8: getfield pC0 : [B
/*    */     //   11: dup
/*    */     //   12: astore_2
/*    */     //   13: arraylength
/*    */     //   14: istore_3
/*    */     //   15: iload_3
/*    */     //   16: dup
/*    */     //   17: iconst_m1
/*    */     //   18: iadd
/*    */     //   19: istore_3
/*    */     //   20: ifle -> 77
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
/*    */     //   43: aload #4
/*    */     //   45: aload_2
/*    */     //   46: iload_3
/*    */     //   47: baload
/*    */     //   48: istore #5
/*    */     //   50: ifnonnull -> 59
/*    */     //   53: iconst_0
/*    */     //   54: istore #4
/*    */     //   56: goto -> 66
/*    */     //   59: aload #4
/*    */     //   61: invokevirtual hashCode : ()I
/*    */     //   64: istore #4
/*    */     //   66: iload_0
/*    */     //   67: iload #5
/*    */     //   69: iload #4
/*    */     //   71: ixor
/*    */     //   72: iadd
/*    */     //   73: istore_0
/*    */     //   74: goto -> 15
/*    */     //   77: iload_0
/*    */     //   78: ireturn
/*    */   }
/*    */   
/*    */   public final void writeExternal(ObjectOutput paramObjectOutput) {
/*    */     paramObjectOutput.writeByte(0);
/*    */     super.writeExternal(paramObjectOutput);
/*    */     paramObjectOutput.writeByte(this.Pw0);
/*    */     paramObjectOutput.writeInt(this.ir0);
/*    */     int i = this.QG0.length;
/*    */     while (i-- > 0) {
/*    */       Object object;
/*    */       if ((object = this.QG0[i]) != zb0.ET && object != zb0.IM) {
/*    */         paramObjectOutput.writeObject(object);
/*    */         paramObjectOutput.writeByte(this.pC0[i]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void readExternal(ObjectInput paramObjectInput) {
/*    */     paramObjectInput.readByte();
/*    */     super.readExternal(paramObjectInput);
/*    */     this.Pw0 = paramObjectInput.readByte();
/*    */     int i;
/*    */     J00(i = paramObjectInput.readInt());
/*    */     while (i-- > 0) {
/*    */       Object object = paramObjectInput.readObject();
/*    */       ej(paramObjectInput.readByte(), object);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     this("{");
/*    */     StringBuilder stringBuilder;
/*    */     byte[] arrayOfByte;
/*    */     boolean bool;
/*    */     Object[] arrayOfObject;
/*    */     int i;
/*    */     for (bool = true, arrayOfByte = this.pC0, i = (arrayOfObject = this.QG0).length; i-- > 0;) {
/*    */       if ((object = arrayOfObject[i]) != zb0.IM && object != zb0.ET) {
/*    */         byte b = this[i];
/*    */         if (bool) {
/*    */           bool = false;
/*    */         } else {
/*    */           stringBuilder.append(",");
/*    */         } 
/*    */         stringBuilder.append(object).append("=").append(b);
/*    */       } 
/*    */     } 
/*    */     stringBuilder.append("}");
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public final void ej(byte paramByte, Object paramObject) {
/*    */     boolean bool = true;
/*    */     int i;
/*    */     if ((i = Dg(paramObject)) < 0) {
/*    */       i = -i - 1;
/*    */       this.pC0[i];
/*    */       bool = false;
/*    */     } 
/*    */     this.pC0[i] = paramByte;
/*    */     if (bool)
/*    */       xt0(this.Hs); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */