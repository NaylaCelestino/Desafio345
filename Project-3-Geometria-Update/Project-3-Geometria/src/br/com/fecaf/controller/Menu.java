package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    boolean exit = false;

    public void executarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("*/*********************/");
            System.out.println("*/********** Geometrie ******  */");
            System.out.println("*/* 1 - Círculo  */");
            System.out.println("*/* 2 - Retângulo  */");
            System.out.println("*/* 3 - Triângulo  */");
            System.out.println("*/* 4 - Sair  */");
            System.out.println("*/*********************/");

            System.out.println("Informe a opção desejada:");
            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:
                    boolean exitCirculo = false;
                    Circulo circulo = new Circulo(); // Criado antes do loop
                    boolean validaCadastro = false;  // Começa como falso

                    while (!exitCirculo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Círculo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Círculo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Sair */");
                        System.out.println("/*********************");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                circulo.cadastrarCirculo();
                                validaCadastro = true; // Agora é possível calcular área e perímetro
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um círculo primeiro.");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um círculo primeiro.");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do círculo...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida.");
                        }
                    }
                    break;

                case 2:

                    boolean exitRetangulo = false;
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;
                    while (!exitRetangulo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Retangulo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Retangulo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Sair */");
                        System.out.println("/*********************");

                        int optionRetangulo = scanner.nextInt();
                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;

                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                }else {
                                    System.out.println("Cadastre um novo retangulo");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do retangulo...");
                                exitRetangulo = true;
                                break;
                            default:
                        }
                    }

                    break;

                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;
                    while (!exitTriangulo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Triangulo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Triangulo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Gera Triangulo Retangulo */");
                        System.out.println(" 5 - Gera 3,4,5  */");
                        System.out.println(" 6 - Sair */");
                        System.out.println("/*********************");

                        int optionTriangulo = scanner.nextInt();
                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;

                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                }else {
                                    System.out.println("Cadastre um novo triangulo");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;

                            case 4:
                                if (validaTriangulo) {
                                    triangulo.geraTrianguloRetangulo();
                                }else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;

                            case 5:
                                if (validaTriangulo) {
                                    triangulo.geraTresQuatroCinco();
                                }else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;

                            case 6:
                                System.out.println("Saindo do retangulo...");
                                exitTriangulo = true;
                                break;
                            default:
                        }
                    }

                    break;

                case 4:
                    System.out.println("Saindo...");
                    exit = true;
                    break;

                default:
                    System.out.println("Escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
