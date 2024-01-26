/* 1 */ package f;public class Hi implements Vj { private static final long serialVersionUID = 3L; public final BigInteger Fk0() { Eb0 eb02; (eb02 = this.GJ).getClass(); Eb0 eb01;
/* 2 */     (eb01 = this.XW).getClass();
/*   */     
/* 4 */     return (new BigInteger(1, eb02.DH())).subtract(new BigInteger(1, DH())).add(BigInteger.ONE); } public final Eb0 XW; public final Eb0 GJ; public final int hashCode() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: bipush #31
/*   */     //   3: istore_1
/*   */     //   4: getfield XW : Lf/Eb0;
/*   */     //   7: dup
/*   */     //   8: astore_2
/*   */     //   9: ifnonnull -> 17
/*   */     //   12: iconst_0
/*   */     //   13: istore_2
/*   */     //   14: goto -> 22
/*   */     //   17: aload_2
/*   */     //   18: invokevirtual hashCode : ()I
/*   */     //   21: istore_2
/*   */     //   22: aload_0
/*   */     //   23: iload_1
/*   */     //   24: iload_2
/*   */     //   25: iadd
/*   */     //   26: bipush #31
/*   */     //   28: imul
/*   */     //   29: istore_0
/*   */     //   30: getfield GJ : Lf/Eb0;
/*   */     //   33: dup
/*   */     //   34: astore_1
/*   */     //   35: ifnonnull -> 43
/*   */     //   38: iconst_0
/*   */     //   39: istore_1
/*   */     //   40: goto -> 48
/*   */     //   43: aload_1
/*   */     //   44: invokevirtual hashCode : ()I
/*   */     //   47: istore_1
/*   */     //   48: iload_0
/*   */     //   49: iload_1
/*   */     //   50: iadd
/* 4 */     //   51: ireturn } public String toString() { return String.format("%s - %s", new Object[] { this.XW.En0(), this.GJ.En0() }); }
/*   */ 
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null)
/*   */       return false; 
/*   */     if (!(paramObject instanceof Hi))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     Eb0 eb02;
/*   */     if ((eb02 = this.XW) == null) {
/*   */       if (((Hi)paramObject).XW != null)
/*   */         return false; 
/*   */     } else if (!eb02.equals(((Hi)paramObject).XW)) {
/*   */       return false;
/*   */     } 
/*   */     Eb0 eb01;
/*   */     if ((eb01 = this.GJ) == null) {
/*   */       if (((Hi)paramObject).GJ != null)
/*   */         return false; 
/*   */     } else if (!equals(((Hi)paramObject).GJ)) {
/*   */       return false;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final Iterator qg0() {
/*   */     return new Wt(this);
/*   */   }
/*   */   
/*   */   public Hi(Eb0 paramEb01, Eb0 paramEb02) {
/*   */     this.XW = paramEb01;
/*   */     this.GJ = paramEb02;
/*   */     if (paramEb01 != null && paramEb02 != null) {
/*   */       if (paramEb01.lPT9(paramEb02) <= 0)
/*   */         return; 
/*   */       arrayOfObject[0] = paramEb01.toString();
/*   */       Object[] arrayOfObject;
/*   */       (arrayOfObject = new Object[2])[1] = paramEb02.toString();
/*   */       throw new IllegalArgumentException(String.format("The first address in the range (%s) has to be lower than the last address (%s)", arrayOfObject));
/*   */     } 
/*   */     throw new NullPointerException("Neither the first nor the last address can be null");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */