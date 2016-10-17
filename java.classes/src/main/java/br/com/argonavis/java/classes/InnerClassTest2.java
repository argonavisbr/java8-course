package br.com.argonavis.java.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassTest2  {
	private String nome = "Outer World"; // antes de Java 8 precisa ser final

    private class Inner1 implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
            System.out.println("Hello 1");
        }
    }
    
    private class Inner2 implements InnerClassTest1.Interface {
    	public String nome;
    	public Inner2(String nome) {
    		this.nome = nome;
    	}
    	public void m1() {
            System.out.println("Hello 2: " + nome);
            System.out.println("Hello 2: " + this.nome);
            System.out.println("Hello 2: " + InnerClassTest2.this.nome);
        }
    }
    
    public static void method1(ActionListener s) {
    	s.actionPerformed(null);
    }
    public static void method2(InnerClassTest1.Interface i) {
    	i.m1();
    }

    public static void main( String[] args ) {
        
        InnerClassTest2 outer = new InnerClassTest2();

        ActionListener i1 = outer.new Inner1();
        InnerClassTest2.Inner2 i2 = outer.new Inner2("Inner World");
        
        method1(i1);
        method2(i2);
        
        outer.outerMethod();
        
    }
    
    public void outerMethod() {
    	Inner2 i2 = this.new Inner2("Inner World");
    }
    
}