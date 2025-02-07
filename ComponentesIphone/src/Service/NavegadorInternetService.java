package Service;

import java.util.ArrayList;
import java.util.List;

import Interface.NavegadorInternet;

public class NavegadorInternetService implements NavegadorInternet{

    private List<String> url = new ArrayList<>();
    private String urlAtual;
    
    public NavegadorInternetService() {
        this.urlAtual = null;
    }

    @Override
    public void exibirPagina(String urlParam) {
        if ( url.isEmpty() ) {
            System.out.println("Não há nenhuma aba no Browser!\n Adicione uma nova aba no Browser!\n");
        } else {
            for(String u : url) {
                if( u == urlParam) {
                    if(urlParam == urlAtual) {
                        System.out.println("Você já está na pagina!\n");
                    } else {
                        System.out.println("Loading...\n");
                        urlAtual = urlParam;
                    }
                } else {
                    System.out.println("Aba não encontrada!\n");
                }
            }
        }
    }

    @Override
    public void adicionarNovaAba(String urlParam) {
        for(String u : url) {
            if( urlParam == u ) {
                System.out.println("Aba já existente!\n");
                return;
            }
        }
        urlAtual = urlParam;
        url.add(urlParam);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página está sendo ATUALIZADA!!!\n");
    }
    
}
