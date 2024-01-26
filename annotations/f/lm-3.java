/* 1 */ package f;public final class lm implements Iterable { public final void Oe(int paramInt1, int paramInt2) { if (paramInt1 == 0) { this.yZ = paramInt2; if (!this.pE0) { this.pE0 = true; this.SG0++; }  return; }  int[] arrayOfInt = this.HP;
/* 2 */     int i = (int)(paramInt1 * -7046029254386353131L >>> this.mb0); while (true) {
/* 3 */       int k; if ((k = arrayOfInt[i]) == 0) { i = -(i + 1); } else if (k != paramInt1)
/*   */       
/*   */       { 
/*   */ 
/*   */ 
/*   */         
/* 9 */         i = i + 1 & this.cs0;
/*   */         continue; }
/*   */       
/*   */       if (i >= 0) {
/*   */         this.Fn[i] = paramInt2;
/*   */         return;
/*   */       } 
/*   */       int j = -(i + 1);
/*   */       int[] arrayOfInt2;
/*   */       (arrayOfInt2 = this.HP)[j] = paramInt1;
/*   */       this.Fn[j] = paramInt2;
/*   */       this.SG0 = paramInt1;
/*   */       paramInt2 = arrayOfInt2.length;
/*   */       this.IA = (int)(paramInt1 * this.As);
/*   */       this.cs0 = j = (paramInt1 = arrayOfInt2.length << 1) - 1;
/*   */       this.mb0 = Long.numberOfLeadingZeros(j);
/*   */       int[] arrayOfInt1 = this.HP;
/*   */       arrayOfInt2 = this.Fn;
/*   */       this.HP = new int[paramInt1];
/*   */       this.Fn = new int[paramInt1];
/*   */       if ((paramInt1 = this.SG0 + 1) >= this.IA && this.SG0 > 0)
/*   */         for (paramInt1 = 0; paramInt1 < paramInt2; ) {
/*   */           if ((k = arrayOfInt1[paramInt1]) != 0) {
/*   */             int m = arrayOfInt2[paramInt1];
/*   */             int[] arrayOfInt3 = this.HP;
/*   */             int n = (int)(k * -7046029254386353131L >>> this.mb0);
/*   */             while (true) {
/*   */               if (arrayOfInt3[n] == 0) {
/*   */                 arrayOfInt3[n] = k;
/*   */                 this.Fn[n] = m;
/*   */                 break;
/*   */               } 
/*   */               n = n + 1 & this.cs0;
/*   */             } 
/*   */           } 
/*   */           paramInt1++;
/*   */         }  
/*   */       return;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public int SG0;
/*   */   public int[] HP;
/*   */   public int[] Fn;
/*   */   public int yZ;
/*   */   public boolean pE0;
/*   */   public final float As;
/*   */   public int IA;
/*   */   public int mb0;
/*   */   public int cs0;
/*   */   public transient sj0 HK0;
/*   */   public transient sj0 DZ;
/*   */   
/*   */   public lm() {
/*   */     this(51, 0.8F);
/*   */   }
/*   */   
/*   */   public lm(int paramInt) {
/*   */     this(paramInt, 0.8F);
/*   */   }
/*   */   
/*   */   public lm(int paramInt, float paramFloat) {
/*   */     if (paramFloat > 0.0F && paramFloat < 1.0F) {
/*   */       this.As = paramFloat;
/*   */       this.IA = (int)(paramInt * paramFloat);
/*   */       int i = (paramInt = MG.nf(paramInt, paramFloat)) - 1;
/*   */       this.mb0 = Long.numberOfLeadingZeros(i);
/*   */       this.HP = new int[paramInt];
/*   */       this.Fn = new int[paramInt];
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + paramFloat);
/*   */   }
/*   */   
/*   */   public lm(lm paramlm) {
/*   */     this((int)(paramlm.HP.length * (f = paramlm.As)), f);
/*   */     int[] arrayOfInt2 = this.HP;
/*   */     int j = paramlm.HP.length;
/*   */     System.arraycopy(paramlm.HP, 0, arrayOfInt2, 0, j);
/*   */     int[] arrayOfInt1 = this.Fn;
/*   */     int i = paramlm.Fn.length;
/*   */     System.arraycopy(paramlm.Fn, 0, this, 0, i);
/*   */     this.SG0 = paramlm.SG0;
/*   */     this.yZ = paramlm.yZ;
/*   */     this.pE0 = paramlm.pE0;
/*   */   }
/*   */   
/*   */   public final int uv0(int paramInt1, int paramInt2) {
/*   */     if (paramInt1 == 0) {
/*   */       if (this.pE0)
/*   */         paramInt2 = this.yZ; 
/*   */       return paramInt2;
/*   */     } 
/*   */     int[] arrayOfInt = this.HP;
/*   */     int i = (int)(paramInt1 * -7046029254386353131L >>> this.mb0);
/*   */     while (true) {
/*   */       int j;
/*   */       if ((j = arrayOfInt[i]) == 0) {
/*   */         i = -(i + 1);
/*   */       } else if (j != paramInt1) {
/*   */         i = i + 1 & this.cs0;
/*   */         continue;
/*   */       } 
/*   */       if (i >= 0)
/*   */         paramInt2 = this.Fn[i]; 
/*   */       return paramInt2;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void clear() {
/*   */     if (this.SG0 == 0)
/*   */       return; 
/*   */     Arrays.fill(this.HP, 0);
/*   */     this.SG0 = 0;
/*   */     this.pE0 = false;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.SG0;
/*   */     if (this.pE0)
/*   */       i += this.yZ; 
/*   */     int[] arrayOfInt1 = this.Fn;
/*   */     byte b = 0;
/*   */     int[] arrayOfInt2;
/*   */     int j = (arrayOfInt2 = this.HP).length;
/*   */     while (b < j) {
/*   */       int k;
/*   */       if ((k = arrayOfInt2[b]) != 0)
/*   */         i = k * 31 + this[b] + i; 
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!(paramObject instanceof lm))
/*   */       return false; 
/*   */     if (((lm)(paramObject = paramObject)).SG0 != this.SG0)
/*   */       return false; 
/*   */     boolean bool;
/*   */     if (((lm)paramObject).pE0 != (bool = this.pE0))
/*   */       return false; 
/*   */     if (bool && ((lm)paramObject).yZ != this.yZ)
/*   */       return false; 
/*   */     int[] arrayOfInt1;
/*   */     int[] arrayOfInt2;
/*   */     byte b;
/*   */     int i;
/*   */     for (arrayOfInt1 = this.Fn, b = 0, i = (arrayOfInt2 = this.HP).length; b < i; ) {
/*   */       int j;
/*   */       if ((j = arrayOfInt2[b]) != 0) {
/*   */         int k;
/*   */         if ((k = paramObject.uv0(j, 0)) == 0) {
/*   */           if (j == 0);
/*   */           int[] arrayOfInt = ((lm)paramObject).HP;
/*   */           int m = (int)(j * -7046029254386353131L >>> ((lm)paramObject).mb0);
/*   */           while (true) {
/*   */             int n;
/*   */             if ((n = arrayOfInt[m]) == 0) {
/*   */               m = -(m + 1);
/*   */             } else if (n != j) {
/*   */               m = m + 1 & ((lm)paramObject).cs0;
/*   */               continue;
/*   */             } 
/*   */             if (!((m >= 0) ? 1 : 0))
/*   */               return false; 
/*   */             break;
/*   */           } 
/*   */         } 
/*   */         if (k != this[b])
/*   */           return false; 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     if (this.SG0 == 0)
/*   */       return "[]"; 
/*   */     this(32);
/*   */     StringBuilder stringBuilder;
/*   */     (new StringBuilder()).append('[');
/*   */     int[] arrayOfInt2 = this.Fn;
/*   */     int[] arrayOfInt1;
/*   */     int i = (arrayOfInt1 = this.HP).length;
/*   */     if (this.pE0) {
/*   */       stringBuilder.append("0=");
/*   */       stringBuilder.append(this.yZ);
/*   */     } else {
/*   */       while (i-- > 0) {
/*   */         int j;
/*   */         if ((j = arrayOfInt1[i]) == 0)
/*   */           continue; 
/*   */         stringBuilder.append(j);
/*   */         stringBuilder.append('=');
/*   */         stringBuilder.append(arrayOfInt2[i]);
/*   */       } 
/*   */     } 
/*   */     while (i-- > 0) {
/*   */       int j;
/*   */       if ((j = arrayOfInt1[i]) == 0)
/*   */         continue; 
/*   */       stringBuilder.append(", ");
/*   */       stringBuilder.append(j);
/*   */       stringBuilder.append('=');
/*   */       stringBuilder.append(arrayOfInt2[i]);
/*   */     } 
/*   */     stringBuilder.append(']');
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     sj0 sj01;
/*   */     if (this.HK0 == null) {
/*   */       sj0 sj03;
/*   */       this(this);
/*   */       this.HK0 = sj03;
/*   */       this(this);
/*   */       this.DZ = sj03;
/*   */     } 
/*   */     sj0 sj02;
/*   */     if (!(sj02 = this.HK0).KJ0) {
/*   */       sj02.uq();
/*   */       (sj01 = this.HK0).KJ0 = true;
/*   */       this.DZ.KJ0 = false;
/*   */     } else {
/*   */       ((lm)super).DZ.uq();
/*   */       (sj01 = ((lm)super).DZ).KJ0 = true;
/*   */       ((lm)super).HK0.KJ0 = false;
/*   */     } 
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */