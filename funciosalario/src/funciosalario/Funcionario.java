/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciosalario;

/**
 *
 * @author aluno.saolucas
 */
public class Funcionario {
    private String nome;
    private double salario;
    private double reajuste;
    
    public String getNome(){
        return nome;}
    public double getSalario(){
        return salario;}
    public double getReajuste(){
        return reajuste;}
    public void setNome(String nome){
        this.nome=nome;}
    public void setSalario(double salario){
        this.salario=salario;}
    public void setReajuste(double reajuste){
        this.reajuste=reajuste;}
    public void show(){
        System.out.println("nome "+ nome);
        System.out.println("salario "+salario);
        System.out.println("o ultimo reajuste foi de "+(reajuste*100)+"%");}
    public Double calcSal(){
        salario = salario*reajuste;
        System.out.println("o salario agora é "+salario);
        return salario;}
        
}
