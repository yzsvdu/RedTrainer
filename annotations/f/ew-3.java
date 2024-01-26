/*  1 */ package f;public final class ew extends Kl0 { public final void sM() { if (R00() == 1) { i = 1; } else { i = 0; }  this.sd = i; if (!i) return;  this.tq0 = LU(false); if ((this
/*  2 */       .Wz0 = this.Ws.get()) > 0) { this
/*    */         
/*  4 */         .qw = this.Ws.get();
/*    */       
/*  6 */       this.Nw0 = this.Ws.get();
/*    */       
/*  8 */       this.or0 = this.Ws.get(); this.Su = au();
/*    */       
/* 10 */       this.Zl0 = this.Ws.getLong();
/*    */       
/* 12 */       this.eB0 = this.Ws.getInt(); this.do = au(); this.y10 = au(); this.coM4 = au(); }  if ((R00() == 1)) { this
/* 13 */         .Ws.getInt();
/* 14 */       this.Pj = au(); }  int i; byte b; for (this.QI = new ph0[i = Gc0()], b = 0; b < i; ) {
/* 15 */       ph0 ph01; int j = this.Ws.getInt(), k = this.Ws.getInt();
/* 16 */       String str1 = au(), str2 = au(); this(j, str2, k); this.QI[b] = ph01; (this.QI[b])
/* 17 */         .Gg = str1; b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public boolean sd;
/*    */   public fH0 tq0;
/*    */   public byte Wz0;
/*    */   public byte qw;
/*    */   public byte Nw0;
/*    */   public byte or0 = 0;
/*    */   public String Su = "0.0.0.0";
/*    */   public long Zl0;
/*    */   public int eB0;
/*    */   public String do = "";
/*    */   public String y10 = "";
/*    */   public String coM4 = "";
/*    */   public String Pj;
/*    */   public ph0[] QI;
/*    */   
/*    */   public ew(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     Arrays.sort(this.QI, ph0.Jy0);
/*    */     r8().tS(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */