/*  1 */ package f;public final class vy extends JG0 { public float Mr; public float Gi; public boolean TF = true; public final void Xp0() { this.TF = false; d10 d10; int i; byte b;
/*  2 */     for (i = (d10 = this.Li0).Z8, this.Gi = 0.0F, this.Mr = this.sh0 * (i - 1) + 0.0F, b = 0; b < i; ) { JG0 jG0 = (JG0)d10.get(b); this.Mr += jG0.J50(); this.Gi = Math.max(this.Gi, jG0.tj0()); b++; }  this.Gi += 0.0F; if (this.Ya0) { this.Mr = Math.round(this.Mr); this.Gi = Math.round(this.Gi); }  } public int RH0 = 8; public boolean Ya0 = true; public float sh0; public float ne; public final void d40() { if (this.TF) Xp0();  float f1 = this.sh0, f2 = 0.0F, f3 = this.ne, f4 = this.Gi - 0.0F - f2, f5 = 0.0F; int i; if (((i = this.RH0) & 0x10) != 0) { f5 = this.xY - this.Mr + f5; } else if ((i & 0x8) == 0)
/*    */     
/*  4 */     { f5 = (this.xY - this.Mr) / 2.0F + f5; }  if ((i & 0x4) == 0) if ((i & 0x2) != 0)
/*  5 */       { f2 = this.HC - 0.0F - f4; } else { f2 = (this.HC - f2 - 0.0F - f4) / 2.0F + f2; }
/*    */         d10 d10; int j; byte b; int k;
/*  7 */     for (j = (d10 = this.Li0).Z8, b = 1, k = 0; k != j; ) { JG0 jG0; float f7 = (jG0 = (JG0)d10.get(k)).J50(), f8 = ((JG0)d10.get(k)).tj0(); if (f3 > 0.0F) f8 = f4 * f3;  f8 = Math.max(f8, jG0.HY()); float f9; if ((f9 = jG0.Hj()) > 0.0F && f8 > f9) f8 = f9;  float f6 = (f4 - f8) / 2.0F + f2; jG0
/*    */ 
/*    */         
/* 10 */         .Ol0(this.Kd + (int)f5, this.er0 + (int)f6); int m = (int)f7; jG0.Tm(m, (int)f8); f5 = f7 + f1 + f5; jG0.uW(); m = k + b; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final String TI() {
/*    */     return "";
/*    */   }
/*    */   
/*    */   public final void MJ0() {
/*    */     super.MJ0();
/*    */     this.TF = true;
/*    */   }
/*    */   
/*    */   public final int J50() {
/*    */     if (this.TF)
/*    */       Xp0(); 
/*    */     return (int)this.Mr;
/*    */   }
/*    */   
/*    */   public final int tj0() {
/*    */     if (this.TF)
/*    */       Xp0(); 
/*    */     return (int)this.Gi;
/*    */   }
/*    */   
/*    */   public vy() {}
/*    */   
/*    */   public vy(JG0... paramVarArgs) {
/*    */     int i = paramVarArgs.length;
/*    */     for (byte b = 0; b < i; b++)
/*    */       J8(paramVarArgs[b]); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */