/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class UnweightedMeshSpawnShapeValue extends MeshSpawnShapeValue { public void setMesh(re0 paramre0, cf0 paramcf0) { super.setMesh(paramre0, paramcf0); this
/*    */       
/*  3 */       .vertexSize = (paramre0.Dt0.getAttributes()).Nb / 4; this.positionOffset = (paramre0.Rb(1)).TZ / 4; int j;
/*  4 */     if ((j = paramre0.rs0.pP()) > 0)
/*  5 */     { short[] arrayOfShort = new short[j];
/*  6 */       paramre0.x2(-1, arrayOfShort);
/*  7 */       this.triangleCount = this.indices.length / 3; } else { this.indices = null; }
/*  8 */      this
/*  9 */       .vertexCount = i; int i; float[] arrayOfFloat = new float[(i = paramre0.Dt0.IH()) * this.vertexSize];
/* 10 */     paramre0.uk(-1, this); }
/*    */ 
/*    */   
/*    */   private float[] vertices;
/*    */   private short[] indices;
/*    */   private int positionOffset;
/*    */   private int vertexSize;
/*    */   private int vertexCount;
/*    */   private int triangleCount;
/*    */   
/*    */   public UnweightedMeshSpawnShapeValue(UnweightedMeshSpawnShapeValue paramUnweightedMeshSpawnShapeValue) {
/*    */     super(paramUnweightedMeshSpawnShapeValue);
/*    */     load(paramUnweightedMeshSpawnShapeValue);
/*    */   }
/*    */   
/*    */   public UnweightedMeshSpawnShapeValue() {}
/*    */   
/*    */   public void spawnAux(eo parameo, float paramFloat) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield indices : [S
/*    */     //   4: ifnonnull -> 124
/*    */     //   7: aload_0
/*    */     //   8: dup
/*    */     //   9: getfield vertexCount : I
/*    */     //   12: iconst_3
/*    */     //   13: isub
/*    */     //   14: invokestatic cOM9 : (I)I
/*    */     //   17: aload_0
/*    */     //   18: getfield vertexSize : I
/*    */     //   21: dup
/*    */     //   22: istore_2
/*    */     //   23: imul
/*    */     //   24: aload_0
/*    */     //   25: getfield positionOffset : I
/*    */     //   28: iadd
/*    */     //   29: dup
/*    */     //   30: istore_0
/*    */     //   31: iload_2
/*    */     //   32: iadd
/*    */     //   33: dup
/*    */     //   34: istore_3
/*    */     //   35: iload_2
/*    */     //   36: iadd
/*    */     //   37: istore_2
/*    */     //   38: getfield vertices : [F
/*    */     //   41: dup
/*    */     //   42: astore #4
/*    */     //   44: iload_0
/*    */     //   45: faload
/*    */     //   46: aload #4
/*    */     //   48: iload_2
/*    */     //   49: aload #4
/*    */     //   51: iload_2
/*    */     //   52: aload #4
/*    */     //   54: iload_2
/*    */     //   55: aload #4
/*    */     //   57: iload_3
/*    */     //   58: aload #4
/*    */     //   60: iload_3
/*    */     //   61: aload #4
/*    */     //   63: iload_3
/*    */     //   64: aload #4
/*    */     //   66: iload_0
/*    */     //   67: aload #4
/*    */     //   69: iload_0
/*    */     //   70: iconst_1
/*    */     //   71: iadd
/*    */     //   72: faload
/*    */     //   73: fstore_0
/*    */     //   74: iconst_2
/*    */     //   75: iadd
/*    */     //   76: faload
/*    */     //   77: fstore_2
/*    */     //   78: faload
/*    */     //   79: fstore_3
/*    */     //   80: iconst_1
/*    */     //   81: iadd
/*    */     //   82: faload
/*    */     //   83: fstore #4
/*    */     //   85: iconst_2
/*    */     //   86: iadd
/*    */     //   87: faload
/*    */     //   88: fstore #5
/*    */     //   90: faload
/*    */     //   91: fstore #6
/*    */     //   93: iconst_1
/*    */     //   94: iadd
/*    */     //   95: faload
/*    */     //   96: fstore #7
/*    */     //   98: iconst_2
/*    */     //   99: iadd
/*    */     //   100: faload
/*    */     //   101: fstore #8
/*    */     //   103: fload_0
/*    */     //   104: fload_2
/*    */     //   105: fload_3
/*    */     //   106: fload #4
/*    */     //   108: fload #5
/*    */     //   110: fload #6
/*    */     //   112: fload #7
/*    */     //   114: fload #8
/*    */     //   116: aload_1
/*    */     //   117: invokestatic pick : (FFFFFFFFFLf/eo;)Lf/eo;
/*    */     //   120: pop
/*    */     //   121: goto -> 258
/*    */     //   124: aload_0
/*    */     //   125: dup
/*    */     //   126: dup
/*    */     //   127: getfield triangleCount : I
/*    */     //   130: iconst_1
/*    */     //   131: isub
/*    */     //   132: invokestatic cOM9 : (I)I
/*    */     //   135: iconst_3
/*    */     //   136: imul
/*    */     //   137: istore_2
/*    */     //   138: getfield indices : [S
/*    */     //   141: dup
/*    */     //   142: astore_3
/*    */     //   143: iload_2
/*    */     //   144: aload_3
/*    */     //   145: iload_2
/*    */     //   146: aload_3
/*    */     //   147: iload_2
/*    */     //   148: saload
/*    */     //   149: aload_0
/*    */     //   150: getfield vertexSize : I
/*    */     //   153: dup
/*    */     //   154: istore_2
/*    */     //   155: imul
/*    */     //   156: aload_0
/*    */     //   157: getfield positionOffset : I
/*    */     //   160: dup
/*    */     //   161: istore_0
/*    */     //   162: iadd
/*    */     //   163: istore_3
/*    */     //   164: iconst_1
/*    */     //   165: iadd
/*    */     //   166: saload
/*    */     //   167: iload_2
/*    */     //   168: imul
/*    */     //   169: iload_0
/*    */     //   170: iadd
/*    */     //   171: istore #4
/*    */     //   173: iconst_2
/*    */     //   174: iadd
/*    */     //   175: saload
/*    */     //   176: iload_2
/*    */     //   177: imul
/*    */     //   178: iload_0
/*    */     //   179: iadd
/*    */     //   180: istore_0
/*    */     //   181: getfield vertices : [F
/*    */     //   184: dup
/*    */     //   185: astore_2
/*    */     //   186: iload_3
/*    */     //   187: faload
/*    */     //   188: aload_2
/*    */     //   189: iload_0
/*    */     //   190: aload_2
/*    */     //   191: iload_0
/*    */     //   192: aload_2
/*    */     //   193: iload_0
/*    */     //   194: aload_2
/*    */     //   195: iload #4
/*    */     //   197: aload_2
/*    */     //   198: iload #4
/*    */     //   200: aload_2
/*    */     //   201: iload #4
/*    */     //   203: aload_2
/*    */     //   204: iload_3
/*    */     //   205: aload_2
/*    */     //   206: iload_3
/*    */     //   207: iconst_1
/*    */     //   208: iadd
/*    */     //   209: faload
/*    */     //   210: fstore_0
/*    */     //   211: iconst_2
/*    */     //   212: iadd
/*    */     //   213: faload
/*    */     //   214: fstore_2
/*    */     //   215: faload
/*    */     //   216: fstore_3
/*    */     //   217: iconst_1
/*    */     //   218: iadd
/*    */     //   219: faload
/*    */     //   220: fstore #4
/*    */     //   222: iconst_2
/*    */     //   223: iadd
/*    */     //   224: faload
/*    */     //   225: fstore #5
/*    */     //   227: faload
/*    */     //   228: fstore #6
/*    */     //   230: iconst_1
/*    */     //   231: iadd
/*    */     //   232: faload
/*    */     //   233: fstore #7
/*    */     //   235: iconst_2
/*    */     //   236: iadd
/*    */     //   237: faload
/*    */     //   238: fstore #8
/*    */     //   240: fload_0
/*    */     //   241: fload_2
/*    */     //   242: fload_3
/*    */     //   243: fload #4
/*    */     //   245: fload #5
/*    */     //   247: fload #6
/*    */     //   249: fload #7
/*    */     //   251: fload #8
/*    */     //   253: aload_1
/*    */     //   254: invokestatic pick : (FFFFFFFFFLf/eo;)Lf/eo;
/*    */     //   257: pop
/*    */     //   258: return
/*    */   }
/*    */   
/*    */   public SpawnShapeValue copy() {
/*    */     return new UnweightedMeshSpawnShapeValue(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/UnweightedMeshSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */