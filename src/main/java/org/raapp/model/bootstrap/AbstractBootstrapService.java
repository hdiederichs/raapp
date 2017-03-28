package org.raapp.model.bootstrap;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Created by hds on 28.03.17.
 */
public abstract class AbstractBootstrapService<E> implements BootstrapService<E> {

    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    @Override
    public List<E> readData(Class<E> eClass) throws IOException, URISyntaxException {
        URL url = this.getClass().getResource(getBootstrapFile());
        Path f = url != null ? Paths.get(url.toURI()) : null;

        if (f != null && f.toFile().exists()) {
            return new ObjectMapper().readValue(JSON_FACTORY.createParser(url), TypeFactory.defaultInstance().constructCollectionType(List.class, eClass));
        } else {
            return Collections.emptyList();
        }
    }
}
