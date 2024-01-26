/*  1 */ package f;public final class Rq0 extends Kl0 { public final void sM() { this
/*  2 */       .l50 = this.Ws.getInt(); this(); this.n = mD0; MD0 mD0; (mD0 = new MD0())
/*    */       
/*  4 */       .vE0 = this.Ws.getInt(); byte b;
/*  5 */     if (((b = this.Ws.get()) & 0x1) != 0)
/*  6 */       this.n
/*    */         
/*  8 */         .sV = this.Ws.getInt();  if ((b & 0x2) != 0) this.n
/*    */         
/* 10 */         .K0 = this.Ws.getInt();  if ((b & 0x4) != 0) this.n
/*    */         
/* 12 */         .vF0 = this.Ws.getInt();  if ((b & 0x8) != 0) this.n
/*    */         
/* 14 */         .RW = this.Ws.getInt();  if ((b & 0x10) != 0) this.n
/*    */         
/* 16 */         .RB = this.Ws.getInt();  if ((b & 0x20) != 0) this.n
/*    */         
/* 18 */         .Qm = this.Ws.getInt();  }
/*    */ 
/*    */   
/*    */   public int l50;
/*    */   public MD0 n;
/*    */   
/*    */   public Rq0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     j40 j40;
/*    */     aq0[] arrayOfAq0;
/*    */     int i;
/*    */     byte b;
/*    */     Uc0 uc0;
/*    */     aq0 aq0;
/*    */     for (j40 = null, i = (arrayOfAq0 = aq0.SL0).length, b = 0, aq0 = arrayOfAq0[b]; b < i && ((uc0 = r8().s40(aq0)) == null || (j40 = uc0.de0(this.l50)) == null); b++);
/*    */     if (j40 == null)
/*    */       return; 
/*    */     Gp0 gp0;
/*    */     if ((gp0 = km.MR) != null && gp0.rx != ky.JH0) {
/*    */       Gp0 gp01 = km.MR;
/*    */       int j = this.l50;
/*    */       MD0 mD0 = this.n;
/*    */       for (Iterator iterator = this.W.iterator(); hasNext();) {
/*    */         if (sI0 = (SI0)next() instanceof Jb) {
/*    */           int k;
/*    */           j40 j401;
/*    */           if ((j401 = ((Jb)(sI0 = sI0)).Ry0) == null) {
/*    */             k = 0;
/*    */           } else {
/*    */             k = k.Jg;
/*    */           } 
/*    */           if (k == j) {
/*    */             MD0 mD01;
/*    */             if ((mD01 = ((Jb)sI0).nl) == null) {
/*    */               ((Jb)sI0).nl = mD0;
/*    */               break;
/*    */             } 
/*    */             this.vE0 += mD0.vE0;
/*    */             this.sV += mD0.sV;
/*    */             this.K0 += mD0.K0;
/*    */             this.vF0 += mD0.vF0;
/*    */             this.RW += mD0.RW;
/*    */             this.RB += mD0.RB;
/*    */             this.Qm += mD0.Qm;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */