/* 1 */ package f;public final class fV { public final MZ PJ0(short paramShort) { paramShort = Qx.SG0(paramShort); short s; if ((s = (short)Qx.Pi0(paramShort)) == 99) s = 2;  if (s == 50 && paramShort == 100) paramShort = 1;  if (s == 3 && paramShort == 100) paramShort = 5;  MZ arrayOfMZ[], arrayOfMZ1[][]; if (s >= (arrayOfMZ1 = this.i60).length || (arrayOfMZ = this[s]) == null || paramShort >= this.length) { arrayOfMZ = null; return (MZ)this; }  MZ mZ = this[paramShort]; return this; }
/*   */ 
/*   */   
/*   */   public static final fV Ca = new fV();
/*   */   public MZ[][] i60 = new MZ[100][];
/*   */   public By0[] kg = new By0[5];
/*   */   public Pz[] sw = new Pz[5];
/*   */   
/*   */   public fV() {
/*   */     Pz[] arrayOfPz;
/*   */     for (byte b = 0; b < (arrayOfPz = this.sw).length; b++) {
/*   */       Pz pz;
/*   */       this();
/*   */       arrayOfPz[b] = pz;
/*   */     } 
/*   */   }
/*   */   
/*   */   public static fV Gv0() {
/*   */     return Ca;
/*   */   }
/*   */   
/*   */   public final ot GI0(int paramInt, byte paramByte) {
/*   */     return (ot)(this.sw[paramByte]).Ze0.Z6(paramInt);
/*   */   }
/*   */   
/*   */   public final ArrayList KF() {
/*   */     this();
/*   */     ArrayList<MZ> arrayList;
/*   */     MZ[][] arrayOfMZ;
/*   */     for (byte b = 0; b < (arrayOfMZ = this.i60).length; b++) {
/*   */       if (arrayOfMZ[b] != null) {
/*   */         MZ[] arrayOfMZ1;
/*   */         for (byte b1 = 0; b1 < (arrayOfMZ1 = this.i60[b]).length; b1++) {
/*   */           MZ mZ;
/*   */           if ((mZ = arrayOfMZ1[b1]) != null)
/*   */             arrayList.add(mZ); 
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     return arrayList;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */