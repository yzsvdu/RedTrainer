/*  1 */ package f;public abstract class sx extends JG0 { public static final Ll Wf = Ll.F10("comboboxKeyboardFocus"); public final Un lPT8; public static void SD0(JG0 paramJG0, Ll paramLl, boolean paramBoolean) { paramJG0.O
/*  2 */       .gf0(paramLl, paramBoolean); for (byte b = 0; b < paramJG0.Ub(); ) { SD0(paramJG0.lPt3(b), paramLl, paramBoolean); b++; }  } public final zm b90; public sx() { this(cOm7()); this.lPT8 = un; this.b90 = new zm((W1)this, (W1)(this = this)); Un un; (un = new Un()).tW(new L7((W1)this)); J8(new Un()); Zf0(true); fk(); } public abstract boolean ix(); public final int R80() { int i = ((W1)this).xy0.J50(); return this.lPT8.J50() + i; } public final int tJ0() { return Math.max(((W1)this).xy0.tj0(), this.lPT8.tj0()); } public final int AW() { int i = ((W1)this).xy0.AW(); return Math.max(super.AW(), this.lPT8.AW() + i); } public final int HY() { int i = Math.max(((W1)this).xy0.HY(), this.lPT8.HY()); return Math.max(super.HY(), Et() + i); } public final void Gd() { int i, j = JG0.Fr(i = this.b90.HY(), this.b90.tj0(), this.b90.Rr);
/*    */     
/*  4 */     int k = this.b90.fr0.mD(); if (yR() + i > k) { if (this
/*  5 */         .er0 - j >= 
/*  6 */         this.b90
/*  7 */         .fr0
/*  8 */         .e3()) { this.b90
/*    */ 
/*    */           
/* 11 */           .ME(this.Kd, this.er0 - j); }
/* 12 */       else { zm zm1 = this.b90;
/* 13 */         int m = this.Kd; i = k - i;
/*    */ 
/*    */         
/* 16 */         zm1
/* 17 */           .ME(m, i); }  } else { zm zm1 = this.b90; int m = this.Kd; i = yR(); zm1.ME(m, i); }
/*    */ 
/*    */     
/* 20 */     i = Math.min(j, k - this.b90.er0); this.b90
/*    */       
/* 22 */       .Tm(this.xY, i); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     int i = this.lPT8.J50(), j = Hy(), k = RS(), m = e3();
/*    */     this.lPT8.ME(m40() - i, m);
/*    */     this.lPT8.Tm(i, j);
/*    */     ((W1)this).xy0.ME(k, m);
/*    */     ((W1)this).xy0.Tm(Math.max(0, this.lPT8.Kd - k), j);
/*    */   }
/*    */   
/*    */   public final void Gu() {
/*    */     boolean bool;
/*    */     rq0();
/*    */     if (this.b90.fr0 != null) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (bool)
/*    */       Gd(); 
/*    */   }
/*    */   
/*    */   public final void pm() {
/*    */     SD0(((W1)this).xy0, Wf, true);
/*    */   }
/*    */   
/*    */   public final void GD() {
/*    */     SD0(((W1)this).xy0, Wf, false);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */