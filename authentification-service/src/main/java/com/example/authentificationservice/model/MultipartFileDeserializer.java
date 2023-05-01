/*package com.example.authentification.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest.StandardMultipartFile ;



import java.io.IOException;

public class MultipartFileDeserializer extends JsonDeserializer<MultipartFile> {

    @Override
    public MultipartFile deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        // Get the multipart file data from the JSON input stream
        ObjectCodec codec = p.getCodec();
        JsonNode node = codec.readTree(p);
        byte[] data = node.get("data").binaryValue();
        String name = node.get("name").asText();
        String originalFilename = node.get("originalFilename").asText();
        String contentType = node.get("contentType").asText();

        // Create a new instance of MultipartFile using the data and metadata
        MultipartFile multipartFile = new StandardMultipartFile(name, originalFilename, contentType, data);

        return multipartFile;
    }
}
*/