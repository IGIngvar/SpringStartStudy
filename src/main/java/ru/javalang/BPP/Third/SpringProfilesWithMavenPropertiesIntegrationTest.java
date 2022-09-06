package ru.javalang.BPP.Third;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringProfilesWithMavenPropertiesIntegrationTest {
    @Autowired
    DatasourceConfig datasourceConfig;

    public void setupDatasource() {
        datasourceConfig.setup();
    }
}