
### Palavras reservadas

![palavras_reservadas](https://github.com/igor-lourenco/java-17/blob/main/images/palavras_reservadas.png)

##
### Modelo de Gerenciamento de memória da JVM

![gerenciamento_memoria_jvm](https://github.com/igor-lourenco/java-17/blob/main/images/Gerenciameno_de_memoria_java.png)

### Comando para iniciar a JVM com rastreamento de memória nativa habilitado
```java -XX:NativeMemoryTracking=summary _1_gerenciamentoDeMemoria/Main1```

### Lista comandos disponíveis para o processo JVM com o PID informado
```jcmd {pid}```

### Mostra as estatísticas de uso de memória nativa por categoria 
```jcmd {pid} VM.native_memory summary```

### Configurando o tamanho máximo da Memória Heap(-Xmx4G) e o tamanho inicial da Memória Heap(-Xms2G) da JVM. 
```java -Xmx4G -Xms2G _1_gerenciamentoDeMemoria/Main```

### Ferramentas visuais para mostrar uso de memória da JVM
```
Java Mission Control (JMC) — Recomendado para NMT
VisualVM — Mais leve e intuitiva
```
