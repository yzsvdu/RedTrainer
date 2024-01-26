/* 1 */ package f;public final class y10 implements Iterable { public final void tD0(int paramInt, Object paramObject) { if (paramInt == 0) { this.vf0 = paramObject; if (!this.yq0) { this.yq0 = true; this.kG++; }  return; }  int j; if ((j = Kz(paramInt)) >= 0) { this.Bu[j]; this.Bu[j] = paramObject; return; }  j = -(j + 1); int[] arrayOfInt2; (arrayOfInt2 = this.PG0)[j] = paramInt; this.Bu[j] = paramObject; this.kG = paramInt; int i = arrayOfInt2.length; this.zS = (int)(paramInt * this.dR); this.O10 = j = (paramInt = arrayOfInt2.length << 1) - 1; this.yA = Long.numberOfLeadingZeros(j); int[] arrayOfInt1 = this.PG0; Object[] arrayOfObject = this.Bu; this.PG0 = new int[paramInt]; this.Bu = new Object[paramInt]; if ((paramInt = this.kG + 1) >= this.zS && this.kG > 0) for (paramInt = 0; paramInt < i; ) { int k; if ((k = arrayOfInt1[paramInt]) != 0) { Object object = arrayOfObject[paramInt];
/* 2 */           int[] arrayOfInt = this.PG0;
/* 3 */           int m = (int)(k * -7046029254386353131L >>> this.yA); while (true) { if (arrayOfInt[m] == 
/* 4 */               0) { arrayOfInt[m] = k; this.Bu[m] = object; break; }  m = m + 1 & this.O10; }  }  paramInt++; }
/*   */         }
/*   */ 
/*   */   
/*   */   public int kG;
/*   */   public int[] PG0;
/*   */   public Object[] Bu;
/*   */   public Object vf0;
/*   */   public boolean yq0;
/*   */   public final float dR;
/*   */   public int zS;
/*   */   public int yA;
/*   */   public int O10;
/*   */   public transient Gt M00;
/*   */   public transient Gt x8;
/*   */   public transient j10 vA0;
/*   */   public transient j10 lJ;
/*   */   
/*   */   public y10() {
/*   */     this(51, 0.8F);
/*   */   }
/*   */   
/*   */   public y10(int paramInt) {
/*   */     this(paramInt, 0.8F);
/*   */   }
/*   */   
/*   */   public y10(int paramInt, float paramFloat) {
/*   */     if (paramFloat > 0.0F && paramFloat < 1.0F) {
/*   */       this.dR = paramFloat;
/*   */       this.zS = (int)(paramInt * paramFloat);
/*   */       int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1;
/*   */       this.yA = Long.numberOfLeadingZeros(i);
/*   */       this.PG0 = new int[paramInt];
/*   */       this.Bu = new Object[paramInt];
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat);
/*   */   }
/*   */   
/*   */   public y10(y10 paramy10) {
/*   */     this((int)(paramy10.PG0.length * (f = paramy10.dR)), f);
/*   */     int[] arrayOfInt = this.PG0;
/*   */     int j = paramy10.PG0.length;
/*   */     System.arraycopy(paramy10.PG0, 0, arrayOfInt, 0, j);
/*   */     Object[] arrayOfObject = this.Bu;
/*   */     int i = paramy10.Bu.length;
/*   */     System.arraycopy(paramy10.Bu, 0, this, 0, i);
/*   */     this.kG = paramy10.kG;
/*   */     this.vf0 = paramy10.vf0;
/*   */     this.yq0 = paramy10.yq0;
/*   */   }
/*   */   
/*   */   public final Object get(int paramInt) {
/*   */     return (paramInt == 0) ? (this.yq0 ? this.vf0 : null) : (((paramInt = Kz(paramInt)) >= 0) ? this.Bu[paramInt] : null);
/*   */   }
/*   */   
/*   */   public final Object remove(int paramInt) {
/*   */     if (paramInt == 0) {
/*   */       if (!this.yq0)
/*   */         return null; 
/*   */       this.yq0 = false;
/*   */       this.vf0 = null;
/*   */       this.kG--;
/*   */       return this.vf0;
/*   */     } 
/*   */     if ((paramInt = Kz(paramInt)) < 0)
/*   */       return null; 
/*   */     int[] arrayOfInt;
/*   */     Object[] arrayOfObject;
/*   */     Object object;
/*   */     int i;
/*   */     int j;
/*   */     int k;
/*   */     for (arrayOfInt = this.PG0, object = (arrayOfObject = this.Bu)[paramInt], i = this.O10, j = paramInt + 1 & i; (k = arrayOfInt[j]) != 0; ) {
/*   */       int m;
/*   */       if ((j - (m = (int)(k * -7046029254386353131L >>> this.yA)) & i) > (paramInt - m & i)) {
/*   */         arrayOfInt[paramInt] = k;
/*   */         arrayOfObject[paramInt] = arrayOfObject[j];
/*   */         paramInt = j;
/*   */       } 
/*   */       j = j + 1 & i;
/*   */     } 
/*   */     arrayOfInt[paramInt] = 0;
/*   */     arrayOfObject[paramInt] = null;
/*   */     this.kG--;
/*   */     return object;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.kG;
/*   */     Object object;
/*   */     if (this.yq0 && (object = this.vf0) != null)
/*   */       i = object.hashCode() + i; 
/*   */     Object[] arrayOfObject = this.Bu;
/*   */     byte b = 0;
/*   */     int j = (object = this.PG0).length;
/*   */     while (b < j) {
/*   */       i = object1 * 31 + i;
/*   */       Object object1;
/*   */       if ((object1 = object[b]) != null && (object1 = this[b]) != null)
/*   */         i = object1.hashCode() + i; 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!(paramObject instanceof y10))
/*   */       return false; 
/*   */     if (((y10)(paramObject = paramObject)).kG != this.kG)
/*   */       return false; 
/*   */     boolean bool;
/*   */     if (((y10)paramObject).yq0 != (bool = this.yq0))
/*   */       return false; 
/*   */     if (bool) {
/*   */       Object object;
/*   */       if ((object = ((y10)paramObject).vf0) == null) {
/*   */         if (this.vf0 != null)
/*   */           return false; 
/*   */       } else if (!object.equals(this.vf0)) {
/*   */         return false;
/*   */       } 
/*   */     } 
/*   */     Object[] arrayOfObject;
/*   */     int[] arrayOfInt;
/*   */     byte b;
/*   */     int i;
/*   */     for (arrayOfObject = this.Bu, b = 0, i = (arrayOfInt = this.PG0).length; b < i; ) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[b]) != 0) {
/*   */         Object object;
/*   */         if ((object = this[b]) == null) {
/*   */           object = f7.mv0;
/*   */           if (j == 0) {
/*   */             if (((y10)paramObject).yq0)
/*   */               object = ((y10)paramObject).vf0; 
/*   */           } else if ((j = paramObject.Kz(j)) >= 0) {
/*   */             object = ((y10)paramObject).Bu[j];
/*   */           } 
/*   */           if (object != null)
/*   */             return false; 
/*   */         } else if (!object.equals(paramObject.get(j))) {
/*   */           return false;
/*   */         } 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     if (this.kG == 0)
/*   */       return "[]"; 
/*   */     this(32);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append('[');
/*   */     Object[] arrayOfObject = this.Bu;
/*   */     int[] arrayOfInt;
/*   */     int i = (arrayOfInt = this.PG0).length;
/*   */     if (this.yq0) {
/*   */       stringBuilder.append("0=");
/*   */       stringBuilder.append(this.vf0);
/*   */     } else {
/*   */       while (i-- > 0) {
/*   */         int j;
/*   */         if ((j = arrayOfInt[i]) == 0)
/*   */           continue; 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append('=');
/*   */         stringBuilder.append(arrayOfObject[i]);
/*   */       } 
/*   */     } 
/*   */     while (i-- > 0) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[i]) == 0)
/*   */         continue; 
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append(j);
/*   */       stringBuilder.append('=');
/*   */       stringBuilder.append(arrayOfObject[i]);
/*   */     } 
/*   */     stringBuilder.append(']');
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     Gt gt1;
/*   */     if (this.M00 == null) {
/*   */       Gt gt;
/*   */       this(this);
/*   */       this.M00 = gt;
/*   */       this(this);
/*   */       this.x8 = gt;
/*   */     } 
/*   */     Gt gt2;
/*   */     if (!(gt2 = this.M00).Jc) {
/*   */       gt2.GS();
/*   */       (gt1 = this.M00).Jc = true;
/*   */       this.x8.Jc = false;
/*   */     } else {
/*   */       ((y10)super).x8.GS();
/*   */       (gt1 = ((y10)super).x8).Jc = true;
/*   */       ((y10)super).M00.Jc = false;
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final j10 coM2() {
/*   */     if (this.vA0 == null) {
/*   */       j10 j102;
/*   */       this(this);
/*   */       this.vA0 = j102;
/*   */       this(this);
/*   */       this.lJ = j102;
/*   */     } 
/*   */     j10 j101;
/*   */     if (!(j101 = this.vA0).Jc) {
/*   */       j101.GS();
/*   */       this.vA0.Jc = true;
/*   */       this.lJ.Jc = false;
/*   */       return this.vA0;
/*   */     } 
/*   */     this.lJ.GS();
/*   */     this.lJ.Jc = true;
/*   */     this.vA0.Jc = false;
/*   */     return this.lJ;
/*   */   }
/*   */   
/*   */   public final int Kz(int paramInt) {
/*   */     int arrayOfInt[] = this.PG0, i = (int)(paramInt * -7046029254386353131L >>> this.yA);
/*   */     while (true) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[i]) == 0)
/*   */         return -(i + 1); 
/*   */       if (j == paramInt)
/*   */         return i; 
/*   */       i = i + 1 & this.O10;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/y10.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */