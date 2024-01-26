/* 1 */ package f;public final class al0 extends Yk0 { public final boolean L70(Object paramObject) { eJ0 eJ01; Object[] arrayOfObject1; Object[] arrayOfObject2; int i; for (arrayOfObject1 = eJ01.QG0, i = (arrayOfObject2 = (eJ01 = this.gi).Con).length; i-- > 0; ) { this.gi.getClass(); Object object; if (((object = arrayOfObject1[i]) != zb0.IM && object != zb0.ET && paramObject == arrayOfObject2[i]) || ((object = arrayOfObject2[i]) != null && zb0.Dz0(object, paramObject))) { this
/* 2 */           .gi.Cn0(i); return true; }  }  return false; }
/*   */ 
/*   */   
/*   */   public al0(eJ0 parameJ0) {
/*   */     super(parameJ0, 0);
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return new JF(this, this.gi);
/*   */   }
/*   */   
/*   */   public final boolean an0(Object paramObject) {
/*   */     return this.gi.containsValue(paramObject);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/al0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */