/* 1 */ package f;public class W1 extends sx { public static final Ll Ou0 = Ll.F10("error"); public final lpt8 xy0; public final A60 Wa0; public Runnable[] Dy; public String zx; public final void Z30(int paramInt) { this.Wa0
/* 2 */       .zy0(paramInt, true, RJ.QE0);
/* 3 */     s3(); } public int bL0; public W1() { lpt8 lpt81; this.zx = ""; this.bL0 = -1; this(this, cOm7()); this.xy0 = new lpt8(); this(); this.Wa0 = a60; this.lPT8.Xe0().xu0(new Ar(this)); A60 a60; (a60 = new A60()).rS(new y60(this)); this.b90.Xu("comboboxPopup"); this.b90.J8(a60); J8(lpt81); } public W1(cQ paramcQ) { this(); rk0(paramcQ); } public final String TI() { return "combobox"; } public final void D30(Runnable paramRunnable) { this.Dy = (Runnable[])hm.LpT6((Object[])this.Dy, paramRunnable, Runnable.class); } public final void COm6(Object paramObject) { cQ cQ = this.Wa0.my; byte b = 0; while (b < this.Wa0.nN) { if (cQ
/* 4 */         .c90(b).equals(paramObject)) { this.Wa0
/*   */           
/* 6 */           .zy0(b, true, RJ.QE0);
/* 7 */         s3(); break; }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int Yq() {
/*   */     return this.Wa0.go;
/*   */   }
/*   */   
/*   */   public final Object WW() {
/*   */     A60 a60;
/*   */     int i;
/*   */     if ((i = (a60 = this.Wa0).go) == -1)
/*   */       return null; 
/*   */     cQ cQ;
/*   */     if ((cQ = this.my) == null)
/*   */       return null; 
/*   */     return c90(i);
/*   */   }
/*   */   
/*   */   public boolean ix() {
/*   */     Gd();
/*   */     if (this.b90.jv()) {
/*   */       this.b90.uW();
/*   */       int i = this.Wa0.go;
/*   */       this.Wa0.zy0(i, true, RJ.QE0);
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public String Ja0(int paramInt) {
/*   */     return String.valueOf(this.Wa0.my.c90(paramInt));
/*   */   }
/*   */   
/*   */   public final void s3() {
/*   */     this.xy0.E1(this.zx);
/*   */     this.xy0.E1(Ja0(i));
/*   */     int i;
/*   */     (((i = this.Wa0.go) == -1) ? this.xy0 : this.xy0).O.gf0(Ou0, false);
/*   */     MJ0();
/*   */   }
/*   */   
/*   */   public final void Xw(nY paramnY) {
/*   */     super.Xw(paramnY);
/*   */   }
/*   */   
/*   */   public final boolean i2(oa0 paramoa0) {
/*   */     if (super.i2(paramoa0))
/*   */       return true; 
/*   */     if (paramoa0.oO()) {
/*   */       int i;
/*   */       if ((i = yl.Nk(paramoa0.GG0)) != 3)
/*   */         if (i != 62 && i != 66) {
/*   */           if (i != 123 && i != 19 && i != 20)
/*   */             return false; 
/*   */         } else {
/*   */           ix();
/*   */           return true;
/*   */         }  
/*   */       this.Wa0.i2(paramoa0);
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final void rk0(cQ paramcQ) {
/*   */     this.Wa0.UN(paramcQ);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */