/*    */ package f;public final class Lpt3 extends Kt { public static final b70 vK = new b70(); public final xh aX;
/*  2 */   public static String h40() { return Uu.Cw.resolve("default.fragment.glsl").QM(null); } public static String La0() { return Uu.Cw.resolve("default.vertex.glsl").QM(null); } public final R40 xj(Xw0 paramXw0) { bi0 bi0 = new bi0(); xh xh1 = this.aX; b70 b701; (b701 = vK).Qr = 0L;
/*  3 */     vK.ra0.clear(); fo0 fo0;
/*  4 */     if ((fo0 = paramXw0.kw) != null) b701.ir(fo0);  T0 t0; if ((t0 = paramXw0.bL) != null) b701.ir(t0); 
/*  5 */     String str2 = "";
/*  6 */     long l1 = b701.Qr;
/*    */ 
/*    */ 
/*    */     
/* 10 */     long l3 = paramXw0.L90.u90.Dt0.getAttributes().Ep(); if (b701.gV(qo.Ml))
/* 11 */       str2 = m0.tF0(str2, "#define fogFlag\n");  if (xh1
/* 12 */       .Ss0 != null)
/* 13 */       str2 = m0.tF0(str2, "#define lightMask\n"); 
/* 14 */     str2 = m0.tF0(str2, "#define borderglow\n");
/* 15 */     if (Vi0(l3, 1L))
/* 16 */       str2 = m0.tF0(str2, "#define positionFlag\n");  if (((l3 & 0x6L) != 0L))
/* 17 */       str2 = m0.tF0(str2, "#define colorFlag\n"); 
/* 18 */     if (Vi0(l3, 256L))
/* 19 */       str2 = m0.tF0(str2, "#define binormalFlag\n"); 
/* 20 */     if (Vi0(l3, 128L))
/* 21 */       str2 = m0.tF0(str2, "#define tangentFlag\n"); 
/* 22 */     if (Vi0(l3, 8L)) {
/* 23 */       str2 = m0.tF0(str2, "#define normalFlag\n");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     String str1 = N.Gl0(zw.vz(N.Gl0(zw.vz(m0.tF0(m0.tF0(str2, "#define lightingFlag\n"), "#define ambientCubemapFlag\n"), "#define numDirectionalLights "), xh1.Ug0, "\n"), "#define numPointLights "), xh1.hX, "\n");
/* 33 */     str2 = str1 + "#define numSpotLights " + Character.MIN_VALUE + "\n"; paramXw0.kw.getClass(); if ((Vi0(l3, 8L) || Vi0(l3, 384L)) && paramXw0.kw != null && b701.gV(ED0.AH)) {
/* 34 */       str2 = m0.tF0(str2, "#define environmentCubemapFlag\n");
/*    */     }
/*    */     
/*    */     int i;
/*    */     byte b;
/* 39 */     for (i = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0.length, b = 0; b < i; )
/*    */     { lw0 lw0;
/*    */ 
/*    */       
/*    */       int j;
/*    */       
/* 45 */       if ((j = (lw0 = (paramXw0.L90.u90.Dt0.getAttributes()).rJ0[b]).s00) == 64)
/*    */       
/*    */       { 
/* 48 */         str2 = N.Gl0(zw.vz(str2, "#define boneWeight"), lw0.ed, "Flag\n"); } else if (j == 16)
/*    */       
/*    */       { 
/* 51 */         str2 = N.Gl0(zw.vz(str2, "#define texCoord"), lw0.ed, "Flag\n"); }  b++; }  long l2; if ((l1 & (
/* 52 */       l2 = zc.U7)) == l2)
/* 53 */       str2 = m0.tF0(str2, "#define blendedFlag\n");  if ((l1 & (
/* 54 */       l2 = O80.Jg0)) == l2)
/*    */     {
/* 56 */       str2 = m0.tF0(m0.tF0(str2, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n"); }  if ((l1 & (
/* 57 */       l2 = O80.D8)) == l2)
/*    */     {
/* 59 */       str2 = m0.tF0(m0.tF0(str2, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n"); }  if ((l1 & (
/* 60 */       l2 = O80.tM)) == l2)
/*    */     {
/* 62 */       str2 = m0.tF0(m0.tF0(str2, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n"); }  if ((l1 & (
/* 63 */       l2 = O80.fS)) == l2)
/*    */     {
/* 65 */       str2 = m0.tF0(m0.tF0(str2, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n"); }  if ((l1 & (
/* 66 */       l2 = O80.La)) == l2)
/*    */     {
/* 68 */       str2 = m0.tF0(m0.tF0(str2, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n"); }  if ((l1 & (
/* 69 */       l2 = O80.Mc0)) == l2)
/*    */     {
/* 71 */       str2 = m0.tF0(m0.tF0(str2, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n"); }  if ((l1 & (
/* 72 */       l2 = qo.A80)) == l2)
/* 73 */       str2 = m0.tF0(str2, "#define diffuseColorFlag\n");  if ((l1 & (
/* 74 */       l2 = qo.J9)) == l2)
/* 75 */       str2 = m0.tF0(str2, "#define specularColorFlag\n");  if ((l1 & (
/* 76 */       l2 = qo.cu0)) == l2)
/* 77 */       str2 = m0.tF0(str2, "#define emissiveColorFlag\n");  if ((l1 & (
/* 78 */       l2 = qo.Ib)) == l2)
/* 79 */       str2 = m0.tF0(str2, "#define reflectionColorFlag\n");  if ((l1 & (
/* 80 */       l2 = s5.DR)) == l2)
/* 81 */       str2 = m0.tF0(str2, "#define overlayColorFlag\n");  if ((l1 & (
/* 82 */       l2 = LPT9.ft0)) == l2)
/* 83 */       str2 = m0.tF0(str2, "#define shininessFlag\n");  if ((l1 & (
/* 84 */       l1 = LPT9.It0)) == l1)
/* 85 */       str2 = m0.tF0(str2, "#define alphaTestFlag\n");  if (paramXw0
/* 86 */       .Et != null && xh1.xu > 0)
/*    */     {
/*    */       
/* 89 */       str2 = N.Gl0(zw.vz(str2, "#define numBones "), xh1.xu, "\n"); } 
/* 90 */     this(paramXw0, xh1, str2);
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public Lpt3(xh paramxh, wI0 paramwI0) {
/*    */     this.aX = paramxh;
/*    */   }
/*    */   
/*    */   public static final boolean Vi0(long paramLong1, long paramLong2) {
/*    */     return ((paramLong1 & paramLong2) == paramLong2);
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(Lpt3.class);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lpt3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */