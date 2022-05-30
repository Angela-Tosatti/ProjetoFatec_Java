import java.util.InputMismatchException;
import java.util.Scanner;

import Classes.Angulo;
import Classes.Armazenamento;
import Classes.Comprimento;
import Classes.Frequencia;
import Classes.Massa;
import Classes.Pressao;
import Classes.Temperatura;
import Classes.Tempo;
import Classes.Velocidade;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipConv = 0;
        int unidI = 0, unidF = 0;
        double v = 0.0;
        double res = 0;
        boolean loopThings = false;
        char close = 's';
        System.out.println("\nSeja bem-vindo ao Conversor de unidades FATEC!!!\n");

        while (close == 's' || close == 'S') {
            do {
                Scanner op = new Scanner(System.in);

                System.out.println("Escolha a unidade que você deseja calcular: \n" +
                        "\n 1 - Armazenamento de dados: Bits, Byts, Kilobyts, Megabytes, Gigabytes e Terabytes." +
                        "\n 2 - Comprimento: Quilômetro, métro, centímetro, milímetro, micrômetro, nanômetro, milha, jarda, pés e polegadas."
                        +
                        "\n 3 - Frequência: Hertz, Quilo-hertz, Mega-hertz e Giga-hertz." +
                        "\n 4 - Massa: Tonelada, Quilograma, Grama, Miligrama, Libra e Onça." +
                        "\n 5 - Pressão: Atmosfera padrão, Bar e Pascal." +
                        "\n 6 - Temperatura: Graus celsius, Graus fahrenheit e Kelvin." +
                        "\n 7 - Tempo: Nanossegundo, Microssegundo, Milissegundo, Segundo, Minuto, Hora e Dia." +
                        "\n 8 - Velocidade: Milha por hora, Quilômetro por hora, Pés por segundo, Metros por segundo e Nó."
                        +
                        "\n 9 - Ângulo: Grau e Radiano." +
                        "\n 0 - Sair do programa.\n");
                try {
                    tipConv = op.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Escolha uma opção válida, entre 0 e 9!");
                    tipConv = -1;
                }

            } while (tipConv < 0 || tipConv > 9);

            if (tipConv != 0) {
                loopThings = false;
                while (!loopThings) {
                    Scanner scValue = new Scanner(System.in);
                    try {
                        System.out.println("\nDigite o valor a ser convertido:\n");
                        v = scValue.nextDouble();
                        loopThings = true;
                    } catch (InputMismatchException e) {
                        System.err.println("\nDigite apenas números!");
                        loopThings = false;
                    }

                }

                switch (tipConv) {
                    case 1:
                        Armazenamento armazenamento = new Armazenamento();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scArmazenameto = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nEscolha o Armazenamento desejado: \n 1 - Bits \n 2 - Bytes \n 3 - Kilobyts \n 4 - Megabytes \n 5 - Gigabytes \n 6 - Terabytes. \n");
                                    unidI = scArmazenameto.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 6);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                loopThings = false;
                            }
                        }
                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bytes \n 2 - Kilobyts \n 3 - Megabytes \n 4 - Gigabytes \n 5 - Terabytes. \n");
                                            unidF = scArmazenamento1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.bitToByte(v);
                                        break;
                                    case 2:
                                        res = armazenamento.bitToKbyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.bitToMbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.bitToGbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.bitToTbyte(v);
                                        break;
                                }
                                break;
                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bits \n 2 - Kilobyts \n 3 - Megabytes \n 4 - Gigabytes \n 5 - Terabytes. \n");
                                            unidF = scArmazenamento2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.byteToBit(v);
                                        break;
                                    case 2:
                                        res = armazenamento.byteToKbyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.byteToMbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.byteToGbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.byteToTbyte(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bits \n 2 - Bytes \n 3 - Megabytes \n 4 - Gigabytes \n 5 - Terabytes. \n");
                                            unidF = scArmazenamento3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.kbyteToBit(v);
                                        break;
                                    case 2:
                                        res = armazenamento.kbyteTobyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.kbyteToMbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.kbyteToGbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.kbyteToTbyte(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bits \n 2 - Bytes \n 3 - Kilobyts \n 4 - Gigabytes \n 5 - Terabytes. \n");
                                            unidF = scArmazenamento4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.mbyteToBit(v);
                                        break;
                                    case 2:
                                        res = armazenamento.mbyteTobyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.mbyteToKbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.mbyteToGbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.mbyteToTbyte(v);
                                        break;
                                }
                                break;
                            case 5:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bits \n 2 - Bytes \n 3 - Kilobyts \n 4 - Megabytes \n 5 - Terabytes. \n");
                                            unidF = scArmazenamento4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.gbyteToBit(v);
                                        break;
                                    case 2:
                                        res = armazenamento.gbyteToKbyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.gbyteToKbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.gbyteToMbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.gbyteToTbyte(v);
                                        break;
                                }
                                break;
                            case 6:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scArmazenamento5 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Escolha para qual Armazenamento você deseja converter: \n 1 - Bits \n 2 - Bytes \n 3 - Kilobyts \n 4 - Gigabytes \n 5 - Megabytes  \n");
                                            unidF = scArmazenamento5.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = armazenamento.tbyteToBit(v);
                                        break;
                                    case 2:
                                        res = armazenamento.tbyteTobyte(v);
                                        break;
                                    case 3:
                                        res = armazenamento.tbyteToKbyte(v);
                                        break;
                                    case 4:
                                        res = armazenamento.tbyteToGbyte(v);
                                        break;
                                    case 5:
                                        res = armazenamento.tbyteToMbyte(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        Comprimento comprimento = new Comprimento();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scComprimento = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nDigite qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Nanometro. \n 7 - Milha. \n 8 - Jarda. \n 9 - Pes. \n 10 - Polegada. \n");
                                    unidI = scComprimento.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 10);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 10!");
                                loopThings = false;
                            }
                        }
                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Metro \n 2 - Centimetro \n 3 - Milimetro \n 4 - Micrometro \n 5 - Nanometro. \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.quilometroParaMetro(v);
                                        break;
                                    case 2:
                                        res = comprimento.quilometroParaCentimetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.quilometroParaMilimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.quilometroParaMicrometro(v);
                                        break;
                                    case 5:
                                        res = comprimento.quilometroParaNanometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.quilometroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.quilometroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.quilometroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.quilometroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Centimetro \n 3 - Milimetro \n 4 - Micrometro \n 5 - Nanometro. \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.metroParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.metroParaCentimetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.metroParaMilimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.metroParaMicrometro(v);
                                        break;
                                    case 5:
                                        res = comprimento.metroParaNanometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.metroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.metroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.metroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.metroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Milimetro \n 4 - Micrometro \n 5 - Nanometro. \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.centimetroParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.centimetroParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.centimetroParaMilimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.centimetroParaMicrometro(v);
                                        break;
                                    case 5:
                                        res = comprimento.centimetroParaNanometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.centimetroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.centimetroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.centimetroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.centimetroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Micrometro \n 5 - Nanometro. \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.milimetroParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.milimetroParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.milimetroParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.milimetroParaMicrometro(v);
                                        break;
                                    case 5:
                                        res = comprimento.milimetroParaNanometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.milimetroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.milimetroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.milimetroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.milimetroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 5:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento5 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Nanometro. \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento5.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.micrometroParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.micrometroParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.micrometroParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.micrometroParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.micrometroParaNanometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.micrometroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.micrometroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.micrometroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.micrometroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 6:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento6 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Milha. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento6.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.nanometroParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.nanometroParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.nanometroParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.nanometroParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.nanometroParaMicrometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.nanometroParaMilha(v);
                                        break;
                                    case 7:
                                        res = comprimento.nanometroParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.nanometroParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.nanometroParaPolegada(v);
                                        break;
                                }
                                break;
                            case 7:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento7 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Nanometro. \n 7 - Jarda. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento7.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.milhaParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.milhaParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.milhaParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.milhaParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.milhaParaMicrometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.milhaParaNanometro(v);
                                        break;
                                    case 7:
                                        res = comprimento.milhaParaJarda(v);
                                        break;
                                    case 8:
                                        res = comprimento.milhaParaPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.milhaParaPolegada(v);
                                        break;
                                }
                                break;
                            case 8:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento8 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Nanometro. \n 7 - Milha. \n 8 - Pes. \n 9 - Polegada. \n");
                                            unidF = scComprimento8.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.jardaParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.jardaParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.jardaParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.jardaParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.jardaParaMicrometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.jardaParaNanometro(v);
                                        break;
                                    case 7:
                                        res = comprimento.jardaParaMilha(v);
                                        break;
                                    case 8:
                                        res = comprimento.jardaParPes(v);
                                        break;
                                    case 9:
                                        res = comprimento.jardaParaPolegada(v);
                                        break;
                                }
                                break;
                            case 9:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento9 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Nanometro. \n 7 - Milha. \n 8 - Jarda. \n 9 - Polegada. \n");
                                            unidF = scComprimento9.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.pesParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.pesParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.pesParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.pesParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.pesParaMicrometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.pesParaNanometro(v);
                                        break;
                                    case 7:
                                        res = comprimento.pesParaMilha(v);
                                        break;
                                    case 8:
                                        res = comprimento.pesParaJarda(v);
                                        break;
                                    case 9:
                                        res = comprimento.pesParaPolegada(v);
                                        break;
                                }
                                break;
                            case 10:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scComprimento9 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual comprimento você quer converter: \n 1 - Quilometro \n 2 - Metro \n 3 - Centimetro \n 4 - Milimetro \n 5 - Micrometro \n 6 - Nanometro. \n 7 - Milha. \n 8 - Jarda. \n 9 - Pes. \n");
                                            unidF = scComprimento9.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 9);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 9!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = comprimento.polegadaParaQuilometro(v);
                                        break;
                                    case 2:
                                        res = comprimento.polegadaParaMetro(v);
                                        break;
                                    case 3:
                                        res = comprimento.polegadaParaCentimetro(v);
                                        break;
                                    case 4:
                                        res = comprimento.polegadaParaMilimetro(v);
                                        break;
                                    case 5:
                                        res = comprimento.polegadaParaMicrometro(v);
                                        break;
                                    case 6:
                                        res = comprimento.polegadaParaNanometro(v);
                                        break;
                                    case 7:
                                        res = comprimento.polegadaParaMilha(v);
                                        break;
                                    case 8:
                                        res = comprimento.polegadaParaJarda(v);
                                        break;
                                    case 9:
                                        res = comprimento.polegadaParaPes(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 3:
                        Frequencia frequencia = new Frequencia();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scFrequencia = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nDigite qual frequência você deseja converter:\n 1 - Hertz \n 2 - Quilohertz \n 3 - Megahertz \n 4 - Gigahertz \n");
                                    unidI = scFrequencia.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 4);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                loopThings = false;
                            }

                        }
                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scFrequencia1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\n Digite para qual frequência você deseja converter:\n 1 - Quilohertz \n 2 - Megahertz \n 3 - Gigahertz \n");
                                            unidF = scFrequencia1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 3);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 3!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = frequencia.hertzToQuiloherz(v);
                                        break;
                                    case 2:
                                        res = frequencia.hertzToMegaHertz(v);
                                        break;
                                    case 3:
                                        res = frequencia.hertzToGigaHertz(v);
                                        break;
                                }
                                break;
                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scFrequencia2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\n Digite para qual frequência você deseja converter:\n 1 - Hertz \n 2 - Megahertz \n 3 - Gigahertz \n");
                                            unidF = scFrequencia2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 3);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 3!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = frequencia.quiloHertzToHertz(v);
                                        break;
                                    case 2:
                                        res = frequencia.quiloHertzToMegaHertz(v);
                                        break;
                                    case 3:
                                        res = frequencia.quiloHertzToGigaHertz(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scFrequencia3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\n Digite para qual frequência você deseja converter: \n 1 - Quilohertz \n 2 - Hertz \n 3 - Gigahertz \n");
                                            unidF = scFrequencia3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 3);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 3!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = frequencia.megaHertzToQuiloHertz(v);
                                        break;
                                    case 2:
                                        res = frequencia.megaHertzToHertz(v);
                                        break;
                                    case 3:
                                        res = frequencia.megaHertzToGigaHertz(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scFrequencia4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\n Digite para qual frequência você deseja converter: \n 1 - Quilohertz \n 2 - Hertz \n 3 - Megahertz \n");
                                            unidF = scFrequencia4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 3);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 3!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = frequencia.gigaHertzToQuiloHertz(v);
                                        break;
                                    case 2:
                                        res = frequencia.gigaHertzToHertz(v);
                                        break;
                                    case 3:
                                        res = frequencia.gigaHertzToMegaHertz(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 4:
                        Massa massa = new Massa();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scMassa = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nDigite qual medida de massa você quer converter: \n 1 - Tonelada \n 2 - Quilogramas \n 3 - Grama \n 4 - Miligrama \n 5 - Libra \n 6 - Onça. \n");
                                    unidI = scMassa.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 6);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                loopThings = false;
                            }
                        }
                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual medida de massa você quer converter: \n 1 - Quilograma \n 2 - Grama \n 3 - Miligrama \n 4 - Libra \n 5 - Onça \n");
                                            unidF = scMassa1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.toneladaToQuilograma(v);
                                        break;
                                    case 2:
                                        res = massa.toneladaToGrama(v);
                                        break;
                                    case 3:
                                        res = massa.toneladaToMiligrama(v);
                                        break;
                                    case 4:
                                        res = massa.toneladaToLibra(v);
                                        break;
                                    case 5:
                                        res = massa.toneladaToOnca(v);
                                        break;
                                }
                                break;
                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual medida de massa você quer converter: \n 1 - Tonelada \n 2 - Grama \n 3 - Miligrama \n 4 - Libra \n 5 - Onça. \n");
                                            unidF = scMassa2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.quilogramaToTonelada(v);
                                        break;
                                    case 2:
                                        res = massa.quilogramaToGrama(v);
                                        break;
                                    case 3:
                                        res = massa.quilogramaToMiligrama(v);
                                        break;
                                    case 4:
                                        res = massa.quilogramaToLibra(v);
                                        break;
                                    case 5:
                                        res = massa.quilogramaToOnca(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual medida de massa você quer converter: \n 1 - Tonelada \n 2 - Quilograma \n 3 - Miligrama \n 4 - Libra \n 5 - Onça. \n");
                                            unidF = scMassa3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.gramaToTonelada(v);
                                        break;
                                    case 2:
                                        res = massa.gramaToQuilograma(v);
                                        break;
                                    case 3:
                                        res = massa.gramaToMiligrama(v);
                                        break;
                                    case 4:
                                        res = massa.gramaToLibra(v);
                                        break;
                                    case 5:
                                        res = massa.gramaToOnca(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual medida de massa você quer converter: \n 1 - Tonelada \n 2 - Quilograma \n 3 - Grama \n 4 - Libra \n 5 - Onça. \n");
                                            unidF = scMassa4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.miligramaToTonelada(v);
                                        break;
                                    case 2:
                                        res = massa.miligramaToQuilo(v);
                                        break;
                                    case 3:
                                        res = massa.miligramaToGrama(v);
                                        break;
                                    case 4:
                                        res = massa.miligramaToLibra(v);
                                        break;
                                    case 5:
                                        res = massa.miligramaToOnca(v);
                                        break;
                                }
                                break;
                            case 5:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa5 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual medida de massa você quer converter: \n 1 - Tonelada\n 2 - Quilograma \n 3 - Grama \n 4 - Miligrama \n 5 - Onça. \n");
                                            unidF = scMassa5.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.libraToTonelada(v);
                                        break;
                                    case 2:
                                        res = massa.libraToQuilograma(v);
                                        break;
                                    case 3:
                                        res = massa.libraToGrama(v);
                                        break;
                                    case 4:
                                        res = massa.libraToMiligrama(v);
                                        break;
                                    case 5:
                                        res = massa.libraToOnca(v);
                                        break;
                                }
                                break;
                            case 6:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scMassa6 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual mediada de massa você quer converter: \n 1 - Tonelada \n 2 - Quilograma \n 3 - Grama \n 4 - Miligrama \n 5 - Libra  \n");
                                            unidF = scMassa6.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = massa.oncaToTonelada(v);
                                        break;
                                    case 2:
                                        res = massa.oncaToQuilo(v);
                                        break;
                                    case 3:
                                        res = massa.oncaToGrama(v);
                                        break;
                                    case 4:
                                        res = massa.oncaToMiligrama(v);
                                        break;
                                    case 5:
                                        res = massa.oncaToLibra(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 5:
                        Pressao pressao = new Pressao();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scPressao = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nEscolha a pressão que você deseja converter: \n\n1 - Atmosfera Padrão\n2 - Bar\n3 - Pascal\n");
                                    unidI = scPressao.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 3);
                            } catch (InputMismatchException e) {
                                System.out.println("Opção inválida, digite uma opção de 1 a 3!");
                                loopThings = false;
                            }
                        }

                        switch (unidI) {
                            case 1: // ATMO PADRAO
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scPressao1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual pressão você deseja converter: \n\n1 - Bar\n2 - Pascal\n");
                                            unidF = scPressao1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = pressao.atmPadraoToBar(v);
                                        break;
                                    case 2:
                                        res = pressao.atmPadraoToPascal(v);
                                        break;
                                }
                                break;

                            case 2: // BAR
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scPressao2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual pressão você deseja converter: \n\n1 - Atmosfera Padrão\n2 - Pascal\n");
                                            unidF = scPressao2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = pressao.barToAtmPadrao(v);
                                        break;
                                    case 2:
                                        res = pressao.barToAtmPascal(v);
                                        break;
                                }
                                break;

                            case 3: // PASCAL
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scPressao3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual pressão você deseja converter: \n\n1 - Atmosfera Padrão\n2 - Bar\n");
                                            unidF = scPressao3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = pressao.pascalToAtmPadrao(v);
                                        break;
                                    case 2:
                                        res = pressao.pascalToBar(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 6:
                        Temperatura temperatura = new Temperatura();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scTemperatura = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nEscolha a temperatura que você deseja converter: \n\n1 - Kelvin\n2 - Farenheit\n3 - Celsius\n");
                                    unidI = scTemperatura.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 3);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 3!");
                                loopThings = false;
                            }
                        }
                        switch (unidI) {
                            case 1: // KELVIN
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTemperatura1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual temperatura você deseja converter: \n\n1 - Farenheit\n2 - Celsius\n");
                                            unidF = scTemperatura1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = temperatura.kelvinParaFarenheit(v);
                                        break;
                                    case 2:
                                        res = temperatura.kelvinParaCelsius(v);
                                        break;
                                }
                                break;
                            case 2: // Farenheit
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTemperatura2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual temperatura você deseja converter: \n\n1 - Kelvin\n2 - Celsius\n");
                                            unidF = scTemperatura2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = temperatura.farenheitParaKelvin(v);
                                        break;
                                    case 2:
                                        res = temperatura.farenheitParaCelsius(v);
                                        break;
                                }
                                break;
                            case 3: // Celsius
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTemperatura3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nEscolha para qual temperatura você deseja converter: \n\n1 - Farenheit \n2 - Kelvin\n");
                                            unidF = scTemperatura3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 2);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 2!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = temperatura.celsiusParaFarenheit(v);
                                        break;
                                    case 2:
                                        res = temperatura.celsiusParaKelvin(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 7:
                        Tempo tempo = new Tempo();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scTempo = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nDigite qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Milissegundos \n 4 - Segundos \n 5 - Minutos \n 6 - Hora \n 7 - Dia \n");
                                    unidI = scTempo.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 7);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 7!");
                                loopThings = false;
                            }
                        }
                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Microssegundos \n 2 - Milissegundos \n 3 - Segundos \n 4 - Minutos \n 5 - Hora \n 6 - Dia \n");
                                            unidF = scTempo1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.nanossegundoParaMicrossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.nanossegundoParaMilissegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.nanossegundoParaSegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.nanossegundoParaMinuto(v);
                                        break;
                                    case 5:
                                        res = tempo.nanossegundoParaHora(v);
                                        break;
                                    case 6:
                                        res = tempo.nanossegundoParaDia(v);
                                        break;
                                }
                                break;

                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Milissegundos \n 3 - Segundos \n 4 - Minutos \n 5 - Hora \n 6 - Dia \n");
                                            unidF = scTempo2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.microssegundoParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.microssegundoParaMilissegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.microssegundoParaSegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.microssegundoParaMinuto(v);
                                        break;
                                    case 5:
                                        res = tempo.microssegundoParaHora(v);
                                        break;
                                    case 6:
                                        res = tempo.microssegundoParaDia(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Segundos \n 4 - Minutos \n 5 - Hora \n 6 - Dia \n");
                                            unidF = scTempo3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.millissegundoParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.millissegundoParaMicrossegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.millissegundoParaSegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.millissegundoParaMinuto(v);
                                        break;
                                    case 5:
                                        res = tempo.millissegundoParaHora(v);
                                        break;
                                    case 6:
                                        res = tempo.millissegundoParaDia(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Milisegundos \n 4 - Minutos \n 5 - Hora \n 6 - Dia \n");
                                            unidF = scTempo4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.segundoParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.segundoParaMicrossegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.segundoParaMillisegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.segundoParaMinuto(v);
                                        break;
                                    case 5:
                                        res = tempo.segundoParaHora(v);
                                        break;
                                    case 6:
                                        res = tempo.segundoParaDia(v);
                                        break;
                                }
                                break;
                            case 5:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo5 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Milisegundos \n 4 - Segundos \n 5 - Hora \n 6 - Dia \n");
                                            unidF = scTempo5.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.minutoParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.minutoParaMicrossegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.minutoParaMillissegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.minutoParaSegundo(v);
                                        break;
                                    case 5:
                                        res = tempo.minutoParaHora(v);
                                        break;
                                    case 6:
                                        res = tempo.minutoParaDia(v);
                                        break;
                                }
                                break;
                            case 6:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo6 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Milisegundos \n 4 - Segundos \n 5 - Minuto \n 6 - Dia \n");
                                            unidF = scTempo6.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.horaParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.horaParaMicrossegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.horaParaMillissegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.horaParaSegundo(v);
                                        break;
                                    case 5:
                                        res = tempo.horaParaMinuto(v);
                                        break;
                                    case 6:
                                        res = tempo.horaParaDia(v);
                                        break;
                                }
                                break;
                            case 7:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scTempo7 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "Digite para qual unidade de tempo você quer converter: \n 1 - Nanossegundos \n 2 - Microssegundos \n 3 - Milisegundos \n 4 - Segundos \n 5 - Minuto \n 6 - Hora \n");
                                            unidF = scTempo7.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 6);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 6!");
                                        loopThings = false;
                                    }
                                }
                                switch (unidF) {
                                    case 1:
                                        res = tempo.diaParaNanossegundo(v);
                                        break;
                                    case 2:
                                        res = tempo.diaParaMicrossegundo(v);
                                        break;
                                    case 3:
                                        res = tempo.diaParaMillissegundo(v);
                                        break;
                                    case 4:
                                        res = tempo.diaParaSegundo(v);
                                        break;
                                    case 5:
                                        res = tempo.diaParaMinuto(v);
                                        break;
                                    case 6:
                                        res = tempo.diaParaHora(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 8:
                        Velocidade velocidade = new Velocidade();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scVelocidade = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nDigite qual unidade de velocidade você deseja converter:\n1 - Milha por hora \n2 - Pés por segundo \n3 - Metro por segundo \n4 - Quilómetro por hora \n5 - Nó.\n");
                                    unidI = scVelocidade.nextInt();
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 5);
                            } catch (InputMismatchException e) {
                                System.err.println("Opção inválida, digite uma opção de 1 a 5!");
                                loopThings = false;
                            }

                        }

                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scVelocidade1 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nDigite para qual velocidade você deseja converter: \n1 - Pés por segundo \n2 - Metro por segundo \n3 - Quilómetro por hora \n4 - Nó.\n");
                                            unidF = scVelocidade1.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 4);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = velocidade.milhaPorHoraParaPesPorSegundo(v);
                                        break;
                                    case 2:
                                        res = velocidade.milhaPorHoraParaMetroPorSegundo(v);
                                        break;
                                    case 3:
                                        res = velocidade.milhaPorHoraParaQuilometroPorHora(v);
                                        break;
                                    case 4:
                                        res = velocidade.milhaPorHoraParaNo(v);
                                        break;
                                }
                                break;
                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scVelocidade2 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nDigite para qual velocidade você deseja converter: \n1 - Milha por hora \n2 - Metro por segundo \n3 - Quilómetro por hora \n4 - Nó.\n");
                                            unidF = scVelocidade2.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 4);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = velocidade.pesPorSegundoParaMilhaPorHora(v);
                                        break;
                                    case 2:
                                        res = velocidade.pesPorSegundoParaMetroPorSegundo(v);
                                        break;
                                    case 3:
                                        res = velocidade.pesPorSegundoParaQuilometroPorHora(v);
                                        break;
                                    case 4:
                                        res = velocidade.pesPorSegundoParaNo(v);
                                        break;
                                }
                                break;
                            case 3:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scVelocidade3 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nDigite para qual velocidade você deseja converter: \n1 - Milha por hora \n2 - Pés por segundo \n3 - Quilómetro por hora \n4 - Nó.\n");
                                            unidF = scVelocidade3.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 4);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = velocidade.metroPorSegundoParaMilhasPorHora(v);
                                        break;
                                    case 2:
                                        res = velocidade.metroPorSegundoParaPesPorSegundo(v);
                                        break;
                                    case 3:
                                        res = velocidade.metroPorSegundoParaQuilometroPorHora(v);
                                        break;
                                    case 4:
                                        res = velocidade.metroPorSegundoParaNo(v);
                                        break;
                                }
                                break;
                            case 4:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scVelocidade4 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nDigite para qual velocidade você deseja converter: \n1 - Milha por hora \n2 - Pés por segundo \n3 - Metro por segundo \n4 - Nó.\n");
                                            unidF = scVelocidade4.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 4);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = velocidade.quilometroPorHoraParaMilhasPorHora(v);
                                        break;
                                    case 2:
                                        res = velocidade.quilometroPorHoraParaPesPorSegundo(v);
                                        break;
                                    case 3:
                                        res = velocidade.quilometroPorHoraParaMetroPorSegundo(v);
                                        break;
                                    case 4:
                                        res = velocidade.quilometroPorHoraParaNo(v);
                                        break;
                                }
                                break;
                            case 5:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scVelocidade5 = new Scanner(System.in);
                                    try {
                                        do {
                                            System.out.println(
                                                    "\nDigite para qual velocidade você deseja converter: \n1 - Milha por hora \n2 - Pés por segundo \n3 - Metro por segundo \n4 - Quilómetro por hora.\n");
                                            unidF = scVelocidade5.nextInt();
                                            loopThings = true;
                                        } while (unidF < 1 || unidF > 4);
                                    } catch (InputMismatchException e) {
                                        System.err.println("Opção inválida, digite uma opção de 1 a 4!");
                                        loopThings = false;
                                    }

                                }
                                switch (unidF) {
                                    case 1:
                                        res = velocidade.noParaMilhasPorHora(v);
                                        break;
                                    case 2:
                                        res = velocidade.noParaPesPorSegundo(v);
                                        break;
                                    case 3:
                                        res = velocidade.noParaMetroPorSegundo(v);
                                        break;
                                    case 4:
                                        res = velocidade.noParaQuilometroPorHora(v);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 9:
                        Angulo angulo = new Angulo();
                        loopThings = false;
                        while (!loopThings) {
                            Scanner scAngulo = new Scanner(System.in);
                            try {
                                do {
                                    System.out.println(
                                            "\nEscolha o grau que você deseja digitado: \n\n1 - Grau\n2 - Radiano\n");
                                    unidI = scAngulo.nextInt();
                                    angulo.verificaResp1(unidI);
                                    loopThings = true;
                                } while (unidI < 1 || unidI > 2);
                            } catch (Exception e) {
                                System.out.println("Opção inválida, digite uma opção de 1 a 2!");
                                loopThings = false;
                            }
                        }

                        switch (unidI) {
                            case 1:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scAngulo1 = new Scanner(System.in);
                                    System.out.println(
                                            "\nEscolha para qual grau você deseja converter: \n\n1 - Radiano\n");
                                    try {
                                        unidF = scAngulo1.nextInt();
                                        angulo.verificaResp2(unidF);
                                        loopThings = true;
                                        res = angulo.grauParaRadiano(v);
                                    } catch (Exception e) {
                                        System.out.println("Opção inválida, digite 1 para realizar a conversão!");
                                        loopThings = false;
                                    }
                                }
                                break;

                            case 2:
                                loopThings = false;
                                while (!loopThings) {
                                    Scanner scAngulo2 = new Scanner(System.in);
                                    System.out.println(
                                            "\nEscolha para qual grau você deseja converter: \n\n1 - Grau\n");
                                    try {
                                        unidF = scAngulo2.nextInt();
                                        angulo.verificaResp2(unidF);
                                        loopThings = true;
                                        res = angulo.radianoParaGrau(v);
                                    } catch (Exception e) {
                                        System.out.println("Opção inválida, digite 1 para realizar a conversão!");
                                        loopThings = false;
                                    }
                                }
                                break;
                        }
                        break;
                    case 0:
                        break;
                }
                System.out.println("A conversão resultou em: " + res);
                System.out.println(
                        "\nDeseja continuar? (Digite 's' para continuar, ou qualquer outra coisa para encerrar!)");
                close = sc.next().charAt(0);
                if (close != 's' && close != 'S')
                    System.out
                            .println("\nObrigado por utilizar o conversor de unidades da Fatec, Fechando o programa!");
            } else {
                System.out.println("\nObrigado por utilizar o conversor de unidades da Fatec, Fechando o programa!");
                break;
            }
        }
        sc.close();
    }
}