/* 1 */ package f;public final class Ag implements Appendable, CharSequence { public static final char[] EZ = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' }; public char[] bF0; public int Td0; public final void sG(char[] paramArrayOfchar, int paramInt1, int paramInt2) { if (paramInt1 <= paramArrayOfchar.length && paramInt1 >= 0) { if (paramInt2 >= 0 && paramArrayOfchar.length - paramInt1 >= paramInt2) { int j; if ((j = this.Td0 + paramInt2) > this.bF0.length) LpT8(j);  char[] arrayOfChar = this.bF0; int i = this.Td0; System.arraycopy(paramArrayOfchar, paramInt1, this, i, paramInt2); this.Td0 = j; return; }  throw new ArrayIndexOutOfBoundsException(XD0.SD0("Length out of bounds: ", paramInt2)); }
/* 2 */      throw new ArrayIndexOutOfBoundsException(
/* 3 */         XD0.SD0("Offset out of bounds: ", paramInt1)); } public final Ag fT(String paramString, char paramChar) { int i = paramString.length(), j = 0; while (true) { int k; if (j == (k = this.Td0)) return this;  if (this.bF0[j] == paramChar) { int m = j + 1; if (j >= 0) { char[] arrayOfChar; if (m > k) m = k;  if (m > j) { k = paramString.length(); int n; if ((n = m - j - k) > 0) { int i1 = j + k; m = this.Td0 - m; char[] arrayOfChar1; System.arraycopy(arrayOfChar1 = this.bF0, m, arrayOfChar1, i1, m); } else if (n < 0) { int i1 = -n; char[] arrayOfChar1; int i2; if ((arrayOfChar1 = this.bF0).length - (i2 = this.Td0) >= i1) { i1 = m + i1; i2 -= m; System.arraycopy(arrayOfChar1, m, arrayOfChar1, i1, i2); } else { int i3; if ((i2 += i1) <= (i3 = (arrayOfChar1.length << 1) + 2)) i2 = i3;  arrayOfChar1 = new char[i2]; System.arraycopy(arrayOfChar1, 0, arrayOfChar1, 0, m); i1 = m + i1; m = this.Td0 - m; System.arraycopy(this.bF0, m, arrayOfChar1, i1, m); this.bF0 = arrayOfChar1; }  }  arrayOfChar = this.bF0; paramString.getChars(0, k, arrayOfChar, j); this.Td0 -= n; } else if (j == arrayOfChar) { if (j >= 0 && j <= k)
/* 4 */             { if ((k = paramString.length()) != 0)
/* 5 */               { int n; if ((arrayOfChar = this.bF0).length - (n = this.Td0) >= k) { n = j + k; int i1 = n - j; System.arraycopy(arrayOfChar, j, arrayOfChar, n, i1); } else { int i1; if ((n += k) <= (i1 = (arrayOfChar.length << 1) + 2)) n = i1;  arrayOfChar = new char[n]; System.arraycopy(arrayOfChar, 0, arrayOfChar, 0, j); n = j + k; i1 = this.Td0 - j; System.arraycopy(this.bF0, j, arrayOfChar, n, i1); this.bF0 = arrayOfChar; }
/* 6 */                  arrayOfChar = this.bF0; paramString.getChars(0, k, arrayOfChar, j); this.Td0 += k; }  } else { throw new StringIndexOutOfBoundsException(j); }  }
/* 7 */           else { throw new StringIndexOutOfBoundsException(); }  j += i; continue; }  throw new StringIndexOutOfBoundsException(); }  j++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final CharSequence subSequence(int paramInt1, int paramInt2) {
/*   */     if (paramInt1 >= 0 && paramInt1 <= paramInt2 && paramInt2 <= this.Td0) {
/*   */       String str;
/*   */       if (paramInt1 == paramInt2) {
/*   */         str = "";
/*   */       } else {
/*   */         String str1;
/*   */         char[] arrayOfChar = ((Ag)super).bF0;
/*   */         paramInt2 -= paramInt1;
/*   */         this(this, paramInt1, paramInt2);
/*   */         str = str1;
/*   */       } 
/*   */       return this;
/*   */     } 
/*   */     throw new StringIndexOutOfBoundsException();
/*   */   }
/*   */   
/*   */   public final Ag Td(int paramInt) {
/*   */     if (paramInt == Integer.MIN_VALUE) {
/*   */       V9("-2147483648");
/*   */     } else {
/*   */       if (paramInt < 0) {
/*   */         yd0('-');
/*   */         paramInt = -paramInt;
/*   */       } 
/*   */       if (paramInt >= 10000) {
/*   */         if (paramInt >= 1000000000)
/*   */           yd0(EZ[(int)(paramInt % 10000000000L / 1000000000L)]); 
/*   */         if (paramInt >= 100000000)
/*   */           yd0(EZ[paramInt % 1000000000 / 100000000]); 
/*   */         if (paramInt >= 10000000)
/*   */           yd0(EZ[paramInt % 100000000 / 10000000]); 
/*   */         if (paramInt >= 1000000)
/*   */           yd0(EZ[paramInt % 10000000 / 1000000]); 
/*   */         if (paramInt >= 100000)
/*   */           yd0(EZ[paramInt % 1000000 / 100000]); 
/*   */         yd0(EZ[paramInt % 100000 / 10000]);
/*   */       } 
/*   */       if (paramInt >= 1000)
/*   */         yd0(EZ[paramInt % 10000 / 1000]); 
/*   */       if (paramInt >= 100)
/*   */         yd0(EZ[paramInt % 1000 / 100]); 
/*   */       if (paramInt >= 10)
/*   */         yd0(EZ[paramInt % 100 / 10]); 
/*   */       yd0(EZ[paramInt % 10]);
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Appendable append(char paramChar) {
/*   */     yd0(paramChar);
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Appendable append(CharSequence paramCharSequence) {
/*   */     if (paramCharSequence == null) {
/*   */       xs();
/*   */     } else {
/*   */       char[] arrayOfChar;
/*   */       if (paramCharSequence instanceof Ag) {
/*   */         arrayOfChar = ((Ag)paramCharSequence).bF0;
/*   */         int i = ((Ag)paramCharSequence).Td0;
/*   */         sG(arrayOfChar, 0, i);
/*   */       } else {
/*   */         V9(arrayOfChar.toString());
/*   */       } 
/*   */     } 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
/*   */     if (paramCharSequence == null)
/*   */       paramCharSequence = "null"; 
/*   */     if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt1 <= paramInt2 && paramInt2 <= paramCharSequence.length()) {
/*   */       V9(paramCharSequence.subSequence(paramInt1, paramInt2).toString());
/*   */       return this;
/*   */     } 
/*   */     throw new IndexOutOfBoundsException();
/*   */   }
/*   */   
/*   */   public Ag() {
/*   */     this.bF0 = new char[16];
/*   */   }
/*   */   
/*   */   public Ag(int paramInt) {
/*   */     if (paramInt >= 0) {
/*   */       this.bF0 = new char[paramInt];
/*   */       return;
/*   */     } 
/*   */     throw new NegativeArraySizeException();
/*   */   }
/*   */   
/*   */   public Ag(CharSequence paramCharSequence) {
/*   */     this(paramCharSequence.toString());
/*   */   }
/*   */   
/*   */   public Ag(Ag paramAg) {
/*   */     this.Td0 = i;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[(i = paramAg.Td0) + 16];
/*   */     System.arraycopy(paramAg.bF0, 0, this, 0, i);
/*   */   }
/*   */   
/*   */   public Ag(String paramString) {
/*   */     this.Td0 = i;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[(i = paramString.length()) + 16];
/*   */     paramString.getChars(0, i, this, 0);
/*   */   }
/*   */   
/*   */   public final void LpT8(int paramInt) {
/*   */     char[] arrayOfChar2;
/*   */     int i;
/*   */     if (paramInt <= (i = ((arrayOfChar2 = this.bF0).length >> 1) + arrayOfChar2.length + 2))
/*   */       paramInt = i; 
/*   */     char[] arrayOfChar1 = new char[paramInt];
/*   */     paramInt = this.Td0;
/*   */     System.arraycopy(arrayOfChar2, 0, this, 0, paramInt);
/*   */     this.bF0 = this;
/*   */   }
/*   */   
/*   */   public final void xs() {
/*   */     int j;
/*   */     if ((j = this.Td0 + 4) > this.bF0.length)
/*   */       LpT8(j); 
/*   */     int i = this.Td0 + 1;
/*   */     arrayOfChar[this.Td0] = 'n';
/*   */     arrayOfChar[i++] = 'u';
/*   */     arrayOfChar[i] = 'l';
/*   */     int k;
/*   */     this.Td0 = (k = i + 1) + 1;
/*   */     char[] arrayOfChar;
/*   */     (arrayOfChar = this.bF0)[k] = 'l';
/*   */   }
/*   */   
/*   */   public final void yd0(char paramChar) {
/*   */     int j;
/*   */     if ((j = this.Td0) == this.bF0.length)
/*   */       LpT8(j + 1); 
/*   */     int i;
/*   */     this.Td0 = (i = this.Td0) + 1;
/*   */     this.bF0[i] = paramChar;
/*   */   }
/*   */   
/*   */   public final void V9(String paramString) {
/*   */     if (paramString == null) {
/*   */       xs();
/*   */       return;
/*   */     } 
/*   */     int j = paramString.length();
/*   */     int k;
/*   */     if ((k = this.Td0 + j) > this.bF0.length)
/*   */       LpT8(k); 
/*   */     char[] arrayOfChar = this.bF0;
/*   */     int i = this.Td0;
/*   */     paramString.getChars(0, j, this, i);
/*   */     this.Td0 = k;
/*   */   }
/*   */   
/*   */   public final char charAt(int paramInt) {
/*   */     if (paramInt >= 0 && paramInt < this.Td0)
/*   */       return this.bF0[paramInt]; 
/*   */     throw new StringIndexOutOfBoundsException(paramInt);
/*   */   }
/*   */   
/*   */   public final int length() {
/*   */     return this.Td0;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     int i;
/*   */     return ((i = this.Td0) == 0) ? "" : new String(this.bF0, 0, i);
/*   */   }
/*   */   
/*   */   public final boolean isEmpty() {
/*   */     return (this.Td0 == 0);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = this.Td0 + 31;
/*   */     for (byte b = 0; b < this.Td0; b++)
/*   */       i = i * 31 + this.bF0[b]; 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null)
/*   */       return false; 
/*   */     if (Ag.class != paramObject.getClass())
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     int i;
/*   */     if ((i = this.Td0) != ((Ag)paramObject).Td0)
/*   */       return false; 
/*   */     char[] arrayOfChar = this.bF0;
/*   */     paramObject = ((Ag)paramObject).bF0;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (this[b] != paramObject[b])
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void Nn(Object paramObject) {
/*   */     if (paramObject == null) {
/*   */       xs();
/*   */     } else {
/*   */       V9(paramObject.toString());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void AF0(String paramString) {
/*   */     V9(paramString);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ag.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */