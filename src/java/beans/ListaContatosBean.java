package beans;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Contato;

@ManagedBean(name="lista")
@RequestScoped
public class ListaContatosBean {

    String nome, email, telefone;
    ArrayList<Contato> lista = new ArrayList<Contato>();
    Contato contato;
    Contato c1 = new Contato("Vinicius", "vini@aol.co", "1234-1234");
    Contato c2 = new Contato("Victor", "vic@aol.co", "1334-1334");

    public ListaContatosBean() {
    }

    public ArrayList<Contato> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contato> lista) {
        this.lista = lista;
    }

    public String getEmail() {
        return email;
    }

    public int getTamanho() {
        return lista.size();
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String cadastrar() {
        lista.add(c1);
        lista.add(c2);

        for (Contato c : lista) {
            if (c.getNome().equals(contato.getNome())) {
                FacesMessage msg =
                        new FacesMessage("Usuario já cadastrado.");
                FacesContext fc = FacesContext.getCurrentInstance();
                fc.addMessage("login", msg);
            } else {
                FacesMessage msg =
                        new FacesMessage("Usuario cadastrado com sucesso.");
                FacesContext fc = FacesContext.getCurrentInstance();
                fc.addMessage("login", msg);
                lista.add(contato);
                return "lista";
            }
        }
        return "lista";
    }
    public void deleta(Contato c) {
        lista.remove(c);
    }
}