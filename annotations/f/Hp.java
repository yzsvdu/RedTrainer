/* 1 */ package f;public final class Hp extends Hi { public static Hp E50(String paramString) { int i; if ((i = paramString.indexOf('/')) != -1) { paramString = paramString.substring(0, i); Hp hp = new Hp(); Eb0 eb0 = Eb0.MF0(paramString); int j; if ((j = Integer.parseUnsignedInt(paramString.substring(i + 1))) >= 0 && j <= 128) {
/*   */         
/* 3 */         this(eb0, he0.Eu0[j]); return hp;
/* 4 */       }  throw new IllegalArgumentException("The mask length must be between 0 and 128"); }
/* 5 */      throw new IllegalArgumentException("Expected '/' in cidr"); }
/*   */ 
/*   */   
/*   */   private static final long serialVersionUID = 3L;
/*   */   public final int FH0;
/*   */   
/*   */   public Hp(Eb0 paramEb0, he0 paramhe0) {
/*   */     super(this, paramhe0.Zr0(paramEb0));
/*   */     this.FH0 = paramhe0.Fa();
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     arrayOfObject[0] = this.XW.En0();
/*   */     Object[] arrayOfObject;
/*   */     (arrayOfObject = new Object[2])[1] = Integer.valueOf(this.FH0);
/*   */     return String.format("%s/%s", arrayOfObject);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */