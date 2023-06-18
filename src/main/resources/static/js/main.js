const INPUT_BUSCA = document.getElementById('input-busca');
const TABELA_CONTEINERS = document.getElementById('tabela-conteiners');
const LINHAS_TABELA = TABELA_CONTEINERS.getElementsByTagName('tr');

INPUT_BUSCA.addEventListener('keyup', () => {
  let expressao = INPUT_BUSCA.value.toLowerCase();

  for (let i = 1; i < LINHAS_TABELA.length; i++) {
    let conteudoDaLinha = LINHAS_TABELA[i].innerHTML.toLowerCase();

    if (conteudoDaLinha.includes(expressao)) {
      LINHAS_TABELA[i].classList.remove('d-none');
    } else {
      LINHAS_TABELA[i].classList.add('d-none');
    }
  }
});