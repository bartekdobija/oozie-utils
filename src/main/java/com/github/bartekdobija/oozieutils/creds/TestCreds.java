package com.github.bartekdobija.oozieutils.creds;

import org.apache.oozie.action.ActionExecutor;
import org.apache.oozie.action.hadoop.Credentials;
import org.apache.oozie.action.hadoop.CredentialsProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dummy Oozie credentials used in simulated end-to-end tests.
 *
 * Created by Bartek Dobija on 30/10/15.
 */
public class TestCreds extends Credentials {

    Logger LOG = LoggerFactory.getLogger(TestCreds.class);

    @Override
    public void addtoJobConf(
            org.apache.hadoop.mapred.JobConf jobConf,
            CredentialsProperties credentialsProperties,
            ActionExecutor.Context context) throws Exception {
        LOG.info("Mocked creds invoked.");
    }
}
