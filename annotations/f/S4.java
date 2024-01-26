/* 1 */ package f;public final class S4 { public final void V9(int paramInt) { if (paramInt == 0) { if (this.sJ) return;  this.sJ = true; this.pB++; return; }  int[] arrayOfInt = this.k4;
/* 2 */     int i = (int)(paramInt * -7046029254386353131L >>> this.A1); while (true) {
/* 3 */       int m; if ((m = arrayOfInt[i]) == 0) { i = -(i + 1); } else if (m != paramInt)
/*   */       
/*   */       { 
/*   */ 
/*   */ 
/*   */         
/* 9 */         i = i + 1 & this.rp0;
/*   */         continue; }
/*   */       
/*   */       if (i >= 0)
/*   */         return; 
/*   */       int j = -(i + 1);
/*   */       int[] arrayOfInt2;
/*   */       (arrayOfInt2 = this.k4)[j] = paramInt;
/*   */       this.pB = paramInt;
/*   */       j = arrayOfInt2.length;
/*   */       this.cA = (int)(paramInt * this.gZ);
/*   */       int k = (paramInt = arrayOfInt2.length << 1) - 1;
/*   */       this.A1 = Long.numberOfLeadingZeros(k);
/*   */       int[] arrayOfInt1 = this.k4;
/*   */       this.k4 = new int[paramInt];
/*   */       if ((paramInt = this.pB + 1) >= this.cA && this.pB > 0)
/*   */         for (paramInt = 0; paramInt < j; ) {
/*   */           if ((m = arrayOfInt1[paramInt]) != 0) {
/*   */             int[] arrayOfInt3 = this.k4;
/*   */             int n = (int)(m * -7046029254386353131L >>> this.A1);
/*   */             while (true) {
/*   */               if (arrayOfInt3[n] == 0) {
/*   */                 arrayOfInt3[n] = m;
/*   */                 break;
/*   */               } 
/*   */               n = n + 1 & this.rp0;
/*   */             } 
/*   */           } 
/*   */           paramInt++;
/*   */         }  
/*   */       return;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public int pB;
/*   */   public int[] k4;
/*   */   public boolean sJ;
/*   */   public final float gZ;
/*   */   public int cA;
/*   */   public int A1;
/*   */   public int rp0;
/*   */   public transient f70 nd0;
/*   */   public transient f70 OC;
/*   */   
/*   */   public S4() {
/*   */     this(51, 0.8F);
/*   */   }
/*   */   
/*   */   public S4(int paramInt) {
/*   */     this(paramInt, 0.8F);
/*   */   }
/*   */   
/*   */   public S4(int paramInt, float paramFloat) {
/*   */     if (paramFloat > 0.0F && paramFloat < 1.0F) {
/*   */       this.gZ = paramFloat;
/*   */       this.cA = (int)(paramInt * paramFloat);
/*   */       int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1;
/*   */       this.A1 = Long.numberOfLeadingZeros(i);
/*   */       this.k4 = new int[paramInt];
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat);
/*   */   }
/*   */   
/*   */   public S4(S4 paramS4) {
/*   */     this((int)(paramS4.k4.length * (f = paramS4.gZ)), f);
/*   */     int[] arrayOfInt = this.k4;
/*   */     int i = paramS4.k4.length;
/*   */     System.arraycopy(paramS4.k4, 0, this, 0, i);
/*   */     this.pB = paramS4.pB;
/*   */     this.sJ = paramS4.sJ;
/*   */   }
/*   */   
/*   */   public final boolean MN(int paramInt) {
/*   */     if (paramInt == 0)
/*   */       return this.sJ; 
/*   */     int[] arrayOfInt = this.k4;
/*   */     int i = (int)(paramInt * -7046029254386353131L >>> this.A1);
/*   */     while (true) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[i]) == 0) {
/*   */         i = -(i + 1);
/*   */       } else if (j != paramInt) {
/*   */         i = i + 1 & this.rp0;
/*   */         continue;
/*   */       } 
/*   */       return (i >= 0);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.pB;
/*   */     byte b = 0;
/*   */     int[] arrayOfInt;
/*   */     int j = (arrayOfInt = this.k4).length;
/*   */     while (b < j) {
/*   */       int k;
/*   */       if ((k = arrayOfInt[b]) != 0)
/*   */         i += k; 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (!(paramObject instanceof S4))
/*   */       return false; 
/*   */     if (((S4)(paramObject = paramObject)).pB != this.pB)
/*   */       return false; 
/*   */     if (((S4)paramObject).sJ != this.sJ)
/*   */       return false; 
/*   */     byte b = 0;
/*   */     int[] arrayOfInt;
/*   */     int i = (arrayOfInt = this.k4).length;
/*   */     while (b < i) {
/*   */       int j;
/*   */       if ((j = this[b]) != 0 && !paramObject.MN(j))
/*   */         return false; 
/*   */       b++;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     if (this.pB == 0)
/*   */       return "[]"; 
/*   */     this(32);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append('[');
/*   */     int[] arrayOfInt;
/*   */     int i = (arrayOfInt = this.k4).length;
/*   */     if (this.sJ) {
/*   */       append("0");
/*   */     } else {
/*   */       while (i-- > 0) {
/*   */         int j;
/*   */         if ((j = arrayOfInt[i]) == 0)
/*   */           continue; 
/*   */         append(j);
/*   */       } 
/*   */     } 
/*   */     while (i-- > 0) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[i]) == 0)
/*   */         continue; 
/*   */       append(", ");
/*   */       append(j);
/*   */     } 
/*   */     append(']');
/*   */     return toString();
/*   */   }
/*   */   
/*   */   public final f70 Jg0() {
/*   */     if (this.nd0 == null) {
/*   */       f70 f702;
/*   */       this(this);
/*   */       this.nd0 = f702;
/*   */       this(this);
/*   */       this.OC = f702;
/*   */     } 
/*   */     f70 f701;
/*   */     if (!(f701 = this.nd0).jK) {
/*   */       f701.uy();
/*   */       this.nd0.jK = true;
/*   */       this.OC.jK = false;
/*   */       return this.nd0;
/*   */     } 
/*   */     this.OC.uy();
/*   */     this.OC.jK = true;
/*   */     this.nd0.jK = false;
/*   */     return this.OC;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */