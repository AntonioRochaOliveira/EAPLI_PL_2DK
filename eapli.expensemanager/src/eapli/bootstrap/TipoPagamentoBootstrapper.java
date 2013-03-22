package eapli.bootstrap;

import Model.TipoPagamento;
import Persistence.RepositorioTiposPagamento;

public class TipoPagamentoBootstrapper {
    static {
        RepositorioTiposPagamento repo = new RepositorioTiposPagamento();
        repo.AdicionarTipoPagamento(new TipoPagamento("Paypal"));
        repo.AdicionarTipoPagamento(new TipoPagamento("Transferência Bancária"));
    }
}
