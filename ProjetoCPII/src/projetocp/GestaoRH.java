package projetocp;

import java.io.*;
import java.util.ArrayList;


public class GestaoRH {

    private ArrayList<Divisao> divisoes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<TipoEquipamento> tiposEquipamento = new ArrayList<>();

    public int getTotalFuncionarios() {
        return funcionarios.size();
    }
    public int getTotalDivisoes() { return divisoes.size(); }
    public int getTotalTiposEquipamento() { return tiposEquipamento.size(); }

    public Funcionario obterFuncionario (int pos){
        return funcionarios.get(pos);
    }
    public Divisao obterDivisao (int pos){
        return divisoes.get(pos);
    }
    public TipoEquipamento obterTiposEquipamento (int pos){
        return tiposEquipamento.get(pos);
    }


    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void adicionarDivisao(Divisao divisao){ divisoes.add(divisao); }
    public void adicionarTipoEquipamento(TipoEquipamento tipoEquipamento){
        if (!tiposEquipamento.isEmpty())
            tipoEquipamento.setNumero(tiposEquipamento.get(tiposEquipamento.size()-1).getNumero()+1);
        else
            tipoEquipamento.setNumero(1);

        tiposEquipamento.add(tipoEquipamento);
    }

    public void eliminarFuncionario(int pos){
        funcionarios.remove(pos);
    }

    public int pesquisarFuncionarios(int nif) {
        for (int i = 0; i < funcionarios.size(); i++)
            if (funcionarios.get(i).getNif() == nif)
                return i;
            return -1;
    }

    public String mostrarFuncionarios(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionarios.size(); i++) {
            str.append(funcionarios.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarTipoEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<tiposEquipamento.size(); i++) {
            str.append(tiposEquipamento.get(i)).append("\n");
        }
        return str.toString();
    }

    public int pesquisarTipoEquipamento(int numero){ // à partida nao vai ser necessario
        for (int i=0; i<tiposEquipamento.size(); i++)
            if (tiposEquipamento.get(i).getNumero()==numero)
                return i;
        return -1;
    }

    public int pesquisarDivisao(String designacao){
        for (int i=0; i<divisoes.size(); i++)
            if (divisoes.get(i).getDesignacao().equalsIgnoreCase(designacao))
                return i;
        return -1;
    }



    public void gravarFicheiro() {
        try {
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("grh.dat"));
            out.writeObject(divisoes);
            out.writeObject(funcionarios);
            out.writeObject(tiposEquipamento);

            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("grh.dat"));
            divisoes = (ArrayList<Divisao>) in.readObject();
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            tiposEquipamento = (ArrayList<TipoEquipamento>) in.readObject();

            Divisao.quantidadeEquipamentosInstalados= divisoes.size();


            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
