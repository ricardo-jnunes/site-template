package com.site.contato;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="contato")
@RequestScoped
public class ContatoController {
	
	ContatoForm form = new ContatoForm();

	public void enviarMensagem(){
		
		String msg = "Contato-- Nome: " + form.getNome() + 
				" E-mail: " + form.getEmail() + " Mensagem: " + form.getMensagem();
		
		FacesMessage fm = new FacesMessage(msg);
	    FacesContext.getCurrentInstance().addMessage("msg", fm);
		
	}

	public ContatoForm getForm() {
		return form;
	}

	public void setForm(ContatoForm form) {
		this.form = form;
	}

	
}
