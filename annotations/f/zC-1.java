/* 1 */ package f;public final class zC extends Eb0 { public final int lPT9(Eb0 paramEb0) { if (paramEb0 == null) return 1;  if (paramEb0 instanceof zC)
/* 2 */     { byte b; if ((b = this.Xe0.compareTo(((zC)paramEb0).Xe0)) == 0)
/* 3 */       { byte b1; long l1; long l2; if ((l1 = this.Cz0) == (l2 = paramEb0.Cz0)) { b1 = 0; } else if (b1 + Long.MIN_VALUE < l2 + Long.MIN_VALUE) { b1 = -1; } else { b1 = 1; }  if (b1 == 0) { byte b2; long l3; long l4; if ((l4 = this.VP) == (l3 = paramEb0.VP)) { b = b2 = 0; } else { if (b + Long.MIN_VALUE < b2 + Long.MIN_VALUE) { b2 = -1; } else { b2 = 1; }  b = b2; }  }  }  return b; }  return 1; }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 1L;
/*   */   public final String Xe0;
/*   */   
/*   */   public zC(String paramString, long paramLong1, long paramLong2) {
/*   */     super(paramLong1, paramLong2);
/*   */     this.Xe0 = paramString;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: invokespecial hashCode : ()I
/*   */     //   5: bipush #31
/*   */     //   7: imul
/*   */     //   8: istore_0
/*   */     //   9: getfield Xe0 : Ljava/lang/String;
/*   */     //   12: dup
/*   */     //   13: astore_1
/*   */     //   14: ifnonnull -> 22
/*   */     //   17: iconst_0
/*   */     //   18: istore_1
/*   */     //   19: goto -> 27
/*   */     //   22: aload_1
/*   */     //   23: invokevirtual hashCode : ()I
/*   */     //   26: istore_1
/*   */     //   27: iload_0
/*   */     //   28: iload_1
/*   */     //   29: iadd
/*   */     //   30: ireturn
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     return (this == paramObject) ? true : (!super.equals(paramObject) ? false : ((zC.class != paramObject.getClass()) ? false : Objects.equals(this.Xe0, ((zC)paramObject).Xe0)));
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     arrayOfObject[0] = super.toString();
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = new Object[2])[1] = this.Xe0;
/*   */     return String.format("%s%%%s", arrayOfObject);
/*   */   }
/*   */   
/*   */   public final zC QC0(long paramLong) {
/*   */     boolean bool;
/*   */     if (paramLong < 0L) {
/*   */       if ((paramLong = -paramLong) < 0L) {
/*   */         this = QC0(-paramLong);
/*   */       } else {
/*   */         zC zC1;
/*   */         paramLong = l + paramLong;
/*   */         long l = this.Cz0;
/*   */         if (Eb0.Be(l = this.VP, paramLong, paramLong))
/*   */           l++; 
/*   */         this(this.Xe0, l, paramLong);
/*   */         this = zC1;
/*   */       } 
/*   */       return this;
/*   */     } 
/*   */     l1 -= paramLong;
/*   */     long l2 = this.Cz0;
/*   */     paramLong >>>= 63L;
/*   */     long l4 = l1 >>> 63L;
/*   */     long l1, l3;
/*   */     if (((l3 = (l1 = this.VP) >>> 63L) & paramLong & l4) == 1L || (l3 == 0L && (paramLong | l4) == 1L)) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     if (bool)
/*   */       l2--; 
/*   */     return new zC(this.Xe0, l2, l1);
/*   */   }
/*   */   
/*   */   public final Eb0 vo0(long paramLong) {
/*   */     if (paramLong < 0L) {
/*   */       this = QC0(-paramLong);
/*   */     } else {
/*   */       zC zC1;
/*   */       l1 += paramLong;
/*   */       long l2 = this.Cz0;
/*   */       paramLong >>>= 63L;
/*   */       long l4 = l1 >>> 63L;
/*   */       long l1, l3;
/*   */       if (((l3 = (l1 = this.VP) >>> 63L) & paramLong) == 1L || ((l3 ^ paramLong) == 1L && l4 == 0L)) {
/*   */       
/*   */       } else {
/*   */       
/*   */       } 
/*   */       if (false)
/*   */         l2++; 
/*   */       this(this.Xe0, l2, l1);
/*   */       this = zC1;
/*   */     } 
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */