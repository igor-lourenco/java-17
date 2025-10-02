
### Palavras reservadas

![palavras_reservadas](https://github.com/igor-lourenco/java-17/blob/main/images/palavras_reservadas.png)

##
### Modelo de Gerenciamento de memória da JVM

![gerenciamento_memoria_jvm](https://github.com/igor-lourenco/java-17/blob/main/images/Gerenciameno_de_memoria_java.png)

#### Comando para iniciar a JVM com rastreamento de memória nativa habilitado
```java -XX:NativeMemoryTracking=summary _1_gerenciamentoDeMemoria/Main1```

#### Lista comandos disponíveis para o processo JVM com o PID informado
```jcmd {pid}```

#### Mostra as estatísticas de uso de memória nativa por categoria 
```jcmd {pid} VM.native_memory summary```

#### Configurando o tamanho máximo da Memória Heap(-Xmx4G) e o tamanho inicial da Memória Heap(-Xms2G) da JVM. 
```java -Xmx4G -Xms2G _1_gerenciamentoDeMemoria/Main```

#### Ferramentas visuais para mostrar uso de memória da JVM
```
Java Mission Control (JMC) — Recomendado para NMT
VisualVM — Mais leve e intuitiva
```
##
### Strings

Strings literais são automaticamente internadas:
```
String nome1 = "Joao";
String nome2 = "Joao";
```

Ambas as variáveis nome1 e nome2 apontam para o mesmo objeto no String Pool.
```
nome1 == nome2 // true
```

Strings criadas com new não vão para o pool automaticamente:
```
String nome3 = new String("Joao");
String nome4 = new String("Joao");
```

nome3 e nome4 são novos objetos na heap, diferente do que está no pool:
```
nome1 == nome3 // false
nome2 == nome4 // false
```
![string_pool](https://github.com/igor-lourenco/java-17/blob/main/src/com/java17/_12_trabalhandoComStrings/Pool_de_strings.png)

##
### Tipos de classes aninhadas

![classes_aninhadas](https://github.com/igor-lourenco/java-17/blob/main/src/com/java17/_16_classesAninhadas/Tipos_classes_aninhadas.png)

##
### Estados da Thread

##### NEW

- A thread foi criada, mas ainda não foi iniciada com start().
```
Thread t = new Thread();
```

##### RUNNABLE

- A thread foi iniciada e está pronta para executar, mas não necessariamente está executando no momento, fica na fila de execução e aguarda o escalonador da JVM.
```
t.start();
```

##### BLOCKED

- A thread está tentando acessar um bloco de código sincronizado(syncronized) que está sendo usado por outra thread.
- Fica bloqueada até que o monitor (lock) seja liberado.


#### WAITING

- A thread está esperando indefinidamente por outra thread realizar uma ação específica. Isso ocorre com métodos como Object.wait() ou Thread.join() sem tempo limite.


##### TIMED_WAITING

- Similar ao WAITING, mas com um tempo limite.
```
Thread.sleep(1000);
t.join(1000);
t.wait(1000);
```

##### TERMINATED (ou DEAD)

- A thread concluiu sua execução ou foi interrompida.
- Não pode ser reiniciada.

![estados_thread](https://github.com/igor-lourenco/java-17/blob/main/src/com/java17/_24_threads/_2_estadosDaThread/Estados_da_Thread.png)
