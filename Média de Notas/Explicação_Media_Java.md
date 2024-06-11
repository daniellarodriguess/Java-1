## Média de notas - Explicação em Java. ➗

Eu acredito, fielmente, que esse tipo de programa tem que ser o mais simples e breve possível. Sempre prezando pelo chamado "Clean Code".

Para começar, além dos conceitos básicos em programação: package, class, main e a declaração do próprio Scanner. Eu sempre busco utilizar o número mínimo de variáveis, porque, assim, é mais fácil de não me perder no meu próprio código e também não confundir quem está lendo.

Dessa vez, precisei criar três variáveis - uma para armazenar (double), um contador (int) e uma variável que o usuário pudesse declarar as notas, para, assim, realizar a média.

As variáveis foram chamadas de:

- armaz_notas - para armazenar notas
- cont_notas - sendo o contador das notas
- nota - as notas declaradas pelo professor

Sempre busco dar nomes claros para as minhas variáveis, tendo em mente o que falei em cima, para não me perder e nem confundir quem está lendo.

Além disso, busco sempre dar comandos claros para os meus usuários, porque sei da importância da compreensão. Porque, diferente da máquina, uma interpretação errada pode gerar um erro no programa.

Decidi optar por uma estrutura de repetição (While) para realizar o armazenamento das notas e a sua contagem. Assim, dessa forma, dou liberdade para o professor digitar a quantidade de notas que ele quiser. Dando a instrução de que, caso ele queira parar, basta digitar zero para encerrar o programa.

Para a realização da média, optei por uma estrutura condicional. Caso o contador (cont_notas) fosse maior que zero, ele diria o resultado da média. Entretanto, caso o contador fosse igual a zero, ele diria que você não digitou nenhuma nota e não te entregaria o resultado desejado. Dessa forma, você consegue impedir da pessoa não digitar nenhuma nota.
