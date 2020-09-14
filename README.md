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
### TEORIA
*******
* **A 1.1 - Ciclo de Vida de uma Activity**
> A Activity é um componente de aplicação com um ciclo de vida específico. Quando o usuário acessa a aplicação, navega pelas opções, sai ou retorna para a mesma, as atividades que a compõem passam por uma série de estados do ciclo de vida.

![image](https://user-images.githubusercontent.com/9430430/93096297-99808080-f67a-11ea-937b-e6ed514f7880.png)

*******
* **A 1.2 - Ciclo de Vida de um Fragment**

> Ao iniciar um fragment vários métodos que são chamados automaticamente pelo Sistema Operacional, e cada um desses são executados em um determinado momento.

> **O método onAttach** é o primeiro método chamado quando a fragment está sendo criada e é o responsável por “juntar" a Fragment com a Activity e receber como parâmetro a Activity em questão.

> **O próximo método chamado é o onCreate,** que é bem parecido com o onCreate da Activity, ou seja, ele cria a Fragment e, assim como na Activity, recebe um Bundle que pode conter alguma informação salva em execuções passadas. É importante notar que o esse método dentro da Fragment não acessa elementos de tela, ou seja não se pode fazer chamadas para elementos gráficos dentro desse método.

> **O próximo método é o onCreateView,** que é o local onde se deve fazer o contato com o layout da Fragment e carregá-lo. Lembre-se os elementos acessados aqui são apenas os elementos da Fragment. A assinatura desse método é um pouco maior, pois aqui se tem que inflar o XML para transformá-lo em um objeto do tipo View.

> **O próximo método é o onActivityCreated** é chamado apenas depois que a Activity já está criada (método onCreate da Activity já terminou), ou seja, aqui é o local onde se pode acessar ou modificar elementos de tela.

> **Os próximos métodos a serem invocados são onStart, onResume e onPause,** possuem a mesma funcionalidade do que quando chamados dentro de uma Activity.

> **O próximo método onSaveInstanceState** Este é muito importante se em sua aplicação é preciso salvar algum tipo de informação que deve ser utilizada futuramente: as informações podem ser salvas em um objeto Bundle que faz parte do parâmetro do método.

> **O método onStop** tem a mesma função do onStop da Activity.

> **O método onDestroyView** é chamado até ele ser executado ainda com a Fragment acessível, ou seja, sua hierarquia ainda pode ser acessada. Após a execução do método, a Fragment passa a não ser mais acessível, seu objeto ainda existe, mas não pode mais ser acessada.

> **Outro método chamado é o onDestroy** quando a Fragment não está mais sendo utilizada, mas o objeto ainda existe, pois ainda está ligada com a Activity.

> **Por fim, temos o método onDetach,** que é quando finalmente a Fragment não está mais ligada a nenhuma Activity, ou seja, não está mais associada a nada. 

![image](https://user-images.githubusercontent.com/9430430/93097317-cf723480-f67b-11ea-8686-544abaf8a688.png)
     


