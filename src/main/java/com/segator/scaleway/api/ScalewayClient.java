/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.segator.scaleway.api.entity.exceptions.ScalewayInvalidRequestException;
import com.jcabi.manifests.Manifests;
import com.segator.scaleway.api.constants.ScalewayConstants;
import com.segator.scaleway.api.entity.ScalewayServerTemplate;
import com.segator.scaleway.api.entity.ScalewayImage;
import com.segator.scaleway.api.entity.ScalewayImageResponse;
import com.segator.scaleway.api.entity.ScalewayImagesResponse;
import com.segator.scaleway.api.entity.ScalewayServer;
import com.segator.scaleway.api.entity.ScalewayServerAction;
import com.segator.scaleway.api.entity.ScalewayServerActionRequest;
import com.segator.scaleway.api.entity.ScalewayServerActionsResponse;
import com.segator.scaleway.api.entity.ScalewayServerInstance;
import com.segator.scaleway.api.entity.ScalewayServerTask;
import com.segator.scaleway.api.entity.ScalewayServerTaskResponse;
import com.segator.scaleway.api.entity.ScalewayServersInstances;
import com.segator.scaleway.api.entity.ScalewayState;
import com.segator.scaleway.api.entity.exceptions.ScalewayException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author isaac_000
 */
public class ScalewayClient {

    private final String accessToken;
    private final String organizationToken;
    private CloseableHttpClient httpclient = null;

    public ScalewayClient(String accessToken, String organizationToken) {
        this.accessToken = accessToken;
        this.organizationToken = organizationToken;
        HttpClientBuilder httpBuilder = HttpClients.custom();
        httpBuilder.setUserAgent("scaleway/java-sdk" + Manifests.read("Implementation-Version"));
        this.httpclient = httpBuilder.build();
    }

    public List<ScalewayImage> getAllImages() throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, "images", accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayImagesResponse.class).getImages();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayImage getImage(ScalewayImage scalewayImage) throws ScalewayException {
        return getImage(scalewayImage.getId());
    }

    public ScalewayImage getImage(String imageId) throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, new StringBuilder("image/").append(imageId).toString(), accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayImageResponse.class).getImage();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayServer createServer(String serverName, ScalewayImage scalewayImage, String... tag) throws ScalewayException {
        ScalewayServerTemplate server = new ScalewayServerTemplate();
        server.setName(serverName);
        server.setImage(scalewayImage);
        server.setOrganization(organizationToken);
        server.setTags(Arrays.asList(tag));
        return createServer(server);
    }

    public void deleteServer(String serverID) throws ScalewayException {
        ScalewayServer serverToDelete = getServer(serverID);
        if (serverToDelete.getState() != ScalewayState.STOPPED) {

        }
        HttpRequestBase request = Utils.buildRequest("DELETE", ScalewayConstants.computeURL, new StringBuilder("servers/").append(serverID).toString(), accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() != 204) {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayServer createServer(ScalewayServerTemplate serverRequest) throws ScalewayException {
        HttpPost request = (HttpPost) Utils.buildRequest("POST", ScalewayConstants.computeURL, "servers", accessToken);
        setResponseObject(request, serverRequest);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 201) {
            ScalewayServerInstance servers = parseResponse(response, ScalewayServerInstance.class);
            return servers.getServer();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }

    }

    public List<ScalewayServer> getAllServers() throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, "servers", accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayServersInstances.class).getServers();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayServer getServer(String serverID) throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, new StringBuilder("servers/").append(serverID).toString(), accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayServerInstance.class).getServer();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public List<ScalewayServerAction> getServerActions(String serverID) throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, new StringBuilder("servers/").append(serverID).append("/action").toString(), accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayServerActionsResponse.class).getActions();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayServerTask executeServerAction(ScalewayServer server, ScalewayServerAction action) throws ScalewayException {
        return executeServerAction(server.getId(), action);
    }

    public ScalewayServerTask executeServerAction(String serverID, ScalewayServerAction action) throws ScalewayException {
        HttpPost request = (HttpPost) Utils.buildRequest("POST", ScalewayConstants.computeURL, new StringBuilder("servers/").append(serverID).append("/action").toString(), accessToken);
        ScalewayServerActionRequest serverActionRequest = new ScalewayServerActionRequest();
        serverActionRequest.setAction(action);
        setResponseObject(request, serverActionRequest);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 202) {
            return parseResponse(response, ScalewayServerTaskResponse.class).getTask();

        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    public ScalewayServerTask getTaskStatus(ScalewayServerTask task) throws ScalewayException {
        return getTaskStatus(task.getId());
    }

    public ScalewayServerTask getTaskStatus(String taskID) throws ScalewayException {
        HttpRequestBase request = Utils.buildRequest("GET", ScalewayConstants.computeURL, new StringBuilder("tasks/").append(taskID).toString(), accessToken);
        HttpResponse response = executeRequest(request);
        if (response.getStatusLine().getStatusCode() == 200) {
            return parseResponse(response, ScalewayServerTaskResponse.class).getTask();
        } else {
            throw new ScalewayInvalidRequestException(response);
        }
    }

    private void setResponseObject(HttpPost request, Object responseObject) throws ScalewayException {
        try {
            request.setEntity(new StringEntity(Utils.formatJson(responseObject), "UTF-8"));
        } catch (JsonProcessingException ex) {
            throw new ScalewayException(ex);
        }
    }

    private HttpResponse executeRequest(HttpRequestBase request) throws ScalewayException {
        try {
            return httpclient.execute(request);
        } catch (IOException ex) {
            throw new ScalewayException(ex);
        }
    }

    private <T> T parseResponse(HttpResponse response, Class<T> entityClass) throws ScalewayException {
        try {
            return Utils.parseJson(response.getEntity(), entityClass);
        } catch (IOException ex) {
            throw new ScalewayException(ex);
        }
    }

    public ScalewayServerTask getTaskResult(ScalewayServerTask serverTask) throws InterruptedException, ScalewayException {
        while (serverTask.getTerminatedAt() == null) {
            Thread.sleep(1000);
            serverTask = getTaskStatus(serverTask);
        }
        return serverTask;
    }
}
