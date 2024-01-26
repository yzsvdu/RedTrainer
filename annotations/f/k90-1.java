/*    */ package f;public final class k90 extends lpt1 { public final Matrix4 pl(eo parameo1, eo parameo2, Ih0 paramIh0) {
/*  2 */     o6(); (kB0("Hero_body", true)).AS.on0(s40); Matrix4 matrix4 = (kB0("Hero_body", true)).AS; getClass(); uq
/*  3 */       .dJ(false, this); eo eo4, eo5, eo6;
/*  4 */     this(uq.lpt2(eo4 = eo.X), uq.lpt2(eo5 = eo.Y), uq.lpt2(eo6 = eo.Z)); eo eo1; eo8.getClass();
/*  5 */     float f7 = parameo1.x, f8 = parameo1.y, f9 = parameo1.z; eo eo8; (eo8 = s40).Tz(f7, f8, f9);
/*  6 */     s40.Tz(0.0F, 0.0F, 0.05F); uq.Gl0(); eo7.getClass();
/*  7 */     float f4 = parameo2.x; f8 = parameo2.y; f9 = parameo2.z;
/*  8 */     float f2 = parameo1.x; f4 = parameo1.y; f8 = parameo1.z; eo eo7; (eo7 = Iy).TG0(f4, f8, f9).uD(f2, f4, f8)
/*  9 */       .WC0(); eo eo2; (eo2 = R70).JL(paramIh0.nj0).Nz(eo7).WC0(); eo3.getClass();
/* 10 */     float f5 = eo7.x; f8 = eo7.y; f9 = eo7.z; eo eo3; (eo3 = FH0).TG0(f5, f8, f9)
/* 11 */       .Nz(eo2).WC0(); float f1 = eo2.x, f3 = eo3.x; f5 = eo7.x; float f6 = eo2.y; f8 = eo3.y; f9 = eo7.y; float f10 = eo2.z, f11 = eo3.z, f12 = eo7.z; uq
/* 12 */       .hE0(false, f1, f3, f5, f6, f8, f9, f10, f11, f12);
/* 13 */     this.Pf.mT(s40, uq, Hk.A1); this.Pf.N8(eo4, this.x); this.Pf.N8(eo5, this.y); this.Pf.N8(eo6, this.z); return this.Pf;
/*    */   }
/*    */   
/*    */   public static eo s40 = new eo();
/*    */   public static TG0 uq = new TG0();
/*    */   public static final eo R70 = new eo();
/*    */   public static final eo FH0 = new eo();
/*    */   public static final eo Iy = new eo();
/*    */   public Matrix4 Pf = new Matrix4();
/*    */   
/*    */   public k90(lpt1 paramlpt1) {
/*    */     super(paramlpt1);
/*    */     ((T0)this.xl0.get(0)).Tz0(new zc(0.0F));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/k90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */