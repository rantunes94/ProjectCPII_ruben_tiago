package projetocp;

import util.Consola;

public class Main {

    private static GestaoRH grh = new GestaoRH();

    public static void main(String[] args) {
	// write your code here
        int opcao, opcaoSubMenu;

        grh.lerFicheiro();

        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    //if (gcp.getNumAlunos() > 0) // se houver alunos
                {

                    do {
                        opcaoSubMenu = menuFuncionario();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }

                    break;

                case 2:
                {

                    do {
                        opcaoSubMenu = menuDivisão();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarDivisao();
                                break;
                            case 2:
                                // verificação , array vazio?
                                consultarDivisao();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }

                    break;
                case 3:
                {

                    do {
                        opcaoSubMenu = menuTiposEquipamento();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarTiposEquipamento();
                                break;
                            case 2:
                                if (grh.getNumTiposEquipamento() > 0)
                                    System.out.println(grh.mostrarTipoEquipamentos());
                                else
                                    System.err.println("Ainda não foram inseridos Tipos de Equipamento!");
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 4:
                {

                    do {
                        opcaoSubMenu = menuEquipamentos();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 5:
                {

                    do {
                        opcaoSubMenu = menuAvarias();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 6:
                {

                    do {
                        opcaoSubMenu = menuEstatisticas();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;

                case 0:
                    System.out.println("Programa terminou...");
            }
            Consola.sc.nextLine();
        } while (opcao != 0);

        grh.gravarFicheiro();

    }


    private static int menu() {
        int opcao;

        System.out.println();
        System.out.println("1 - Gerir Funcionários");
        System.out.println("2 - Gerir Divisão");
        System.out.println("3 - Gerir Tipos de Equipamento");
        System.out.println("4 - Gerir Equipamentos");
        System.out.println("5 - Gerir Avarias/Reparações");
        System.out.println("6 - Estatisticas");
        System.out.println("0 - Sair\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);

        return opcao;
    }

    private static int menuFuncionario() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Funcionário");
        System.out.println("2 - Alterar Funcionário");
        System.out.println("3 - Consultar Funcionário");
        System.out.println("4 - Eliminar Funcionário");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 4);

        return opcao;
    }

    private static int menuDivisão() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Divisão");
        System.out.println("2 - Consultar por Designação");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }

    private static int menuTiposEquipamento() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir o tipo de equipamento");
        System.out.println("2 - Consultar todos");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }

    private static int menuEquipamentos() {
        int opcao;

        System.out.println();
        System.out.println("1 - Registar equipamentos");
        System.out.println("2 - Consultar por divisão");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }

    private static int menuAvarias() {
        int opcao;

        System.out.println();
        System.out.println("1 - Registar avarias");
        System.out.println("2 - Alterar estado");
        System.out.println("3 - Consultar por número de equipamento");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }

    private static int menuEstatisticas() {
        int opcao;

        System.out.println();
        //System.out.println("1 - Inserir Divisão");
        //System.out.println("2 - Consultar por Designação");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }


    public static void criarDivisao() {
        String designacao, localizacao;
        Divisao d1;

        designacao = Consola.lerString("Indique a designação da Divisão: ");
        localizacao = Consola.lerString("Indique a localização da Divisão: ");

        d1 = new Divisao(designacao, localizacao);

        grh.adicionarDivisao(d1);

        System.out.println("Divisão inserida com sucesso!");
    }

    public static void criarTiposEquipamento() {
        String designacao;
        TipoEquipamento te1;

        designacao = Consola.lerString("Indique a designação do Tipo de equipamento: ");


        te1 = new TipoEquipamento(designacao);

        grh.adicionarTipoEquipamento(te1);

        System.out.println("Divisão inserida com sucesso!");
    }







    public static void consultarDivisao(){
        int pos;
        String designacao;
        Divisao divisao;
        do {
            designacao = Consola.lerString("Indique a designação da Divisão: ");
            pos = grh.pesquisarDivisao(designacao);
            if (pos == -1)
                System.err.println("Divisão não existe!");
        } while (pos == -1);

        divisao=grh.obterDivisao(pos);

        System.out.println(divisao);
    }


}
