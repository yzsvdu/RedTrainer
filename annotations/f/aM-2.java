/* 1 */ package f;public final class aM { public final int OH0() { int i; byte b; ge0[] arrayOfGe0; for (i = 0, b = 0; b < (arrayOfGe0 = this.wE).length; ) { if ((arrayOfGe0[b]).TG0
/* 2 */         .nm0()) i |= 
/* 3 */           1 << this.Tp * 3 + b;  b++; }  return i; }
/*   */ 
/*   */   
/*   */   public byte Tp;
/*   */   public JG0 S3;
/*   */   public ge0[] wE;
/*   */   public dQ yR;
/*   */   public JG0[] Hi;
/*   */   
/*   */   public aM(byte paramByte, fH0 paramfH0) {
/*   */     this.Tp = paramByte;
/*   */     (this.yR = new dQ(Ml0.OH0(paramByte + 1350))).Xu("label-settings-title");
/*   */     (this.S3 = new JG0()).Xu("label-settings-value");
/*   */     this.wE = new ge0[3];
/*   */     this.Hi = arrayOfJG0;
/*   */     JG0[] arrayOfJG0;
/*   */     (arrayOfJG0 = new JG0[4])[0] = this.yR;
/*   */     for (byte b = 0; b < 3; b = (byte)(b + 1)) {
/*   */       boolean bool1;
/*   */       this();
/*   */       this.wE[b] = ge01;
/*   */       ge0 ge01 = this.wE[b];
/*   */       if (paramfH0 == null) {
/*   */         bool1 = false;
/*   */       } else {
/*   */         bool1 = paramfH0.Mu0(paramByte, b);
/*   */       } 
/*   */       ge01.zs(bool1);
/*   */       boolean bool = false;
/*   */       if (paramByte == 1 && b == 1)
/*   */         bool = true; 
/*   */       if (paramByte == 3 && b == 2)
/*   */         bool = true; 
/*   */       if (bool) {
/*   */         this.wE[b].zs(false);
/*   */         this.wE[b].sk0(false);
/*   */       } 
/*   */       (this.S3 = new at(new JG0[] { this.wE[b] })).Xu("label-settings-value-small");
/*   */       JG0[] arrayOfJG01 = this.Hi;
/*   */       arrayOfJG01[b + 1] = this.S3;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final JG0[] sK0() {
/*   */     return this.Hi;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */