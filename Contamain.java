package com.mycompany.contamain;
import javax.swing.JOptionPane;
public class Contamain {

    public static void main(String[] args) {
        Contam user = new Contam();
        String msg;
        int opt;
        double valor;
        int confirmar;
        JOptionPane.showMessageDialog(null, "Bem vindo ao centro de criação de contas!");
        user.nome = JOptionPane.showInputDialog("Digite seu nome");
        user.senha = JOptionPane.showInputDialog("Digite sua senha");
        do{
        msg = JOptionPane.showInputDialog("Qual vai ser o tipo da conta?\n"
                + "[1]Poupança\n"
                + "[2]Corrente");
        opt = Integer.parseInt(msg);
        } while(opt < 1 || opt > 2);
        if (opt == 1 ){Contam.tipo_conta tipo = Contam.tipo_conta.poupança;}
        else {Contam.tipo_conta tipo = Contam.tipo_conta.corrente;}
        JOptionPane.showMessageDialog(null,"Conta criada!");
        do{
        do {
           msg = JOptionPane.showInputDialog("Oque você deseja fazer?\n"
                    + "[1]Depositar\n"
                    + "[2]Sacar\n"
                    + "[3]Visualizar seus dados\n"
                    + "[4]Mandar dinheiro para alguém\n"
                    + "[5]Redefinir senha");
           opt = Integer.parseInt(msg);
        } while(opt < 1 || opt > 5);
        switch(opt){
            case 1: 
               msg = JOptionPane.showInputDialog("Digite o valor que deseja depositar");
               valor = Double.parseDouble(msg);
               user.depositar(valor);
               break;
            case 2:
               msg = JOptionPane.showInputDialog("Digite o valor que deseja sacar");
               valor = Double.parseDouble(msg); 
               user.sacar(valor);
               break;
            case 3:
                user.visualizar_status();
                break;
            case 4:
                msg = JOptionPane.showInputDialog("Digite o valor que deseja depositar");
                valor = Double.parseDouble(msg);
                msg = JOptionPane.showInputDialog("Digite o nome da pessoa");
                user.mandar(valor, msg);
                break;
            case 5:
                user.redefinir_senha();
                break;
        }
        confirmar = JOptionPane.showConfirmDialog(null, "Você quer continuar sua sessão?");
        } while(confirmar == 0);
    }
}
