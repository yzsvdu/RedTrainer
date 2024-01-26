/* 1 */ package f;public final class Nu0 implements Iterable { public int Ty; public Object[] q40; public int[] d50; public float Ke; public int Dx; public int pG; public final int aD0(Object paramObject) { if (paramObject != null) { Object[] arrayOfObject = this.q40; int i = (int)(paramObject.hashCode() * -7046029254386353131L >>> this.pG); while (true)
/* 2 */       { Object object; if ((object = arrayOfObject[i]) == null) return -(i + 1);  if (object.equals(paramObject)) return i;  i = i + 1 & this.Ug; }  }  throw new IllegalArgumentException("key cannot be null."); } public int Ug; public transient oO fM0; public transient oO QD; public Nu0() { this(51, 0.8F); } public Nu0(int paramInt) { this(paramInt, 0.8F); } public Nu0(int paramInt, float paramFloat) { if (paramFloat > 0.0F && paramFloat < 1.0F) { this.Ke = paramFloat; this.Dx = (int)(paramInt * paramFloat); int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1; this.pG = Long.numberOfLeadingZeros(i); this.q40 = new Object[paramInt]; this.d50 = new int[paramInt]; return; }  throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat); } public Nu0(Nu0 paramNu0) { this((int)(paramNu0.q40.length * (f = paramNu0.Ke)), f); Object[] arrayOfObject = this.q40; int j = paramNu0.q40.length; System.arraycopy(paramNu0.q40, 0, arrayOfObject, 0, j); int[] arrayOfInt = this.d50; int i = paramNu0.d50.length; System.arraycopy(paramNu0.d50, 0, this, 0, i); this.Ty = paramNu0.Ty; } public final void H3(int paramInt) { paramInt = this.q40.length; this.Dx = (int)(paramInt * this.Ke); int i = paramInt - 1; this.pG = Long.numberOfLeadingZeros(i); Object[] arrayOfObject = this.q40; int[] arrayOfInt = this.d50; this.q40 = new Object[paramInt]; this.d50 = new int[paramInt]; if (this.Ty > 0) for (byte b = 0; b < paramInt; ) { Object object; if ((object = arrayOfObject[b]) != null) { int j = arrayOfInt[b]; Object[] arrayOfObject1 = this.q40; int k = (int)(object.hashCode() * -7046029254386353131L >>> this.pG); while (true) { if (arrayOfObject1[k] == 
/* 3 */               null) { arrayOfObject1[k] = object; this.d50[k] = j; break; }  k = k + 1 & this.Ug; }  }  b++; }   } public final int hashCode() { int i = this.Ty; int[] arrayOfInt = this.d50; byte b = 0; Object[] arrayOfObject; int j = (arrayOfObject = this.q40).length; while (b < j) { Object object; if ((object = arrayOfObject[b]) != null) i = object.hashCode() + this[b] + i;  b++; }  return i; } public final boolean equals(Object paramObject) { if (paramObject == this) return true;  if (!(paramObject instanceof Nu0)) return false;  if (((Nu0)(paramObject = paramObject)).Ty != this.Ty) return false;  int[] arrayOfInt; Object[] arrayOfObject; byte b; int i; for (arrayOfInt = this.d50, b = 0, i = (arrayOfObject = this.q40).length; b < i; ) { Object object; if ((object = arrayOfObject[b]) != null) { int j = 0; int k; if ((k = paramObject.aD0(object)) >= 0) j = ((Nu0)paramObject).d50[k];  if (j == 0 && !((paramObject.aD0(object) >= 0) ? 1 : 0)) return false;  if (j != this[b]) return false;  }  b++; }  return true; }
/*   */ 
/*   */   
/*   */   public final String toString() {
/*   */     String str1, str2 = ", ";
/*   */     if (this.Ty == 0) {
/*   */       str1 = "{}";
/*   */     } else {
/*   */       StringBuilder stringBuilder;
/*   */       this(32);
/*   */       (new StringBuilder()).append('{');
/*   */       int[] arrayOfInt;
/*   */       Object[] arrayOfObject;
/*   */       int i;
/*   */       for (arrayOfInt = ((Nu0)super).d50, i = (arrayOfObject = ((Nu0)super).q40).length; i-- > 0; ) {
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
/*   */     oO oO1;
/*   */     if (this.fM0 == null) {
/*   */       oO oO3;
/*   */       this(this);
/*   */       this.fM0 = oO3;
/*   */       this(this);
/*   */       this.QD = oO3;
/*   */     } 
/*   */     oO oO2;
/*   */     if (!(oO2 = this.fM0).di0) {
/*   */       oO2.F2();
/*   */       (oO1 = this.fM0).di0 = true;
/*   */       this.QD.di0 = false;
/*   */     } else {
/*   */       ((Nu0)super).QD.F2();
/*   */       (oO1 = ((Nu0)super).QD).di0 = true;
/*   */       ((Nu0)super).fM0.di0 = false;
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final void b4(int paramInt, Object paramObject) {
/*   */     int i;
/*   */     if ((i = aD0(paramObject)) >= 0) {
/*   */       this.d50[i] = paramInt;
/*   */       return;
/*   */     } 
/*   */     i = -(i + 1);
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = this.q40)[i] = paramObject;
/*   */     this.d50[i] = paramInt;
/*   */     this.Ty = paramInt;
/*   */     if ((paramInt = this.Ty + 1) >= this.Dx)
/*   */       H3(arrayOfObject.length << 1); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nu0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */