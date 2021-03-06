
package com.concretepage.article_ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ArticlesPort", targetNamespace = "http://www.concretepage.com/article-ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ArticlesPort {


    /**
     * 
     * @param addArticleRequest
     * @return
     *     returns com.concretepage.article_ws.AddArticleResponse
     */
    @WebMethod
    @WebResult(name = "addArticleResponse", targetNamespace = "http://www.concretepage.com/article-ws", partName = "addArticleResponse")
    public AddArticleResponse addArticle(
        @WebParam(name = "addArticleRequest", targetNamespace = "http://www.concretepage.com/article-ws", partName = "addArticleRequest")
        AddArticleRequest addArticleRequest);

    /**
     * 
     * @param getAllArticlesRequest
     * @return
     *     returns com.concretepage.article_ws.GetAllArticlesResponse
     */
    @WebMethod
    @WebResult(name = "getAllArticlesResponse", targetNamespace = "http://www.concretepage.com/article-ws", partName = "getAllArticlesResponse")
    public GetAllArticlesResponse getAllArticles(
        @WebParam(name = "getAllArticlesRequest", targetNamespace = "http://www.concretepage.com/article-ws", partName = "getAllArticlesRequest")
        GetAllArticlesRequest getAllArticlesRequest);

    /**
     * 
     * @param updateArticleRequest
     * @return
     *     returns com.concretepage.article_ws.UpdateArticleResponse
     */
    @WebMethod
    @WebResult(name = "updateArticleResponse", targetNamespace = "http://www.concretepage.com/article-ws", partName = "updateArticleResponse")
    public UpdateArticleResponse updateArticle(
        @WebParam(name = "updateArticleRequest", targetNamespace = "http://www.concretepage.com/article-ws", partName = "updateArticleRequest")
        UpdateArticleRequest updateArticleRequest);

    /**
     * 
     * @param deleteArticleRequest
     * @return
     *     returns com.concretepage.article_ws.DeleteArticleResponse
     */
    @WebMethod
    @WebResult(name = "deleteArticleResponse", targetNamespace = "http://www.concretepage.com/article-ws", partName = "deleteArticleResponse")
    public DeleteArticleResponse deleteArticle(
        @WebParam(name = "deleteArticleRequest", targetNamespace = "http://www.concretepage.com/article-ws", partName = "deleteArticleRequest")
        DeleteArticleRequest deleteArticleRequest);

    /**
     * 
     * @param getArticleByIdRequest
     * @return
     *     returns com.concretepage.article_ws.GetArticleByIdResponse
     */
    @WebMethod
    @WebResult(name = "getArticleByIdResponse", targetNamespace = "http://www.concretepage.com/article-ws", partName = "getArticleByIdResponse")
    public GetArticleByIdResponse getArticleById(
        @WebParam(name = "getArticleByIdRequest", targetNamespace = "http://www.concretepage.com/article-ws", partName = "getArticleByIdRequest")
        GetArticleByIdRequest getArticleByIdRequest);

}
