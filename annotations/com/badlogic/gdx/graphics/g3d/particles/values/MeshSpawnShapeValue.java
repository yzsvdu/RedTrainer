/*   */ package com.badlogic.gdx.graphics.g3d.particles.values;public abstract class MeshSpawnShapeValue extends SpawnShapeValue { public re0 mesh; public cf0 model; public MeshSpawnShapeValue(MeshSpawnShapeValue paramMeshSpawnShapeValue) { super(paramMeshSpawnShapeValue); } public MeshSpawnShapeValue() {} public void load(ParticleValue paramParticleValue) { super.load(paramParticleValue); re0 re01 = ((MeshSpawnShapeValue)paramParticleValue).mesh; setMesh(this, ((MeshSpawnShapeValue)paramParticleValue).model); } public void setMesh(re0 paramre0, cf0 paramcf0) { if (paramre0.Rb(1) != null) { this.model = paramcf0; this.mesh = paramre0; return; }  throw new JU("Mesh vertices must have Usage.Position"); } public void setMesh(re0 paramre0) { setMesh(paramre0, null); } public void save(sz0 paramsz0, ResourceData paramResourceData) { if (this.model != null) { paramResourceData.createSaveData().saveAsset(paramsz0.kF((iq0)this.model), cf0.class); paramResourceData.createSaveData().save("index", Integer.valueOf(this.model.n6.JF0(this.mesh, true))); }  } public void load(sz0 paramsz0, ResourceData paramResourceData) { // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: invokevirtual getSaveData : ()Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   4: dup
/*   */     //   5: astore_2
/*   */     //   6: invokevirtual loadAsset : ()Lf/bs;
/*   */     //   9: dup
/*   */     //   10: astore_3
/*   */     //   11: ifnull -> 69
/*   */     //   14: aload_0
/*   */     //   15: aload_1
/*   */     //   16: aload_3
/*   */     //   17: dup
/*   */     //   18: aload_1
/*   */     //   19: monitorenter
/*   */     //   20: getfield bz : Ljava/lang/String;
/*   */     //   23: astore_0
/*   */     //   24: getfield RA0 : Ljava/lang/Class;
/*   */     //   27: aload_0
/*   */     //   28: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   31: aload_1
/*   */     //   32: monitorexit
/*   */     //   33: checkcast f/cf0
/*   */     //   36: dup
/*   */     //   37: astore_0
/*   */     //   38: getfield n6 : Lf/fQ;
/*   */     //   41: aload_2
/*   */     //   42: ldc 'index'
/*   */     //   44: invokevirtual load : (Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   47: checkcast java/lang/Integer
/*   */     //   50: invokevirtual intValue : ()I
/*   */     //   53: invokevirtual get : (I)Ljava/lang/Object;
/*   */     //   56: checkcast f/re0
/*   */     //   59: aload_0
/*   */     //   60: invokevirtual setMesh : (Lf/re0;Lf/cf0;)V
/*   */     //   63: goto -> 69
/*   */     //   66: aload_1
/*   */     //   67: monitorexit
/*   */     //   68: athrow
/*   */     //   69: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 20
/*   */     //   #2	-> 33
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   20	23	66	finally
/* 1 */     //   24	31	66	finally } public static class Triangle { public float x1; public float y1; public float z1; public float x2; public float y2; public static eo pick(float param1Float1, float param1Float2, float param1Float3, float param1Float4, float param1Float5, float param1Float6, float param1Float7, float param1Float8, float param1Float9, eo param1eo) { param1Float4 = nx0.Mc0.nextFloat(); param1Float5 = nx0.Mc0.nextFloat(); param1Float1 = NUL.df(param1Float7, param1Float1, param1Float5, NUL.df(param1Float4, param1Float1, param1Float4, param1Float1)); param1Float2 = NUL.df(param1Float8, param1Float2, param1Float5, NUL.df(param1Float5, param1Float2, param1Float4, param1Float2)); param1Float3 = NUL.df(param1Float6, param1Float3, param1Float4, param1Float3); param1Float3 = (param1Float9 - param1Float3) * param1Float5 + param1Float3;
/* 2 */       return param1eo.TG0(param1Float1, param1Float2, param1Float3); }
/* 3 */     public float z2; public float x3; public float y3; public float z3; public Triangle(float param1Float1, float param1Float2, float param1Float3, float param1Float4, float param1Float5, float param1Float6, float param1Float7, float param1Float8, float param1Float9) { this.x1 = param1Float1; this.y1 = param1Float2; this.z1 = param1Float3; this.x2 = param1Float4; this.y2 = param1Float5; this.z2 = param1Float6; this.x3 = param1Float7; this.y3 = param1Float8; this.z3 = param1Float9; } public eo pick(eo param1eo) { float f2 = nx0.Mc0.nextFloat(), f3 = nx0.Mc0.nextFloat();
/* 4 */       float f4 = this.x1, f5 = NUL.df(this.x2, f4, f2, f4); f4 = NUL.df(this.x3, f4, f3, f5); f5 = this.y1; float f6 = NUL.df(this.y2, f5, f2, f5); f5 = NUL.df(this.y3, f5, f3, f6); f6 = this.z1; float f1 = NUL.df(this.z2, f6, f2, f6); return param1eo.TG0(f4, f5, (this.z3 - f6) * f3 + f1); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/MeshSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */