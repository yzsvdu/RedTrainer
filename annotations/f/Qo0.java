/* 1 */ package f;public final class Qo0 extends Gi0 { public static Qo0 wi0(String paramString) { int i; if ((i = paramString.indexOf('/')) != -1) { paramString = paramString.substring(0, i); Qo0 qo0 = new Qo0(); o80 o80 = o80.E5(paramString); int j; if ((j = Integer.parseUnsignedInt(paramString.substring(i + 1))) >= 0 && j <= 32) {
/*   */         
/* 3 */         this(o80, mI0.values()[j]); return qo0;
/* 4 */       }  throw new IllegalArgumentException("The mask length must be between 0 and 32"); }
/* 5 */      throw new IllegalArgumentException("Expected '/' in cidr"); }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 3L;
/*   */   public final int EL;
/*   */   
/*   */   public Qo0(o80 paramo80, mI0 parammI0) {
/*   */     super(this, parammI0.Ty(paramo80));
/*   */     this.EL = parammI0.N70();
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     arrayOfObject[0] = this.PRN;
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = new Object[2])[1] = Integer.valueOf(this.EL);
/*   */     return String.format("%s/%d", arrayOfObject);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */