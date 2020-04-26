# Avaliacao 1

Esta avaliação é composta de quatro exercícios que estão disponíveis nas pastas ex1, ex2, ex3 e ex4 deste zip.
Cada exercício é um projeto Java que deve ser implementado de acordo com as instruções abaixo. 

## Exercício 1

O objetivo do exercício um é implementar um contador compartilhado que deverá ser exposto através de TCP/IP. 
O cliente que irá consumir o serviço já está implementado na classe SharedCounterClient e SharedCounterClientRunnable. Completem a implementação do servidor, lembrem de atentar para o fato do acesso
concorrente à estrutura que irá oferecer o serviço de contador de forma a impedir que acessos concorrentes
resultem em valores idênticos retornados à mais de uma requisição.

## Exercício 2

O exercício dois apresenta um código em Java que simula o comportamento de uma tarefa assíncrona executada em uma Thread, a Thread principal faz uso da estratégia de Busy-Wait para detectar a conclusão da tarefa assíncrona. Analise o código e responda no arquivo CONSIDERACOES.md quais as implicações de se usar essa estratégias e quais alternativas existem.

## Exercício 3

No diretório ex3 há uma cópia do código disponível no exercício dois, o objetivo do exercício três e implementar a mesma tarefa assíncrona sem utilizar Busy-Wait, fazendo com que a Thread principal suspenda a execução enquanto a tarefa assíncrona não é concluída e sendo posteriormente notificada de sua conclusão.

## Exercício 4

No exercício quatro o objetivo é implementar o padrão produtor-consumidor. O projeto conta com duas Threads, uma responsável por fazer o papel do produtor e uma segunda do consumidor. Implementem a classe ProducerConsumerImpl de forma que:
1) a Thread produtora interrompa a execução sempre que o buffer for preenchido;
2) a Thread produtora seja retomada assím que houver espaço no buffer;
3) a Thread consumidora interrompa a execução sempre que o buffer estiver vazio;
4) a Thread consumidora retome a execução assim que houver ítens no buffer;

Admitam que o tamanho do Buffer é de 2 elementos. Sintam-se a vontade para escolher a estrutura de dados a ser utilizada no buffer.