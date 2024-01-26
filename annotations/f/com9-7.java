/* 1 */ package f;public final class com9 implements Iterable { public int Z3; public Object[] gg; public float[] lPT5; public float Tz; public int Ei0; public int UC0; public final int Sr(Object paramObject) { if (paramObject != null) { Object[] arrayOfObject = this.gg; int i = (int)(paramObject.hashCode() * -7046029254386353131L >>> this.UC0); while (true)
/* 2 */       { Object object; if ((object = arrayOfObject[i]) == null) return -(i + 1);  if (object.equals(paramObject)) return i;  i = i + 1 & this.y3; }  }  throw new IllegalArgumentException("key cannot be null."); } public int y3; public transient av XY; public transient av Wl; public com9() { this(51, 0.8F); } public com9(int paramInt) { this(paramInt, 0.8F); } public com9(int paramInt, float paramFloat) { if (paramFloat > 0.0F && paramFloat < 1.0F) { this.Tz = paramFloat; this.Ei0 = (int)(paramInt * paramFloat); int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1; this.UC0 = Long.numberOfLeadingZeros(i); this.gg = new Object[paramInt]; this.lPT5 = new float[paramInt]; return; }  throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat); } public com9(com9 paramcom9) { this(j, paramcom9.Tz); Object[] arrayOfObject = this.gg; int k = paramcom9.gg.length; System.arraycopy(paramcom9.gg, 0, arrayOfObject, 0, k); float[] arrayOfFloat = this.lPT5; int i = paramcom9.lPT5.length; System.arraycopy(paramcom9.lPT5, 0, this, 0, i); this.Z3 = paramcom9.Z3; } public final int hashCode() { float[] arrayOfFloat; int i; Object[] arrayOfObject; byte b; int j; for (i = this.Z3, arrayOfFloat = this.lPT5, b = 0, j = (arrayOfObject = this.gg).length; b < j; ) { Object object; if ((object = arrayOfObject[b]) != null) { int k = object.hashCode(); i = Float.floatToRawIntBits(this[b]) + k + i; }  b++; }  return i; } public final boolean equals(Object paramObject) { if (paramObject == this) return true;  if (!(paramObject instanceof com9)) return false;  if (((com9)(paramObject = paramObject)).Z3 != this.Z3) return false;  float[] arrayOfFloat; Object[] arrayOfObject; byte b; int i; for (arrayOfFloat = this.lPT5, b = 0, i = (arrayOfObject = this.gg).length; b < i; ) { Object object; if ((object = arrayOfObject[b]) != null) { float f = 0.0F; int j; if ((j = paramObject.Sr(object)) >= 0) f = ((com9)paramObject).lPT5[j];  if (f == 0.0F) { boolean bool; if (paramObject.Sr(object) >= 0) { bool = true; } else { bool = false; }  if (!bool) return false;  }  if (f != this[b])
/* 3 */           return false;  }  b++; }  return true; }
/*   */ 
/*   */   
/*   */   public final String toString() {
/*   */     String str1, str2 = ", ";
/*   */     if (this.Z3 == 0) {
/*   */       str1 = "{}";
/*   */     } else {
/*   */       StringBuilder stringBuilder;
/*   */       this(32);
/*   */       (new StringBuilder()).append('{');
/*   */       float[] arrayOfFloat;
/*   */       Object[] arrayOfObject;
/*   */       int i;
/*   */       for (arrayOfFloat = ((com9)super).lPT5, i = (arrayOfObject = ((com9)super).gg).length; i-- > 0; ) {
/*   */         Object object;
/*   */         if ((object = arrayOfObject[i]) == null)
/*   */           continue; 
/*   */         stringBuilder.append(object);
/*   */         stringBuilder.append('=');
/*   */         stringBuilder.append(this[i]);
/*   */       } 
/*   */       while (i-- > 0) {
/*   */         Object object;
/*   */         if ((object = arrayOfObject[i]) == null)
/*   */           continue; 
/*   */         stringBuilder.append(str2);
/*   */         stringBuilder.append(object);
/*   */         stringBuilder.append('=');
/*   */         stringBuilder.append(this[i]);
/*   */       } 
/*   */       stringBuilder.append('}');
/*   */       str1 = stringBuilder.toString();
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     av av1;
/*   */     if (this.XY == null) {
/*   */       av av3;
/*   */       this(this);
/*   */       this.XY = av3;
/*   */       this(this);
/*   */       this.Wl = av3;
/*   */     } 
/*   */     av av2;
/*   */     if (!(av2 = this.XY).Nt) {
/*   */       av2.ox0();
/*   */       (av1 = this.XY).Nt = true;
/*   */       this.Wl.Nt = false;
/*   */     } else {
/*   */       ((com9)super).Wl.ox0();
/*   */       (av1 = ((com9)super).Wl).Nt = true;
/*   */       ((com9)super).XY.Nt = false;
/*   */     } 
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/com9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */