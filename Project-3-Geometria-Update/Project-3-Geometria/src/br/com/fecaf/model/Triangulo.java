package br.com.fecaf.model;

import java.util.Scanner;



public class Triangulo {
    Scanner scanner = new Scanner(System.in);
    public double base, lado2, lado3, area, perimetro, altura;

    public boolean cadastrarTriangulo() {
        System.out.println("*******************");
        System.out.println("/* Cadastrar Triangulo */");
        System.out.println("*******************");
        System.out.println("/* Informe a base */");
        base = scanner.nextDouble();
        System.out.println("Informe o lado2 */");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado3 */");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura */");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso!");
        System.out.println("/******************");
        return true;

    }

    public void calcularArea() {
        System.out.println("*******************");
        System.out.println("/*  Calculando Area   */");
        System.out.println("*******************");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("*******************");


    }

    public void geraTrianguloRetangulo() {
        double maior = base;  // Supondo que o lado1 seja o maior, só pra começar
        if (lado2 > maior) {  // Se o lado2 for maior que o lado1, o maior é o lado2
            maior = lado2;
        }
        if (lado3 > maior) {  // Se o lado3 for maior que os outros, o maior é o lado3
            maior = lado3;
        }

        //A formula que tava na imagem: a² + b² == c²
        // Descobrir os outros dois lados que não são o maior

        double somaDosQuadrados = base * base + lado2 * lado2 + lado3 * lado3 - maior * maior;

        // Comparar os quadrados dos lados
        if (somaDosQuadrados == maior * maior) {
            System.out.println("O triângulo é retângulo!");  // Mostra que é retangulo “parabens kkk”
        } else {
            System.out.println("O triângulo não é retângulo.");  // Não é retângulo, “triste :(“
        }
    }

    public void geraTresQuatroCinco(){

        // Aqui a gente vê se o triângulo é do tipo "3, 4, 5"
        if ((base == 3 && lado2 == 4 && lado3 == 5) ||
                (base == 4 && lado2 == 5 && lado3 == 3) ||
                (base == 5 && lado2 == 3 && lado3 == 4)) {
            System.out.println("O triângulo é do tipo '3, 4, 5'!");  // O “famoso triangulo que queriamos”
        } else {
            System.out.println("O triângulo não é do tipo '3, 4, 5'.");  // Mostra que não é ele
        }

    }
        public void calcularPerimetro() {
            System.out.println("*******************");
            System.out.println("/*  Calculando Perimetro   */");
            System.out.println("*******************");

            perimetro = base + lado2 + lado3;

            System.out.println("O perimetro é: " + perimetro);
            System.out.println("*******************");
        }
        // Isosceles / Escaleno / Equilatero
        public void definirTipo() {

            System.out.println("*******************");
            System.out.println("/*  Definindo tipo  */");
            System.out.println("*******************");

            if (base == lado2 && base == lado3) {

                System.out.println("Este Triangulo é Equilatero");

            } else if (base != lado2 && base != lado3 && lado2 != lado3) {
                System.out.println("Este triangulo é Escaleno");
            } else {
                System.out.println("Este Triangulo é Isosceles");
            }
            System.out.println("*******************");
        }
    }

