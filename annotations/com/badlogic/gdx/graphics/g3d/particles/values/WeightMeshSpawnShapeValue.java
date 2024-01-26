/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class WeightMeshSpawnShapeValue extends MeshSpawnShapeValue { public void calculateWeights() { short[] arrayOfShort; this.distribution.Nv
/*  2 */       .clear();
/*    */ 
/*    */     
/*  5 */     Ao ao = this.mesh.Dt0.getAttributes();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 12 */     short s1 = (short)(ao.Nb / 4), s2 = (short)((ao.kA(1)).TZ / 4); int j; float[] arrayOfFloat = new float[(j = this.mesh.Dt0.IH()) * s1]; this.mesh
/* 13 */       .uk(-1, arrayOfFloat); int i; if ((i = this.mesh.rs0.pP()) > 0)
/* 14 */     { arrayOfShort = new short[i]; this.mesh
/* 15 */         .x2(-1, arrayOfShort); for (byte b1 = 0; b1 < i; )
/* 16 */       { MeshSpawnShapeValue.Triangle triangle; int m = arrayOfShort[b1 + 1] * s1 + s2, n = arrayOfShort[b1 + 2] * s1 + s2; float f6 = arrayOfFloat[k], f3 = arrayOfFloat[k + 2], f4 = arrayOfFloat[m], f8 = arrayOfFloat[m + 1], f9 = arrayOfFloat[m + 2], f10 = arrayOfFloat[n], f11 = arrayOfFloat[n + 1], f5 = arrayOfFloat[n + 2], f12 = NUL.df(f11, f7, f4, (f8 - f11) * f6); int k; float f7; f12 = Math.abs((((f7 = arrayOfFloat[(k = arrayOfShort[b1] * s1 + s2) + 1]) - f8) * f10 + f12) / 2.0F); this(f6, f7, f3, f4, f8, f9, f10, f11, f5); aW aW2; (aW2 = this.distribution)
/* 17 */           .Nv
/* 18 */           .Com3(new Kg(aW2, triangle, 0.0F, f12)); b1 += 3; }  } else { for (i = 0; i < arrayOfShort; ) { MeshSpawnShapeValue.Triangle triangle; int m, n = (m = i + s1) + s1;
/* 19 */         float f6 = arrayOfFloat[i], f3 = arrayOfFloat[i + 2], f4 = arrayOfFloat[m], f8 = arrayOfFloat[m + 1], f9 = arrayOfFloat[m + 2], f10 = arrayOfFloat[n], f11 = arrayOfFloat[n + 1], f5 = arrayOfFloat[n + 2], f12 = NUL.df(f11, f7, f4, (f8 - f11) * f6); float f7; f12 = Math.abs((((f7 = arrayOfFloat[(i += s2) + 1]) - f8) * f10 + f12) / 2.0F); this(f6, f7, f3, f4, f8, f9, f10, f11, f5); aW aW2; (aW2 = this.distribution)
/* 20 */           .Nv
/* 21 */           .Com3(new Kg(aW2, triangle, 0.0F, f12)); int k = i + s1; }  }
/* 22 */      aW aW1 = this.distribution; float f1 = 0.0F; i = 0; fQ fQ1; while (i < 
/* 23 */       (fQ1 = this.Nv)
/* 24 */       .Z8) { f1 += (((Kg[])fQ1.Uq0)[i]).Nv; i++; }  float f2; byte b; fQ fQ2; for (f2 = 0.0F, b = 0; b < (fQ2 = this.Nv).Z8; ) { (((Kg[])fQ2.Uq0)[b]).Yz0 = f2 = (((Kg[])fQ2.Uq0)[b]).Nv / f1 + f2; b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   private aW distribution;
/*    */   
/*    */   public WeightMeshSpawnShapeValue(WeightMeshSpawnShapeValue paramWeightMeshSpawnShapeValue) {
/*    */     super(paramWeightMeshSpawnShapeValue);
/*    */     aW aW1;
/*    */     this();
/*    */     this.distribution = this;
/*    */     load(paramWeightMeshSpawnShapeValue);
/*    */   }
/*    */   
/*    */   public WeightMeshSpawnShapeValue() {
/*    */     aW aW1;
/*    */     this();
/*    */     this.distribution = this;
/*    */   }
/*    */   
/*    */   public void init() {
/*    */     calculateWeights();
/*    */   }
/*    */   
/*    */   public void spawnAux(eo parameo, float paramFloat) {
/*    */     aW aW1;
/*    */     (aW1 = this.distribution).getClass();
/*    */     paramFloat = nx0.Mc0.nextFloat();
/*    */     int j;
/*    */     for (int i = this.distribution.Nv.Z8 - 1; j <= i; ) {
/*    */       int k = JO.Se0(i, j, 2, j);
/*    */       float f;
/*    */       if (paramFloat < (f = (((Kg[])this.Nv.Uq0)[k]).Yz0)) {
/*    */         i = k - 1;
/*    */         continue;
/*    */       } 
/*    */       if (paramFloat > f)
/*    */         j = k + 1; 
/*    */     } 
/*    */     float f2 = nx0.Mc0.nextFloat();
/*    */     paramFloat = nx0.Mc0.nextFloat();
/*    */     MeshSpawnShapeValue.Triangle triangle;
/*    */     float f3 = (triangle = (MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).x1, f4 = NUL.df(((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).x2, f3, f2, f3);
/*    */     f3 = NUL.df(((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).x3, f3, paramFloat, f4);
/*    */     f4 = ((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).y1;
/*    */     float f5 = NUL.df(((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).y2, f4, f2, f4);
/*    */     f4 = NUL.df(((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).y3, f4, paramFloat, f5);
/*    */     f5 = ((MeshSpawnShapeValue.Triangle)(((Kg[])this.Nv.Uq0)[j]).Tr0).z1;
/*    */     float f1 = NUL.df(this.z2, f5, f2, f5);
/*    */     parameo.TG0(f3, f4, (this.z3 - f5) * paramFloat + f1);
/*    */   }
/*    */   
/*    */   public SpawnShapeValue copy() {
/*    */     return new WeightMeshSpawnShapeValue(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/WeightMeshSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */