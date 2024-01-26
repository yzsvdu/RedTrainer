/*   */ package f;public abstract class kw0 extends Fy0 implements PropertyChangeListener { public final void Te0() {
/* 2 */     sk0(this.GY.WU); this.GY.getClass();
/* 3 */     this.z4 = null; zn();
/*   */ 
/*   */     
/* 6 */     s6(this.GY.e0);
/*   */   }
/*   */   
/*   */   public kw0(aP paramaP, String paramString, U70 paramU70, int paramInt1, int paramInt2) {
/*   */     super(paramString);
/*   */     zY().qt(new U70[] { paramU70 });
/*   */     zY().zT(aP.JZ(paramaP) * paramInt1, aP.JZ(paramaP) * paramInt2);
/*   */     zY().tL(aP.JZ(paramaP) * 24, aP.JZ(paramaP) * 24);
/*   */     Te0();
/*   */   }
/*   */   
/*   */   public final void LM(throws paramthrows) {
/*   */     super.LM(paramthrows);
/*   */     this.GY.DL0(this);
/*   */   }
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     this.GY.Ey0(this);
/*   */     super.ED0(paramthrows);
/*   */   }
/*   */   
/*   */   public final void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
/*   */     Te0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */