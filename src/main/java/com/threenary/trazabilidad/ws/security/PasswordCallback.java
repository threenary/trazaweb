package com.threenary.trazabilidad.ws.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

/**
 * <h2>PasswordCallback</h2><br>
 * Manejador de password para seguridad en los llamados a Web Services
 * 
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 04/12/2012
 */
public class PasswordCallback implements CallbackHandler {

    /** usr: un objeto de tipo <code>String</code>*/
    private String usr;
    
    /** pwd: un objeto de tipo <code>String</code>*/
    private String pwd;
    
    /** passwords: un objeto de tipo <code>Map<String,String></code>*/
    private Map<String, String> passwords = new HashMap<String, String>();

    /**
     * Constructor
     */
    public PasswordCallback() {
        passwords.put("testwservice", "testwservicepsw");
    }

    /**
     * Manejador de callbacks para retornar el password asociado al usuario
     * 
     * @param callbacks
     * @throws IOException
     * @throws UnsupportedCallbackException
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

            String pass = passwords.get(pc.getIdentifier());
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }

    /**
     * Getter
     *
     * @return Retorna el/la user.
     */
    public String getUsr() {
        return usr;
    }

    /**
     * Setter
     *
     * @param user El/La user para setear.
     */
    public void setUsr(String user) {
        this.usr = user;
    }

    /**
     * Getter
     *
     * @return Retorna el/la pwd.
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Setter
     *
     * @param pwd El/La pwd para setear.
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
