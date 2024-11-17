package nunes.karla.questao4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
}
