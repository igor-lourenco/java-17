
### Palavras reservadas

![palavras_reservadas](https://github.com/igor-lourenco/java-17/blob/main/images/palavras_reservadas.png)

Memória Heap

- Onde fica armazenados os objetos instânciados e é gerenciada pelo Garbage Collector

- Young Generation (Geração jovem)
-- Onde novos objetos são alocados inicialmente.

-- Objetos que vivem pouco tempo geralmente morrem aqui.

-- Dividida em:

--- Eden: onde objetos nascem.

--- Survivor 0 e 1: objetos sobreviventes da coleta no Eden são movidos aqui.

🧹 O GC que atua aqui é chamado de Minor GC (rápido e frequente).

- Old Generation (Tenured)
-- Objetos que sobreviveram a várias coletas na Young Generation são promovidos para cá.

-- Normalmente, objetos que têm vida longa (ex: cache, singletons, etc).

🧹 O GC aqui é o Major GC (mais lento, mas menos frequente).


Memória não Heap

- Class(Metadata, Class space), Metaspace: Metadados de classes Java carregadas (ex: Spring, JPA, etc).

- Code	: Cache do compilador JIT da JVM (HotSpot).

- GC	: Estruturas de controle do Garbage Collector.

- Compiler:	Infra do compilador JIT.

- Thread(stack): 	Pilhas de execução das threads Java.

- Symbol:	Strings internas como nomes de classes, métodos, etc.

- Internal, Arena Chunk, Safepoint, Serviceability, Tracing, Synchronization:	Infraestrutura interna da JVM.

- Native Memory Tracking:	O próprio mecanismo que permite este relatório(Overhead do rastreador de memória nativa - NMT).

- Unknown:  Geralmente aparece quando alguma biblioteca JNI (nativa) ou alocação interna não é rastreada detalhadamente — pode incluir drivers, alocações diretas, etc.
