/*  1 */ package f;public final class Dj0 extends Ar0 { public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { paramwP = paramwP; StringBuilder stringBuilder1 = null, stringBuilder2 = null; if (paramString.endsWith(this.fv)) { this(); str5 = (stringBuilder2 = new StringBuilder()).append(paramString.substring(0, paramString.length() - this.fv.length())).append(this.yL0).toString(); }  if (paramString.endsWith(this.yL0)) { this(); str4 = (stringBuilder1 = new StringBuilder()).append(paramString.substring(0, paramString.length() - this.yL0.length())).append(this.fv).toString(); }  if (str5 == null) { rD0 = paramRD0; } else { rD0 = resolve((String)rD0); }  if (str4 != null) paramRD0 = resolve(str4); 
/*  2 */     String str1 = rD0.QM(null);
/*  3 */     if (rD0.equals(paramRD0)) { str3 = this; }
/*  4 */     else { str3 = str3.QM(null); }
/*  5 */      this(this, str3); String str3, str4; Rm0 rm0;
/*    */     String str5;
/*    */     RD0 rD0;
/*  8 */     String str2 = "ShaderProgram " + paramString + " failed to compile:\n" + rm0.ET(); Lpt7 lpt7;
/*  9 */     if ((paramwP == null || ((F10)paramwP).JI) && !rm0.Xu0 && (lpt7 = paramsz0.Sw0).q1 >= 1)
/* 10 */       UB0.Kg0.O70(this.EX, str2);  return rm0; }
/*    */ 
/*    */   
/*    */   public String yL0 = ".vert";
/*    */   public String fv = ".frag";
/*    */   
/*    */   public Dj0(Xt0 paramXt0) {
/*    */     super(paramXt0);
/*    */   }
/*    */   
/*    */   public Dj0(Xt0 paramXt0, String paramString1, String paramString2) {
/*    */     super(paramXt0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dj0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */