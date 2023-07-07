package com.mycompany.contamain;
import javax.swing.JOptionPane;
public class Contam {
    String nome;
    String senha;
    double saldo;
    enum tipo_conta{
        poupança, corrente
    }
    public void depositar(double quantia){
        this.saldo += quantia;
        JOptionPane.showMessageDialog(null,"Valor depositado!");
        }
    public void sacar(double quantia){
        String tente;
        int c = 0;
        tente = JOptionPane.showInputDialog("Digite sua senha");
        while(!tente.equals(this.senha)){
        c++;
        if (c > 2){JOptionPane.showMessageDialog(null, "Valor de tentativas excedido"); break;}
        tente = JOptionPane.showInputDialog("Senha incorreta! Digite sua senha novamente (Faltam "+(3-c)+ "Tentativas)");
        }
        if(c > 2){
        JOptionPane.showMessageDialog(null, "Você errou muitas vezes, tente novamente mais tarde!");
        }else if (this.saldo < quantia){
        JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        } else {
        this.saldo -= quantia;
        JOptionPane.showMessageDialog(null, "Valor sacado!");
    }}
    public void visualizar_status(){
        String msg;
        int opção = 0;
        do{
            msg = JOptionPane.showInputDialog(null, "O que você quer visulizar?\n"
                    + "[1]senha\n"
                    + "[2]saldo\n");
            opção = Integer.parseInt(msg);
        } while(opção < 1 || opção > 2);
        String tente;
        int c = 0;
        tente = JOptionPane.showInputDialog("Digite sua senha");
        while(!tente.equals(this.senha)){
        c++;
        if (c > 2){JOptionPane.showMessageDialog(null, "Valor de tentativas excedido"); break;}
        tente = JOptionPane.showInputDialog("Senha incorreta! Digite sua senha novamente (Faltam "+(3-c)+ "Tentativas)");
        }
        if(c > 2){
        JOptionPane.showMessageDialog(null, "Você errou muitas vezes, tente novamente mais tarde!");
        } else {
            switch(opção){
                case 1 -> JOptionPane.showMessageDialog(null, this.senha);
                case 2 -> JOptionPane.showMessageDialog(null, this.saldo);
            }
        }
        
    }
    public void mandar(double quantia, String nomes){
        String tente;
        int c = 0;
        tente = JOptionPane.showInputDialog("Digite sua senha");
        while(!tente.equals(this.senha)){
        c++;
        if (c > 2){JOptionPane.showMessageDialog(null, "Valor de tentativas excedido"); break;}
        tente = JOptionPane.showInputDialog("Senha incorreta! Digite sua senha novamente (Faltam "+(3-c)+ "Tentativas)");
        }
        if(c > 2){
        JOptionPane.showMessageDialog(null, "Você errou muitas vezes, tente novamente mais tarde!");
        } else if (quantia > this.saldo){
            JOptionPane.showMessageDialog(null, "Valor da conta insuficiente!");
        } else {
            this.saldo -= quantia;
            JOptionPane.showMessageDialog(null, "Valor de "+ quantia +" foi enviado para "+ nomes);
        }
        
    } public void redefinir_senha(){
        JOptionPane.showMessageDialog(null, "Digite as seguintes informações para continuar:");
        String msg = JOptionPane.showInputDialog("Nome");
        if (msg.equals(this.nome)) {
            this.senha = JOptionPane.showInputDialog(null, "Digite sua senha nova");
            JOptionPane.showMessageDialog(null, "Sua nova senha foi redefinida!");
        } else {
            JOptionPane.showMessageDialog(null, "O nome não está correto, você não poderá\n"
                    + "redefinir a sua senha");
        }
    }
}
