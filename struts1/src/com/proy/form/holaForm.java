package com.proy.form;

import org.apache.struts.action.ActionForm;

public class holaForm extends ActionForm{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -3691956659254904594L;
	private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
