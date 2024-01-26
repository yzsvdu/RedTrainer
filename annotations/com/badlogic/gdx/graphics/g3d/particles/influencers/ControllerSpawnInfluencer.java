/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class ControllerSpawnInfluencer extends Influencer { public void read(It paramIt, bM0 parambM0) { this
/* 2 */       .spawnType = (NumericValue)COm9.aD0(paramIt, parambM0, "spawnType", NumericValue.class, null); if (parambM0.Ua("spawnAdjustment"))
/* 3 */     { bM0 bM01 = parambM0.Jb("spawnAdjustment");
/* 4 */       this.spawnAdjustment = (eo)paramIt.Uj0(eo.class, null, bM01); }  if (parambM0.Ua("rotationAdjustment"))
/* 5 */     { bM0 bM01 = parambM0.Jb("rotationAdjustment");
/* 6 */       this.rotationAdjustment = (eo)paramIt.Uj0(eo.class, null, bM01); }  if (parambM0.Ua("invertSpawn")) {
/* 7 */       bM0 bM01 = parambM0.Jb("invertSpawn");
/* 8 */       this.invertSpawn = ((Boolean)paramIt.Uj0(Boolean.class, null, this)).booleanValue();
/*   */     }  }
/*   */ 
/*   */   
/*   */   private eo spawnPosition;
/*   */   public eo spawnAdjustment;
/*   */   public NumericValue spawnType;
/*   */   public boolean invertSpawn;
/*   */   public eo rotationAdjustment;
/*   */   
/*   */   public ControllerSpawnInfluencer() {
/*   */     eo eo1;
/*   */     NumericValue numericValue;
/*   */     this(4.0F, 3.0F, 0.0F);
/*   */     this.spawnPosition = this;
/*   */     this(0.0F, 0.0F, 0.0F);
/*   */     this.spawnAdjustment = this;
/*   */     this(0.0F, 0.0F, 0.0F);
/*   */     this.rotationAdjustment = this;
/*   */     this();
/*   */     this.spawnType = this;
/*   */     this.invertSpawn = false;
/*   */   }
/*   */   
/*   */   public ControllerSpawnInfluencer(ControllerSpawnInfluencer paramControllerSpawnInfluencer) {
/*   */     this.spawnPosition = paramControllerSpawnInfluencer.spawnPosition.cN();
/*   */     this.spawnAdjustment = paramControllerSpawnInfluencer.spawnAdjustment.cN();
/*   */     this.rotationAdjustment = paramControllerSpawnInfluencer.rotationAdjustment.cN();
/*   */     this.invertSpawn = paramControllerSpawnInfluencer.invertSpawn;
/*   */     this();
/*   */     this.spawnType = numericValue;
/*   */     NumericValue numericValue;
/*   */     (numericValue = new NumericValue()).setValue(paramControllerSpawnInfluencer.spawnType.getValue());
/*   */   }
/*   */   
/*   */   public void init() {}
/*   */   
/*   */   public void allocateChannels() {}
/*   */   
/*   */   public void start() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield spawnType : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   4: invokevirtual getValue : ()F
/*   */     //   7: fconst_0
/*   */     //   8: fcmpl
/*   */     //   9: ifne -> 23
/*   */     //   12: getstatic f/q10.Rs : Lf/eo;
/*   */     //   15: dup
/*   */     //   16: invokestatic w3 : (Lf/eo;Lf/eo;)Lf/eo;
/*   */     //   19: astore_1
/*   */     //   20: goto -> 43
/*   */     //   23: aload_0
/*   */     //   24: getfield spawnType : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   27: invokevirtual getValue : ()F
/*   */     //   30: fconst_1
/*   */     //   31: fcmpl
/*   */     //   32: ifne -> 51
/*   */     //   35: getstatic f/q10.HF : Lf/eo;
/*   */     //   38: dup
/*   */     //   39: invokestatic w3 : (Lf/eo;Lf/eo;)Lf/eo;
/*   */     //   42: astore_1
/*   */     //   43: aload_0
/*   */     //   44: aload_1
/*   */     //   45: putfield spawnPosition : Lf/eo;
/*   */     //   48: goto -> 59
/*   */     //   51: aload_0
/*   */     //   52: getfield spawnPosition : Lf/eo;
/*   */     //   55: invokevirtual gL : ()Lf/eo;
/*   */     //   58: pop
/*   */     //   59: aload_0
/*   */     //   60: getfield invertSpawn : Z
/*   */     //   63: ifeq -> 110
/*   */     //   66: getstatic f/q10.Nl : Lf/K50;
/*   */     //   69: getstatic f/K50.zN : Lf/K50;
/*   */     //   72: if_acmpne -> 110
/*   */     //   75: aload_0
/*   */     //   76: getfield spawnPosition : Lf/eo;
/*   */     //   79: aload_0
/*   */     //   80: getfield spawnAdjustment : Lf/eo;
/*   */     //   83: dup
/*   */     //   84: dup
/*   */     //   85: astore_1
/*   */     //   86: getfield x : F
/*   */     //   89: fneg
/*   */     //   90: fstore_2
/*   */     //   91: getfield y : F
/*   */     //   94: fstore_3
/*   */     //   95: fload_2
/*   */     //   96: aload_1
/*   */     //   97: getfield z : F
/*   */     //   100: fneg
/*   */     //   101: fload_3
/*   */     //   102: swap
/*   */     //   103: invokevirtual Tz : (FFF)Lf/eo;
/*   */     //   106: pop
/*   */     //   107: goto -> 122
/*   */     //   110: aload_0
/*   */     //   111: getfield spawnPosition : Lf/eo;
/*   */     //   114: aload_0
/*   */     //   115: getfield spawnAdjustment : Lf/eo;
/*   */     //   118: invokevirtual zT : (Lf/eo;)Lf/eo;
/*   */     //   121: pop
/*   */     //   122: aload_0
/*   */     //   123: dup
/*   */     //   124: dup2
/*   */     //   125: getfield controller : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
/*   */     //   128: getfield transform : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   131: aload_0
/*   */     //   132: getfield spawnPosition : Lf/eo;
/*   */     //   135: invokevirtual Jo : (Lf/eo;)V
/*   */     //   138: getfield controller : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
/*   */     //   141: getfield transform : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   144: getstatic f/eo.Z : Lf/eo;
/*   */     //   147: aload_0
/*   */     //   148: getfield rotationAdjustment : Lf/eo;
/*   */     //   151: getfield z : F
/*   */     //   154: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   157: pop
/*   */     //   158: getfield controller : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
/*   */     //   161: getfield transform : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   164: getstatic f/eo.Y : Lf/eo;
/*   */     //   167: aload_0
/*   */     //   168: getfield rotationAdjustment : Lf/eo;
/*   */     //   171: getfield y : F
/*   */     //   174: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   177: pop
/*   */     //   178: getfield controller : Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
/*   */     //   181: getfield transform : Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   184: getstatic f/eo.X : Lf/eo;
/*   */     //   187: aload_0
/*   */     //   188: getfield rotationAdjustment : Lf/eo;
/*   */     //   191: getfield x : F
/*   */     //   194: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*   */     //   197: pop
/*   */     //   198: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 16
/*   */     //   #2	-> 24
/*   */     //   #3	-> 39
/*   */     //   #4	-> 45
/*   */   }
/*   */   
/*   */   public void activateParticles(int paramInt1, int paramInt2) {}
/*   */   
/*   */   public ControllerSpawnInfluencer copy() {
/*   */     return new ControllerSpawnInfluencer(this);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Zg(NumericValue.class, this.spawnType, "spawnType");
/*   */     paramIt.Zg(Boolean.class, Boolean.valueOf(this.invertSpawn), "invertSpawn");
/*   */     paramIt.Zg(eo.class, this.spawnAdjustment, "spawnAdjustment");
/*   */     paramIt.Zg(eo.class, this.rotationAdjustment, "rotationAdjustment");
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/ControllerSpawnInfluencer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */