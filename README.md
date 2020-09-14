*******
### MARVEL
*******
App Android Nativo escrito em Kotlin, consumindo API da Marvel e processando resposta com retrofit2 e moschi. Projetado com padrão de arquitetura MVVM com divisão de responsabilidades, separação de conceitos e desacoplamento de camadas.
*******
![Screen](https://user-images.githubusercontent.com/9430430/93039327-986d3600-f61d-11ea-928c-130ea94ba189.JPG)
*******
### ESTRUTURA DOS PACOTES: MVVM ARCHITECTURE PATTERN:
*******
![Package Structure](https://user-images.githubusercontent.com/9430430/93045298-2ac90600-f62d-11ea-8df4-e7a1871812c7.JPG)
*******
### NETWORK LAYER
> **DATA**
*******
* :ballot_box_with_check:    **network:**
>Pacote onde ficam as classes de dados. Classes do retrofit e classes do response e os endpoint's da aplicação.
*******
* :ballot_box_with_check:   **model:**
> Pacote onde fica a classe responsável por listar os atributos para construir os itens da lista.
*******
* :ballot_box_with_check:   **response:**
> Pacote aonde ficam as classes de response(classes contendo anotaçõs do retrofit e moschi). 
  Essas camandas não misturamos com as camadas de apresentação.
*******
* MarvelRootResponse
> Classe response (Objeto que representa a raiz inicial da estrutura: responsável
              pelo mapeamento da estrutura de Json da API)
              
* MarvelDetailsResponse
> Classe response (responsável pelo mapeamento da estrutura de Json da API)      

* MarvelResultsResponse
> Classe response (responsável pelo mapeamento da estrutura de Json da API)
  
* MarvelThumbnailResponse
> Classe response (responsável pelo mapeamento da estrutura de Json da API)
*******
### APRESENTAÇÃO
> **PRESENTATION**
*******
> Pacote aonde ficam as activitys, view models e qualquer outra classe relacionada a apresentação.
  Toda que o usuário vizualiza e interage fica nesse pacote.
*******
* :ballot_box_with_check: **BaseActivity:**
 > Classe herdeira de AppCompatActivity() que configura uma toolbar padrão e foi 
             implementado também por meio dessa classe ações relacionadas ao menu na aplicação.
*******
* :ballot_box_with_check: **DetalhesActivity:**
> Classe da Activity Details responsável pela exibição de detalhes dos personagens selecionados.
*******
* :ballot_box_with_check: **MarvelActivity:**
> Classe principal (MainActivity) do projeto (features).

* :ballot_box_with_check: **MarvelAdapter:**
> Classe responsável por fazer a ligação do Array list para dentro do RecyclerView.

* :ballot_box_with_check: **MarvelViewModel:**
> Classe responsável por obter os dados da camada de rede e passar esses dados para a activity/fragmetns fazendo a comunicação entre eles através da LiveData.
  A responsabilidade portanto do ViewModel é gerenciar os dados da Activity e fazer a ponte com as demais camadas do Aplicativo.
*******
     


