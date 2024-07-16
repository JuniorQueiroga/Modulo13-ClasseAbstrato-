//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fisica pessoaF = new Fisica();
        pessoaF.setNome("Junior");
        pessoaF.setSobrenome("Queiroga");
        pessoaF.setCpf("351.658.777-77");
        System.out.println(pessoaF.getNome() + " seu CPF é: " + pessoaF.getCpf());

       Juridica pessoaJ = new Juridica();
        pessoaJ.setNome("Antonio");
        pessoaJ.setSobrenome("Queiroga");
        pessoaJ.setCnpj("01.001.001/0001-00");
        System.out.println(pessoaJ.getNome() + " " + pessoaJ.getSobrenome() + " seu CNPJ é: " + pessoaJ.getCnpj());
    }
}