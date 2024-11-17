package nunes.karla.questao2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Vestuario extends Produto{
    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return this.getPreco() - (this.getPreco() * 0.2); // 20% de desconto
    }
}
