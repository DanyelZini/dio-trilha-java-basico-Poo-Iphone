package Service;

import Interface.AparelhoTelefonico;

public class AparelhoTelefonicoService implements AparelhoTelefonico{

    private boolean emLigacao;

    public AparelhoTelefonicoService() {
        this.emLigacao = false;
    }

    @Override
    public void ligar(String numero) {
        if( emLigacao == true ) {
            System.out.println("Em ligação!\n");
        } else {
            emLigacao = true;
            System.out.println("Chamando...\n Ligação efetuada para o numero:" + numero);
        }
    }
    
    @Override
    public void desligar() {
        if ( emLigacao == false ) {
            System.out.println("Você não está em ligação no momento!\n");
        } else {
            emLigacao = false;
            System.out.println("Chamada encerrada!\n");
        }
    }

    @Override
    public void atender() {
        if ( emLigacao == true ) {
            System.out.println("Em ligação!\n");
        } else {
            emLigacao = true;
            System.out.println("Chamada atendida!\n ");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if ( emLigacao == true ) {
            System.out.println("Em ligação!\n");
        } else {
            emLigacao = true;
            System.out.println("Iniciado correio de voz!\n");
        }
    }
    
}
