/*  1 */ package f;public final class iB0 { public rM Wj = new rM(); public ua0 Di0 = new ua0(); public rM Lz0 = new rM(); public ua0 mm0 = new ua0(); public Bc oL0 = new Bc(); public Bc Xh0 = new Bc(); public Bc l9 = new Bc(); public Bc N00 = new Bc(); public Bc E50 = new Bc(); public Bc Uh0 = new Bc(); public Bc em0 = new Bc(); public Bc BM = new Bc(); public Bc XZ = new Bc(); public vI O9 = new vI(); public Bc Ps = new Bc(); public Bc jP = new Bc(); public static String dL(BufferedReader paramBufferedReader, String paramString) { String str; if ((str = paramBufferedReader.readLine()) != null) return str.substring(str.indexOf(":") + 1).trim(); 
/*  2 */     throw new IOException(
/*  3 */         m0.tF0("Missing value: ", paramString)); } public Bc U90 = new Bc(); public Bc ao0 = new Bc(); public mt0 k50 = new mt0(); public fQ Op; public Dz0 tU = Dz0.COM8; public R90[] n8; public int h2 = 4; public float Ay; public float ZG; public String kK; public fQ qB0; public boolean[] T30; public boolean xZ; public iB0() { LB(); } public iB0(BufferedReader paramBufferedReader) { LB(); fB0(paramBufferedReader); } public iB0(iB0 paramiB0) { this.Op = new fQ(paramiB0.Op); this.kK = paramiB0.kK; this.qB0 = new fQ(paramiB0.qB0); vb(paramiB0.h2); this.Wj.kN(paramiB0.Wj); this.Lz0.kN(paramiB0.Lz0); this.oL0.k5(paramiB0.oL0); this.mm0.s4(paramiB0.mm0); this.Di0.s4(paramiB0.Di0); this.Xh0.k5(paramiB0.Xh0); this.l9.k5(paramiB0.l9); this.N00.k5(paramiB0.N00); this.E50.k5(paramiB0.E50); this.Uh0.k5(paramiB0.Uh0); this.em0.k5(paramiB0.em0); this.BM.k5(paramiB0.BM); this.XZ.k5(paramiB0.XZ); this.O9.HP(paramiB0.O9); this.Ps.kN(paramiB0.Ps); this.jP.kN(paramiB0.jP); this.U90.k5(paramiB0.U90); this.ao0.k5(paramiB0.ao0); this.k50.FF0(paramiB0.k50); this.xZ = paramiB0.xZ; this.tU = paramiB0.tU; float f = paramiB0.vz0(); pI0(f, paramiB0.Hi()); } public final void LB() { this.Op = new fQ(); this.qB0 = new fQ(); this.Lz0.fs0 = true; this.oL0.fs0 = true;
/*  4 */     this.mm0
/*  5 */       .fs0 = true;
/*  6 */     this.Xh0
/*  7 */       .fs0 = true;
/*  8 */     this.XZ
/*  9 */       .fs0 = true;
/* 10 */     this.k50
/* 11 */       .fs0 = true;
/* 12 */     this.U90
/* 13 */       .fs0 = true;
/* 14 */     this.ao0
/* 15 */       .fs0 = true; } public final void vb(int paramInt) { this.h2 = paramInt; this.T30 = new boolean[paramInt]; this.n8 = new R90[paramInt]; } public final void fB0(BufferedReader paramBufferedReader) { try { fQ fQ1; this.kK = dL(paramBufferedReader, "name"); paramBufferedReader.readLine(); this.Wj.fo(paramBufferedReader); paramBufferedReader.readLine(); this.Lz0.fo(paramBufferedReader); paramBufferedReader.readLine(); Integer.parseInt(dL(paramBufferedReader, "minParticleCount")); vb(Integer.parseInt(dL(paramBufferedReader, "maxParticleCount"))); paramBufferedReader.readLine(); this.oL0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.mm0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.Di0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.Ps.fo(paramBufferedReader); paramBufferedReader.readLine(); this.jP.fo(paramBufferedReader); paramBufferedReader.readLine(); this.k50.pq0(paramBufferedReader); paramBufferedReader.readLine(); this.U90.fo(paramBufferedReader); paramBufferedReader.readLine(); this.ao0.fo(paramBufferedReader); if (paramBufferedReader.readLine().trim().equals("- Scale -")) { this.Xh0.fo(paramBufferedReader); this.l9.Pb = false; } else { this.Xh0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.l9.fo(paramBufferedReader); }  paramBufferedReader.readLine(); this.E50.fo(paramBufferedReader); paramBufferedReader.readLine(); this.Uh0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.N00.fo(paramBufferedReader); paramBufferedReader.readLine(); this.em0.fo(paramBufferedReader); paramBufferedReader.readLine(); this.BM.fo(paramBufferedReader); paramBufferedReader.readLine(); this.O9.W10(paramBufferedReader); paramBufferedReader.readLine(); this.XZ.fo(paramBufferedReader); paramBufferedReader.readLine(); this.xZ = Boolean.parseBoolean(dL(paramBufferedReader, "attached")); Boolean.parseBoolean(dL(paramBufferedReader, "continuous")); Boolean.parseBoolean(dL(paramBufferedReader, "aligned")); Boolean.parseBoolean(dL(paramBufferedReader, "additive")); Boolean.parseBoolean(dL(paramBufferedReader, "behind")); String str1;
/* 16 */       if ((str1 = paramBufferedReader.readLine()).startsWith("premultipliedAlpha"))
/*    */       
/* 18 */       { Boolean.parseBoolean(str1.substring(str1.indexOf(":") + 1).trim());
/* 19 */         str1 = paramBufferedReader.readLine(); }  if (str1.startsWith("spriteMode")) { this
/*    */           
/* 21 */           .tU = Dz0.valueOf(str1.substring(str1.indexOf(":") + 1).trim()); paramBufferedReader.readLine(); }  this(); String str2; for (; (str2 = paramBufferedReader.readLine()) != null && !str2.isEmpty(); fQ1.Com3(str2)); this
/* 22 */         .qB0 = fQ1; return; } catch (RuntimeException runtimeException) { if (this
/* 23 */         .kK == null) throw runtimeException;  throw new RuntimeException(
/* 24 */           B40.df("Error parsing emitter: ")
/* 25 */           .append(this.kK).toString(), runtimeException); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void pI0(float paramFloat1, float paramFloat2) {
/*    */     if (this.xZ) {
/*    */       float f1 = paramFloat1 - this.Ay;
/*    */       float f2 = paramFloat2 - this.ZG;
/*    */       byte b = 0;
/*    */       boolean[] arrayOfBoolean;
/*    */       int i = (arrayOfBoolean = this.T30).length;
/*    */       while (b < i) {
/*    */         if (arrayOfBoolean[b])
/*    */           this.n8[b].SK0(f1, f2); 
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */     this.Ay = paramFloat1;
/*    */     this.ZG = paramFloat2;
/*    */   }
/*    */   
/*    */   public final float vz0() {
/*    */     return this.Ay;
/*    */   }
/*    */   
/*    */   public final float Hi() {
/*    */     return this.ZG;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iB0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */