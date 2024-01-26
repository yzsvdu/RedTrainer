/*  1 */ package f;public final class ya extends JG0 { public final void V90(throws paramthrows) { super.V90(paramthrows); if (this.pZ.isEmpty() && 
/*  2 */       !this.db0.en && this
/*  3 */       .lg0 < 1L && this.V70 < 1L) if (this
/*  4 */         .I20.isEmpty()) { wI0(false); } else { this.pZ = this.I20.poll(); this.Pc.E1(""); km.pm0.bL((byte)2, (short)1395); this.V70 = System.currentTimeMillis() + 500L; this.lg0 = -1L; wI0(true); this
/*  5 */           .db0
/*  6 */           .sz(pRn.WHITE, 500); }   if (this
/*  7 */       .V70 < System.currentTimeMillis() && !this.pZ.isEmpty() && this.Pc.bA0()) { Dk0 dk0 = this.Pc; String str = this.pZ; dk0
/*  8 */         .R
/*  9 */         .add(new Rb(str));
/* 10 */       this.pZ = ""; this.lg0 = System.currentTimeMillis() + 2000L; this.V70 = -1L; }  long l; if ((l = this.lg0) > 0L && l <= System.currentTimeMillis()) { this.lg0 = -1L; this
/* 11 */         .db0
/* 12 */         .oC0(500); }
/*    */      }
/*    */ 
/*    */   
/*    */   public Dk0 Pc;
/*    */   public long V70;
/*    */   public long lg0;
/*    */   public String pZ;
/*    */   public ArrayDeque I20;
/*    */   
/*    */   public ya(boolean paramBoolean) {
/*    */     I i;
/*    */     this.V70 = 0L;
/*    */     this.lg0 = 0L;
/*    */     this.pZ = "";
/*    */     this.I20 = new ArrayDeque();
/*    */     (this.Pc = new Dk0(2500, 0)).Xu("label");
/*    */     this.Pc.Rp0();
/*    */     J8(this.Pc);
/*    */     if (paramBoolean) {
/*    */       Xu("battle-ability-enemy");
/*    */     } else {
/*    */       Xu("battle-ability");
/*    */     } 
/*    */     this(this, pRn.TRANSPARENT);
/*    */     Vo0(i);
/*    */     wI0(false);
/*    */   }
/*    */   
/*    */   public final void gf0(String paramString) {
/*    */     if (paramString == null || paramString.isEmpty())
/*    */       return; 
/*    */     this.I20.add(paramString);
/*    */     wI0(true);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     byte b;
/*    */     this.Pc.mM();
/*    */     Dk0 dk0 = this.Pc;
/*    */     int j = this.Kd;
/*    */     if (km.XU()) {
/*    */       b = 40;
/*    */     } else {
/*    */       b = 100;
/*    */     } 
/*    */     int i = j + b;
/*    */     j = this.er0;
/*    */     if (km.XU()) {
/*    */       b = 36;
/*    */     } else {
/*    */       b = 24;
/*    */     } 
/*    */     dk0.ME(i, j - b);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */