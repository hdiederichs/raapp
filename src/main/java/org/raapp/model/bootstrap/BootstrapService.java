package org.raapp.model.bootstrap;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by hds on 28.03.17.
 */
public interface BootstrapService<E> {

    void bootstrap();

    String getBootstrapFile();

    List<E> readData(Class<E> eClass) throws IOException, URISyntaxException;

}
