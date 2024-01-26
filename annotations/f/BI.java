/* 1 */ package f;public final class BI implements ah0 { public final void hp0() { if (this.S9) { this.S9 = false; if (this.Fp0 != null) Lq0
/*   */ 
/*   */           
/* 4 */           .p00(B40.df("Failed querying controller at index: ").append(this.Fp0.L3).toString());  this.fJ.DQ(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final y10 r0 = new y10((s3.values()).length);
/*   */   public static final y10 D2 = new y10((kB.values()).length);
/*   */   public static final Lpt7 Lq0 = new Lpt7(BI.class.getSimpleName());
/*   */   public final BL fJ = new BL();
/*   */   public final y10 Z1 = new y10();
/*   */   public final y10 jb0 = new y10();
/*   */   public final String UI0;
/*   */   public final String COm4;
/*   */   public ControllerIndex Fp0;
/*   */   public boolean S9 = true;
/*   */   public int YF = -1;
/*   */   public int rp = -1;
/*   */   
/*   */   public BI(ControllerIndex paramControllerIndex) {
/*   */     this.Fp0 = paramControllerIndex;
/*   */     this.UI0 = UUID.randomUUID().toString();
/*   */     this.COm4 = Wn();
/*   */     Zy0();
/*   */   }
/*   */   
/*   */   static {
/*   */     s3[] arrayOfS3;
/*   */     int i = (arrayOfS3 = s3.values()).length;
/*   */     byte b;
/*   */     for (b = 0; b < i; b++) {
/*   */       s3 s3 = arrayOfS3[b];
/*   */       r0.tD0(s3.ordinal(), s3);
/*   */     } 
/*   */     kB[] arrayOfKB;
/*   */     i = (arrayOfKB = kB.values()).length;
/*   */     for (b = 0; b < i; b++) {
/*   */       kB kB = arrayOfKB[b];
/*   */       D2.tD0(kB.ordinal(), kB);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int T2() {
/*   */     int i;
/*   */     if ((i = this.YF) >= 0)
/*   */       return i; 
/*   */     this.YF = D2.kG;
/*   */     try {
/*   */       while ((i = this.YF) > 0 && !this.Fp0.Ye((kB)D2.get(i - 1)))
/*   */         this.YF--; 
/*   */     } catch (l9 l9) {
/*   */       hp0();
/*   */     } catch (NullPointerException nullPointerException) {}
/*   */     return this.YF;
/*   */   }
/*   */   
/*   */   public final oW CQ() {
/*   */     if (oW.Vd == null)
/*   */       oW.Vd = new oW(); 
/*   */     return oW.Vd;
/*   */   }
/*   */   
/*   */   public final String Wn() {
/*   */     try {
/*   */       return this.Fp0.dZ();
/*   */     } catch (l9 l9) {
/*   */     
/*   */     } catch (NullPointerException nullPointerException) {}
/*   */     return "Unknown";
/*   */   }
/*   */   
/*   */   public final void Zy0() {
/*   */     kB[] arrayOfKB;
/*   */     int i = (arrayOfKB = kB.values()).length;
/*   */     byte b;
/*   */     for (b = 0; b < i; b++) {
/*   */       kB kB = arrayOfKB[b];
/*   */       this.jb0.tD0(kB.ordinal(), Float.valueOf(0.0F));
/*   */     } 
/*   */     s3[] arrayOfS3;
/*   */     i = (arrayOfS3 = s3.values()).length;
/*   */     for (b = 0; b < i; b++) {
/*   */       s3 s3 = arrayOfS3[b];
/*   */       this.Z1.tD0(s3.ordinal(), Boolean.FALSE);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */