
package com.dulcejosefina.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dulcejosefina.ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelectVentasDeUnDiaDeterminado_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVentasDeUnDiaDeterminado");
    private final static QName _VerVentasPaginadas_QNAME = new QName("http://ejb.dulcejosefina.com/", "verVentasPaginadas");
    private final static QName _SelectAllVentasResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectAllVentasResponse");
    private final static QName _SelectVentaResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVentaResponse");
    private final static QName _EliminarProductoDeUnaVentaResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "eliminarProductoDeUnaVentaResponse");
    private final static QName _SumaTotalVentasMensualResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "sumaTotalVentasMensualResponse");
    private final static QName _VerVentasPaginadasResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "verVentasPaginadasResponse");
    private final static QName _GetSalesCanceledTodayAndPrevius_QNAME = new QName("http://ejb.dulcejosefina.com/", "getSalesCanceledTodayAndPrevius");
    private final static QName _AnularVentaResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "anularVentaResponse");
    private final static QName _CrearVentaResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "crearVentaResponse");
    private final static QName _SelectVentasHastaElMomentoResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVentasHastaElMomentoResponse");
    private final static QName _EliminarProductoDeUnaVenta_QNAME = new QName("http://ejb.dulcejosefina.com/", "eliminarProductoDeUnaVenta");
    private final static QName _SelectVentasDeUnDiaDeterminadoResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVentasDeUnDiaDeterminadoResponse");
    private final static QName _SumaTotalVentasMensual_QNAME = new QName("http://ejb.dulcejosefina.com/", "sumaTotalVentasMensual");
    private final static QName _SelectUnaVentaResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectUnaVentaResponse");
    private final static QName _SelectVentasHastaElMomento_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVentasHastaElMomento");
    private final static QName _GetRecordCountVentas_QNAME = new QName("http://ejb.dulcejosefina.com/", "getRecordCountVentas");
    private final static QName _GetRecordCountVentasResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "getRecordCountVentasResponse");
    private final static QName _GetSalesCanceledTodayAndPreviusResponse_QNAME = new QName("http://ejb.dulcejosefina.com/", "getSalesCanceledTodayAndPreviusResponse");
    private final static QName _AnularVenta_QNAME = new QName("http://ejb.dulcejosefina.com/", "anularVenta");
    private final static QName _CrearVenta_QNAME = new QName("http://ejb.dulcejosefina.com/", "crearVenta");
    private final static QName _SelectVenta_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectVenta");
    private final static QName _SelectAllVentas_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectAllVentas");
    private final static QName _SelectUnaVenta_QNAME = new QName("http://ejb.dulcejosefina.com/", "selectUnaVenta");
    private final static QName _Exception_QNAME = new QName("http://ejb.dulcejosefina.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dulcejosefina.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarProductoDeUnaVentaResponse }
     * 
     */
    public EliminarProductoDeUnaVentaResponse createEliminarProductoDeUnaVentaResponse() {
        return new EliminarProductoDeUnaVentaResponse();
    }

    /**
     * Create an instance of {@link SumaTotalVentasMensualResponse }
     * 
     */
    public SumaTotalVentasMensualResponse createSumaTotalVentasMensualResponse() {
        return new SumaTotalVentasMensualResponse();
    }

    /**
     * Create an instance of {@link GetSalesCanceledTodayAndPrevius }
     * 
     */
    public GetSalesCanceledTodayAndPrevius createGetSalesCanceledTodayAndPrevius() {
        return new GetSalesCanceledTodayAndPrevius();
    }

    /**
     * Create an instance of {@link VerVentasPaginadasResponse }
     * 
     */
    public VerVentasPaginadasResponse createVerVentasPaginadasResponse() {
        return new VerVentasPaginadasResponse();
    }

    /**
     * Create an instance of {@link EliminarProductoDeUnaVenta }
     * 
     */
    public EliminarProductoDeUnaVenta createEliminarProductoDeUnaVenta() {
        return new EliminarProductoDeUnaVenta();
    }

    /**
     * Create an instance of {@link CrearVentaResponse }
     * 
     */
    public CrearVentaResponse createCrearVentaResponse() {
        return new CrearVentaResponse();
    }

    /**
     * Create an instance of {@link SelectVentasHastaElMomentoResponse }
     * 
     */
    public SelectVentasHastaElMomentoResponse createSelectVentasHastaElMomentoResponse() {
        return new SelectVentasHastaElMomentoResponse();
    }

    /**
     * Create an instance of {@link AnularVentaResponse }
     * 
     */
    public AnularVentaResponse createAnularVentaResponse() {
        return new AnularVentaResponse();
    }

    /**
     * Create an instance of {@link SelectVentasDeUnDiaDeterminado }
     * 
     */
    public SelectVentasDeUnDiaDeterminado createSelectVentasDeUnDiaDeterminado() {
        return new SelectVentasDeUnDiaDeterminado();
    }

    /**
     * Create an instance of {@link VerVentasPaginadas }
     * 
     */
    public VerVentasPaginadas createVerVentasPaginadas() {
        return new VerVentasPaginadas();
    }

    /**
     * Create an instance of {@link SelectVentaResponse }
     * 
     */
    public SelectVentaResponse createSelectVentaResponse() {
        return new SelectVentaResponse();
    }

    /**
     * Create an instance of {@link SelectAllVentasResponse }
     * 
     */
    public SelectAllVentasResponse createSelectAllVentasResponse() {
        return new SelectAllVentasResponse();
    }

    /**
     * Create an instance of {@link CrearVenta }
     * 
     */
    public CrearVenta createCrearVenta() {
        return new CrearVenta();
    }

    /**
     * Create an instance of {@link SelectVenta }
     * 
     */
    public SelectVenta createSelectVenta() {
        return new SelectVenta();
    }

    /**
     * Create an instance of {@link SelectAllVentas }
     * 
     */
    public SelectAllVentas createSelectAllVentas() {
        return new SelectAllVentas();
    }

    /**
     * Create an instance of {@link SelectUnaVenta }
     * 
     */
    public SelectUnaVenta createSelectUnaVenta() {
        return new SelectUnaVenta();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SelectVentasHastaElMomento }
     * 
     */
    public SelectVentasHastaElMomento createSelectVentasHastaElMomento() {
        return new SelectVentasHastaElMomento();
    }

    /**
     * Create an instance of {@link SelectUnaVentaResponse }
     * 
     */
    public SelectUnaVentaResponse createSelectUnaVentaResponse() {
        return new SelectUnaVentaResponse();
    }

    /**
     * Create an instance of {@link SelectVentasDeUnDiaDeterminadoResponse }
     * 
     */
    public SelectVentasDeUnDiaDeterminadoResponse createSelectVentasDeUnDiaDeterminadoResponse() {
        return new SelectVentasDeUnDiaDeterminadoResponse();
    }

    /**
     * Create an instance of {@link SumaTotalVentasMensual }
     * 
     */
    public SumaTotalVentasMensual createSumaTotalVentasMensual() {
        return new SumaTotalVentasMensual();
    }

    /**
     * Create an instance of {@link GetRecordCountVentasResponse }
     * 
     */
    public GetRecordCountVentasResponse createGetRecordCountVentasResponse() {
        return new GetRecordCountVentasResponse();
    }

    /**
     * Create an instance of {@link GetSalesCanceledTodayAndPreviusResponse }
     * 
     */
    public GetSalesCanceledTodayAndPreviusResponse createGetSalesCanceledTodayAndPreviusResponse() {
        return new GetSalesCanceledTodayAndPreviusResponse();
    }

    /**
     * Create an instance of {@link GetRecordCountVentas }
     * 
     */
    public GetRecordCountVentas createGetRecordCountVentas() {
        return new GetRecordCountVentas();
    }

    /**
     * Create an instance of {@link AnularVenta }
     * 
     */
    public AnularVenta createAnularVenta() {
        return new AnularVenta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVentasDeUnDiaDeterminado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVentasDeUnDiaDeterminado")
    public JAXBElement<SelectVentasDeUnDiaDeterminado> createSelectVentasDeUnDiaDeterminado(SelectVentasDeUnDiaDeterminado value) {
        return new JAXBElement<SelectVentasDeUnDiaDeterminado>(_SelectVentasDeUnDiaDeterminado_QNAME, SelectVentasDeUnDiaDeterminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerVentasPaginadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "verVentasPaginadas")
    public JAXBElement<VerVentasPaginadas> createVerVentasPaginadas(VerVentasPaginadas value) {
        return new JAXBElement<VerVentasPaginadas>(_VerVentasPaginadas_QNAME, VerVentasPaginadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllVentasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectAllVentasResponse")
    public JAXBElement<SelectAllVentasResponse> createSelectAllVentasResponse(SelectAllVentasResponse value) {
        return new JAXBElement<SelectAllVentasResponse>(_SelectAllVentasResponse_QNAME, SelectAllVentasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVentaResponse")
    public JAXBElement<SelectVentaResponse> createSelectVentaResponse(SelectVentaResponse value) {
        return new JAXBElement<SelectVentaResponse>(_SelectVentaResponse_QNAME, SelectVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoDeUnaVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "eliminarProductoDeUnaVentaResponse")
    public JAXBElement<EliminarProductoDeUnaVentaResponse> createEliminarProductoDeUnaVentaResponse(EliminarProductoDeUnaVentaResponse value) {
        return new JAXBElement<EliminarProductoDeUnaVentaResponse>(_EliminarProductoDeUnaVentaResponse_QNAME, EliminarProductoDeUnaVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaTotalVentasMensualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "sumaTotalVentasMensualResponse")
    public JAXBElement<SumaTotalVentasMensualResponse> createSumaTotalVentasMensualResponse(SumaTotalVentasMensualResponse value) {
        return new JAXBElement<SumaTotalVentasMensualResponse>(_SumaTotalVentasMensualResponse_QNAME, SumaTotalVentasMensualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerVentasPaginadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "verVentasPaginadasResponse")
    public JAXBElement<VerVentasPaginadasResponse> createVerVentasPaginadasResponse(VerVentasPaginadasResponse value) {
        return new JAXBElement<VerVentasPaginadasResponse>(_VerVentasPaginadasResponse_QNAME, VerVentasPaginadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesCanceledTodayAndPrevius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "getSalesCanceledTodayAndPrevius")
    public JAXBElement<GetSalesCanceledTodayAndPrevius> createGetSalesCanceledTodayAndPrevius(GetSalesCanceledTodayAndPrevius value) {
        return new JAXBElement<GetSalesCanceledTodayAndPrevius>(_GetSalesCanceledTodayAndPrevius_QNAME, GetSalesCanceledTodayAndPrevius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "anularVentaResponse")
    public JAXBElement<AnularVentaResponse> createAnularVentaResponse(AnularVentaResponse value) {
        return new JAXBElement<AnularVentaResponse>(_AnularVentaResponse_QNAME, AnularVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "crearVentaResponse")
    public JAXBElement<CrearVentaResponse> createCrearVentaResponse(CrearVentaResponse value) {
        return new JAXBElement<CrearVentaResponse>(_CrearVentaResponse_QNAME, CrearVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVentasHastaElMomentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVentasHastaElMomentoResponse")
    public JAXBElement<SelectVentasHastaElMomentoResponse> createSelectVentasHastaElMomentoResponse(SelectVentasHastaElMomentoResponse value) {
        return new JAXBElement<SelectVentasHastaElMomentoResponse>(_SelectVentasHastaElMomentoResponse_QNAME, SelectVentasHastaElMomentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoDeUnaVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "eliminarProductoDeUnaVenta")
    public JAXBElement<EliminarProductoDeUnaVenta> createEliminarProductoDeUnaVenta(EliminarProductoDeUnaVenta value) {
        return new JAXBElement<EliminarProductoDeUnaVenta>(_EliminarProductoDeUnaVenta_QNAME, EliminarProductoDeUnaVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVentasDeUnDiaDeterminadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVentasDeUnDiaDeterminadoResponse")
    public JAXBElement<SelectVentasDeUnDiaDeterminadoResponse> createSelectVentasDeUnDiaDeterminadoResponse(SelectVentasDeUnDiaDeterminadoResponse value) {
        return new JAXBElement<SelectVentasDeUnDiaDeterminadoResponse>(_SelectVentasDeUnDiaDeterminadoResponse_QNAME, SelectVentasDeUnDiaDeterminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaTotalVentasMensual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "sumaTotalVentasMensual")
    public JAXBElement<SumaTotalVentasMensual> createSumaTotalVentasMensual(SumaTotalVentasMensual value) {
        return new JAXBElement<SumaTotalVentasMensual>(_SumaTotalVentasMensual_QNAME, SumaTotalVentasMensual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnaVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectUnaVentaResponse")
    public JAXBElement<SelectUnaVentaResponse> createSelectUnaVentaResponse(SelectUnaVentaResponse value) {
        return new JAXBElement<SelectUnaVentaResponse>(_SelectUnaVentaResponse_QNAME, SelectUnaVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVentasHastaElMomento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVentasHastaElMomento")
    public JAXBElement<SelectVentasHastaElMomento> createSelectVentasHastaElMomento(SelectVentasHastaElMomento value) {
        return new JAXBElement<SelectVentasHastaElMomento>(_SelectVentasHastaElMomento_QNAME, SelectVentasHastaElMomento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCountVentas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "getRecordCountVentas")
    public JAXBElement<GetRecordCountVentas> createGetRecordCountVentas(GetRecordCountVentas value) {
        return new JAXBElement<GetRecordCountVentas>(_GetRecordCountVentas_QNAME, GetRecordCountVentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCountVentasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "getRecordCountVentasResponse")
    public JAXBElement<GetRecordCountVentasResponse> createGetRecordCountVentasResponse(GetRecordCountVentasResponse value) {
        return new JAXBElement<GetRecordCountVentasResponse>(_GetRecordCountVentasResponse_QNAME, GetRecordCountVentasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesCanceledTodayAndPreviusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "getSalesCanceledTodayAndPreviusResponse")
    public JAXBElement<GetSalesCanceledTodayAndPreviusResponse> createGetSalesCanceledTodayAndPreviusResponse(GetSalesCanceledTodayAndPreviusResponse value) {
        return new JAXBElement<GetSalesCanceledTodayAndPreviusResponse>(_GetSalesCanceledTodayAndPreviusResponse_QNAME, GetSalesCanceledTodayAndPreviusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "anularVenta")
    public JAXBElement<AnularVenta> createAnularVenta(AnularVenta value) {
        return new JAXBElement<AnularVenta>(_AnularVenta_QNAME, AnularVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "crearVenta")
    public JAXBElement<CrearVenta> createCrearVenta(CrearVenta value) {
        return new JAXBElement<CrearVenta>(_CrearVenta_QNAME, CrearVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectVenta")
    public JAXBElement<SelectVenta> createSelectVenta(SelectVenta value) {
        return new JAXBElement<SelectVenta>(_SelectVenta_QNAME, SelectVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllVentas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectAllVentas")
    public JAXBElement<SelectAllVentas> createSelectAllVentas(SelectAllVentas value) {
        return new JAXBElement<SelectAllVentas>(_SelectAllVentas_QNAME, SelectAllVentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnaVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "selectUnaVenta")
    public JAXBElement<SelectUnaVenta> createSelectUnaVenta(SelectUnaVenta value) {
        return new JAXBElement<SelectUnaVenta>(_SelectUnaVenta_QNAME, SelectUnaVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.dulcejosefina.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
