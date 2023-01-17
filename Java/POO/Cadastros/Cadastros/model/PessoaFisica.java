package Cadastros.model;

    public class PessoaFisica extends Cliente {

        private double CPF;
        private String estadoCivil;
        private String escolaridade;

        private int idade;

        public PessoaFisica(String nome, String UF, int idade, double CPF, String estadoCivil, String escolaridade) {
            super(nome, UF, idade);
            this.CPF = CPF;
            this.estadoCivil = estadoCivil;
            this.escolaridade = escolaridade;
            this.idade = idade;
        }

        public double getCPF() {
            return CPF;
        }

        public void setCPF(double CPF) {
            this.CPF = CPF;
        }

        public String getEstadoCivil() {
            return estadoCivil;
        }

        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }

        public String getEscolaridade() {
            return escolaridade;
        }

        public void setEscolaridade(String escolaridade) {
            this.escolaridade = escolaridade;
        }


        public int getIdade() {
            return idade;
        }


        public void setIdade(int idade) {
            this.idade = idade;
        }


        public void visualizar() {
                System.out.println("\n_________________________________________");
                System.out.println("\n                                         ");
                System.out.println("            CADASTRO                       ");
                System.out.println("\n    NOME: " + getNome());
                System.out.println("\n    IDADE: " + getIdade());
                System.out.println("\n    UF: " + getUF());
                System.out.println("\n    Estado Civil: " + getEstadoCivil());
                System.out.println("\n    CPF: " + getCPF());
                System.out.println("\n    Escolaridade: " + getEscolaridade());
                System.out.println("\n                                         ");
                System.out.println("\n                                         ");
                System.out.println("\n_________________________________________");

            }
        }

