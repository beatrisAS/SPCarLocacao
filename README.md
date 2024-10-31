# SPCar Locação - Sistema de Cobrança de Locação de Veículos

Este projeto é uma solução para a loja SPCar que visa auxiliar no cálculo e cobrança dos serviços de locação de veículos. O programa, desenvolvido em Java, permite ao usuário inserir dados sobre o veículo alugado e calcular automaticamente o valor total a ser pago, considerando a diária do carro e a quilometragem percorrida.

## Funcionalidades

O programa solicita as seguintes informações do cliente:
1. **Modelo do carro alugado**
2. **Valor da diária para locação** (em reais)
3. **Quantidade de dias de locação**
4. **Quantidade de Km percorridos**

Com base nesses dados, o sistema calcula:
- **Custo total da diária**: multiplicando o valor da diária pela quantidade de dias;
- **Custo por quilômetro rodado**: considerando uma taxa de R$0,20 por km.

Após o cálculo, o sistema exibe o modelo do carro e o valor total a ser pago pelo cliente.

## Exemplo de Execução

```shell
Digite o modelo do carro alugado: Ford Fiesta
Digite o valor da diária para locação (R$): 120
Digite a quantidade de dias de locação: 5
Digite a quantidade de Km percorridos: 300
Modelo do carro: Ford Fiesta
Valor total a pagar: R$ 660.00
```

## Estrutura do Projeto

O projeto contém um único arquivo principal em Java:

- **SPCarLocacao.java**: Contém toda a lógica do programa, desde a entrada dos dados do usuário até o cálculo e a exibição do valor total.

## Como Executar

1. Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) está instalado em seu ambiente.
2. Clone o repositório:

   ```shell
   git clone https://github.com/seu_usuario/SPCarLocacao.git
   ```

3. Navegue até o diretório do projeto:

   ```shell
   cd SPCarLocacao
   ```

4. Compile o arquivo Java:

   ```shell
   javac SPCarLocacao.java
   ```

5. Execute o programa:

   ```shell
   java SPCarLocacao
   ```

## Estrutura do Código

Cada seção do código é comentada para facilitar a compreensão, detalhando a entrada dos dados, o cálculo dos custos e a exibição dos resultados.

## Critérios de Avaliação

Este projeto atende aos seguintes critérios de avaliação:
- Organização e estrutura clara do código.
- Aplicação de conceitos fundamentais de Java, como entrada e saída de dados e uso de variáveis.
- Utilização otimizada de comandos para minimizar a complexidade.
- Comentários explicativos para facilitar a compreensão e manutenção do código.

## Autor

Desenvolvido por [@beatrisAS](https://github.com/beatrisAS).
