/* 1 */ package f;public final class j9 extends Kl0 { public final void sM() { boolean bool; this
/* 2 */       .kn = this.Ws.getInt();
/* 3 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 4 */       .TR = bool;
/* 5 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 6 */       .mJ0 = bool;
/* 7 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 8 */       .GI0 = bool; }
/*   */ 
/*   */   
/*   */   public int kn;
/*   */   public boolean TR;
/*   */   public boolean mJ0;
/*   */   public boolean GI0;
/*   */   
/*   */   public j9(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     vh0 vh0;
/*   */     if ((vh0 = (r8()).Qa) == null)
/*   */       return; 
/*   */     Jo jo;
/*   */     if ((jo = vh0.J7(this.kn)) == null)
/*   */       return; 
/*   */     boolean bool1 = this.GI0, bool3 = this.mJ0;
/*   */     jo.Iy();
/*   */     jo.Zk0 = bool2;
/*   */     jo.Do0 = bool1;
/*   */     jo.xi = bool3;
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     boolean bool2;
/*   */     if (bool2 = this.TR)
/*   */       stringBuilder.append("{§}"); 
/*   */     if (bool3)
/*   */       stringBuilder.append("{GMMODE}"); 
/*   */     if (bool1)
/*   */       stringBuilder.append("{HIDE}"); 
/*   */     stringBuilder.append(" ");
/*   */     stringBuilder.append(jo.qE);
/*   */     jo.qE = stringBuilder.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */