/*  1 */ package f;public final class wA extends gT { public final Object Kx0(int paramInt1, int paramInt2) { CD0 cD0 = this.JY[paramInt1]; switch (paramInt2) { default: return "";case 3: this(Ml0.OH0(1683)); (new Un()).tW(new LD0(cD0, this)); return new Un();case 2: return cD0.aT ? 
/*  2 */           Ml0.OH0(1678) : ((wA)super).Fs
/*    */ 
/*    */           
/*  5 */           .format(new Date(cD0.hY.Wf0 * 1000L));
/*    */       case 1:
/*  7 */         return ((wA)super).Fs.format(new Date(cD0.bt0 * 1000L));case 0: break; }  if (cD0
/*  8 */       .fM == 
/*  9 */       km.a3
/* 10 */       .yD)
/*    */     
/*    */     { 
/* 13 */       this(km.a3.Ct); (new VP()).CC(true); }
/* 14 */     else { FV fV = cD0.hY;
/* 15 */       this(0, 0, fV);
/*    */       
/* 17 */       (vP = new VP()).CC(cD0.aT); }  if (km.XU()) { nx(-28, -52);
/* 18 */       this.X70
/* 19 */         .Dd = 2; }
/* 20 */     else { nx(-14, -26); }
/*    */ 
/*    */     
/* 23 */     this(cD0.hY.Pb); Un un; VP vP; fO fO; (new fO()).Xu("label");
/* 24 */     (new fO()).zI0 = false;
/* 25 */     (new Q20(1)).si(this, (new Q20(1)).Ub()); (new Q20(1)).si(this, (new Q20(1)).Ub());
/*    */     return new Q20(1); }
/*    */ 
/*    */   
/*    */   public CD0[] JY;
/*    */   public SimpleDateFormat Fs;
/*    */   public String[] a7;
/*    */   
/*    */   public wA() {
/*    */     String[] arrayOfString;
/*    */     this.JY = new CD0[0];
/*    */     this.Fs = new SimpleDateFormat("yyyy-MM-dd");
/*    */     if (km.XU()) {
/*    */       (arrayOfString = new String[4])[0] = Ml0.OH0(1651);
/*    */       (new String[4])[1] = Ml0.OH0(1652);
/*    */       (new String[4])[2] = Ml0.OH0(1659);
/*    */       (new String[4])[3] = Ml0.OH0(1683);
/*    */       this.a7 = this;
/*    */     } else {
/*    */       (arrayOfString = new String[3])[0] = Ml0.OH0(1651);
/*    */       (new String[3])[1] = Ml0.OH0(1652);
/*    */       (new String[3])[2] = Ml0.OH0(1659);
/*    */       ((wA)super).a7 = this;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int Z80() {
/*    */     return this.JY.length;
/*    */   }
/*    */   
/*    */   public final int ED0() {
/*    */     return this.a7.length;
/*    */   }
/*    */   
/*    */   public final String zd(int paramInt) {
/*    */     return this.a7[paramInt];
/*    */   }
/*    */   
/*    */   public final Object ms(int paramInt1, int paramInt2) {
/*    */     return "";
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */