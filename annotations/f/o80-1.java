/*  1 */ package f;public final class o80 implements z5, Comparable { private static final long serialVersionUID = 2L; public final int oj; public static o80 E5(String paramString) { if (paramString != null) { int i; if (paramString.length() >= 7 && paramString.length() <= 15) { int j; int k; int m; int n; char[] arrayOfChar; int i1; byte b; for (j = 1, k = 0, m = 0, n = 0, i1 = (arrayOfChar = paramString.toCharArray()).length, b = 0; b < i1; ) { char c; if ((c = arrayOfChar[b]) >= '0' && c <= '9') { j = 0; m *= 10; if ((m = c - 48 + m) > 255) throw new IllegalArgumentException(m0.tF0("Invalid octet in ", paramString));  }
/*  2 */           else if (c == '.') { if (!j) { if ((j = n + 1) <= 3) { k = k << 8 | m; m = 0; n = 1; j = n = j; } else { throw new IllegalArgumentException(
/*  3 */                     m0.tF0("Too many dots in ", paramString)); }  }
/*  4 */             else { throw new IllegalArgumentException(
/*  5 */                   m0.tF0("Empty octet in ", paramString)); }  }
/*  6 */           else { throw new IllegalArgumentException("Unexpected character " + c + " in " + paramString); }  b++; }  if (n == 3) { if (j == 0) { i = k << 8 | m;
/*  7 */             return new o80(i); }
/*  8 */            throw new IllegalArgumentException(
/*  9 */               m0.tF0("Empty octet in ", i)); }
/* 10 */          throw new IllegalArgumentException(
/* 11 */             m0.tF0("Too few dots in", i)); }
/* 12 */        throw new IllegalArgumentException(
/* 13 */           m0.tF0("Invalid IP address length in ", i)); }
/* 14 */      throw new NullPointerException("String IP address is null"); }
/*    */ 
/*    */   
/*    */   public o80(int paramInt) {
/*    */     this.oj = paramInt;
/*    */   }
/*    */   
/*    */   static {
/*    */     E5("0.0.0.0");
/*    */     E5("255.255.255.255");
/*    */   }
/*    */   
/*    */   public final int hp() {
/*    */     return 4;
/*    */   }
/*    */   
/*    */   public final o80 Ue0() {
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final int H00(o80 paramo80) {
/*    */     int i;
/*    */     int j;
/*    */     return (paramo80 == null) ? 1 : (((i = this.oj) == (j = paramo80.oj)) ? 0 : ((i + Integer.MIN_VALUE < j + Integer.MIN_VALUE) ? -1 : 1));
/*    */   }
/*    */   
/*    */   public final boolean equals(Object paramObject) {
/*    */     return (paramObject == null) ? false : (!(paramObject instanceof o80) ? false : ((((o80)paramObject).oj == this.oj)));
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    */     return this.oj;
/*    */   }
/*    */   
/*    */   public final boolean gK() {
/*    */     return Rf0.c9.jI(this);
/*    */   }
/*    */   
/*    */   public final byte[] DH() {
/*    */     return new byte[] { (byte)CD.ag0.Ow0(this.oj), (byte)CD.zK0.Ow0(this.oj), (byte)CD.PR.Ow0(this.oj), (byte)CD.AR.Ow0(this.oj) };
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     CharSequence[] arrayOfCharSequence;
/*    */     (arrayOfCharSequence = new CharSequence[4])[0] = Integer.toString(CD.ag0.Ow0(this.oj));
/*    */     (new CharSequence[4])[1] = Integer.toString(CD.zK0.Ow0(this.oj));
/*    */     (new CharSequence[4])[2] = Integer.toString(CD.PR.Ow0(this.oj));
/*    */     (new CharSequence[4])[3] = Integer.toString(CD.AR.Ow0(this.oj));
/*    */     return String.join(".", arrayOfCharSequence);
/*    */   }
/*    */   
/*    */   public final long lpt9() {
/*    */     return this.oj & 0xFFFFFFFFL;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/o80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */