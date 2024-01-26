/*   */ package f;public class xK0 extends Ap implements x9 { public boolean mt(oa0 paramoa0) { RJ rJ; int i;
/* 2 */     if ((i = Zk0.yE(paramoa0.cz0)) != 2) { if (i != 4) return false;  if (this.dv && paramoa0
/* 3 */         .uC == 2)
/* 4 */       { rJ = RJ.L0;
/* 5 */         hm.c50(this.Dq0, this); }  return true; }
/* 6 */      if (!((xK0)super).dv) { rJ = RJ.kf;
/* 7 */       hm.c50(((xK0)super).Dq0, this); }  return true; }
/*   */ 
/*   */   
/*   */   public static final Ll qG0 = Ll.F10("selected");
/*   */   public static final Ll RQ = Ll.F10("empty");
/*   */   public boolean dv;
/*   */   public tC0[] Dq0;
/*   */   
/*   */   public xK0() {
/*   */     xL0();
/*   */     Xu("display");
/*   */   }
/*   */   
/*   */   public String TI() {
/*   */     return "listboxlabel";
/*   */   }
/*   */   
/*   */   public final boolean i2(oa0 paramoa0) {
/*   */     cb(paramoa0);
/*   */     if (!paramoa0.Ua && mt(paramoa0))
/*   */       return true; 
/*   */     return super.i2(paramoa0) ? true : paramoa0.Cz0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */