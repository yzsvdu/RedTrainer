/*   */ package f;
/*   */ import java.util.Map;
/* 3 */ public final class lD0 extends Yk0 { public lD0(eJ0 parameJ0) { super(parameJ0, 0); } public final boolean an0(Object paramObject) { paramObject = this.aL0.get(((Map.Entry)paramObject).getKey()); this.aL0
/* 4 */       .getClass(); Object object; if ((object = ((Map.Entry)paramObject).getValue()) == paramObject || (paramObject != null && zb0.Dz0(paramObject, object))) return true;  }
/*   */   public final Iterator iterator() { return new Cr0(this, this.aL0); } public final boolean L70(Object paramObject) { Object object1 = paramObject.getKey();
/* 6 */     this
/* 7 */       .aL0.Cn0(i);
/*   */     int i;
/*   */     Object object2;
/*   */     return ((paramObject = paramObject) != null && (i = this.aL0.bu(object1)) >= 0 && ((paramObject = paramObject.getValue()) == (object2 = this.aL0.Con[i]) || (paramObject != null && zb0.Dz0(paramObject, object2)))); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lD0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */