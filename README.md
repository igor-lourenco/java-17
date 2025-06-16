### ☕️ Declarações de Tipos e Modificadores
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| class           | Declara uma classe                                         |
| interface       | Declara uma interface                                      |
| enum            | Declara um tipo enum                                       |
| record          | Declara um record (Java 14+)                               |
| abstract        | Declara classe/método como abstrato                        |
| final           | Impede extensão/override ou define constante               |
| static          | Indica membro de classe                                    |
| sealed          | Restringe subclasses (Java 17)                             |
| non-sealed      | Subclasse de sealed que permite extensão (Java 17)         |
| permits         | Lista subclasses permitidas por uma sealed class (Java 17)|
| strictfp        | Garante precisão em ponto flutuante                        |
| transient       | Impede serialização de campo                               |
| volatile        | Torna variável visível entre threads                       |
| native          | Método implementado em código nativo (JNI)                 |
| synchronized    | Controle de concorrência                                   |

### 🧮 Tipos Primitivos
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| boolean         | Lógico (true/false)                                        |
| byte            | Inteiro de 8 bits                                          |
| short           | Inteiro de 16 bits                                         |
| int             | Inteiro de 32 bits                                         |
| long            | Inteiro de 64 bits                                         |
| float           | Ponto flutuante de 32 bits                                 |
| double          | Ponto flutuante de 64 bits                                 |
| char            | Caractere Unicode de 16 bits                               |
| void            | Indica ausência de retorno                                 |

### 🧱 Controle de Fluxo
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| if              | Condicional                                                |
| else            | Alternativa do if                                          |
| switch          | Seleção múltipla                                           |
| case            | Bloco de switch                                            |
| default         | Bloco padrão no switch                                     |
| while           | Loop enquanto                                              |
| do              | Loop pós-condicional                                       |
| for             | Loop com controle                                          |
| break           | Sai de loop ou switch                                      |
| continue        | Pula para próxima iteração                                 |
| return          | Retorna valor de método                                    |
| yield           | Retorna valor de switch expression (Java 13+)             |

### 🧨 Exceções
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| try             | Início de tratamento de exceções                           |
| catch           | Captura exceção                                            |
| finally         | Bloco sempre executado                                     |
| throw           | Lança uma exceção                                          |
| throws          | Declara exceções de método                                 |
| assert          | Verifica condição em tempo de execução                     |

### 🧬 Operadores Orientados a Objetos
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| new             | Cria nova instância                                        |
| this            | Referência ao objeto atual                                 |
| super           | Referência à superclasse                                   |
| instanceof      | Testa tipo do objeto                                       |
| extends         | Indica herança                                             |
| implements      | Indica implementação de interface                          |

### 🔒 Modificadores de Acesso e Visibilidade
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| public          | Acesso livre                                               |
| protected       | Acesso por subclasses ou pacote                            |
| private         | Acesso restrito                                            |
| package         | Define o pacote da classe                                  |
| import          | Importa classes de outros pacotes                          |

### 🧰 Utilitários Diversos
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| null            | Valor nulo                                                 |
| var             | Inferência de tipo local (Java 10)                         |

### 🚫 Reservadas Mas Não Usadas
| Palavra-chave   | Descrição                                                  |
|-----------------|------------------------------------------------------------|
| const           | Reservada para uso futuro                                  |
| goto            | Reservada para uso futuro                                  |





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
