package com.threenary.trazabilidad.ws.client;

import java.security.Security;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;

import com.inssjp.mywebservice.business.IWebService;
import com.inssjp.mywebservice.business.MedicamentosDTO;
import com.inssjp.mywebservice.business.WebServiceError;
import com.threenary.trazabilidad.domain.Envio;
import com.threenary.trazabilidad.domain.WSError;
import com.threenary.trazabilidad.ws.security.MyProvider;

/**
 * <h2>WSUtils</h2><br>
 * Clase auxiliar que contiene métodos de clase utilizados para
 * formatear los objetos que se enviarán a través de los Web Services
 * al SNTM
 * 
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 10/12/2012
 */
public final class WSUtils {

    /** ERROR_COMUNICACION: un objeto de tipo <code>String</code> */
    private final static String ERROR_COMUNICACION = "ERRCOM"; //$NON-NLS-1$

    /**
     * Configura el servicio para que confié en todos los certificados
     * para comunicación SSL
     * 
     * @param webService
     *            <code>IWebService</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    private static void configureSSLTrusted(IWebService webService) {
        Security.addProvider(new MyProvider());
        Security.setProperty("ssl.TrustManagerFactory.algorithm",
                "TrustAllCertificates");
        Client proxy = ClientProxy.getClient(webService);

        HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
        TLSClientParameters tcp = new TLSClientParameters();
        tcp.setDisableCNCheck(Boolean.TRUE);
        conduit.setTlsClientParameters(tcp);
    }

    /**
     * Convierte los datos del <code>Envio</code> al formato aceptado
     * por el Web Service <code>MedicamentosDTO</code> y lo prepara
     * para ser enviado dentro de una lista
     * 
     * @param envio
     *            un objeto del tipo
     *            <code>List<MedicamentosDTO></code>
     * @return un objeto del tipo <code>MedicamentosDTO</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public static ArrayList<MedicamentosDTO> convertirEnvio(Envio envio) {
        final ArrayList<MedicamentosDTO> medicamentos = new ArrayList<MedicamentosDTO>();

        final MedicamentosDTO dto = new MedicamentosDTO();

        dto.setFEvento(envio.getMovimiento().getFechaEventoToString());
        dto.setHEvento(envio.getMovimiento().getHoraEventoToString()
                .substring(0, 5));
        dto.setGlnOrigen(envio.getMovimiento().getAgenteOrigen().getGln());
        dto.setCuitOrigen(envio.getMovimiento().getAgenteOrigen().getCuit());
        dto.setGlnDestino(envio.getMovimiento().getAgenteDestino().getGln());
        dto.setCuitDestino(envio.getMovimiento().getAgenteDestino().getCuit());
        dto.setNRemito(String.valueOf(envio.getMovimiento().getRemito()));
        dto.setNFactura(String.valueOf(envio.getMovimiento().getFactura()));
        dto.setVencimiento(envio.getVencimientoToString());
        dto.setGtin(envio.getMedicamento().getGtin());
        dto.setLote(envio.getLote());
        dto.setNumeroSerial(envio.getSerie().trim());
        dto.setIdEvento(String.valueOf(envio.getMovimiento().getEvento()
                .getCodigo()));
        dto.setApellido(envio.getMovimiento().getApellido());
        dto.setNombres(envio.getMovimiento().getNombre());
        dto.setNDocumento(envio.getMovimiento().getNroDocumento());
        dto.setSexo(envio.getMovimiento().getSexo());
        dto.setTipoDocumento(String.valueOf(envio.getMovimiento()
                .getIdTipoDocumento()));
        dto.setDireccion(envio.getMovimiento().getDireccion());
        dto.setLocalidad(envio.getMovimiento().getLocalidad());
        dto.setNumero(envio.getMovimiento().getNumero());
        dto.setPiso(envio.getMovimiento().getPiso());
        dto.setDepto(envio.getMovimiento().getDpto());
        dto.setNPostal(envio.getMovimiento().getCodigoPostal());
        dto.setTelefono(envio.getMovimiento().getTelefono());
        dto.setIdObraSocial(String.valueOf(envio.getMovimiento()
                .getIdObraSocial()));

        medicamentos.add(dto);
        return medicamentos;
    }

    /**
     * Convierte los datos del <code>WebServiceError</code> obtenido
     * como resultado del SNTM al formato para ser almacenado y
     * gestionado por el sistema <code>WSError</code>
     * 
     * @param e
     *            un objeto tipo <code>WebServiceError</code>
     * @return un objeto tipo <code>WSError</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public static WSError convertirError(WebServiceError e) {
        final WSError wsError = new WSError();
        wsError.setCodigoError(e.getCError());
        wsError.setDetalleError(e.getDError());
        wsError.setFecha(Calendar.getInstance());
        return wsError;
    }

    /**
     * Wrappea un error de comunicación con el Web Service para
     * dejarlo registrado en la BD
     * 
     * @param msg
     *            objeto <code>String</code> con el mensaje de la
     *            excepcion
     * @return <code>WSError</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public static WSError convertirErrorComunicacion(String msg) {
        final WSError wsError = new WSError();
        wsError.setCodigoError(ERROR_COMUNICACION);
        wsError.setDetalleError(msg);
        wsError.setFecha(Calendar.getInstance());
        return wsError;
    }

}
