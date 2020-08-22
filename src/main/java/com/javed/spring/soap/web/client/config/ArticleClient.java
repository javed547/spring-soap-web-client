package com.javed.spring.soap.web.client.config;

import com.concretepage.article_ws.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ArticleClient extends WebServiceGatewaySupport {

    public GetArticleByIdResponse getArticleById(String articleId) {
        GetArticleByIdRequest articleByIdRequest = new GetArticleByIdRequest();
        articleByIdRequest.setArticleId("5f37fbd773184f2c9c4eb820");

        return (GetArticleByIdResponse) getWebServiceTemplate()
                .marshalSendAndReceive(articleByIdRequest, new SoapActionCallback("http://localhost:8080/soapws/getArticleByIdRequest"));
    }

    public GetAllArticlesResponse getAllArticles() {
        GetAllArticlesRequest request = new GetAllArticlesRequest();
        return (GetAllArticlesResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/getAllArticlesRequest"));
    }

    public AddArticleResponse addArticle(String title, String category) {
        AddArticleRequest request = new AddArticleRequest();
        request.setTitle(title);
        request.setCategory(category);
        return (AddArticleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/addArticleRequest"));
    }


    public UpdateArticleResponse updateArticle(ArticleInfo articleInfo) {
        UpdateArticleRequest request = new UpdateArticleRequest();
        request.setArticleInfo(articleInfo);
        return (UpdateArticleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/updateArticleRequest"));
    }

    public DeleteArticleResponse deleteArticle(String articleId) {
        DeleteArticleRequest request = new DeleteArticleRequest();
        request.setArticleId(articleId);
        return (DeleteArticleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8080/soapws/deleteArticleRequest"));
    }
}
