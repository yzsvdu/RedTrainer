/*  1 */ package f;public final class s20 extends V60 { public final vk Sa0(VV paramVV, int paramInt) { String str; T7 t7; String[] arrayOfString; int j = paramVV.ordinal() * 1000 + paramInt; Object object = null; f7 f71; int k; if ((k = (f71 = this.HC0).gP(Integer.valueOf(j))) >= 0)
/*  2 */       object = f71.RG[k];  vk vk;
/*  3 */     if ((vk = (vk)object) != null) return vk;  if (paramVV.ordinal() != 2) { str = "/a/2/2/9"; } else { str = "/a/2/3/0"; }
/*    */ 
/*    */     
/*  6 */     E80.Mx0();
/*    */     
/*    */     int i;
/*    */     HI hI;
/* 10 */     if ((i = Fq.cL0((ByteBuffer)(object = (hI = (this.uo.TI.B8(str)).bP).GA0()), t7.XL)) == (k = 1129464142)) {
/*    */ 
/*    */       
/* 13 */       i = wd.TG0(object.getInt(), 8, object.position(), (ByteBuffer)object);
/* 14 */       i = object.position() + i;
/* 15 */       int n = object.getInt(u80.Lx0((ByteBuffer)object) + 12 + (k = paramInt * 8));
/* 16 */       i = n + i; int m = WW.Rq0(u80.Lx0((ByteBuffer)object), 12, 4, k, (ByteBuffer)object) - n;
/* 17 */       arrayOfString = nN.Wj; if (paramInt < 400) { arrayOfString[paramInt]; } else { Integer.toString(paramInt); }
/* 18 */        vk vk1 = new vk(); ByteBuffer byteBuffer;
/* 19 */       (byteBuffer = hI.GA0()).position(i); if (m > 0) {
/* 20 */         V8.Pp0(i, m, byteBuffer.limit(), byteBuffer);
/*    */       }
/* 22 */       this(S0.qy(byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN))); this.HC0.X00(Integer.valueOf(j), vk1); return vk1;
/* 23 */     }  throw new RuntimeException(
/* 24 */         RH0.KK("Header magic mismatch = ", i, " vs expected ", arrayOfString)); }
/*    */ 
/*    */   
/*    */   public f7 HC0;
/*    */   
/*    */   public s20(HI paramHI) {
/*    */     super(paramHI);
/*    */     f7 f71;
/*    */     this();
/*    */     this.HC0 = this;
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(s20.class);
/*    */   }
/*    */   
/*    */   public final KB0 eD(int paramInt) {
/*    */     VV vV = VV.Dv0;
/*    */     int i = 0 + paramInt;
/*    */     KB0 kB0;
/*    */     if ((kB0 = (KB0)this.b80.pd0(Integer.valueOf(i))) == null || kB0.Db0.Y0) {
/*    */       Iq iq;
/*    */       Wd wd = this.uo.oB(vV, paramInt);
/*    */       this();
/*    */       this(this, this);
/*    */       this.b80.X00(Integer.valueOf(i), kB0);
/*    */     } 
/*    */     return kB0;
/*    */   }
/*    */   
/*    */   public final void vO() {
/*    */     TA tA;
/*    */     (tA = this.b80.mw0()).getClass();
/*    */     while (tA.hasNext())
/*    */       ((KB0)tA.next()).Db0.dispose(); 
/*    */     this.b80.t9();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */